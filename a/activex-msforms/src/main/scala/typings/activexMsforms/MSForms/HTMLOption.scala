package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLOption extends StObject {
  
  var Checked: Boolean
  
  val DisplayStyle: fmDisplayStyle
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLOption_typekey")
  var MSFormsDotHTMLOption_typekey: HTMLOption
  
  var Value: String
}
object HTMLOption {
  
  inline def apply(
    Checked: Boolean,
    DisplayStyle: fmDisplayStyle,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLOption_typekey: HTMLOption,
    Value: String
  ): HTMLOption = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLOption_typekey")(MSFormsDotHTMLOption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOption]
  }
  
  extension [Self <: HTMLOption](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyle(value: fmDisplayStyle): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLOption_typekey(value: HTMLOption): Self = StObject.set(x, "MSForms.HTMLOption_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
