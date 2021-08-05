package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnString extends StObject {
  
  /* private */ @JSName("MSForms.ReturnString_typekey")
  var MSFormsDotReturnString_typekey: ReturnString
  
  var Value: String
}
object ReturnString {
  
  inline def apply(MSFormsDotReturnString_typekey: ReturnString, Value: String): ReturnString = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnString_typekey")(MSFormsDotReturnString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnString]
  }
  
  extension [Self <: ReturnString](x: Self) {
    
    inline def setMSFormsDotReturnString_typekey(value: ReturnString): Self = StObject.set(x, "MSForms.ReturnString_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
