package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`datetime-picker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePickerInput
  extends StObject
     with Input {
  
  /**
    * Indicates if the input should provide an option to select the time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#includeTime)
    */
  var includeTime: Boolean = js.native
  
  /**
    * The maximum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#max)
    */
  var max: Double = js.native
  
  /**
    * The minimum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#min)
    */
  var min: Double = js.native
  
  /**
    * The type of input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#type)
    */
  @JSName("type")
  var type_DateTimePickerInput: `datetime-picker` = js.native
}
