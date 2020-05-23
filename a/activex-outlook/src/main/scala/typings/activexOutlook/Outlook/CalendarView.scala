package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarView extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules
  var BoldDatesWithItems: Boolean
  var BoldSubjects: Boolean
  var CalendarViewMode: OlCalendarViewMode
  val Class: OlObjectClass
  val DayWeekFont: ViewFont
  val DayWeekTimeFont: ViewFont
  var DayWeekTimeScale: OlDayWeekTimeScale
  var DaysInMultiDayMode: Double
  val DisplayedDates: js.Any
  var EndField: String
  var Filter: String
  var Language: String
  var LockUserChanges: Boolean
  val MonthFont: ViewFont
  var MonthShowEndTime: Boolean
  var Name: String
  @JSName("Outlook.CalendarView_typekey")
  var OutlookDotCalendarView_typekey: CalendarView
  val Parent: js.Any
  val SaveOption: OlViewSaveOption
  val SelectedEndTime: VarDate
  val SelectedStartTime: VarDate
  val Session: NameSpace
  val Standard: Boolean
  var StartField: String
  val ViewType: OlViewType
  var XML: String
  def Apply(): Unit
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  def Delete(): Unit
  def GoToDate(Date: VarDate): Unit
  def Reset(): Unit
  def Save(): Unit
}

object CalendarView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    AutoFormatRules: AutoFormatRules,
    BoldDatesWithItems: Boolean,
    BoldSubjects: Boolean,
    CalendarViewMode: OlCalendarViewMode,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    DayWeekFont: ViewFont,
    DayWeekTimeFont: ViewFont,
    DayWeekTimeScale: OlDayWeekTimeScale,
    DaysInMultiDayMode: Double,
    Delete: () => Unit,
    DisplayedDates: js.Any,
    EndField: String,
    Filter: String,
    GoToDate: VarDate => Unit,
    Language: String,
    LockUserChanges: Boolean,
    MonthFont: ViewFont,
    MonthShowEndTime: Boolean,
    Name: String,
    OutlookDotCalendarView_typekey: CalendarView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    SelectedEndTime: VarDate,
    SelectedStartTime: VarDate,
    Session: NameSpace,
    Standard: Boolean,
    StartField: String,
    ViewType: OlViewType,
    XML: String
  ): CalendarView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], BoldDatesWithItems = BoldDatesWithItems.asInstanceOf[js.Any], BoldSubjects = BoldSubjects.asInstanceOf[js.Any], CalendarViewMode = CalendarViewMode.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DayWeekFont = DayWeekFont.asInstanceOf[js.Any], DayWeekTimeFont = DayWeekTimeFont.asInstanceOf[js.Any], DayWeekTimeScale = DayWeekTimeScale.asInstanceOf[js.Any], DaysInMultiDayMode = DaysInMultiDayMode.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayedDates = DisplayedDates.asInstanceOf[js.Any], EndField = EndField.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MonthFont = MonthFont.asInstanceOf[js.Any], MonthShowEndTime = MonthShowEndTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], SelectedEndTime = SelectedEndTime.asInstanceOf[js.Any], SelectedStartTime = SelectedStartTime.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], StartField = StartField.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CalendarView_typekey")(OutlookDotCalendarView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarView]
  }
}

