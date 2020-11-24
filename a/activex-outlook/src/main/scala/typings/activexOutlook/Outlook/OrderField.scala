package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderField extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var IsDescending: Boolean = js.native
  
  @JSName("Outlook.OrderField_typekey")
  var OutlookDotOrderField_typekey: OrderField = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val ViewXMLSchemaName: String = js.native
}
object OrderField {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    IsDescending: Boolean,
    OutlookDotOrderField_typekey: OrderField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): OrderField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], IsDescending = IsDescending.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OrderField_typekey")(OutlookDotOrderField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderField]
  }
  
  @scala.inline
  implicit class OrderFieldOps[Self <: OrderField] (val x: Self) extends AnyVal {
    
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
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDescending(value: Boolean): Self = this.set("IsDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOrderField_typekey(value: OrderField): Self = this.set("Outlook.OrderField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewXMLSchemaName(value: String): Self = this.set("ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
