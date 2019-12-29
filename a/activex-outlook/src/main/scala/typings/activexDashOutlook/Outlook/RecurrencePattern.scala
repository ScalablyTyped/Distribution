package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RecurrencePattern")
@js.native
class RecurrencePattern protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DayOfMonth: Double = js.native
  var DayOfWeekMask: OlDaysOfWeek = js.native
  var Duration: Double = js.native
  var EndTime: VarDate = js.native
  val Exceptions: typings.activexDashOutlook.Outlook.Exceptions = js.native
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

