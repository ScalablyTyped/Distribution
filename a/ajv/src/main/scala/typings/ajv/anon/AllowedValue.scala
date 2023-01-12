package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValue extends StObject {
  
  var allowedValue: Any
}
object AllowedValue {
  
  inline def apply(allowedValue: Any): AllowedValue = {
    val __obj = js.Dynamic.literal(allowedValue = allowedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedValue] (val x: Self) extends AnyVal {
    
    inline def setAllowedValue(value: Any): Self = StObject.set(x, "allowedValue", value.asInstanceOf[js.Any])
  }
}
