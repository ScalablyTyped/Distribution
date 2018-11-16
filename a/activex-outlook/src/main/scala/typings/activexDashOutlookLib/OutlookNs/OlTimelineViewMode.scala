package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTimelineViewMode extends js.Object

@JSGlobal("Outlook.OlTimelineViewMode")
@js.native
object OlTimelineViewMode extends js.Object {
  @js.native
  sealed trait olTimelineViewDay
    extends activexDashOutlookLib.OutlookNs.OlTimelineViewMode
  
  @js.native
  sealed trait olTimelineViewMonth
    extends activexDashOutlookLib.OutlookNs.OlTimelineViewMode
  
  @js.native
  sealed trait olTimelineViewWeek
    extends activexDashOutlookLib.OutlookNs.OlTimelineViewMode
  
  /* 0 */ val olTimelineViewDay: olTimelineViewDay with scala.Double = js.native
  /* 2 */ val olTimelineViewMonth: olTimelineViewMonth with scala.Double = js.native
  /* 1 */ val olTimelineViewWeek: olTimelineViewWeek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTimelineViewMode with scala.Double] = js.native
}

