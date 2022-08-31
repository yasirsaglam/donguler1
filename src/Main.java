import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, m = 0, adet = 0, ort = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                //System.out.println(i);
                m += i;
                adet++;
                ort = m / adet;
            }
        }
        System.out.println("Girdiğiniz sayıya kadar olan, 3'e ve 4'e tam bölünen sayıların ortalaması : " + ort);
    }
}
