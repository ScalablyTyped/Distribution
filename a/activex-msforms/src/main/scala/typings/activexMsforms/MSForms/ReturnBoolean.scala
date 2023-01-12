package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnBoolean extends StObject {
  
  /* private */ @JSName("MSForms.ReturnBoolean_typekey")
  var MSFormsDotReturnBoolean_typekey: ReturnBoolean
  
  var Value: Boolean
}
object ReturnBoolean {
  
  inline def apply(MSFormsDotReturnBoolean_typekey: ReturnBoolean, Value: Boolean): ReturnBoolean = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnBoolean_typekey")(MSFormsDotReturnBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnBoolean] (val x: Self) extends AnyVal {
    
    inline def setMSFormsDotReturnBoolean_typekey(value: ReturnBoolean): Self = StObject.set(x, "MSForms.ReturnBoolean_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
