package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProperties extends WidgetProperties {
  /**
    * Indicates whether the date gets updated when the user changes the month in the drop-down.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#commitOnMonthChange)
    *
    * @default false
    */
  var commitOnMonthChange: js.UndefOr[Boolean] = js.native
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DatePickerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePickerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[DatePickerViewModelProperties] = js.native
}

object DatePickerProperties {
  @scala.inline
  def apply(): DatePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProperties]
  }
  @scala.inline
  implicit class DatePickerPropertiesOps[Self <: DatePickerProperties] (val x: Self) extends AnyVal {
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
    def setCommitOnMonthChange(value: Boolean): Self = this.set("commitOnMonthChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitOnMonthChange: Self = this.set("commitOnMonthChange", js.undefined)
    @scala.inline
    def setValue(value: DateProperties): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setViewModel(value: DatePickerViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

