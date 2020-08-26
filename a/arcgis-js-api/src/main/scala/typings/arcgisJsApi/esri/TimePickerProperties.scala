package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerProperties extends WidgetProperties {
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimePickerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePickerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[TimePickerViewModelProperties] = js.native
}

object TimePickerProperties {
  @scala.inline
  def apply(): TimePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProperties]
  }
  @scala.inline
  implicit class TimePickerPropertiesOps[Self <: TimePickerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: DateProperties): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setViewModel(value: TimePickerViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

