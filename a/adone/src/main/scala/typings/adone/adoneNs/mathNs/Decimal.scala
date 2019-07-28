package typings.adone.adoneNs.mathNs

import typings.adone.adoneNs.mathNs.INs.DecimalNs.Config
import typings.adone.adoneNs.mathNs.INs.DecimalNs.Constructor
import typings.adone.adoneNs.mathNs.INs.DecimalNs.Modulo
import typings.adone.adoneNs.mathNs.INs.DecimalNs.Rounding
import typings.adone.adoneNs.mathNs.INs.DecimalNs.Value
import typings.adone.adoneNumbers.`0`
import typings.adone.adoneNumbers.`1`
import typings.adone.adoneNumbers.`2`
import typings.adone.adoneNumbers.`3`
import typings.adone.adoneNumbers.`4`
import typings.adone.adoneNumbers.`5`
import typings.adone.adoneNumbers.`6`
import typings.adone.adoneNumbers.`7`
import typings.adone.adoneNumbers.`8`
import typings.adone.adoneNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arbitrary precision decimal number
  */
@JSGlobal("adone.math.Decimal")
@js.native
class Decimal protected () extends js.Object {
  def this(x: Value) = this()
  /**
    * digits
    */
  val d: js.Array[Double] = js.native
  /**
    * exponent
    */
  val e: Double = js.native
  val name: String = js.native
  /**
    * sign
    */
  val s: Double = js.native
  /**
    * Returns a new Decimal whose value is the absolute value, i.e. the magnitude, of the value of this Decimal.
    *
    * @alias absoluteValue
    */
  def abs(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the absolute value, i.e. the magnitude, of the value of this Decimal.
    *
    * @alias abs
    */
  def absoluteValue(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse cosine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseCosine
    */
  def acos(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic cosine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseHyperbolicCosine
    */
  def acosh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal plus x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias plus
    */
  def add(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse sine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseSine
    */
  def asin(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic sine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseHyperbolicSine
    */
  def asinh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseTangent
    */
  def atan(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias inverseHyperbolicTangent
    */
  def atanh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the cube root of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    *
    * @alias cubeRoot
    */
  def cbrt(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to a whole number in the direction of positive Infinity.
    *
    * The return value is not affected by the value of the precision setting.
    */
  def ceil(): Decimal = js.native
  /**
    * 1	if the value of this Decimal is greater than the value of x
    *
    * -1	if the value of this Decimal is less than the value of x
    *
    * 0	if this Decimal and x have the same value
    *
    * NaN	if the value of either this Decimal or x is NaN
    *
    * @alias comparedTo
    */
  def cmp(x: Value): Double = js.native
  /**
    * 1	if the value of this Decimal is greater than the value of x
    *
    * -1	if the value of this Decimal is less than the value of x
    *
    * 0	if this Decimal and x have the same value
    *
    * NaN	if the value of either this Decimal or x is NaN
    *
    * @alias cmp
    */
  def comparedTo(x: Value): Double = js.native
  /**
    * Returns a new Decimal whose value is the cosine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias cosine
    */
  def cos(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic cosine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias hyperbolicCosine
    */
  def cosh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the cosine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias cos
    */
  def cosine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the cube root of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    *
    * @alias cbrt
    */
  def cubeRoot(): Decimal = js.native
  /**
    * Returns the number of decimal places, i.e. the number of digits after the decimal point, of the value of this Decimal.
    *
    * @alias dp
    */
  def decimalPlaces(): Double = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal divided by x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias dividedBy
    */
  def div(x: Value): Decimal = js.native
  /**
    * Return a new Decimal whose value is the integer part of dividing this Decimal by x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias dividedToIntegerBy
    */
  def divToInt(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal divided by x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias div
    */
  def dividedBy(x: Value): Decimal = js.native
  /**
    * Return a new Decimal whose value is the integer part of dividing this Decimal by x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias divToInt
    */
  def dividedToIntegerBy(x: Value): Decimal = js.native
  /**
    * Returns the number of decimal places, i.e. the number of digits after the decimal point, of the value of this Decimal.
    *
    * @alias decimalPlaces
    */
  def dp(): Double = js.native
  /**
    * Returns true if the value of this Decimal equals the value of x, otherwise returns false.
    * As with JavaScript, NaN does not equal NaN.
    *
    * @alias equals
    */
  def eq(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal equals the value of x, otherwise returns false.
    * As with JavaScript, NaN does not equal NaN.
    *
    * @alias eq
    */
  def equals(x: Value): Boolean = js.native
  /**
    * Returns a new Decimal whose value is the base e (Euler's number, the base of the natural logarithm) exponential of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias naturalExponential
    */
  def exp(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to a whole number in the direction of negative Infinity.
    *
    * The return value is not affected by the value of the precision setting.
    */
  def floor(): Decimal = js.native
  /**
    * Returns true if the value of this Decimal is greater than the value of x, otherwise returns false.
    *
    * @alias gt
    */
  def greaterThan(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is greater than or equal to the value of x, otherwise returns false.
    *
    * @alias gte
    */
  def greaterThanOrEqualTo(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is greater than the value of x, otherwise returns false.
    *
    * @alias greaterThan
    */
  def gt(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is greater than or equal to the value of x, otherwise returns false.
    *
    * @alias greaterThanOrEqualTo
    */
  def gte(x: Value): Boolean = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic cosine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias cosh
    */
  def hyperbolicCosine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic sine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias sinh
    */
  def hyperbolicSine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias tanh
    */
  def hyperbolicTangent(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse cosine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias acos
    */
  def inverseCosine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic cosine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias acosh
    */
  def inverseHyperbolicCosine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic sine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias asinh
    */
  def inverseHyperbolicSine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias atanh
    */
  def inverseHyperbolicTangent(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse sine in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias asin
    */
  def inverseSine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias atan
    */
  def inverseTangent(): Decimal = js.native
  /**
    * Returns true if the value of this Decimal is a finite number, otherwise returns false.
    * The only possible non-finite values of a Decimal are NaN, Infinity and -Infinity.
    */
  def isFinite(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is a whole number, otherwise returns false.
    *
    * @alias isInteger
    */
  def isInt(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is a whole number, otherwise returns false.
    *
    * @alias isInt
    */
  def isInteger(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is NaN, otherwise returns false.
    */
  def isNaN(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is negative, otherwise returns false.
    *
    * @alias isNegative
    */
  def isNeg(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is negative, otherwise returns false.
    *
    * @alias isNeg
    */
  def isNegative(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is positive, otherwise returns false.
    *
    * @alias isPositive
    */
  def isPos(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is positive, otherwise returns false.
    *
    * @alias isPos
    */
  def isPositive(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is zero or minus zero, otherwise returns false.
    */
  def isZero(): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is less than the value of x, otherwise returns false.
    *
    * @alias lt
    */
  def lessThan(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is less than or equal to the value of x, otherwise returns false.
    *
    * @alias lte
    */
  def lessThanOrEqualTo(x: Value): Boolean = js.native
  /**
    * Returns a new Decimal whose value is the natural logarithm of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias naturalLogarithm
    */
  def ln(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base x logarithm of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias logarithm
    */
  def log(): Decimal = js.native
  def log(n: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base x logarithm of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias log
    */
  def logarithm(): Decimal = js.native
  def logarithm(n: Value): Decimal = js.native
  /**
    * Returns true if the value of this Decimal is less than the value of x, otherwise returns false.
    *
    * @alias lessThan
    */
  def lt(x: Value): Boolean = js.native
  /**
    * Returns true if the value of this Decimal is less than or equal to the value of x, otherwise returns false.
    *
    * @alias lessThanOrEqualTo
    */
  def lte(x: Value): Boolean = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal minus x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias sub
    */
  def minus(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal modulo x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The value returned, and in particular its sign, is dependent on the value of the modulo property of this Decimal's constructor.
    * If it is 1 (default value), the result will have the same sign as this Decimal,
    * and it will match that of Javascript's % operator (within the limits of double precision) and BigDecimal's remainder method.
    *
    * @alias modulo
    */
  def mod(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal modulo x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The value returned, and in particular its sign, is dependent on the value of the modulo property of this Decimal's constructor.
    * If it is 1 (default value), the result will have the same sign as this Decimal,
    * and it will match that of Javascript's % operator (within the limits of double precision) and BigDecimal's remainder method.
    *
    * @alias mod
    */
  def modulo(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal times x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias times
    */
  def mul(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base e (Euler's number, the base of the natural logarithm) exponential of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias exp
    */
  def naturalExponential(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the natural logarithm of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias ln
    */
  def naturalLogarithm(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal negated, i.e. multiplied by -1.
    *
    * @alias negated
    */
  def neg(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal negated, i.e. multiplied by -1.
    *
    * @alias neg
    */
  def negated(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal plus x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias add
    */
  def plus(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal raised to the power x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will almost always be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    * If a result is incorrectly rounded the maximum error will be 1 ulp (unit in the last place).
    *
    * @alias toPower
    */
  def pow(x: Value): Decimal = js.native
  /**
    * Returns the number of significant digits of the value of this Decimal.
    *
    * @param includeZeros If it is true or 1 then any trailing zeros of the integer part of a number are counted as significant digits,
    *                     otherwise they are not.
    * @alias sd
    */
  def precision(): Double = js.native
  def precision(includeZeros: Boolean): Double = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to a whole number using rounding mode rounding.
    */
  def round(): Decimal = js.native
  /**
    * Returns the number of significant digits of the value of this Decimal.
    *
    * @param includeZeros If it is true or 1 then any trailing zeros of the integer part of a number are counted as significant digits,
    *                     otherwise they are not.
    * @alias precision
    */
  def sd(): Double = js.native
  def sd(includeZeros: Boolean): Double = js.native
  /**
    * Returns a new Decimal whose value is the sine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias sine
    */
  def sin(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the sine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias sin
    */
  def sine(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic sine of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias hyperbolicSine
    */
  def sinh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the square root of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    *
    * @alias squareRoot
    */
  def sqrt(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the square root of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    *
    * @alias sqrt
    */
  def squareRoot(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal minus x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias minus
    */
  def sub(x: Value): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the tangent of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias tangent
    */
  def tan(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the tangent of the value in radians of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias tan
    */
  def tangent(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic tangent in radians of the value of this Decimal,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias hyperbolicTangent
    */
  def tanh(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal times x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * @alias mul
    */
  def times(x: Value): Decimal = js.native
  /**
    * Returns a string representing the value of this Decimal in binary, rounded to sd significant digits using rounding mode rm.
    */
  def toBinary(): String = js.native
  def toBinary(significantDigits: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal in binary, rounded to sd significant digits using rounding mode rm.
    */
  def toBinary(significantDigits: Double, rounding: Rounding): String = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to dp decimal places using rounding mode rm.
    *
    * @alias toDecimalPlaces
    */
  def toDP(): Decimal = js.native
  def toDP(decimalPlaces: Double): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to dp decimal places using rounding mode rm.
    *
    * @alias toDecimalPlaces
    */
  def toDP(decimalPlaces: Double, rounding: Rounding): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to dp decimal places using rounding mode rm.
    *
    * @alias toDP
    */
  def toDecimalPlaces(): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: Double): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to dp decimal places using rounding mode rm.
    *
    * @alias toDP
    */
  def toDecimalPlaces(decimalPlaces: Double, rounding: Rounding): Decimal = js.native
  /**
    * Returns a string representing the value of this Decimal in exponential notation rounded using rounding mode rm to dp decimal places,
    * i.e with one digit before the decimal point and dp digits after it.
    *
    * If the value of this Decimal in exponential notation has fewer than dp fraction digits,
    * the return value will be appended with zeros accordingly.
    */
  def toExponential(): String = js.native
  def toExponential(decimalPlaces: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal in exponential notation rounded using rounding mode rm to dp decimal places,
    * i.e with one digit before the decimal point and dp digits after it.
    *
    * If the value of this Decimal in exponential notation has fewer than dp fraction digits,
    * the return value will be appended with zeros accordingly.
    */
  def toExponential(decimalPlaces: Double, rounding: Rounding): String = js.native
  /**
    * Returns a string representing the value of this Decimal in normal (fixed-point) notation rounded to dp decimal places using rounding mode rm.
    *
    * If the value of this Decimal in normal notation has fewer than dp fraction digits, the return value will be appended with zeros accordingly.
    *
    * Unlike Number.prototype.toFixed, which returns exponential notation if a number is greater or equal to 1021, this method will always return normal notation.
    */
  def toFixed(): String = js.native
  def toFixed(decimalPlaces: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal in normal (fixed-point) notation rounded to dp decimal places using rounding mode rm.
    *
    * If the value of this Decimal in normal notation has fewer than dp fraction digits, the return value will be appended with zeros accordingly.
    *
    * Unlike Number.prototype.toFixed, which returns exponential notation if a number is greater or equal to 1021, this method will always return normal notation.
    */
  def toFixed(decimalPlaces: Double, rounding: Rounding): String = js.native
  /**
    * Returns an array of two Decimals representing the value of this Decimal as a simple fraction with an integer numerator and an integer denominator.
    * The denominator will be a positive non-zero value less than or equal to maxDenominator.
    *
    * If a maximum denominator is omitted, the denominator will be the lowest value necessary to represent the number exactly.
    */
  def toFraction(): js.Array[Decimal] = js.native
  def toFraction(maxDenominator: Value): js.Array[Decimal] = js.native
  /**
    * Returns a string representing the value of this Decimal in hexadecimal, rounded to sd significant digits using rounding mode rm.
    *
    * @alias toHexadecimal
    */
  def toHex(): String = js.native
  def toHex(significantDigits: Double): String = js.native
  def toHex(significantDigits: Double, rounding: Rounding): String = js.native
  /**
    * Returns a string representing the value of this Decimal in hexadecimal, rounded to sd significant digits using rounding mode rm.
    *
    * @alias toHex
    */
  def toHexadecimal(): String = js.native
  def toHexadecimal(significantDigits: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal in hexadecimal, rounded to sd significant digits using rounding mode rm.
    *
    * @alias toHex
    */
  def toHexadecimal(significantDigits: Double, rounding: Rounding): String = js.native
  /**
    * Same as valueOf
    */
  def toJSON(): String = js.native
  /**
    * Returns a new Decimal whose value is the nearest multiple of x in the direction of rounding mode rm, or rounding if rm is omitted,
    * to the value of this Decimal.
    *
    * The return value will always have the same sign as this Decimal, unless either this Decimal or x is NaN,
    * in which case the return value will be also be NaN.
    */
  def toNearest(): Decimal = js.native
  def toNearest(x: Value): Decimal = js.native
  def toNearest(x: Value, rounding: Rounding): Decimal = js.native
  /**
    * Returns the value of this Decimal converted to a primitive number.
    *
    * Type coercion with, for example, JavaScript's unary plus operator will also work,
    * except that a Decimal with the value minus zero will convert to positive zero.
    */
  def toNumber(): Double = js.native
  /**
    * Returns a string representing the value of this Decimal in octal, rounded to sd significant digits using rounding mode rm.
    */
  def toOctal(): String = js.native
  def toOctal(significantDigits: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal in octal, rounded to sd significant digits using rounding mode rm.
    */
  def toOctal(significantDigits: Double, rounding: Rounding): String = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal raised to the power x,
    * rounded to precision significant digits using rounding mode rounding.
    *
    * The return value will almost always be correctly rounded,
    * i.e. rounded as if the result was first calculated to an infinite number of correct digits before rounding.
    * If a result is incorrectly rounded the maximum error will be 1 ulp (unit in the last place).
    *
    * @alias pow
    */
  def toPower(x: Value): Decimal = js.native
  /**
    * Returns a string representing the value of this Decimal rounded to sd significant digits using rounding mode rm.
    */
  def toPrecision(): String = js.native
  def toPrecision(significantDigits: Double): String = js.native
  /**
    * Returns a string representing the value of this Decimal rounded to sd significant digits using rounding mode rm.
    */
  def toPrecision(significantDigits: Double, rounding: Rounding): String = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to sd significant digits using rounding mode rm.
    *
    * @alias toSignificantDigits
    */
  def toSD(): Decimal = js.native
  def toSD(significantDigits: Double): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to sd significant digits using rounding mode rm.
    *
    * @alias toSignificantDigits
    */
  def toSD(significantDigits: Double, rounding: Rounding): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to sd significant digits using rounding mode rm.
    *
    * @alias toSD
    */
  def toSignificantDigits(): Decimal = js.native
  def toSignificantDigits(significantDigits: Double): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal rounded to sd significant digits using rounding mode rm.
    *
    * @alias toSD
    */
  def toSignificantDigits(significantDigits: Double, rounding: Rounding): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal truncated to a whole number.
    *
    * @alias truncated
    */
  def trunc(): Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of this Decimal truncated to a whole number.
    *
    * @alias trunc
    */
  def truncated(): Decimal = js.native
}

/* static members */
@JSGlobal("adone.math.Decimal")
@js.native
object Decimal extends js.Object {
  val Decimal: js.UndefOr[Constructor] = js.native
  /**
    * Not a rounding mode
    */
  val EUCLID: `9` = js.native
  /**
    * Rounds towards Infinity
    */
  val ROUND_CEIL: `2` = js.native
  /**
    * Rounds towards zero
    */
  val ROUND_DOWN: `1` = js.native
  /**
    * Rounds towards -Infinity
    */
  val ROUND_FLOOR: `3` = js.native
  /**
    * Rounds towards nearest neighbour.
    *
    * If equidistant, rounds towards Infinity
    */
  val ROUND_HALF_CEIL: `7` = js.native
  /**
    * Rounds towards nearest neighbour.
    *
    * If equidistant, rounds towards zero
    */
  val ROUND_HALF_DOWN: `5` = js.native
  /**
    * Rounds towards nearest neighbour.
    *
    * If equidistant, rounds towards even neighbour
    */
  val ROUND_HALF_EVEN: `6` = js.native
  /**
    * Rounds towards nearest neighbour.
    *
    * If equidistant, rounds towards -Infinity
    */
  val ROUND_HALF_FLOOR: `8` = js.native
  /**
    * Rounds towards nearest neighbour.
    *
    * If equidistant, rounds away from zero
    */
  val ROUND_HALF_UP: `4` = js.native
  /**
    * Rounds away from zero
    */
  val ROUND_UP: `0` = js.native
  val crypto: Boolean = js.native
  val default: js.UndefOr[Constructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  /**
    * The modulo mode used when calculating the modulus: a mod n.
    *
    * The quotient, q = a / n, is calculated according to the rounding mode that corresponds to the chosen modulo mode.
    *
    * The remainder, r, is calculated as: r = a - n * q.
    */
  val modulo: Modulo = js.native
  /**
    * The maximum number of significant digits of the result of an operation.
    */
  val precision: Double = js.native
  /**
    * The default rounding mode used when rounding the result of an operation to precision significant digits, and when rounding
    * the return value of the round, toBinary, toDecimalPlaces, toExponential, toFixed, toHexadecimal, toNearest, toOctal,
    * toPrecision and toSignificantDigits methods.
    */
  val rounding: Rounding = js.native
  /**
    * The negative exponent value at and below which toString returns exponential notation.
    *
    * JavaScript numbers use exponential notation for negative exponents of -7 and below.
    */
  val toExpNeg: Double = js.native
  /**
    * The positive exponent value at and above which toString returns exponential notation.
    *
    * JavaScript numbers use exponential notation for positive exponents of 20 and above.
    */
  val toExpPos: Double = js.native
  /**
    * Returns a new Decimal whose value is the absolute value of x
    */
  def abs(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse cosine in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def acos(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse cosine in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def acosh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of x + y, rounded to precision significant digits using rounding mode rounding.
    */
  def add(x: Value, y: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse sine in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def asin(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic sine in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def asinh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse tangent in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def atan(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse tangent in radians of the quotient of y and x, rounded to precision significant digits using rounding mode rounding.
    *
    * The signs of y and x are used to determine the quadrant of the result.
    */
  def atan2(y: Value, x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic tangent in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def atanh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the cube root of x, rounded to precision significant digits using rounding mode rounding.
    */
  def cbrt(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of x rounded to a whole number in the direction of positive Infinity.
    */
  def ceil(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  def clone(`object`: Config): Constructor = js.native
  /**
    * Configures the 'global' settings for this particular Decimal constructor, i.e. the settings which apply to operations performed on the Decimal instances created by it.
    *
    * @alias set
    */
  def config(`object`: Config): Constructor = js.native
  /**
    * Returns a new Decimal whose value is the cosine of the value in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def cos(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the inverse hyperbolic cosine in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def cosh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of x divided by x, rounded to precision significant digits using rounding mode rounding.
    */
  def div(x: Value, y: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base e (Euler's number, the base of the natural logarithm) exponential of x, rounded to precision significant digits using rounding mode rounding.
    */
  def exp(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the value of x rounded to a whole number in the direction of negative Infinity.
    */
  def floor(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the square root of the sum of the squares of the arguments, rounded to precision significant digits using rounding mode rounding.
    */
  def hypot(x: Value*): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns true if object is a Decimal instance (where Decimal is any Decimal constructor), or false if it is not.
    */
  def isDecimal(`object`: js.Any): Boolean = js.native
  /**
    * Returns a new Decimal whose value is the natural logarithm of x, rounded to precision significant digits using rounding mode rounding.
    */
  def ln(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base x logarithm of x, rounded to precision significant digits using rounding mode rounding.
    *
    * @param base logarithm base, default is 10
    */
  def log(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  def log(x: Value, base: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base 10 logarithm of x, rounded to precision significant digits using rounding mode rounding.
    */
  def log10(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the base 2 logarithm of x, rounded to precision significant digits using rounding mode rounding.
    */
  def log2(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the maximum of the arguments.
    */
  def max(x: Value*): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the minimum of the arguments.
    */
  def min(x: Value*): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is x modulo y, rounded to precision significant digits using rounding mode rounding.
    */
  def mod(x: Value, y: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is x times y, rounded to precision significant digits using rounding mode rounding.
    */
  def mul(x: Value, y: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is base raised to the power exponent, rounded to precision significant digits using rounding mode rounding.
    */
  def pow(base: Value, exponent: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal with a pseudo-random value equal to or greater than 0 and less than 1.
    *
    * The return value will have dp decimal places (or less if trailing zeros are produced). If dp is omitted then the number of decimal places will default to the current precision setting.
    */
  def random(): typings.adone.adoneNs.mathNs.Decimal = js.native
  def random(significantDigits: Double): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is x rounded to a whole number using rounding mode rounding.
    */
  def round(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Configures the 'global' settings for this particular Decimal constructor, i.e. the settings which apply to operations performed on the Decimal instances created by it.
    *
    * @alias config
    */
  def set(`object`: Config): Constructor = js.native
  /**
    * 1	if the value of x is non-zero and its sign is positive
    *
    * -1	if the value of x is non-zero and its sign is negative
    *
    * 0	if the value of x is positive zero
    *
    * -0	if the value of x is negative zero
    *
    * NaN	if the value of x is NaN
    */
  def sign(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the sine of the value in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def sin(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic sine of the value in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def sinh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the square root of x, rounded to precision significant digits using rounding mode rounding.
    */
  def sqrt(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is x minus y, rounded to precision significant digits using rounding mode rounding.
    */
  def sub(x: Value, y: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the tangent of the value in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def tan(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is the hyperbolic tangent of the value in radians of x, rounded to precision significant digits using rounding mode rounding.
    */
  def tanh(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
  /**
    * Returns a new Decimal whose value is x truncated to a whole number.
    */
  def trunc(x: Value): typings.adone.adoneNs.mathNs.Decimal = js.native
}

