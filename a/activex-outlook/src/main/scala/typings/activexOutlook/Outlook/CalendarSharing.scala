package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarSharing extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  var CalendarDetail: OlCalendarDetail
  val Class: OlObjectClass
  var EndDate: VarDate
  val Folder: typings.activexOutlook.Outlook.Folder
  var IncludeAttachments: Boolean
  var IncludePrivateDetails: Boolean
  var IncludeWholeCalendar: Boolean
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: CalendarSharing
  val Parent: js.Any
  var RestrictToWorkingHours: Boolean
  val Session: NameSpace
  var StartDate: VarDate
  def ForwardAsICal(MailFormat: OlCalendarMailFormat): MailItem
  def SaveAsICal(Path: String): Unit
}

object CalendarSharing {
  @scala.inline
  def apply(
    Application: Application,
    CalendarDetail: OlCalendarDetail,
    Class: OlObjectClass,
    EndDate: VarDate,
    Folder: Folder,
    ForwardAsICal: OlCalendarMailFormat => MailItem,
    IncludeAttachments: Boolean,
    IncludePrivateDetails: Boolean,
    IncludeWholeCalendar: Boolean,
    OutlookDotCalendarSharing_typekey: CalendarSharing,
    Parent: js.Any,
    RestrictToWorkingHours: Boolean,
    SaveAsICal: String => Unit,
    Session: NameSpace,
    StartDate: VarDate
  ): CalendarSharing = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CalendarDetail = CalendarDetail.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], EndDate = EndDate.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], ForwardAsICal = js.Any.fromFunction1(ForwardAsICal), IncludeAttachments = IncludeAttachments.asInstanceOf[js.Any], IncludePrivateDetails = IncludePrivateDetails.asInstanceOf[js.Any], IncludeWholeCalendar = IncludeWholeCalendar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RestrictToWorkingHours = RestrictToWorkingHours.asInstanceOf[js.Any], SaveAsICal = js.Any.fromFunction1(SaveAsICal), Session = Session.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CalendarSharing_typekey")(OutlookDotCalendarSharing_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSharing]
  }
}

