package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarSharing")
@js.native
class CalendarSharing protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  var CalendarDetail: OlCalendarDetail = js.native
  val Class: OlObjectClass = js.native
  var EndDate: VarDate = js.native
  val Folder: typings.activexDashOutlook.Outlook.Folder = js.native
  var IncludeAttachments: Boolean = js.native
  var IncludePrivateDetails: Boolean = js.native
  var IncludeWholeCalendar: Boolean = js.native
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: CalendarSharing = js.native
  val Parent: js.Any = js.native
  var RestrictToWorkingHours: Boolean = js.native
  val Session: NameSpace = js.native
  var StartDate: VarDate = js.native
  def ForwardAsICal(MailFormat: OlCalendarMailFormat): MailItem = js.native
  def SaveAsICal(Path: String): Unit = js.native
}

