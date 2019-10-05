package typings.androiduix

import typings.androiduix.goog.math.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("goog")
@js.native
object goog extends js.Object {
  @js.native
  object math extends js.Object {
    @js.native
    class Long protected () extends js.Object {
      def this(low: Double, high: Double) = this()
      var high_ : js.Any = js.native
      var low_ : js.Any = js.native
      def add(other: Long): Long = js.native
      def and(other: Long): Long = js.native
      def compare(other: Long): Double = js.native
      def div(other: Long): Long = js.native
      def equals(other: Long): Boolean = js.native
      def getHighBits(): Double = js.native
      def getLowBits(): Double = js.native
      def getLowBitsUnsigned(): Double = js.native
      def getNumBitsAbs(): Double = js.native
      def greaterThan(other: Long): Boolean = js.native
      def greaterThanOrEqual(other: Long): Boolean = js.native
      def isNegative(): Boolean = js.native
      def isOdd(): Boolean = js.native
      def isZero(): Boolean = js.native
      def lessThan(other: Long): Boolean = js.native
      def lessThanOrEqual(other: Long): Boolean = js.native
      def modulo(other: Long): Long = js.native
      def multiply(other: Long): Long = js.native
      def negate(): Long = js.native
      def not(): Long = js.native
      def notEquals(other: Long): Boolean = js.native
      def or(other: Long): Long = js.native
      def shiftLeft(numBits: Double): Long = js.native
      def shiftRight(numBits: Double): Long = js.native
      def shiftRightUnsigned(numBits: Double): Long = js.native
      def subtract(other: Long): Long = js.native
      def toInt(): Double = js.native
      def toNumber(): Double = js.native
      def toString(opt_radix: Double): String = js.native
      def xor(other: Long): Long = js.native
    }
    
    /* static members */
    @js.native
    object Long extends js.Object {
      var IntCache_ : js.Any = js.native
      var MAX_VALUE: Long = js.native
      var MIN_VALUE: Long = js.native
      var NEG_ONE: Long = js.native
      var ONE: Long = js.native
      var TWO_PWR_16_DBL_ : js.Any = js.native
      var TWO_PWR_24_ : js.Any = js.native
      var TWO_PWR_24_DBL_ : js.Any = js.native
      var TWO_PWR_31_DBL_ : js.Any = js.native
      var TWO_PWR_32_DBL_ : js.Any = js.native
      var TWO_PWR_48_DBL_ : js.Any = js.native
      var TWO_PWR_63_DBL_ : js.Any = js.native
      var TWO_PWR_64_DBL_ : js.Any = js.native
      var ZERO: Long = js.native
      def fromBits(lowBits: Double, highBits: Double): Long = js.native
      def fromInt(value: Double): Long = js.native
      def fromNumber(value: Double): Long = js.native
      def fromString(str: String, opt_radix: Double): Long = js.native
    }
    
  }
  
}

