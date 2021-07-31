package typings.arcgisJsApi.esri

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePicker
  extends StObject
     with Widget_ {
  
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: Date = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: TimePickerViewModel = js.native
}
