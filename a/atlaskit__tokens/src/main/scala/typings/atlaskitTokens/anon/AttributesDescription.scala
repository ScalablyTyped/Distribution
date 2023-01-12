package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDescription extends StObject {
  
  var attributes: Description
  
  var value: String
}
object AttributesDescription {
  
  inline def apply(attributes: Description, value: String): AttributesDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesDescription] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Description): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
