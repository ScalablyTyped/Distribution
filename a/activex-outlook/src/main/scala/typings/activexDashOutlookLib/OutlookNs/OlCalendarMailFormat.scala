package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlCalendarMailFormat extends js.Object

@JSGlobal("Outlook.OlCalendarMailFormat")
@js.native
object OlCalendarMailFormat extends js.Object {
  @js.native
  sealed trait olCalendarMailFormatDailySchedule
    extends activexDashOutlookLib.OutlookNs.OlCalendarMailFormat
  
  @js.native
  sealed trait olCalendarMailFormatEventList
    extends activexDashOutlookLib.OutlookNs.OlCalendarMailFormat
  
  /* 0 */ val olCalendarMailFormatDailySchedule: olCalendarMailFormatDailySchedule with scala.Double = js.native
  /* 1 */ val olCalendarMailFormatEventList: olCalendarMailFormatEventList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlCalendarMailFormat with scala.Double] = js.native
}

