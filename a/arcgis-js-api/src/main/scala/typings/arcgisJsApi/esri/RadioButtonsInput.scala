package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`radio-buttons`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonsInput
  extends StObject
     with Accessor
     with JSONSupport
     with inputsInput {
  
  /**
    * The text used to represent a null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html#noValueOptionLabel)
    */
  var noValueOptionLabel: String = js.native
  
  /**
    * Determines whether a null value option is displayed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html#showNoValueOption)
    */
  var showNoValueOption: Boolean = js.native
  
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html#type)
    */
  val `type`: `radio-buttons` = js.native
}
