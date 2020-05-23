package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlCalendarDetail
import typings.activexOutlook.Outlook.OlCalendarMailFormat
import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarSharing")
@js.native
class CalendarSharing protected ()
  extends typings.activexOutlook.Outlook.CalendarSharing {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override var CalendarDetail: OlCalendarDetail = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var EndDate: VarDate = js.native
  /* CompleteClass */
  override val Folder: typings.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override var IncludeAttachments: Boolean = js.native
  /* CompleteClass */
  override var IncludePrivateDetails: Boolean = js.native
  /* CompleteClass */
  override var IncludeWholeCalendar: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.CalendarSharing_typekey")
  override var OutlookDotCalendarSharing_typekey: typings.activexOutlook.Outlook.CalendarSharing = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RestrictToWorkingHours: Boolean = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var StartDate: VarDate = js.native
  /* CompleteClass */
  override def ForwardAsICal(MailFormat: OlCalendarMailFormat): typings.activexOutlook.Outlook.MailItem = js.native
  /* CompleteClass */
  override def SaveAsICal(Path: String): Unit = js.native
}

