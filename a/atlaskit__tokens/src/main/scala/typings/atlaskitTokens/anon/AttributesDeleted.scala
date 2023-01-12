package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDeleted extends StObject {
  
  var attributes: Deleted
  
  var value: String
}
object AttributesDeleted {
  
  inline def apply(attributes: Deleted, value: String): AttributesDeleted = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesDeleted] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Deleted): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
