package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.TextAreaInputProperties & {  type :'text-area'} */
trait TextAreaInputPropertiesty extends StObject {
  
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
  
  var `type`: `text-area`
}
object TextAreaInputPropertiesty {
  
  inline def apply(): TextAreaInputPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text-area")
    __obj.asInstanceOf[TextAreaInputPropertiesty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAreaInputPropertiesty] (val x: Self) extends AnyVal {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setType(value: `text-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
