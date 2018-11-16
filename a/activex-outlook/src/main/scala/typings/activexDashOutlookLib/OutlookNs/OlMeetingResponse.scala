package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMeetingResponse extends js.Object

@JSGlobal("Outlook.OlMeetingResponse")
@js.native
object OlMeetingResponse extends js.Object {
  @js.native
  sealed trait olMeetingAccepted
    extends activexDashOutlookLib.OutlookNs.OlMeetingResponse
  
  @js.native
  sealed trait olMeetingDeclined
    extends activexDashOutlookLib.OutlookNs.OlMeetingResponse
  
  @js.native
  sealed trait olMeetingTentative
    extends activexDashOutlookLib.OutlookNs.OlMeetingResponse
  
  /* 3 */ val olMeetingAccepted: olMeetingAccepted with scala.Double = js.native
  /* 4 */ val olMeetingDeclined: olMeetingDeclined with scala.Double = js.native
  /* 2 */ val olMeetingTentative: olMeetingTentative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMeetingResponse with scala.Double] = js.native
}

