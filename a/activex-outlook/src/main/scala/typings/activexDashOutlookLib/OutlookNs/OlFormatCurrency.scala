package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatCurrency extends js.Object

@JSGlobal("Outlook.OlFormatCurrency")
@js.native
object OlFormatCurrency extends js.Object {
  @js.native
  sealed trait olFormatCurrencyDecimal
    extends activexDashOutlookLib.OutlookNs.OlFormatCurrency
  
  @js.native
  sealed trait olFormatCurrencyNonDecimal
    extends activexDashOutlookLib.OutlookNs.OlFormatCurrency
  
  /* 1 */ val olFormatCurrencyDecimal: olFormatCurrencyDecimal with scala.Double = js.native
  /* 2 */ val olFormatCurrencyNonDecimal: olFormatCurrencyNonDecimal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatCurrency with scala.Double] = js.native
}

