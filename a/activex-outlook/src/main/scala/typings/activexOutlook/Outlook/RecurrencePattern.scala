package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrencePattern extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var DayOfMonth: Double
  var DayOfWeekMask: OlDaysOfWeek
  var Duration: Double
  var EndTime: VarDate
  val Exceptions: typings.activexOutlook.Outlook.Exceptions
  var Instance: Double
  var Interval: Double
  var MonthOfYear: Double
  var NoEndDate: Boolean
  var Occurrences: Double
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: RecurrencePattern
  val Parent: js.Any
  var PatternEndDate: VarDate
  var PatternStartDate: VarDate
  var RecurrenceType: OlRecurrenceType
  var Regenerate: Boolean
  val Session: NameSpace
  var StartTime: VarDate
  def GetOccurrence(StartDate: VarDate): AppointmentItem
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
}

