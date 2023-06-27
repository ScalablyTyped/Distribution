package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputProperties extends StObject {
  
  /**
  		 * When set, defines the text input's maximum length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
  		 */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * When set, defines the text input's minimum length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
  		 */
  var minLength: js.UndefOr[Double] = js.undefined
}
object TextInputProperties {
  
  inline def apply(): TextInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInputProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
