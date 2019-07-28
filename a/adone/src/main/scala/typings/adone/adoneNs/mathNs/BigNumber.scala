package typings.adone.adoneNs.mathNs

import typings.adone.adoneNs.mathNs.INs.BigNumberNs.BufferConvertOptions
import typings.adone.adoneStrings.maybe
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a number of arbitrary precision
  */
@JSGlobal("adone.math.BigNumber")
@js.native
class BigNumber protected () extends js.Object {
  def this(n: String) = this()
  /**
    * Creates a BigNumber from the given value, the base is 10
    */
  def this(n: Double) = this()
  def this(n: BigNumber) = this()
  /**
    * Creates a BigNumber from the given string and base
    */
  def this(n: String, base: Double) = this()
  /**
    * Returns a new bignum with the absolute value of the instance
    */
  def abs(): BigNumber = js.native
  def add(n: String): BigNumber = js.native
  /**
    * Returns a new bignum containing the instance value plus n
    */
  def add(n: Double): BigNumber = js.native
  def add(n: BigNumber): BigNumber = js.native
  def and(n: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value bitwise AND (&)-ed with n.
    */
  def and(n: Double): BigNumber = js.native
  def and(n: BigNumber): BigNumber = js.native
  /**
    * Returns the number of bits used to represent the current bignum
    */
  def bitLength(): Double = js.native
  def cmp(n: String): Double = js.native
  /**
    * Compares the instance value to n.
    *
    * Returns a positive integer if > n, a negative integer if < n, and 0 if == n
    */
  def cmp(n: Double): Double = js.native
  def cmp(n: BigNumber): Double = js.native
  def div(n: String): BigNumber = js.native
  /**
    * Returns a new bignum containing the instance value integrally divided by n
    */
  def div(n: Double): BigNumber = js.native
  def div(n: BigNumber): BigNumber = js.native
  def eq(n: String): Boolean = js.native
  /**
    * Checks whether the instance value is equal to n (== n).
    */
  def eq(n: Double): Boolean = js.native
  def eq(n: BigNumber): Boolean = js.native
  def gcd(n: String): BigNumber = js.native
  /**
    * Returns the greatest common divisor of the current bignum with n as a new bignum.
    */
  def gcd(n: Double): BigNumber = js.native
  def gcd(n: BigNumber): BigNumber = js.native
  def ge(n: String): Boolean = js.native
  /**
    * Checks whether the instance value is greater than or equal to n (>= n).
    */
  def ge(n: Double): Boolean = js.native
  def ge(n: BigNumber): Boolean = js.native
  def gt(n: String): Boolean = js.native
  /**
    * Checks whether the instance value is greater than n (> n).
    */
  def gt(n: Double): Boolean = js.native
  def gt(n: BigNumber): Boolean = js.native
  def invertm(m: String): BigNumber = js.native
  /**
    * Computes the multiplicative inverse modulo m.
    */
  def invertm(m: Double): BigNumber = js.native
  def invertm(m: BigNumber): BigNumber = js.native
  /**
    * Checks whether the bit at the given index is set
    */
  def isBitSet(n: Double): Boolean = js.native
  def jacobi(n: String): Double = js.native
  /**
    * Returns the Jacobi symbol (or Legendre symbol if n is prime) of the current bignum (= a) over n.
    * Note that n must be odd and >= 3. 0 <= a < n.
    * Returns -1 or 1
    */
  def jacobi(n: Double): Double = js.native
  def jacobi(n: BigNumber): Double = js.native
  def le(n: String): Boolean = js.native
  /**
    * Checks whether the instance value is less than or equal to n (<= n).
    */
  def le(n: Double): Boolean = js.native
  def le(n: BigNumber): Boolean = js.native
  def lt(n: String): Boolean = js.native
  /**
    * Checks whether the instance value is less than n (< n).
    */
  def lt(n: Double): Boolean = js.native
  def lt(n: BigNumber): Boolean = js.native
  def mod(n: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value modulo n.
    */
  def mod(n: Double): BigNumber = js.native
  def mod(n: BigNumber): BigNumber = js.native
  def mul(n: String): BigNumber = js.native
  /**
    * Returns a new bignum containing the instance value multiplied by n
    */
  def mul(n: Double): BigNumber = js.native
  def mul(n: BigNumber): BigNumber = js.native
  /**
    * Returns a new bignum with the negative of the instance value
    */
  def neg(): BigNumber = js.native
  /**
    * Returns the next prime number after this bignum
    */
  def nextPrime(): BigNumber = js.native
  def or(n: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value bitwise inclusive-OR (|)-ed with n.
    */
  def or(n: Double): BigNumber = js.native
  def or(n: BigNumber): BigNumber = js.native
  def pow(n: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value raised to the nth power.
    */
  def pow(n: Double): BigNumber = js.native
  def pow(n: BigNumber): BigNumber = js.native
  def powm(n: String, m: String): BigNumber = js.native
  def powm(n: String, m: Double): BigNumber = js.native
  def powm(n: String, m: BigNumber): BigNumber = js.native
  def powm(n: Double, m: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value raised to the nth power modulo m.
    */
  def powm(n: Double, m: Double): BigNumber = js.native
  def powm(n: Double, m: BigNumber): BigNumber = js.native
  def powm(n: BigNumber, m: String): BigNumber = js.native
  def powm(n: BigNumber, m: Double): BigNumber = js.native
  def powm(n: BigNumber, m: BigNumber): BigNumber = js.native
  /**
    * Checks whether the bignum is:
    *
    * - certainly prime (true)
    *
    * - probably prime ('maybe')
    *
    * - certainly composite (false)
    */
  def probPrime(): Boolean | maybe = js.native
  /**
    * Returns a random number from 0 to this -1
    */
  def rand(): BigNumber = js.native
  def rand(upperBound: String): BigNumber = js.native
  /**
    * Returns a random number from this to upperBound - 1
    */
  def rand(upperBound: Double): BigNumber = js.native
  def rand(upperBound: BigNumber): BigNumber = js.native
  def root(n: String): BigNumber = js.native
  /**
    * Returns a new bignum that is the nth root. This truncates.
    */
  def root(n: Double): BigNumber = js.native
  def root(n: BigNumber): BigNumber = js.native
  def shiftLeft(n: String): BigNumber = js.native
  /**
    * Returns a new bignum that is the 2^n multiple. Equivalent of the << operator.
    */
  def shiftLeft(n: Double): BigNumber = js.native
  def shiftLeft(n: BigNumber): BigNumber = js.native
  def shiftRight(n: String): BigNumber = js.native
  /**
    * Returns a new bignum of the value integer divided by 2^n. Equivalent of the >> operator.
    */
  def shiftRight(n: Double): BigNumber = js.native
  def shiftRight(n: BigNumber): BigNumber = js.native
  /**
    * Returns a new bignum that is the square root. This truncates.
    */
  def sqrt(): BigNumber = js.native
  def sub(n: String): BigNumber = js.native
  /**
    * Return a new bignum containing the instance value minus n
    */
  def sub(n: Double): BigNumber = js.native
  def sub(n: BigNumber): BigNumber = js.native
  /**
    * Returns a new Buffer with the data from the bignum.
    */
  def toBuffer(): Buffer = js.native
  def toBuffer(opts: BufferConvertOptions): Buffer = js.native
  /**
    * Converts the bignum into a Number.
    * If the bignum is too big you'll lose precision or you'll get ±Infinity.
    */
  def toNumber(): Double = js.native
  def toString(base: Double): String = js.native
  def xor(n: String): BigNumber = js.native
  /**
    * Returns a new bignum with the instance value bitwise exclusive-OR (^)-ed with n.
    */
  def xor(n: Double): BigNumber = js.native
  def xor(n: BigNumber): BigNumber = js.native
}

/* static members */
@JSGlobal("adone.math.BigNumber")
@js.native
object BigNumber extends js.Object {
  /**
    * One
    */
  var ONE: BigNumber = js.native
  /**
    * Zero
    */
  var ZERO: BigNumber = js.native
  /**
    * Creates a new bignum from a Buffer.
    */
  def fromBuffer(buf: Buffer): BigNumber = js.native
  def fromBuffer(buf: Buffer, opts: BufferConvertOptions): BigNumber = js.native
  /**
    * Generates a probable prime number of length bits.
    *
    * @param bits the number of bits
    * @param safe If true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime. Default: true
    */
  def prime(bits: Double): BigNumber = js.native
  def prime(bits: Double, safe: Boolean): BigNumber = js.native
}

