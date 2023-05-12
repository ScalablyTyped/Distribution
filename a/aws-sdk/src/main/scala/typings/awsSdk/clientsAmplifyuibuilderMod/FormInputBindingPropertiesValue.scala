package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormInputBindingPropertiesValue extends StObject {
  
  /**
    * Describes the properties to customize with data at runtime.
    */
  var bindingProperties: js.UndefOr[FormInputBindingPropertiesValueProperties] = js.undefined
  
  /**
    * The property type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object FormInputBindingPropertiesValue {
  
  inline def apply(): FormInputBindingPropertiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormInputBindingPropertiesValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormInputBindingPropertiesValue] (val x: Self) extends AnyVal {
    
    inline def setBindingProperties(value: FormInputBindingPropertiesValueProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
