package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlCalendarViewMode extends js.Object

@JSGlobal("Outlook.OlCalendarViewMode")
@js.native
object OlCalendarViewMode extends js.Object {
  @js.native
  sealed trait olCalendarView5DayWeek
    extends activexDashOutlookLib.OutlookNs.OlCalendarViewMode
  
  @js.native
  sealed trait olCalendarViewDay
    extends activexDashOutlookLib.OutlookNs.OlCalendarViewMode
  
  @js.native
  sealed trait olCalendarViewMonth
    extends activexDashOutlookLib.OutlookNs.OlCalendarViewMode
  
  @js.native
  sealed trait olCalendarViewMultiDay
    extends activexDashOutlookLib.OutlookNs.OlCalendarViewMode
  
  @js.native
  sealed trait olCalendarViewWeek
    extends activexDashOutlookLib.OutlookNs.OlCalendarViewMode
  
  /* 4 */ val olCalendarView5DayWeek: olCalendarView5DayWeek with scala.Double = js.native
  /* 0 */ val olCalendarViewDay: olCalendarViewDay with scala.Double = js.native
  /* 2 */ val olCalendarViewMonth: olCalendarViewMonth with scala.Double = js.native
  /* 3 */ val olCalendarViewMultiDay: olCalendarViewMultiDay with scala.Double = js.native
  /* 1 */ val olCalendarViewWeek: olCalendarViewWeek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlCalendarViewMode with scala.Double] = js.native
}

