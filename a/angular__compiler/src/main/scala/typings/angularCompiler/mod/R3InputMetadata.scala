package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3InputMetadata extends StObject {
  
  var bindingPropertyName: String
  
  var classPropertyName: String
  
  var required: Boolean
}
object R3InputMetadata {
  
  inline def apply(bindingPropertyName: String, classPropertyName: String, required: Boolean): R3InputMetadata = {
    val __obj = js.Dynamic.literal(bindingPropertyName = bindingPropertyName.asInstanceOf[js.Any], classPropertyName = classPropertyName.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InputMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3InputMetadata] (val x: Self) extends AnyVal {
    
    inline def setBindingPropertyName(value: String): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
    
    inline def setClassPropertyName(value: String): Self = StObject.set(x, "classPropertyName", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
