package typings
package atAngularCommonLib.atAngularCommonMod

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
  sealed trait CurrencyDecimal
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Group separator for currency values (fallback to `Group`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyGroup
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Decimal separator.
    * For `en-US`, the dot character.
    * Example : 2,345`.`67
    */
  @js.native
  sealed trait Decimal
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Computer notation for exponential value (n times a power of 10).
    * Example: 1.2E3
    */
  @js.native
  sealed trait Exponential
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Grouping separator, typically for thousands.
    * For `en-US`, the comma character.
    * Example: 2`,`345.67
    */
  @js.native
  sealed trait Group
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Infinity, can be used with plus and minus.
    * Example: ∞, +∞, -∞
    */
  @js.native
  sealed trait Infinity
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * List-item separator.
    * Example: "one, two, and three"
    */
  @js.native
  sealed trait List
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Sign for negative numbers.
    * Example: -23
    */
  @js.native
  sealed trait MinusSign
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Not a number.
    * Example: NaN
    */
  @js.native
  sealed trait NaN
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Sign for permille (out of 1000).
    * Example: 23.4‰
    */
  @js.native
  sealed trait PerMille
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Sign for percentage (out of 100).
    * Example: 23.4%
    */
  @js.native
  sealed trait PercentSign
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Sign for positive numbers.
    * Example: +23
    */
  @js.native
  sealed trait PlusSign
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Human-readable format of exponential.
    * Example: 1.2x103
    */
  @js.native
  sealed trait SuperscriptingExponent
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /**
    * Symbol used between time units.
    * Example: 10:52
    */
  @js.native
  sealed trait TimeSeparator
    extends atAngularCommonLib.atAngularCommonMod.NumberSymbol
  
  /* 12 */ val CurrencyDecimal: CurrencyDecimal with scala.Double = js.native
  /* 13 */ val CurrencyGroup: CurrencyGroup with scala.Double = js.native
  /* 0 */ val Decimal: Decimal with scala.Double = js.native
  /* 6 */ val Exponential: Exponential with scala.Double = js.native
  /* 1 */ val Group: Group with scala.Double = js.native
  /* 9 */ val Infinity: Infinity with scala.Double = js.native
  /* 2 */ val List: List with scala.Double = js.native
  /* 5 */ val MinusSign: MinusSign with scala.Double = js.native
  /* 10 */ val NaN: NaN with scala.Double = js.native
  /* 8 */ val PerMille: PerMille with scala.Double = js.native
  /* 3 */ val PercentSign: PercentSign with scala.Double = js.native
  /* 4 */ val PlusSign: PlusSign with scala.Double = js.native
  /* 7 */ val SuperscriptingExponent: SuperscriptingExponent with scala.Double = js.native
  /* 11 */ val TimeSeparator: TimeSeparator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.NumberSymbol with scala.Double] = js.native
}

