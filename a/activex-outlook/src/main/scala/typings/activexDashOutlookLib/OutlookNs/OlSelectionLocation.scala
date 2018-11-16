package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSelectionLocation extends js.Object

@JSGlobal("Outlook.OlSelectionLocation")
@js.native
object OlSelectionLocation extends js.Object {
  @js.native
  sealed trait olAttachmentWell
    extends activexDashOutlookLib.OutlookNs.OlSelectionLocation
  
  @js.native
  sealed trait olDailyTaskList
    extends activexDashOutlookLib.OutlookNs.OlSelectionLocation
  
  @js.native
  sealed trait olToDoBarAppointmentList
    extends activexDashOutlookLib.OutlookNs.OlSelectionLocation
  
  @js.native
  sealed trait olToDoBarTaskList
    extends activexDashOutlookLib.OutlookNs.OlSelectionLocation
  
  @js.native
  sealed trait olViewList
    extends activexDashOutlookLib.OutlookNs.OlSelectionLocation
  
  /* 4 */ val olAttachmentWell: olAttachmentWell with scala.Double = js.native
  /* 3 */ val olDailyTaskList: olDailyTaskList with scala.Double = js.native
  /* 2 */ val olToDoBarAppointmentList: olToDoBarAppointmentList with scala.Double = js.native
  /* 1 */ val olToDoBarTaskList: olToDoBarTaskList with scala.Double = js.native
  /* 0 */ val olViewList: olViewList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSelectionLocation with scala.Double] = js.native
}

