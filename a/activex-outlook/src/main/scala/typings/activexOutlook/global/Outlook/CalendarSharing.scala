package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlCalendarDetail
import typings.activexOutlook.Outlook.OlCalendarMailFormat
import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.CalendarSharing")
@js.native
class CalendarSharing protected ()
  extends StObject
     with typings.activexOutlook.Outlook.CalendarSharing {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  var CalendarDetail: OlCalendarDetail = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var EndDate: VarDate = js.native
  
  /* CompleteClass */
  override val Folder: typings.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def ForwardAsICal(MailFormat: OlCalendarMailFormat): typings.activexOutlook.Outlook.MailItem = js.native
  
  /* CompleteClass */
  var IncludeAttachments: Boolean = js.native
  
  /* CompleteClass */
  var IncludePrivateDetails: Boolean = js.native
  
  /* CompleteClass */
  var IncludeWholeCalendar: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: typings.activexOutlook.Outlook.CalendarSharing = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RestrictToWorkingHours: Boolean = js.native
  
  /* CompleteClass */
  override def SaveAsICal(Path: String): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var StartDate: VarDate = js.native
}
