package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValuesArray extends StObject {
  
  var allowedValues: js.Array[Any]
}
object AllowedValuesArray {
  
  inline def apply(allowedValues: js.Array[Any]): AllowedValuesArray = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValuesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedValuesArray] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: js.Array[Any]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: Any*): Self = StObject.set(x, "allowedValues", js.Array(value*))
  }
}
