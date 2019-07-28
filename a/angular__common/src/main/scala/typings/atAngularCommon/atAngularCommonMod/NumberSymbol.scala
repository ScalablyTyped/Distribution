package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberSymbol extends js.Object

@JSImport("@angular/common", "NumberSymbol")
@js.native
object NumberSymbol extends js.Object {
  /**
    * Decimal separator for currency values (fallback to `Decimal`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyDecimal extends NumberSymbol
  
  /**
    * Group separator for currency values (fallback to `Group`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyGroup extends NumberSymbol
  
  /**
    * Decimal separator.
    * For `en-US`, the dot character.
    * Example : 2,345`.`67
    */
  @js.native
  sealed trait Decimal extends NumberSymbol
  
  /**
    * Computer notation for exponential value (n times a power of 10).
    * Example: 1.2E3
    */
  @js.native
  sealed trait Exponential extends NumberSymbol
  
  /**
    * Grouping separator, typically for thousands.
    * For `en-US`, the comma character.
    * Example: 2`,`345.67
    */
  @js.native
  sealed trait Group extends NumberSymbol
  
  /**
    * Infinity, can be used with plus and minus.
    * Example: ∞, +∞, -∞
    */
  @js.native
  sealed trait Infinity extends NumberSymbol
  
  /**
    * List-item separator.
    * Example: "one, two, and three"
    */
  @js.native
  sealed trait List extends NumberSymbol
  
  /**
    * Sign for negative numbers.
    * Example: -23
    */
  @js.native
  sealed trait MinusSign extends NumberSymbol
  
  /**
    * Not a number.
    * Example: NaN
    */
  @js.native
  sealed trait NaN extends NumberSymbol
  
  /**
    * Sign for permille (out of 1000).
    * Example: 23.4‰
    */
  @js.native
  sealed trait PerMille extends NumberSymbol
  
  /**
    * Sign for percentage (out of 100).
    * Example: 23.4%
    */
  @js.native
  sealed trait PercentSign extends NumberSymbol
  
  /**
    * Sign for positive numbers.
    * Example: +23
    */
  @js.native
  sealed trait PlusSign extends NumberSymbol
  
  /**
    * Human-readable format of exponential.
    * Example: 1.2x103
    */
  @js.native
  sealed trait SuperscriptingExponent extends NumberSymbol
  
  /**
    * Symbol used between time units.
    * Example: 10:52
    */
  @js.native
  sealed trait TimeSeparator extends NumberSymbol
  
  /* 12 */ val CurrencyDecimal: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.CurrencyDecimal with Double = js.native
  /* 13 */ val CurrencyGroup: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.CurrencyGroup with Double = js.native
  /* 0 */ val Decimal: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.Decimal with Double = js.native
  /* 6 */ val Exponential: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.Exponential with Double = js.native
  /* 1 */ val Group: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.Group with Double = js.native
  /* 9 */ val Infinity: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.Infinity with Double = js.native
  /* 2 */ val List: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.List with Double = js.native
  /* 5 */ val MinusSign: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.MinusSign with Double = js.native
  /* 10 */ val NaN: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.NaN with Double = js.native
  /* 8 */ val PerMille: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.PerMille with Double = js.native
  /* 3 */ val PercentSign: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.PercentSign with Double = js.native
  /* 4 */ val PlusSign: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.PlusSign with Double = js.native
  /* 7 */ val SuperscriptingExponent: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.SuperscriptingExponent with Double = js.native
  /* 11 */ val TimeSeparator: typings.atAngularCommon.atAngularCommonMod.NumberSymbol.TimeSeparator with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberSymbol with Double] = js.native
}

