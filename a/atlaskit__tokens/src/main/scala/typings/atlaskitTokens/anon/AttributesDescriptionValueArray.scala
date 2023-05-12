package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDescriptionValueArray extends StObject {
  
  var attributes: Description
  
  var value: js.Array[Offset]
}
object AttributesDescriptionValueArray {
  
  inline def apply(attributes: Description, value: js.Array[Offset]): AttributesDescriptionValueArray = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDescriptionValueArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesDescriptionValueArray] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Description): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Offset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Offset*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
