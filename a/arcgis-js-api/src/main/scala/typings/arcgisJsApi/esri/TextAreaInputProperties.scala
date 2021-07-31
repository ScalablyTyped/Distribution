package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaInputProperties
  extends StObject
     with TextInputProperties {
  
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html#type)
    */
  var `type`: js.UndefOr[`text-area`] = js.undefined
}
object TextAreaInputProperties {
  
  @scala.inline
  def apply(): TextAreaInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaInputProperties]
  }
  
  @scala.inline
  implicit class TextAreaInputPropertiesMutableBuilder[Self <: TextAreaInputProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `text-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
