package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBoxInputProperties extends TextInputProperties {
  
  /**
    * The type of input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextBoxInput.html#type)
    */
  var `type`: js.UndefOr[`text-box`] = js.native
}
object TextBoxInputProperties {
  
  @scala.inline
  def apply(): TextBoxInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBoxInputProperties]
  }
  
  @scala.inline
  implicit class TextBoxInputPropertiesMutableBuilder[Self <: TextBoxInputProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `text-box`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
