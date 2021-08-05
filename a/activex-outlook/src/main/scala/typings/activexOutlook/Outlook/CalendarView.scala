package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarView extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  def Apply(): Unit
  
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules
  
  var BoldDatesWithItems: Boolean
  
  var BoldSubjects: Boolean
  
  var CalendarViewMode: OlCalendarViewMode
  
  val Class: OlObjectClass
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  
  val DayWeekFont: ViewFont
  
  val DayWeekTimeFont: ViewFont
  
  var DayWeekTimeScale: OlDayWeekTimeScale
  
  var DaysInMultiDayMode: Double
  
  def Delete(): Unit
  
  val DisplayedDates: js.Any
  
  var EndField: String
  
  var Filter: String
  
  def GoToDate(Date: VarDate): Unit
  
  var Language: String
  
  var LockUserChanges: Boolean
  
  val MonthFont: ViewFont
  
  var MonthShowEndTime: Boolean
  
  var Name: String
  
  /* private */ @JSName("Outlook.CalendarView_typekey")
  var OutlookDotCalendarView_typekey: CalendarView
  
  val Parent: js.Any
  
  def Reset(): Unit
  
  def Save(): Unit
  
  val SaveOption: OlViewSaveOption
  
  val SelectedEndTime: VarDate
  
  val SelectedStartTime: VarDate
  
  val Session: NameSpace
  
  val Standard: Boolean
  
  var StartField: String
  
  val ViewType: OlViewType
  
  var XML: String
}
object CalendarView {
  
  inline def apply(
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
  
  extension [Self <: CalendarView](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    inline def setAutoFormatRules(value: AutoFormatRules): Self = StObject.set(x, "AutoFormatRules", value.asInstanceOf[js.Any])
    
    inline def setBoldDatesWithItems(value: Boolean): Self = StObject.set(x, "BoldDatesWithItems", value.asInstanceOf[js.Any])
    
    inline def setBoldSubjects(value: Boolean): Self = StObject.set(x, "BoldSubjects", value.asInstanceOf[js.Any])
    
    inline def setCalendarViewMode(value: OlCalendarViewMode): Self = StObject.set(x, "CalendarViewMode", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    inline def setDayWeekFont(value: ViewFont): Self = StObject.set(x, "DayWeekFont", value.asInstanceOf[js.Any])
    
    inline def setDayWeekTimeFont(value: ViewFont): Self = StObject.set(x, "DayWeekTimeFont", value.asInstanceOf[js.Any])
    
    inline def setDayWeekTimeScale(value: OlDayWeekTimeScale): Self = StObject.set(x, "DayWeekTimeScale", value.asInstanceOf[js.Any])
    
    inline def setDaysInMultiDayMode(value: Double): Self = StObject.set(x, "DaysInMultiDayMode", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDisplayedDates(value: js.Any): Self = StObject.set(x, "DisplayedDates", value.asInstanceOf[js.Any])
    
    inline def setEndField(value: String): Self = StObject.set(x, "EndField", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGoToDate(value: VarDate => Unit): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1(value))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    inline def setMonthFont(value: ViewFont): Self = StObject.set(x, "MonthFont", value.asInstanceOf[js.Any])
    
    inline def setMonthShowEndTime(value: Boolean): Self = StObject.set(x, "MonthShowEndTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotCalendarView_typekey(value: CalendarView): Self = StObject.set(x, "Outlook.CalendarView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    inline def setSelectedEndTime(value: VarDate): Self = StObject.set(x, "SelectedEndTime", value.asInstanceOf[js.Any])
    
    inline def setSelectedStartTime(value: VarDate): Self = StObject.set(x, "SelectedStartTime", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    inline def setStartField(value: String): Self = StObject.set(x, "StartField", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
