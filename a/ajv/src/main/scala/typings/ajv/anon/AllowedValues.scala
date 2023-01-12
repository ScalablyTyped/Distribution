package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValues extends StObject {
  
  var allowedValues: js.Array[String]
}
object AllowedValues {
  
  inline def apply(allowedValues: js.Array[String]): AllowedValues = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedValues] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
  }
}
