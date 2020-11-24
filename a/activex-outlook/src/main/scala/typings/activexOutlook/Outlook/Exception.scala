package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exception extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val AppointmentItem: typings.activexOutlook.Outlook.AppointmentItem = js.native
  
  val Class: OlObjectClass = js.native
  
  val Deleted: Boolean = js.native
  
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  
  val OriginalDate: VarDate = js.native
  
  @JSName("Outlook.Exception_typekey")
  var OutlookDotException_typekey: Exception = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object Exception {
  
  @scala.inline
  def apply(
    Application: Application,
    AppointmentItem: AppointmentItem,
    Class: OlObjectClass,
    Deleted: Boolean,
    ItemProperties: ItemProperties,
    OriginalDate: VarDate,
    OutlookDotException_typekey: Exception,
    Parent: js.Any,
    Session: NameSpace
  ): Exception = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppointmentItem = AppointmentItem.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], ItemProperties = ItemProperties.asInstanceOf[js.Any], OriginalDate = OriginalDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exception_typekey")(OutlookDotException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentItem(value: AppointmentItem): Self = this.set("AppointmentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemProperties(value: ItemProperties): Self = this.set("ItemProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDate(value: VarDate): Self = this.set("OriginalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotException_typekey(value: Exception): Self = this.set("Outlook.Exception_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
