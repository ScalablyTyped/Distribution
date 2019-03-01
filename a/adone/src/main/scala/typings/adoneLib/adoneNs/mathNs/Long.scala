package typings
package adoneLib.adoneNs.mathNs

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
class Long ()
  extends adoneLib.adoneNs.mathNs.INs._Longable {
  def this(low: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double, unsigned: scala.Boolean) = this()
  var high: scala.Double = js.native
  var low: scala.Double = js.native
  var unsigned: scala.Boolean = js.native
  /**
    * Returns the sum of this and the specified Long
    */
  def add(addend: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  /**
    * Returns the bitwise AND of this Long and the specified
    */
  def and(other: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  /**
    * Compares this Long's value with the specified's.
    * Returns 0 if they are the same, 1 if the this is greater and -1 if the given one is greater
    */
  def compare(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Double = js.native
  /**
    * Returns this Long divided by the specified
    */
  def div(divisor: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  /**
    * Tests if this Long's value equals the specified's
    */
  def equals(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Boolean = js.native
  /**
    * Gets the high 32 bits as a signed integer
    */
  def getHighBits(): scala.Double = js.native
  /**
    * Gets the high 32 bits as an unsigned integer
    */
  def getHighBitsUnsigned(): scala.Double = js.native
  /**
    * Gets the low 32 bits as a signed integer
    */
  def getLowBits(): scala.Double = js.native
  /**
    * Gets the low 32 bits as an unsigned integer
    */
  def getLowBitsUnsigned(): scala.Double = js.native
  /**
    * Gets the number of bits needed to represent the absolute value of this Long
    */
  def getNumBitsAbs(): scala.Double = js.native
  /**
    * Tests if this Long's value is greater than the specified's
    */
  def greaterThan(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's
    */
  def greaterThanOrEqual(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Boolean = js.native
  def inspect(): java.lang.String = js.native
  /**
    * Tests if this Long's value is even
    */
  def isEven(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is negative
    */
  def isNegative(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is odd
    */
  def isOdd(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is positive
    */
  def isPositive(): scala.Boolean = js.native
  /**
    * Tests if this Long's value equals zero
    */
  def isZero(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's
    */
  def lessThan(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's
    */
  def lessThanOrEqual(other: adoneLib.adoneNs.mathNs.INs.Longable): scala.Boolean = js.native
  /**
    * Returns this Long modulo the specified
    */
  def mod(divisor: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  /**
    * Returns the product of this and the specified Long
    */
  def mul(multiplier: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
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
  def or(other: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  def shl(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits shifted to the left by the given amount
    */
  def shl(numBits: scala.Double): Long = js.native
  def shr(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount
    */
  def shr(numBits: scala.Double): Long = js.native
  def shru(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount
    */
  def shru(numBits: scala.Double): Long = js.native
  /**
    * Returns the difference of this and the specified Long
    */
  def sub(subtrahend: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
  /**
    * Converts this Long to an array of bytes, big-endian by default
    *
    * @param le Whether to return an array in little-endian format
    */
  def toBytes(): js.Array[scala.Double] = js.native
  def toBytes(le: scala.Boolean): js.Array[scala.Double] = js.native
  /**
    * Converts this Long to an array of bytes in big-endian format
    */
  def toBytesBE(): js.Array[scala.Double] = js.native
  /**
    * Converts this Long to an array of bytes in little-endian format
    */
  def toBytesLE(): js.Array[scala.Double] = js.native
  /**
    * Converts the Long to a 32 bit integer, assuming it is a 32 bit integer
    */
  def toInt(): scala.Double = js.native
  /**
    * Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa)
    */
  def toNumber(): scala.Double = js.native
  /**
    * Converts this Long to signed
    */
  def toSigned(): Long = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
  /**
    * Converts this Long to unsigned
    */
  def toUnsigned(): Long = js.native
  /**
    * Returns the bitwise XOR of this Long and the given one
    */
  def xor(other: adoneLib.adoneNs.mathNs.INs.Longable): Long = js.native
}

/* static members */
@JSGlobal("adone.math.Long")
@js.native
object Long extends js.Object {
  /**
    * Maximum unsigned value
    */
  var MAX_UNSIGNED_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Maximum signed value
    */
  var MAX_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Minimum signed value
    */
  var MIN_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed negative one
    */
  var NEG_ONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed one
    */
  var ONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Unsigned one
    */
  var UONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Unsigned zero
    */
  var UZERO: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed zero
    */
  var ZERO: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value
    */
  def fromInt(value: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromInt(value: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned
    */
  def fromNumber(): adoneLib.adoneNs.mathNs.Long = js.native
  def fromNumber(value: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromNumber(value: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix
    */
  def fromString(str: java.lang.String): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, radix: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean, radix: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Converts the specified value to a Long
    */
  def fromValue(`val`: adoneLib.adoneNs.mathNs.INs.Longable): adoneLib.adoneNs.mathNs.Long = js.native
}

