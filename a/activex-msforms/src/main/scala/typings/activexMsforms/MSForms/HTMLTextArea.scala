package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLTextArea extends StObject {
  
  var Columns: Double
  
  var HTMLName: String
  
  /* private */ @JSName("MSForms.HTMLTextArea_typekey")
  var MSFormsDotHTMLTextArea_typekey: HTMLTextArea
  
  var Rows: Double
  
  var Value: String
  
  var WordWrap: String
}
object HTMLTextArea {
  
  inline def apply(
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
  
  extension [Self <: HTMLTextArea](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLTextArea_typekey(value: HTMLTextArea): Self = StObject.set(x, "MSForms.HTMLTextArea_typekey", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: String): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
