package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatPercent extends js.Object

@JSGlobal("Outlook.OlFormatPercent")
@js.native
object OlFormatPercent extends js.Object {
  @js.native
  sealed trait olFormatPercent1Decimal
    extends activexDashOutlookLib.OutlookNs.OlFormatPercent
  
  @js.native
  sealed trait olFormatPercent2Decimal
    extends activexDashOutlookLib.OutlookNs.OlFormatPercent
  
  @js.native
  sealed trait olFormatPercentAllDigits
    extends activexDashOutlookLib.OutlookNs.OlFormatPercent
  
  @js.native
  sealed trait olFormatPercentRounded
    extends activexDashOutlookLib.OutlookNs.OlFormatPercent
  
  /* 2 */ val olFormatPercent1Decimal: olFormatPercent1Decimal with scala.Double = js.native
  /* 3 */ val olFormatPercent2Decimal: olFormatPercent2Decimal with scala.Double = js.native
  /* 4 */ val olFormatPercentAllDigits: olFormatPercentAllDigits with scala.Double = js.native
  /* 1 */ val olFormatPercentRounded: olFormatPercentRounded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatPercent with scala.Double] = js.native
}

