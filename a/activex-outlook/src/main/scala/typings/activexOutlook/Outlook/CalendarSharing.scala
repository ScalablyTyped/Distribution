package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarSharing extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var CalendarDetail: OlCalendarDetail = js.native
  
  val Class: OlObjectClass = js.native
  
  var EndDate: VarDate = js.native
  
  val Folder: typings.activexOutlook.Outlook.Folder = js.native
  
  def ForwardAsICal(MailFormat: OlCalendarMailFormat): MailItem = js.native
  
  var IncludeAttachments: Boolean = js.native
  
  var IncludePrivateDetails: Boolean = js.native
  
  var IncludeWholeCalendar: Boolean = js.native
  
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: CalendarSharing = js.native
  
  val Parent: js.Any = js.native
  
  var RestrictToWorkingHours: Boolean = js.native
  
  def SaveAsICal(Path: String): Unit = js.native
  
  val Session: NameSpace = js.native
  
  var StartDate: VarDate = js.native
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
  
  @scala.inline
  implicit class CalendarSharingMutableBuilder[Self <: CalendarSharing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarDetail(value: OlCalendarDetail): Self = StObject.set(x, "CalendarDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: VarDate): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardAsICal(value: OlCalendarMailFormat => MailItem): Self = StObject.set(x, "ForwardAsICal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludeAttachments(value: Boolean): Self = StObject.set(x, "IncludeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePrivateDetails(value: Boolean): Self = StObject.set(x, "IncludePrivateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeWholeCalendar(value: Boolean): Self = StObject.set(x, "IncludeWholeCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotCalendarSharing_typekey(value: CalendarSharing): Self = StObject.set(x, "Outlook.CalendarSharing_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictToWorkingHours(value: Boolean): Self = StObject.set(x, "RestrictToWorkingHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsICal(value: String => Unit): Self = StObject.set(x, "SaveAsICal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: VarDate): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
  }
}
