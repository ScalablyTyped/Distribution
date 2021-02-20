package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLTextArea extends StObject {
  
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
  implicit class HTMLTextAreaMutableBuilder[Self <: HTMLTextArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLTextArea_typekey(value: HTMLTextArea): Self = StObject.set(x, "MSForms.HTMLTextArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: String): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
