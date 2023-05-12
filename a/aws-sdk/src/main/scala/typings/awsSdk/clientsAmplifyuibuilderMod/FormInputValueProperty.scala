package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormInputValueProperty extends StObject {
  
  /**
    * The information to bind fields to data at runtime.
    */
  var bindingProperties: js.UndefOr[FormInputValuePropertyBindingProperties] = js.undefined
  
  /**
    * A list of form properties to concatenate to create the value to assign to this field property.
    */
  var concat: js.UndefOr[FormInputValuePropertyList] = js.undefined
  
  /**
    * The value to assign to the input field.
    */
  var value: js.UndefOr[String] = js.undefined
}
object FormInputValueProperty {
  
  inline def apply(): FormInputValueProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormInputValueProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormInputValueProperty] (val x: Self) extends AnyVal {
    
    inline def setBindingProperties(value: FormInputValuePropertyBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setConcat(value: FormInputValuePropertyList): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setConcatVarargs(value: FormInputValueProperty*): Self = StObject.set(x, "concat", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
