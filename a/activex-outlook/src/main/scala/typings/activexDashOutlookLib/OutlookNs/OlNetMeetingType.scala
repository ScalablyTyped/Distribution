package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlNetMeetingType extends js.Object

@JSGlobal("Outlook.OlNetMeetingType")
@js.native
object OlNetMeetingType extends js.Object {
  @js.native
  sealed trait olExchangeConferencing
    extends activexDashOutlookLib.OutlookNs.OlNetMeetingType
  
  @js.native
  sealed trait olNetMeeting
    extends activexDashOutlookLib.OutlookNs.OlNetMeetingType
  
  @js.native
  sealed trait olNetShow
    extends activexDashOutlookLib.OutlookNs.OlNetMeetingType
  
  /* 2 */ val olExchangeConferencing: olExchangeConferencing with scala.Double = js.native
  /* 0 */ val olNetMeeting: olNetMeeting with scala.Double = js.native
  /* 1 */ val olNetShow: olNetShow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlNetMeetingType with scala.Double] = js.native
}

