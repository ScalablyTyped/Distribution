package typings.asmcryptoJs

import typings.asmcryptoJs.anon.BitLength
import typings.asmcryptoJs.anon.Gcd
import typings.asmcryptoJs.anon.Quotient
import typings.asmcryptoJs.bigintAsmMod.bigintresult
import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Math
import typings.std.Uint32Array
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bignumMod {
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
  @js.native
  class BigNumber () extends StObject {
    def this(num: Uint8Array) = this()
    
    def add(that: BigNumber): BigNumber = js.native
    
    var bitLength: Double = js.native
    
    def clamp(b: Double): BigNumber = js.native
    
    def compare(that: BigNumber): Double = js.native
    
    def divide(that: BigNumber): Quotient = js.native
    
    def isMillerRabinProbablePrime(rounds: Double): Boolean = js.native
    
    def isProbablePrime(): Boolean = js.native
    def isProbablePrime(paranoia: Double): Boolean = js.native
    
    var limbs: Uint32Array = js.native
    
    def multiply(that: BigNumber): BigNumber = js.native
    
    def negate(): BigNumber = js.native
    
    var sign: Double = js.native
    
    def slice(f: Double): BigNumber = js.native
    def slice(f: Double, b: Double): BigNumber = js.native
    
    def square(): BigNumber = js.native
    
    def subtract(that: BigNumber): BigNumber = js.native
    
    def toBytes(): Uint8Array = js.native
    
    def toString(radix: Double): String = js.native
  }
  /* static members */
  object BigNumber {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.ONE")
    @js.native
    def ONE: BigNumber = js.native
    @scala.inline
    def ONE_=(x: BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.ZERO")
    @js.native
    def ZERO: BigNumber = js.native
    @scala.inline
    def ZERO_=(x: BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.extGCD")
    @js.native
    def extGCD: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
    @scala.inline
    def extGCD(a: this.type, b: this.type): Gcd = (^.asInstanceOf[js.Dynamic].applyDynamic("extGCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Gcd]
    @scala.inline
    def extGCD_=(x: js.Function2[/* a */ this.type, /* b */ this.type, Gcd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extGCD")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fromArrayBuffer(buffer: ArrayBuffer): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
    
    @scala.inline
    def fromConfig(obj: BitLength): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
    
    @scala.inline
    def fromNumber(num: Double): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(num.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
    
    @scala.inline
    def fromString(str: String): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
  }
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus")
  @js.native
  class Modulus protected () extends BigNumber {
    def this(number: BigNumber) = this()
    
    var coefficient: js.Any = js.native
    
    var comodulus: js.Any = js.native
    
    var comodulusRemainder: js.Any = js.native
    
    var comodulusRemainderSquare: js.Any = js.native
    
    /**
      * Modular inverse
      */
    def inverse(a: BigNumber): BigNumber = js.native
    
    /**
      * Modular exponentiation
      */
    def power(g: BigNumber, e: BigNumber): BigNumber = js.native
    
    /**
      * Modular reduction
      */
    def reduce(a: BigNumber): BigNumber = js.native
  }
  /* static members */
  object Modulus {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def _Montgomery_reduce(a: BigNumber, n: Modulus): BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("_Montgomery_reduce")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[BigNumber]
  }
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_asm")
  @js.native
  def bigintAsm: bigintresult = js.native
  
  @scala.inline
  def bigintAsm_=(x: bigintresult): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bigint_asm")(x.asInstanceOf[js.Any])
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_heap")
  @js.native
  val bigintHeap: Uint32Array = js.native
  
  object bigintStdlib {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Math")
    @js.native
    def Math: typings.std.Math = js.native
    @scala.inline
    def Math_=(x: Math): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Math")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Uint32Array")
    @js.native
    class Uint32Array ()
      extends StObject
         with typings.std.Uint32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Uint32Array")
    @js.native
    def Uint32Array: Uint32ArrayConstructor = js.native
    @scala.inline
    def Uint32Array_=(x: Uint32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uint32Array")(x.asInstanceOf[js.Any])
  }
}
