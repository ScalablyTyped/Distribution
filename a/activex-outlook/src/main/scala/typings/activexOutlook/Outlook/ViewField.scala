package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewField extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ColumnFormat: typings.activexOutlook.Outlook.ColumnFormat = js.native
  
  @JSName("Outlook.ViewField_typekey")
  var OutlookDotViewField_typekey: ViewField = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val ViewXMLSchemaName: String = js.native
}
object ViewField {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ColumnFormat: ColumnFormat,
    OutlookDotViewField_typekey: ViewField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): ViewField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFormat = ColumnFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewField_typekey")(OutlookDotViewField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewField]
  }
  
  @scala.inline
  implicit class ViewFieldOps[Self <: ViewField] (val x: Self) extends AnyVal {
    
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
    def setColumnFormat(value: ColumnFormat): Self = this.set("ColumnFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotViewField_typekey(value: ViewField): Self = this.set("Outlook.ViewField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewXMLSchemaName(value: String): Self = this.set("ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
