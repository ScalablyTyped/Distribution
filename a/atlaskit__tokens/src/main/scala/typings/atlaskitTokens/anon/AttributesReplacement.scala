package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesReplacement extends StObject {
  
  var attributes: Replacement
  
  var value: String
}
object AttributesReplacement {
  
  inline def apply(attributes: Replacement, value: String): AttributesReplacement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesReplacement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesReplacement] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Replacement): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
