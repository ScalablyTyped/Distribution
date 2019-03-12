package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RecurrencePattern")
@js.native
class RecurrencePattern protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  var DayOfMonth: scala.Double = js.native
  var DayOfWeekMask: OlDaysOfWeek = js.native
  var Duration: scala.Double = js.native
  var EndTime: stdLib.VarDate = js.native
  val Exceptions: activexDashOutlookLib.OutlookNs.Exceptions = js.native
  var Instance: scala.Double = js.native
  var Interval: scala.Double = js.native
  var MonthOfYear: scala.Double = js.native
  var NoEndDate: scala.Boolean = js.native
  var Occurrences: scala.Double = js.native
  var `Outlook.RecurrencePattern_typekey`: RecurrencePattern = js.native
  val Parent: js.Any = js.native
  var PatternEndDate: stdLib.VarDate = js.native
  var PatternStartDate: stdLib.VarDate = js.native
  var RecurrenceType: OlRecurrenceType = js.native
  var Regenerate: scala.Boolean = js.native
  val Session: NameSpace = js.native
  var StartTime: stdLib.VarDate = js.native
  def GetOccurrence(StartDate: stdLib.VarDate): AppointmentItem = js.native
}

