package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarSharing")
@js.native
class CalendarSharing protected () extends js.Object {
  val Application: Application = js.native
  var CalendarDetail: OlCalendarDetail = js.native
  val Class: OlObjectClass = js.native
  var EndDate: stdLib.VarDate = js.native
  val Folder: Folder = js.native
  var IncludeAttachments: scala.Boolean = js.native
  var IncludePrivateDetails: scala.Boolean = js.native
  var IncludeWholeCalendar: scala.Boolean = js.native
  var `Outlook.CalendarSharing_typekey`: CalendarSharing = js.native
  val Parent: js.Any = js.native
  var RestrictToWorkingHours: scala.Boolean = js.native
  val Session: NameSpace = js.native
  var StartDate: stdLib.VarDate = js.native
  def ForwardAsICal(MailFormat: OlCalendarMailFormat): MailItem = js.native
  def SaveAsICal(Path: java.lang.String): scala.Unit = js.native
}

