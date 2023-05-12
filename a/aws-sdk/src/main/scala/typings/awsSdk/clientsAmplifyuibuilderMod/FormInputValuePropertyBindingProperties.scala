package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormInputValuePropertyBindingProperties extends StObject {
  
  /**
    * The data field to bind the property to.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The form property to bind to the data field.
    */
  var property: String
}
object FormInputValuePropertyBindingProperties {
  
  inline def apply(property: String): FormInputValuePropertyBindingProperties = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormInputValuePropertyBindingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormInputValuePropertyBindingProperties] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
