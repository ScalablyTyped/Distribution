package typings
package adoneLib.adoneNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a number of arbitrary precision
     */
@JSGlobal("adone.math.BigNumber")
@js.native
class BigNumber protected () extends js.Object {
  /**
           * Creates a BigNumber from the given value, the base is 10
           */
  def this(n: BigNumber) = this()
  /**
           * Creates a BigNumber from the given value, the base is 10
           */
  def this(n: java.lang.String) = this()
  /**
           * Creates a BigNumber from the given value, the base is 10
           */
  def this(n: scala.Double) = this()
  /**
           * Creates a BigNumber from the given string and base
           */
  def this(n: java.lang.String, base: scala.Double) = this()
  /**
           * Returns a new bignum with the absolute value of the instance
           */
  def abs(): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value plus n
           */
  def add(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value plus n
           */
  def add(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value plus n
           */
  def add(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise AND (&)-ed with n.
           */
  def and(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise AND (&)-ed with n.
           */
  def and(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise AND (&)-ed with n.
           */
  def and(n: scala.Double): BigNumber = js.native
  /**
           * Returns the number of bits used to represent the current bignum
           */
  def bitLength(): scala.Double = js.native
  /**
           * Compares the instance value to n.
           *
           * Returns a positive integer if > n, a negative integer if < n, and 0 if == n
           */
  def cmp(n: BigNumber): scala.Double = js.native
  /**
           * Compares the instance value to n.
           *
           * Returns a positive integer if > n, a negative integer if < n, and 0 if == n
           */
  def cmp(n: java.lang.String): scala.Double = js.native
  /**
           * Compares the instance value to n.
           *
           * Returns a positive integer if > n, a negative integer if < n, and 0 if == n
           */
  def cmp(n: scala.Double): scala.Double = js.native
  /**
           * Returns a new bignum containing the instance value integrally divided by n
           */
  def div(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value integrally divided by n
           */
  def div(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value integrally divided by n
           */
  def div(n: scala.Double): BigNumber = js.native
  /**
           * Checks whether the instance value is equal to n (== n).
           */
  def eq(n: BigNumber): scala.Boolean = js.native
  /**
           * Checks whether the instance value is equal to n (== n).
           */
  def eq(n: java.lang.String): scala.Boolean = js.native
  /**
           * Checks whether the instance value is equal to n (== n).
           */
  def eq(n: scala.Double): scala.Boolean = js.native
  /**
           * Returns the greatest common divisor of the current bignum with n as a new bignum.
           */
  def gcd(n: BigNumber): BigNumber = js.native
  /**
           * Returns the greatest common divisor of the current bignum with n as a new bignum.
           */
  def gcd(n: java.lang.String): BigNumber = js.native
  /**
           * Returns the greatest common divisor of the current bignum with n as a new bignum.
           */
  def gcd(n: scala.Double): BigNumber = js.native
  /**
           * Checks whether the instance value is greater than or equal to n (>= n).
           */
  def ge(n: BigNumber): scala.Boolean = js.native
  /**
           * Checks whether the instance value is greater than or equal to n (>= n).
           */
  def ge(n: java.lang.String): scala.Boolean = js.native
  /**
           * Checks whether the instance value is greater than or equal to n (>= n).
           */
  def ge(n: scala.Double): scala.Boolean = js.native
  /**
           * Checks whether the instance value is greater than n (> n).
           */
  def gt(n: BigNumber): scala.Boolean = js.native
  /**
           * Checks whether the instance value is greater than n (> n).
           */
  def gt(n: java.lang.String): scala.Boolean = js.native
  /**
           * Checks whether the instance value is greater than n (> n).
           */
  def gt(n: scala.Double): scala.Boolean = js.native
  /**
           * Computes the multiplicative inverse modulo m.
           */
  def invertm(m: BigNumber): BigNumber = js.native
  /**
           * Computes the multiplicative inverse modulo m.
           */
  def invertm(m: java.lang.String): BigNumber = js.native
  /**
           * Computes the multiplicative inverse modulo m.
           */
  def invertm(m: scala.Double): BigNumber = js.native
  /**
           * Checks whether the bit at the given index is set
           */
  def isBitSet(n: scala.Double): scala.Boolean = js.native
  /**
           * Returns the Jacobi symbol (or Legendre symbol if n is prime) of the current bignum (= a) over n.
           * Note that n must be odd and >= 3. 0 <= a < n.
           * Returns -1 or 1
           */
  def jacobi(n: BigNumber): scala.Double = js.native
  /**
           * Returns the Jacobi symbol (or Legendre symbol if n is prime) of the current bignum (= a) over n.
           * Note that n must be odd and >= 3. 0 <= a < n.
           * Returns -1 or 1
           */
  def jacobi(n: java.lang.String): scala.Double = js.native
  /**
           * Returns the Jacobi symbol (or Legendre symbol if n is prime) of the current bignum (= a) over n.
           * Note that n must be odd and >= 3. 0 <= a < n.
           * Returns -1 or 1
           */
  def jacobi(n: scala.Double): scala.Double = js.native
  /**
           * Checks whether the instance value is less than or equal to n (<= n).
           */
  def le(n: BigNumber): scala.Boolean = js.native
  /**
           * Checks whether the instance value is less than or equal to n (<= n).
           */
  def le(n: java.lang.String): scala.Boolean = js.native
  /**
           * Checks whether the instance value is less than or equal to n (<= n).
           */
  def le(n: scala.Double): scala.Boolean = js.native
  /**
           * Checks whether the instance value is less than n (< n).
           */
  def lt(n: BigNumber): scala.Boolean = js.native
  /**
           * Checks whether the instance value is less than n (< n).
           */
  def lt(n: java.lang.String): scala.Boolean = js.native
  /**
           * Checks whether the instance value is less than n (< n).
           */
  def lt(n: scala.Double): scala.Boolean = js.native
  /**
           * Returns a new bignum with the instance value modulo n.
           */
  def mod(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value modulo n.
           */
  def mod(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value modulo n.
           */
  def mod(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value multiplied by n
           */
  def mul(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value multiplied by n
           */
  def mul(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum containing the instance value multiplied by n
           */
  def mul(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the negative of the instance value
           */
  def neg(): BigNumber = js.native
  /**
           * Returns the next prime number after this bignum
           */
  def nextPrime(): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise inclusive-OR (|)-ed with n.
           */
  def or(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise inclusive-OR (|)-ed with n.
           */
  def or(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise inclusive-OR (|)-ed with n.
           */
  def or(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power.
           */
  def pow(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power.
           */
  def pow(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power.
           */
  def pow(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: BigNumber, m: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: BigNumber, m: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: BigNumber, m: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: java.lang.String, m: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: java.lang.String, m: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: java.lang.String, m: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: scala.Double, m: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: scala.Double, m: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value raised to the nth power modulo m.
           */
  def powm(n: scala.Double, m: scala.Double): BigNumber = js.native
  /**
           * Checks whether the bignum is:
           *
           * - certainly prime (true)
           *
           * - probably prime ('maybe')
           *
           * - certainly composite (false)
           */
  def probPrime(): scala.Boolean | adoneLib.adoneLibStrings.maybe = js.native
  /**
           * Returns a random number from 0 to this -1
           */
  def rand(): BigNumber = js.native
  /**
           * Returns a random number from this to upperBound - 1
           */
  def rand(upperBound: BigNumber): BigNumber = js.native
  /**
           * Returns a random number from this to upperBound - 1
           */
  def rand(upperBound: java.lang.String): BigNumber = js.native
  /**
           * Returns a random number from this to upperBound - 1
           */
  def rand(upperBound: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum that is the nth root. This truncates.
           */
  def root(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum that is the nth root. This truncates.
           */
  def root(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum that is the nth root. This truncates.
           */
  def root(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum that is the 2^n multiple. Equivalent of the << operator.
           */
  def shiftLeft(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum that is the 2^n multiple. Equivalent of the << operator.
           */
  def shiftLeft(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum that is the 2^n multiple. Equivalent of the << operator.
           */
  def shiftLeft(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum of the value integer divided by 2^n. Equivalent of the >> operator.
           */
  def shiftRight(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum of the value integer divided by 2^n. Equivalent of the >> operator.
           */
  def shiftRight(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum of the value integer divided by 2^n. Equivalent of the >> operator.
           */
  def shiftRight(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new bignum that is the square root. This truncates.
           */
  def sqrt(): BigNumber = js.native
  /**
           * Return a new bignum containing the instance value minus n
           */
  def sub(n: BigNumber): BigNumber = js.native
  /**
           * Return a new bignum containing the instance value minus n
           */
  def sub(n: java.lang.String): BigNumber = js.native
  /**
           * Return a new bignum containing the instance value minus n
           */
  def sub(n: scala.Double): BigNumber = js.native
  /**
           * Returns a new Buffer with the data from the bignum.
           */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
           * Returns a new Buffer with the data from the bignum.
           */
  def toBuffer(opts: adoneLib.adoneNs.mathNs.INs.BigNumberNs.BufferConvertOptions): nodeLib.Buffer = js.native
  /**
           * Converts the bignum into a Number.
           * If the bignum is too big you'll lose precision or you'll get ±Infinity.
           */
  def toNumber(): scala.Double = js.native
  /**
           * Converts the number to a string in the given base
           */
  def toString(base: scala.Double): java.lang.String = js.native
  /**
           * Returns a new bignum with the instance value bitwise exclusive-OR (^)-ed with n.
           */
  def xor(n: BigNumber): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise exclusive-OR (^)-ed with n.
           */
  def xor(n: java.lang.String): BigNumber = js.native
  /**
           * Returns a new bignum with the instance value bitwise exclusive-OR (^)-ed with n.
           */
  def xor(n: scala.Double): BigNumber = js.native
}

/**
     * Represents a number of arbitrary precision
     */
@JSGlobal("adone.math.BigNumber")
@js.native
object BigNumber extends js.Object {
  /**
           * One
           */
  var ONE: adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
           * Zero
           */
  var ZERO: adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
           * Creates a new bignum from a Buffer.
           */
  def fromBuffer(buf: nodeLib.Buffer): adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
           * Creates a new bignum from a Buffer.
           */
  def fromBuffer(buf: nodeLib.Buffer, opts: adoneLib.adoneNs.mathNs.INs.BigNumberNs.BufferConvertOptions): adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
           * Generates a probable prime number of length bits.
           *
           * @param bits the number of bits
           * @param safe If true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime. Default: true
           */
  def prime(bits: scala.Double): adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
           * Generates a probable prime number of length bits.
           *
           * @param bits the number of bits
           * @param safe If true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime. Default: true
           */
  def prime(bits: scala.Double, safe: scala.Boolean): adoneLib.adoneNs.mathNs.BigNumber = js.native
}

