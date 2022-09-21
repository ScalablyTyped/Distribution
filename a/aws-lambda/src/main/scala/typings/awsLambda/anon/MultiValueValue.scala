package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiValueValue extends StObject {
  
  var multiValue: js.UndefOr[js.Array[Value]] = js.undefined
  
  var value: String
}
object MultiValueValue {
  
  inline def apply(value: String): MultiValueValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueValue]
  }
  
  extension [Self <: MultiValueValue](x: Self) {
    
    inline def setMultiValue(value: js.Array[Value]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setMultiValueVarargs(value: Value*): Self = StObject.set(x, "multiValue", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
