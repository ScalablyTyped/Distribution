package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiValue extends StObject {
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var multiValue: js.UndefOr[js.Array[Attributes]] = js.undefined
  
  var value: String
}
object MultiValue {
  
  inline def apply(value: String): MultiValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiValue] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setMultiValue(value: js.Array[Attributes]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setMultiValueVarargs(value: Attributes*): Self = StObject.set(x, "multiValue", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
