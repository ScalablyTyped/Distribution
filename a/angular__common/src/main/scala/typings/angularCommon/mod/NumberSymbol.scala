package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberSymbol extends StObject
@JSImport("@angular/common", "NumberSymbol")
@js.native
object NumberSymbol extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberSymbol & Double] = js.native
  
  /**
    * Decimal separator for currency values (fallback to `Decimal`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyDecimal
    extends StObject
       with NumberSymbol
  /* 12 */ val CurrencyDecimal: typings.angularCommon.mod.NumberSymbol.CurrencyDecimal & Double = js.native
  
  /**
    * Group separator for currency values (fallback to `Group`).
    * Example: $2,345.67
    */
  @js.native
  sealed trait CurrencyGroup
    extends StObject
       with NumberSymbol
  /* 13 */ val CurrencyGroup: typings.angularCommon.mod.NumberSymbol.CurrencyGroup & Double = js.native
  
  /**
    * Decimal separator.
    * For `en-US`, the dot character.
    * Example : 2,345`.`67
    */
  @js.native
  sealed trait Decimal
    extends StObject
       with NumberSymbol
  /* 0 */ val Decimal: typings.angularCommon.mod.NumberSymbol.Decimal & Double = js.native
  
  /**
    * Computer notation for exponential value (n times a power of 10).
    * Example: 1.2E3
    */
  @js.native
  sealed trait Exponential
    extends StObject
       with NumberSymbol
  /* 6 */ val Exponential: typings.angularCommon.mod.NumberSymbol.Exponential & Double = js.native
  
  /**
    * Grouping separator, typically for thousands.
    * For `en-US`, the comma character.
    * Example: 2`,`345.67
    */
  @js.native
  sealed trait Group
    extends StObject
       with NumberSymbol
  /* 1 */ val Group: typings.angularCommon.mod.NumberSymbol.Group & Double = js.native
  
  /**
    * Infinity, can be used with plus and minus.
    * Example: ∞, +∞, -∞
    */
  @js.native
  sealed trait Infinity
    extends StObject
       with NumberSymbol
  /* 9 */ val Infinity: typings.angularCommon.mod.NumberSymbol.Infinity & Double = js.native
  
  /**
    * List-item separator.
    * Example: "one, two, and three"
    */
  @js.native
  sealed trait List
    extends StObject
       with NumberSymbol
  /* 2 */ val List: typings.angularCommon.mod.NumberSymbol.List & Double = js.native
  
  /**
    * Sign for negative numbers.
    * Example: -23
    */
  @js.native
  sealed trait MinusSign
    extends StObject
       with NumberSymbol
  /* 5 */ val MinusSign: typings.angularCommon.mod.NumberSymbol.MinusSign & Double = js.native
  
  /**
    * Not a number.
    * Example: NaN
    */
  @js.native
  sealed trait NaN
    extends StObject
       with NumberSymbol
  /* 10 */ val NaN: typings.angularCommon.mod.NumberSymbol.NaN & Double = js.native
  
  /**
    * Sign for permille (out of 1000).
    * Example: 23.4‰
    */
  @js.native
  sealed trait PerMille
    extends StObject
       with NumberSymbol
  /* 8 */ val PerMille: typings.angularCommon.mod.NumberSymbol.PerMille & Double = js.native
  
  /**
    * Sign for percentage (out of 100).
    * Example: 23.4%
    */
  @js.native
  sealed trait PercentSign
    extends StObject
       with NumberSymbol
  /* 3 */ val PercentSign: typings.angularCommon.mod.NumberSymbol.PercentSign & Double = js.native
  
  /**
    * Sign for positive numbers.
    * Example: +23
    */
  @js.native
  sealed trait PlusSign
    extends StObject
       with NumberSymbol
  /* 4 */ val PlusSign: typings.angularCommon.mod.NumberSymbol.PlusSign & Double = js.native
  
  /**
    * Human-readable format of exponential.
    * Example: 1.2x103
    */
  @js.native
  sealed trait SuperscriptingExponent
    extends StObject
       with NumberSymbol
  /* 7 */ val SuperscriptingExponent: typings.angularCommon.mod.NumberSymbol.SuperscriptingExponent & Double = js.native
  
  /**
    * Symbol used between time units.
    * Example: 10:52
    */
  @js.native
  sealed trait TimeSeparator
    extends StObject
       with NumberSymbol
  /* 11 */ val TimeSeparator: typings.angularCommon.mod.NumberSymbol.TimeSeparator & Double = js.native
}
