import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws java.io.IOException  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите катет a: ");
        int a = scanner.nextInt();
        while (a>1000) {
            System.out.println("Значение должно быть меньше 1000");
            a = scanner.nextInt();
        }
        while (a<0) {
            System.out.println("Значение должно быть больше 0");
            a = scanner.nextInt();
        }
        System.out.print("Введите катет b: ");
        int b = scanner.nextInt();
        while (b>1000) {
            System.out.println("Значение должно быть меньше 1000");
            b = scanner.nextInt();
        }
        while (b<0) {
            System.out.println("Значение должно быть больше 0");
            b = scanner.nextInt();
        }
        double c = Math.sqrt(a*a+b*b);
        System.out.print ("Гипотенуза ="+c);
    }
}