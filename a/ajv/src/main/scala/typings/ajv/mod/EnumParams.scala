package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumParams
  extends StObject
     with ErrorParameters {
  
  var allowedValues: js.Array[js.Any]
}
object EnumParams {
  
  inline def apply(allowedValues: js.Array[js.Any]): EnumParams = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumParams]
  }
  
  extension [Self <: EnumParams](x: Self) {
    
    inline def setAllowedValues(value: js.Array[js.Any]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: js.Any*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
  }
}
