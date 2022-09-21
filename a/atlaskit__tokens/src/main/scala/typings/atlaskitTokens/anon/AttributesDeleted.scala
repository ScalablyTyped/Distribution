package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDeleted extends StObject {
  
  var attributes: Deleted
  
  var value: js.Array[Color | Inset]
}
object AttributesDeleted {
  
  inline def apply(attributes: Deleted, value: js.Array[Color | Inset]): AttributesDeleted = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeleted]
  }
  
  extension [Self <: AttributesDeleted](x: Self) {
    
    inline def setAttributes(value: Deleted): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Color | Inset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (Color | Inset)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
