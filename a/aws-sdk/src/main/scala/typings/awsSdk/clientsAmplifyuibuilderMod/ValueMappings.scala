package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMappings extends StObject {
  
  /**
    * The information to bind fields to data at runtime.
    */
  var bindingProperties: js.UndefOr[FormInputBindingProperties] = js.undefined
  
  /**
    * The value and display value pairs.
    */
  var values: ValueMappingList
}
object ValueMappings {
  
  inline def apply(values: ValueMappingList): ValueMappings = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueMappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueMappings] (val x: Self) extends AnyVal {
    
    inline def setBindingProperties(value: FormInputBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setValues(value: ValueMappingList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ValueMapping*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
