package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInput extends Input {
  
  /**
    * When set, defines the input's maximum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
    */
  var maxLength: Double = js.native
  
  /**
    * When set, defines the input's minimum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
    */
  var minLength: Double = js.native
  
  /**
    * Indicates the type of form element [input](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#type)
    */
  @JSName("type")
  val type_TextInput: `text-area` | `text-box` = js.native
}
