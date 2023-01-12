package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalProperty extends StObject {
  
  var additionalProperty: String
}
object AdditionalProperty {
  
  inline def apply(additionalProperty: String): AdditionalProperty = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalProperty] (val x: Self) extends AnyVal {
    
    inline def setAdditionalProperty(value: String): Self = StObject.set(x, "additionalProperty", value.asInstanceOf[js.Any])
  }
}
