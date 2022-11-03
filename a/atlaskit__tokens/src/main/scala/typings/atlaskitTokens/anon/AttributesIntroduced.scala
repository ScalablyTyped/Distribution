package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesIntroduced extends StObject {
  
  var attributes: Introduced
  
  var value: String
}
object AttributesIntroduced {
  
  inline def apply(attributes: Introduced, value: String): AttributesIntroduced = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesIntroduced]
  }
  
  extension [Self <: AttributesIntroduced](x: Self) {
    
    inline def setAttributes(value: Introduced): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
