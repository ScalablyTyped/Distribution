package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigIntegerMod {
  
  @JSImport("@angular/compiler/src/i18n/big_integer", "BigIntExponentiation")
  @js.native
  class BigIntExponentiation protected () extends StObject {
    def this(base: Double) = this()
    
    /* private */ val base: js.Any = js.native
    
    /* private */ val exponents: js.Any = js.native
    
    /**
      * Compute the value for `this.base^exponent`, resulting in a big integer that is optimized for
      * further multiplication operations.
      */
    def toThePowerOf(exponent: Double): BigIntForMultiplication = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/big_integer", "BigIntForMultiplication")
  @js.native
  class BigIntForMultiplication protected () extends StObject {
    def this(value: BigInteger) = this()
    
    /**
      * Computes and memoizes the big integer value for `this.number * 2^exponent`.
      */
    /* private */ var getMultipliedByPowerOfTwo: js.Any = js.native
    
    /**
      * Returns the big integer itself.
      */
    def getValue(): BigInteger = js.native
    
    /**
      * Computes the value for `num * b`, where `num` is a JS number and `b` is a big integer. The
      * value for `b` is represented by a storage model that is optimized for this computation.
      *
      * This operation is implemented in N(log2(num)) by continuous halving of the number, where the
      * least-significant bit (LSB) is tested in each iteration. If the bit is set, the bit's index is
      * used as exponent into the power-of-two multiplication of `b`.
      *
      * As an example, consider the multiplication num=42, b=1337. In binary 42 is 0b00101010 and the
      * algorithm unrolls into the following iterations:
      *
      *  Iteration | num        | LSB  | b * 2^iter | Add? | product
      * -----------|------------|------|------------|------|--------
      *  0         | 0b00101010 | 0    | 1337       | No   | 0
      *  1         | 0b00010101 | 1    | 2674       | Yes  | 2674
      *  2         | 0b00001010 | 0    | 5348       | No   | 2674
      *  3         | 0b00000101 | 1    | 10696      | Yes  | 13370
      *  4         | 0b00000010 | 0    | 21392      | No   | 13370
      *  5         | 0b00000001 | 1    | 42784      | Yes  | 56154
      *  6         | 0b00000000 | 0    | 85568      | No   | 56154
      *
      * The computed product of 56154 is indeed the correct result.
      *
      * The `BigIntForMultiplication` representation for a big integer provides memoized access to the
      * power-of-two values to reduce the workload in computing those values.
      */
    def multiplyBy(num: Double): BigInteger = js.native
    
    /**
      * See `multiplyBy()` for details. This function allows for the computed product to be added
      * directly to the provided result big integer.
      */
    def multiplyByAndAddTo(num: Double, result: BigInteger): Unit = js.native
    
    /**
      * Stores all memoized power-of-twos, where each index represents `this.number * 2^index`.
      */
    /* private */ val powerOfTwos: js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/big_integer", "BigInteger")
  @js.native
  /**
    * Creates a big integer using its individual digits in little endian storage.
    */
  /* private */ class BigInteger () extends StObject {
    
    /**
      * Returns a new big integer with the sum of `this` and `other` as its value. This does not mutate
      * `this` but instead returns a new instance, unlike `addToSelf`.
      */
    def add(other: BigInteger): BigInteger = js.native
    
    /**
      * Adds `other` to the instance itself, thereby mutating its value.
      */
    def addToSelf(other: BigInteger): Unit = js.native
    
    /* private */ val digits: js.Any = js.native
  }
  /* static members */
  object BigInteger {
    
    @JSImport("@angular/compiler/src/i18n/big_integer", "BigInteger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def one(): BigInteger = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[BigInteger]
    
    inline def zero(): BigInteger = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[BigInteger]
  }
}
