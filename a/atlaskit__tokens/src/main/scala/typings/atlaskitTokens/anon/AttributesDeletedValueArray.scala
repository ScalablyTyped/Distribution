package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDeletedValueArray extends StObject {
  
  var attributes: Deleted
  
  var value: js.Array[Offset]
}
object AttributesDeletedValueArray {
  
  inline def apply(attributes: Deleted, value: js.Array[Offset]): AttributesDeletedValueArray = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeletedValueArray]
  }
  
  extension [Self <: AttributesDeletedValueArray](x: Self) {
    
    inline def setAttributes(value: Deleted): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Offset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Offset*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
