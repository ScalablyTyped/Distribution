package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMeetingStatus extends js.Object

@JSGlobal("Outlook.OlMeetingStatus")
@js.native
object OlMeetingStatus extends js.Object {
  @js.native
  sealed trait olMeeting
    extends activexDashOutlookLib.OutlookNs.OlMeetingStatus
  
  @js.native
  sealed trait olMeetingCanceled
    extends activexDashOutlookLib.OutlookNs.OlMeetingStatus
  
  @js.native
  sealed trait olMeetingReceived
    extends activexDashOutlookLib.OutlookNs.OlMeetingStatus
  
  @js.native
  sealed trait olMeetingReceivedAndCanceled
    extends activexDashOutlookLib.OutlookNs.OlMeetingStatus
  
  @js.native
  sealed trait olNonMeeting
    extends activexDashOutlookLib.OutlookNs.OlMeetingStatus
  
  /* 1 */ val olMeeting: olMeeting with scala.Double = js.native
  /* 5 */ val olMeetingCanceled: olMeetingCanceled with scala.Double = js.native
  /* 3 */ val olMeetingReceived: olMeetingReceived with scala.Double = js.native
  /* 7 */ val olMeetingReceivedAndCanceled: olMeetingReceivedAndCanceled with scala.Double = js.native
  /* 0 */ val olNonMeeting: olNonMeeting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMeetingStatus with scala.Double] = js.native
}

