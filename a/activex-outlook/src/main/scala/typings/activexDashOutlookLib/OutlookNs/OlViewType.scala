package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlViewType extends js.Object

@JSGlobal("Outlook.OlViewType")
@js.native
object OlViewType extends js.Object {
  @js.native
  sealed trait olBusinessCardView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olCalendarView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olCardView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olDailyTaskListView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olIconView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olTableView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  @js.native
  sealed trait olTimelineView
    extends activexDashOutlookLib.OutlookNs.OlViewType
  
  /* 5 */ val olBusinessCardView: olBusinessCardView with scala.Double = js.native
  /* 2 */ val olCalendarView: olCalendarView with scala.Double = js.native
  /* 1 */ val olCardView: olCardView with scala.Double = js.native
  /* 6 */ val olDailyTaskListView: olDailyTaskListView with scala.Double = js.native
  /* 3 */ val olIconView: olIconView with scala.Double = js.native
  /* 0 */ val olTableView: olTableView with scala.Double = js.native
  /* 4 */ val olTimelineView: olTimelineView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlViewType with scala.Double] = js.native
}

