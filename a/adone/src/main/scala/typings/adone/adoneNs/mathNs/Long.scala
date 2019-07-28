package typings.adone.adoneNs.mathNs

import typings.adone.adoneNs.mathNs.INs.Longable
import typings.adone.adoneNs.mathNs.INs._Longable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a 64 bit two's-complement integer
  */
@JSGlobal("adone.math.Long")
@js.native
/**
  * @param low The low (signed) 32 bits of the long
  * @param high The high (signed) 32 bits of the long
  * @param unsigned Whether unsigned or not, defaults to false for signed
  */
class Long () extends _Longable {
  def this(low: Double) = this()
  def this(low: Double, high: Double) = this()
  def this(low: Double, high: Double, unsigned: Boolean) = this()
  var high: Double = js.native
  var low: Double = js.native
  var unsigned: Boolean = js.native
  /**
    * Returns the sum of this and the specified Long
    */
  def add(addend: Longable): Long = js.native
  /**
    * Returns the bitwise AND of this Long and the specified
    */
  def and(other: Longable): Long = js.native
  /**
    * Compares this Long's value with the specified's.
    * Returns 0 if they are the same, 1 if the this is greater and -1 if the given one is greater
    */
  def compare(other: Longable): Double = js.native
  /**
    * Returns this Long divided by the specified
    */
  def div(divisor: Longable): Long = js.native
  /**
    * Tests if this Long's value equals the specified's
    */
  def equals(other: Longable): Boolean = js.native
  /**
    * Gets the high 32 bits as a signed integer
    */
  def getHighBits(): Double = js.native
  /**
    * Gets the high 32 bits as an unsigned integer
    */
  def getHighBitsUnsigned(): Double = js.native
  /**
    * Gets the low 32 bits as a signed integer
    */
  def getLowBits(): Double = js.native
  /**
    * Gets the low 32 bits as an unsigned integer
    */
  def getLowBitsUnsigned(): Double = js.native
  /**
    * Gets the number of bits needed to represent the absolute value of this Long
    */
  def getNumBitsAbs(): Double = js.native
  /**
    * Tests if this Long's value is greater than the specified's
    */
  def greaterThan(other: Longable): Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's
    */
  def greaterThanOrEqual(other: Longable): Boolean = js.native
  def inspect(): String = js.native
  /**
    * Tests if this Long's value is even
    */
  def isEven(): Boolean = js.native
  /**
    * Tests if this Long's value is negative
    */
  def isNegative(): Boolean = js.native
  /**
    * Tests if this Long's value is odd
    */
  def isOdd(): Boolean = js.native
  /**
    * Tests if this Long's value is positive
    */
  def isPositive(): Boolean = js.native
  /**
    * Tests if this Long's value equals zero
    */
  def isZero(): Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's
    */
  def lessThan(other: Longable): Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's
    */
  def lessThanOrEqual(other: Longable): Boolean = js.native
  /**
    * Returns this Long modulo the specified
    */
  def mod(divisor: Longable): Long = js.native
  /**
    * Returns the product of this and the specified Long
    */
  def mul(multiplier: Longable): Long = js.native
  /**
    * Negates this Long's value
    */
  def negate(): Long = js.native
  /**
    * Returns the bitwise NOT of this Long
    */
  def not(): Long = js.native
  /**
    * Returns the bitwise OR of this Long and the specifieds
    */
  def or(other: Longable): Long = js.native
  /**
    * Returns this Long with bits shifted to the left by the given amount
    */
  def shl(numBits: Double): Long = js.native
  def shl(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount
    */
  def shr(numBits: Double): Long = js.native
  def shr(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount
    */
  def shru(numBits: Double): Long = js.native
  def shru(numBits: Long): Long = js.native
  /**
    * Returns the difference of this and the specified Long
    */
  def sub(subtrahend: Longable): Long = js.native
  /**
    * Converts this Long to an array of bytes, big-endian by default
    *
    * @param le Whether to return an array in little-endian format
    */
  def toBytes(): js.Array[Double] = js.native
  def toBytes(le: Boolean): js.Array[Double] = js.native
  /**
    * Converts this Long to an array of bytes in big-endian format
    */
  def toBytesBE(): js.Array[Double] = js.native
  /**
    * Converts this Long to an array of bytes in little-endian format
    */
  def toBytesLE(): js.Array[Double] = js.native
  /**
    * Converts the Long to a 32 bit integer, assuming it is a 32 bit integer
    */
  def toInt(): Double = js.native
  /**
    * Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa)
    */
  def toNumber(): Double = js.native
  /**
    * Converts this Long to signed
    */
  def toSigned(): Long = js.native
  def toString(radix: Double): String = js.native
  /**
    * Converts this Long to unsigned
    */
  def toUnsigned(): Long = js.native
  /**
    * Returns the bitwise XOR of this Long and the given one
    */
  def xor(other: Longable): Long = js.native
}

/* static members */
@JSGlobal("adone.math.Long")
@js.native
object Long extends js.Object {
  /**
    * Maximum unsigned value
    */
  var MAX_UNSIGNED_VALUE: Long = js.native
  /**
    * Maximum signed value
    */
  var MAX_VALUE: Long = js.native
  /**
    * Minimum signed value
    */
  var MIN_VALUE: Long = js.native
  /**
    * Signed negative one
    */
  var NEG_ONE: Long = js.native
  /**
    * Signed one
    */
  var ONE: Long = js.native
  /**
    * Unsigned one
    */
  var UONE: Long = js.native
  /**
    * Unsigned zero
    */
  var UZERO: Long = js.native
  /**
    * Signed zero
    */
  var ZERO: Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits
    */
  def fromBits(lowBits: Double, highBits: Double): Long = js.native
  def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value
    */
  def fromInt(value: Double): Long = js.native
  def fromInt(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned
    */
  def fromNumber(): Long = js.native
  def fromNumber(value: Double): Long = js.native
  def fromNumber(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix
    */
  def fromString(str: String): Long = js.native
  def fromString(str: String, radix: Double): Long = js.native
  def fromString(str: String, unsigned: Boolean): Long = js.native
  def fromString(str: String, unsigned: Boolean, radix: Double): Long = js.native
  /**
    * Converts the specified value to a Long
    */
  def fromValue(`val`: Longable): Long = js.native
}

