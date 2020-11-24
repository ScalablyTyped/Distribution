package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFormat extends js.Object {
  
  var Align: OlAlign = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var FieldFormat: Double = js.native
  
  val FieldType: OlUserPropertyType = js.native
  
  var Label: String = js.native
  
  @JSName("Outlook.ColumnFormat_typekey")
  var OutlookDotColumnFormat_typekey: ColumnFormat = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  var Width: Double = js.native
}
object ColumnFormat {
  
  @scala.inline
  def apply(
    Align: OlAlign,
    Application: Application,
    Class: OlObjectClass,
    FieldFormat: Double,
    FieldType: OlUserPropertyType,
    Label: String,
    OutlookDotColumnFormat_typekey: ColumnFormat,
    Parent: js.Any,
    Session: NameSpace,
    Width: Double
  ): ColumnFormat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], FieldFormat = FieldFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ColumnFormat_typekey")(OutlookDotColumnFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFormat]
  }
  
  @scala.inline
  implicit class ColumnFormatOps[Self <: ColumnFormat] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: OlAlign): Self = this.set("Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFormat(value: Double): Self = this.set("FieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: OlUserPropertyType): Self = this.set("FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotColumnFormat_typekey(value: ColumnFormat): Self = this.set("Outlook.ColumnFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
