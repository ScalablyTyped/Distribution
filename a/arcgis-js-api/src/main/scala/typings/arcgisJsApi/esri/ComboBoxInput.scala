package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`combo-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBoxInput
  extends StObject
     with Accessor
     with JSONSupport
     with inputsInput {
  
  /**
  		 * The text used to represent a null value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#noValueOptionLabel)
  		 */
  var noValueOptionLabel: String = js.native
  
  /**
  		 * Determines whether a null value option is displayed.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#showNoValueOption)
  		 */
  var showNoValueOption: Boolean = js.native
  
  /**
  		 * The type of form element input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#type)
  		 */
  val `type`: `combo-box` = js.native
}
