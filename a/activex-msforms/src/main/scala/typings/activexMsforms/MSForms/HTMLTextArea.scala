package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLTextArea extends js.Object {
  
  var Columns: Double = js.native
  
  var HTMLName: String = js.native
  
  @JSName("MSForms.HTMLTextArea_typekey")
  var MSFormsDotHTMLTextArea_typekey: HTMLTextArea = js.native
  
  var Rows: Double = js.native
  
  var Value: String = js.native
  
  var WordWrap: String = js.native
}
object HTMLTextArea {
  
  @scala.inline
  def apply(
    Columns: Double,
    HTMLName: String,
    MSFormsDotHTMLTextArea_typekey: HTMLTextArea,
    Rows: Double,
    Value: String,
    WordWrap: String
  ): HTMLTextArea = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLTextArea_typekey")(MSFormsDotHTMLTextArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTextArea]
  }
  
  @scala.inline
  implicit class HTMLTextAreaOps[Self <: HTMLTextArea] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLTextArea_typekey(value: HTMLTextArea): Self = this.set("MSForms.HTMLTextArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: String): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
}
