package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlCalendarDetail extends js.Object

@JSGlobal("Outlook.OlCalendarDetail")
@js.native
object OlCalendarDetail extends js.Object {
  @js.native
  sealed trait olFreeBusyAndSubject
    extends activexDashOutlookLib.OutlookNs.OlCalendarDetail
  
  @js.native
  sealed trait olFreeBusyOnly
    extends activexDashOutlookLib.OutlookNs.OlCalendarDetail
  
  @js.native
  sealed trait olFullDetails
    extends activexDashOutlookLib.OutlookNs.OlCalendarDetail
  
  /* 1 */ val olFreeBusyAndSubject: olFreeBusyAndSubject with scala.Double = js.native
  /* 0 */ val olFreeBusyOnly: olFreeBusyOnly with scala.Double = js.native
  /* 2 */ val olFullDetails: olFullDetails with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlCalendarDetail with scala.Double] = js.native
}

