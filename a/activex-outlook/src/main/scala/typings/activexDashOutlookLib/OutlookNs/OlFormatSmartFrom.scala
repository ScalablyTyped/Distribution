package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatSmartFrom extends js.Object

@JSGlobal("Outlook.OlFormatSmartFrom")
@js.native
object OlFormatSmartFrom extends js.Object {
  @js.native
  sealed trait olFormatSmartFromFromOnly
    extends activexDashOutlookLib.OutlookNs.OlFormatSmartFrom
  
  @js.native
  sealed trait olFormatSmartFromFromTo
    extends activexDashOutlookLib.OutlookNs.OlFormatSmartFrom
  
  /* 2 */ val olFormatSmartFromFromOnly: olFormatSmartFromFromOnly with scala.Double = js.native
  /* 1 */ val olFormatSmartFromFromTo: olFormatSmartFromFromTo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatSmartFrom with scala.Double] = js.native
}

