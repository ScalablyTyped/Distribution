package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderVisibleElements extends Object {
  /**
    * Indicates whether to display labels for slider thumbs. By default, labels display input thumb values as floating point values with a precision of two digits. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var labels: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var rangeLabels: js.UndefOr[Boolean] = js.native
}

object SliderVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SliderVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SliderVisibleElements]
  }
  @scala.inline
  implicit class SliderVisibleElementsOps[Self <: SliderVisibleElements] (val x: Self) extends AnyVal {
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
    def setLabels(value: Boolean): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setRangeLabels(value: Boolean): Self = this.set("rangeLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeLabels: Self = this.set("rangeLabels", js.undefined)
  }
  
}

