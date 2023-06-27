package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInput extends StObject {
  
  /**
  		 * When set, defines the text input's maximum length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
  		 */
  var maxLength: Double
  
  /**
  		 * When set, defines the text input's minimum length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
  		 */
  var minLength: Double
}
object TextInput {
  
  inline def apply(maxLength: Double, minLength: Double): TextInput = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
  }
}
