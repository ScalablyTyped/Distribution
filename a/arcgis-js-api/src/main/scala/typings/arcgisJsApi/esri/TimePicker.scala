package typings.arcgisJsApi.esri

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker extends Widget_ {
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: Date = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimePickerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePickerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: TimePickerViewModel = js.native
}

