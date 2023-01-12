package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBindingPropertiesValue extends StObject {
  
  /**
    * Describes the properties to customize with data at runtime.
    */
  var bindingProperties: js.UndefOr[ComponentBindingPropertiesValueProperties] = js.undefined
  
  /**
    * The default value of the property.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The property type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ComponentBindingPropertiesValue {
  
  inline def apply(): ComponentBindingPropertiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentBindingPropertiesValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentBindingPropertiesValue] (val x: Self) extends AnyVal {
    
    inline def setBindingProperties(value: ComponentBindingPropertiesValueProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
