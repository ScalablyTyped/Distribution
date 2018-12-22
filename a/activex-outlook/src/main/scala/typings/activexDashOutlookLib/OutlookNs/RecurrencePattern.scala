package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RecurrencePattern")
@js.native
class RecurrencePattern protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var DayOfMonth: scala.Double = js.native
  var DayOfWeekMask: OlDaysOfWeek = js.native
  var Duration: scala.Double = js.native
  var EndTime: activexDashInteropLib.VarDate = js.native
  val Exceptions: Exceptions = js.native
  var Instance: scala.Double = js.native
  var Interval: scala.Double = js.native
  var MonthOfYear: scala.Double = js.native
  var NoEndDate: scala.Boolean = js.native
  var Occurrences: scala.Double = js.native
  var `Outlook.RecurrencePattern_typekey`: RecurrencePattern = js.native
  val Parent: js.Any = js.native
  var PatternEndDate: activexDashInteropLib.VarDate = js.native
  var PatternStartDate: activexDashInteropLib.VarDate = js.native
  var RecurrenceType: OlRecurrenceType = js.native
  var Regenerate: scala.Boolean = js.native
  val Session: NameSpace = js.native
  var StartTime: activexDashInteropLib.VarDate = js.native
  def GetOccurrence(StartDate: activexDashInteropLib.VarDate): AppointmentItem = js.native
}

