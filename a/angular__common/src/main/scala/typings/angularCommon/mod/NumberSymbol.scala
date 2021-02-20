package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberSymbol extends StObject
@JSImport("@angular/common", "NumberSymbol")
@js.native
object NumberSymbol extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberSymbol with Double] = js.native
  
  /**
    * Decimal separator for currency values (fallback to `Decimal`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyDecimal extends NumberSymbol
  /* 12 */ val CurrencyDecimal: typings.angularCommon.mod.NumberSymbol.CurrencyDecimal with Double = js.native
  
  /**
    * Group separator for currency values (fallback to `Group`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyGroup extends NumberSymbol
  /* 13 */ val CurrencyGroup: typings.angularCommon.mod.NumberSymbol.CurrencyGroup with Double = js.native
  
  /**
    * Decimal separator.
    * For `en-US`, the dot character.
    * Example : 2,345`.`67
    */
  @js.native
  sealed trait Decimal extends NumberSymbol
  /* 0 */ val Decimal: typings.angularCommon.mod.NumberSymbol.Decimal with Double = js.native
  
  /**
    * Computer notation for exponential value (n times a power of 10).
    * Example: 1.2E3
    */
  @js.native
  sealed trait Exponential extends NumberSymbol
  /* 6 */ val Exponential: typings.angularCommon.mod.NumberSymbol.Exponential with Double = js.native
  
  /**
    * Grouping separator, typically for thousands.
    * For `en-US`, the comma character.
    * Example: 2`,`345.67
    */
  @js.native
  sealed trait Group extends NumberSymbol
  /* 1 */ val Group: typings.angularCommon.mod.NumberSymbol.Group with Double = js.native
  
  /**
    * Infinity, can be used with plus and minus.
    * Example: ∞, +∞, -∞
    */
  @js.native
  sealed trait Infinity extends NumberSymbol
  /* 9 */ val Infinity: typings.angularCommon.mod.NumberSymbol.Infinity with Double = js.native
  
  /**
    * List-item separator.
    * Example: "one, two, and three"
    */
  @js.native
  sealed trait List extends NumberSymbol
  /* 2 */ val List: typings.angularCommon.mod.NumberSymbol.List with Double = js.native
  
  /**
    * Sign for negative numbers.
    * Example: -23
    */
  @js.native
  sealed trait MinusSign extends NumberSymbol
  /* 5 */ val MinusSign: typings.angularCommon.mod.NumberSymbol.MinusSign with Double = js.native
  
  /**
    * Not a number.
    * Example: NaN
    */
  @js.native
  sealed trait NaN extends NumberSymbol
  /* 10 */ val NaN: typings.angularCommon.mod.NumberSymbol.NaN with Double = js.native
  
  /**
    * Sign for permille (out of 1000).
    * Example: 23.4‰
    */
  @js.native
  sealed trait PerMille extends NumberSymbol
  /* 8 */ val PerMille: typings.angularCommon.mod.NumberSymbol.PerMille with Double = js.native
  
  /**
    * Sign for percentage (out of 100).
    * Example: 23.4%
    */
  @js.native
  sealed trait PercentSign extends NumberSymbol
  /* 3 */ val PercentSign: typings.angularCommon.mod.NumberSymbol.PercentSign with Double = js.native
  
  /**
    * Sign for positive numbers.
    * Example: +23
    */
  @js.native
  sealed trait PlusSign extends NumberSymbol
  /* 4 */ val PlusSign: typings.angularCommon.mod.NumberSymbol.PlusSign with Double = js.native
  
  /**
    * Human-readable format of exponential.
    * Example: 1.2x103
    */
  @js.native
  sealed trait SuperscriptingExponent extends NumberSymbol
  /* 7 */ val SuperscriptingExponent: typings.angularCommon.mod.NumberSymbol.SuperscriptingExponent with Double = js.native
  
  /**
    * Symbol used between time units.
    * Example: 10:52
    */
  @js.native
  sealed trait TimeSeparator extends NumberSymbol
  /* 11 */ val TimeSeparator: typings.angularCommon.mod.NumberSymbol.TimeSeparator with Double = js.native
}
