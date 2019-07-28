package typings.adone

import org.scalablytyped.runtime.Instantiable1
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

@js.native
trait TypeofClassDecimal
  extends Instantiable1[/* x */ Value, typings.adone.adoneNs.mathNs.Decimal] {
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

