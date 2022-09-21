package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesDeprecated extends StObject {
  
  var attributes: Deprecated
  
  var value: String
}
object AttributesDeprecated {
  
  inline def apply(attributes: Deprecated, value: String): AttributesDeprecated = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeprecated]
  }
  
  extension [Self <: AttributesDeprecated](x: Self) {
    
    inline def setAttributes(value: Deprecated): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
