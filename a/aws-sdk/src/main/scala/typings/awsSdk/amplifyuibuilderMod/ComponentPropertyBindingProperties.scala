package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropertyBindingProperties extends StObject {
  
  /**
    * The data field to bind the property to.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The component property to bind to the data field.
    */
  var property: String
}
object ComponentPropertyBindingProperties {
  
  inline def apply(property: String): ComponentPropertyBindingProperties = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropertyBindingProperties]
  }
  
  extension [Self <: ComponentPropertyBindingProperties](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
