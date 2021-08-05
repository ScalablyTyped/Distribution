package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnInteger extends StObject {
  
  /* private */ @JSName("MSForms.ReturnInteger_typekey")
  var MSFormsDotReturnInteger_typekey: ReturnInteger
  
  var Value: Double
}
object ReturnInteger {
  
  inline def apply(MSFormsDotReturnInteger_typekey: ReturnInteger, Value: Double): ReturnInteger = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnInteger_typekey")(MSFormsDotReturnInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnInteger]
  }
  
  extension [Self <: ReturnInteger](x: Self) {
    
    inline def setMSFormsDotReturnInteger_typekey(value: ReturnInteger): Self = StObject.set(x, "MSForms.ReturnInteger_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
