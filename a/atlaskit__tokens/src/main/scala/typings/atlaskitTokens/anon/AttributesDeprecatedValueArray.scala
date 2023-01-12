package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDeprecatedValueArray extends StObject {
  
  var attributes: Deprecated
  
  var value: js.Array[Offset]
}
object AttributesDeprecatedValueArray {
  
  inline def apply(attributes: Deprecated, value: js.Array[Offset]): AttributesDeprecatedValueArray = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeprecatedValueArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesDeprecatedValueArray] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Deprecated): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Offset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Offset*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
