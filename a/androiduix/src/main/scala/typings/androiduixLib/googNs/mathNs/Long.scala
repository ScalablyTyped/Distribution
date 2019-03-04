package typings
package androiduixLib.googNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("goog.math.Long")
@js.native
class Long protected () extends js.Object {
  def this(low: scala.Double, high: scala.Double) = this()
  var high_ : js.Any = js.native
  var low_ : js.Any = js.native
  def add(other: Long): Long = js.native
  def and(other: Long): Long = js.native
  def compare(other: Long): scala.Double = js.native
  def div(other: Long): Long = js.native
  def equals(other: Long): scala.Boolean = js.native
  def getHighBits(): scala.Double = js.native
  def getLowBits(): scala.Double = js.native
  def getLowBitsUnsigned(): scala.Double = js.native
  def getNumBitsAbs(): scala.Double = js.native
  def greaterThan(other: Long): scala.Boolean = js.native
  def greaterThanOrEqual(other: Long): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isOdd(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lessThan(other: Long): scala.Boolean = js.native
  def lessThanOrEqual(other: Long): scala.Boolean = js.native
  def modulo(other: Long): Long = js.native
  def multiply(other: Long): Long = js.native
  def negate(): Long = js.native
  def not(): Long = js.native
  def notEquals(other: Long): scala.Boolean = js.native
  def or(other: Long): Long = js.native
  def shiftLeft(numBits: scala.Double): Long = js.native
  def shiftRight(numBits: scala.Double): Long = js.native
  def shiftRightUnsigned(numBits: scala.Double): Long = js.native
  def subtract(other: Long): Long = js.native
  def toInt(): scala.Double = js.native
  def toNumber(): scala.Double = js.native
  def toString(opt_radix: scala.Double): java.lang.String = js.native
  def xor(other: Long): Long = js.native
}

/* static members */
@JSGlobal("goog.math.Long")
@js.native
object Long extends js.Object {
  var IntCache_ : js.Any = js.native
  var MAX_VALUE: androiduixLib.googNs.mathNs.Long = js.native
  var MIN_VALUE: androiduixLib.googNs.mathNs.Long = js.native
  var NEG_ONE: androiduixLib.googNs.mathNs.Long = js.native
  var ONE: androiduixLib.googNs.mathNs.Long = js.native
  var TWO_PWR_16_DBL_ : js.Any = js.native
  var TWO_PWR_24_ : js.Any = js.native
  var TWO_PWR_24_DBL_ : js.Any = js.native
  var TWO_PWR_31_DBL_ : js.Any = js.native
  var TWO_PWR_32_DBL_ : js.Any = js.native
  var TWO_PWR_48_DBL_ : js.Any = js.native
  var TWO_PWR_63_DBL_ : js.Any = js.native
  var TWO_PWR_64_DBL_ : js.Any = js.native
  var ZERO: androiduixLib.googNs.mathNs.Long = js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double): androiduixLib.googNs.mathNs.Long = js.native
  def fromInt(value: scala.Double): androiduixLib.googNs.mathNs.Long = js.native
  def fromNumber(value: scala.Double): androiduixLib.googNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, opt_radix: scala.Double): androiduixLib.googNs.mathNs.Long = js.native
}

