package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlCalendarViewMode
import typings.activexOutlook.Outlook.OlDayWeekTimeScale
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarView")
@js.native
class CalendarView protected ()
  extends typings.activexOutlook.Outlook.CalendarView {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  /* CompleteClass */
  override var BoldDatesWithItems: Boolean = js.native
  /* CompleteClass */
  override var BoldSubjects: Boolean = js.native
  /* CompleteClass */
  override var CalendarViewMode: OlCalendarViewMode = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val DayWeekFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override val DayWeekTimeFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var DayWeekTimeScale: OlDayWeekTimeScale = js.native
  /* CompleteClass */
  override var DaysInMultiDayMode: Double = js.native
  /* CompleteClass */
  override val DisplayedDates: js.Any = js.native
  /* CompleteClass */
  override var EndField: String = js.native
  /* CompleteClass */
  override var Filter: String = js.native
  /* CompleteClass */
  override var Language: String = js.native
  /* CompleteClass */
  override var LockUserChanges: Boolean = js.native
  /* CompleteClass */
  override val MonthFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var MonthShowEndTime: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.CalendarView_typekey")
  override var OutlookDotCalendarView_typekey: typings.activexOutlook.Outlook.CalendarView = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  /* CompleteClass */
  override val SelectedEndTime: VarDate = js.native
  /* CompleteClass */
  override val SelectedStartTime: VarDate = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Standard: Boolean = js.native
  /* CompleteClass */
  override var StartField: String = js.native
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  /* CompleteClass */
  override var XML: String = js.native
  /* CompleteClass */
  override def Apply(): Unit = js.native
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  /* CompleteClass */
  override def Reset(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

