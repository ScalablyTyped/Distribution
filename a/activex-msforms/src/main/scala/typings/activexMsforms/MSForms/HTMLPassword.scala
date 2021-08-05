package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPassword extends StObject {
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLPassword_typekey")
  var MSFormsDotHTMLPassword_typekey: HTMLPassword
  
  var MaxLength: Double
  
  var Value: String
  
  var Width: Double
}
object HTMLPassword {
  
  inline def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLPassword_typekey: HTMLPassword,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLPassword = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLPassword_typekey")(MSFormsDotHTMLPassword_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPassword]
  }
  
  extension [Self <: HTMLPassword](x: Self) {
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLPassword_typekey(value: HTMLPassword): Self = StObject.set(x, "MSForms.HTMLPassword_typekey", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
