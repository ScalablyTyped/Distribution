package typings.activexDashOutlook.OutlookNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarView")
@js.native
class CalendarView protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val AutoFormatRules: typings.activexDashOutlook.OutlookNs.AutoFormatRules = js.native
  var BoldDatesWithItems: Boolean = js.native
  var BoldSubjects: Boolean = js.native
  var CalendarViewMode: OlCalendarViewMode = js.native
  val Class: OlObjectClass = js.native
  val DayWeekFont: ViewFont = js.native
  val DayWeekTimeFont: ViewFont = js.native
  var DayWeekTimeScale: OlDayWeekTimeScale = js.native
  var DaysInMultiDayMode: Double = js.native
  val DisplayedDates: js.Any = js.native
  var EndField: String = js.native
  var Filter: String = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  val MonthFont: ViewFont = js.native
  var MonthShowEndTime: Boolean = js.native
  var Name: String = js.native
  var `Outlook.CalendarView_typekey`: CalendarView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val SelectedEndTime: VarDate = js.native
  val SelectedStartTime: VarDate = js.native
  val Session: NameSpace = js.native
  val Standard: Boolean = js.native
  var StartField: String = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

