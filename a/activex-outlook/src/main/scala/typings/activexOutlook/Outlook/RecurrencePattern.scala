package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrencePattern extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DayOfMonth: Double = js.native
  var DayOfWeekMask: OlDaysOfWeek = js.native
  var Duration: Double = js.native
  var EndTime: VarDate = js.native
  val Exceptions: typings.activexOutlook.Outlook.Exceptions = js.native
  var Instance: Double = js.native
  var Interval: Double = js.native
  var MonthOfYear: Double = js.native
  var NoEndDate: Boolean = js.native
  var Occurrences: Double = js.native
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: RecurrencePattern = js.native
  val Parent: js.Any = js.native
  var PatternEndDate: VarDate = js.native
  var PatternStartDate: VarDate = js.native
  var RecurrenceType: OlRecurrenceType = js.native
  var Regenerate: Boolean = js.native
  val Session: NameSpace = js.native
  var StartTime: VarDate = js.native
  def GetOccurrence(StartDate: VarDate): AppointmentItem = js.native
}

object RecurrencePattern {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DayOfMonth: Double,
    DayOfWeekMask: OlDaysOfWeek,
    Duration: Double,
    EndTime: VarDate,
    Exceptions: Exceptions,
    GetOccurrence: VarDate => AppointmentItem,
    Instance: Double,
    Interval: Double,
    MonthOfYear: Double,
    NoEndDate: Boolean,
    Occurrences: Double,
    OutlookDotRecurrencePattern_typekey: RecurrencePattern,
    Parent: js.Any,
    PatternEndDate: VarDate,
    PatternStartDate: VarDate,
    RecurrenceType: OlRecurrenceType,
    Regenerate: Boolean,
    Session: NameSpace,
    StartTime: VarDate
  ): RecurrencePattern = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DayOfMonth = DayOfMonth.asInstanceOf[js.Any], DayOfWeekMask = DayOfWeekMask.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], Exceptions = Exceptions.asInstanceOf[js.Any], GetOccurrence = js.Any.fromFunction1(GetOccurrence), Instance = Instance.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], MonthOfYear = MonthOfYear.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], Occurrences = Occurrences.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PatternEndDate = PatternEndDate.asInstanceOf[js.Any], PatternStartDate = PatternStartDate.asInstanceOf[js.Any], RecurrenceType = RecurrenceType.asInstanceOf[js.Any], Regenerate = Regenerate.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RecurrencePattern_typekey")(OutlookDotRecurrencePattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrencePattern]
  }
  @scala.inline
  implicit class RecurrencePatternOps[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfMonth(value: Double): Self = this.set("DayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfWeekMask(value: OlDaysOfWeek): Self = this.set("DayOfWeekMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: VarDate): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptions(value: Exceptions): Self = this.set("Exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetOccurrence(value: VarDate => AppointmentItem): Self = this.set("GetOccurrence", js.Any.fromFunction1(value))
    @scala.inline
    def setInstance(value: Double): Self = this.set("Instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthOfYear(value: Double): Self = this.set("MonthOfYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoEndDate(value: Boolean): Self = this.set("NoEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOccurrences(value: Double): Self = this.set("Occurrences", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotRecurrencePattern_typekey(value: RecurrencePattern): Self = this.set("Outlook.RecurrencePattern_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternEndDate(value: VarDate): Self = this.set("PatternEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternStartDate(value: VarDate): Self = this.set("PatternStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecurrenceType(value: OlRecurrenceType): Self = this.set("RecurrenceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegenerate(value: Boolean): Self = this.set("Regenerate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: VarDate): Self = this.set("StartTime", value.asInstanceOf[js.Any])
  }
  
}

