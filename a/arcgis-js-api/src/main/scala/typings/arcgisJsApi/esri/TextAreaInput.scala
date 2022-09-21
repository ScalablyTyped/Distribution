package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaInput
  extends StObject
     with TextInput
     with JSONSupport
     with inputsInput {
  
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html#type)
    */
  val `type`: `text-area`
}
object TextAreaInput {
  
  inline def apply(maxLength: Double, minLength: Double, toJSON: () => Any): TextAreaInput = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")("text-area")
    __obj.asInstanceOf[TextAreaInput]
  }
  
  extension [Self <: TextAreaInput](x: Self) {
    
    inline def setType(value: `text-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
