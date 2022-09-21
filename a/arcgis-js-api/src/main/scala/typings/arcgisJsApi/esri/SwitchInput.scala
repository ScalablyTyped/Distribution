package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchInput
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Coded value used when the switch state is turned off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html#offValue)
    */
  var offValue: String | Double = js.native
  
  /**
    * Coded value used when the switch state is turned on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html#onValue)
    */
  var onValue: String | Double = js.native
  
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html#type)
    */
  val `type`: switch = js.native
}
