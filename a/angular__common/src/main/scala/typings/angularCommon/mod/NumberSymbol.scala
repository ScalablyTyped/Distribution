package typings.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberSymbol with Double] = js.native
  /* 12 */ @js.native
  object CurrencyDecimal extends TopLevel[CurrencyDecimal with Double]
  
  /* 13 */ @js.native
  object CurrencyGroup extends TopLevel[CurrencyGroup with Double]
  
  /* 0 */ @js.native
  object Decimal extends TopLevel[Decimal with Double]
  
  /* 6 */ @js.native
  object Exponential extends TopLevel[Exponential with Double]
  
  /* 1 */ @js.native
  object Group extends TopLevel[Group with Double]
  
  /* 9 */ @js.native
  object Infinity extends TopLevel[Infinity with Double]
  
  /* 2 */ @js.native
  object List extends TopLevel[List with Double]
  
  /* 5 */ @js.native
  object MinusSign extends TopLevel[MinusSign with Double]
  
  /* 10 */ @js.native
  object NaN extends TopLevel[NaN with Double]
  
  /* 8 */ @js.native
  object PerMille extends TopLevel[PerMille with Double]
  
  /* 3 */ @js.native
  object PercentSign extends TopLevel[PercentSign with Double]
  
  /* 4 */ @js.native
  object PlusSign extends TopLevel[PlusSign with Double]
  
  /* 7 */ @js.native
  object SuperscriptingExponent extends TopLevel[SuperscriptingExponent with Double]
  
  /* 11 */ @js.native
  object TimeSeparator extends TopLevel[TimeSeparator with Double]
  
}

