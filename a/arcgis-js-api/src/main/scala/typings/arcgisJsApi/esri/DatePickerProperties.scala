package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProperties extends WidgetProperties {
  /**
    * Indicates whether the date gets updated when the user changes the month in the drop-down.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#commitOnMonthChange)
    *
    * @default false
    */
  var commitOnMonthChange: js.UndefOr[Boolean] = js.undefined
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#value)
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DatePickerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePickerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[DatePickerViewModel] = js.undefined
}

object DatePickerProperties {
  @scala.inline
  def apply(
    commitOnMonthChange: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    value: js.Any = null,
    viewModel: DatePickerViewModel = null
  ): DatePickerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commitOnMonthChange)) __obj.updateDynamic("commitOnMonthChange")(commitOnMonthChange.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProperties]
  }
}

