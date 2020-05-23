package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderVisibleElements extends Object {
  /**
    * Indicates whether to display labels for slider thumbs. By default, labels display input thumb values as floating point values with a precision of two digits. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var labels: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var rangeLabels: js.UndefOr[Boolean] = js.undefined
}

object SliderVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    labels: js.UndefOr[Boolean] = js.undefined,
    rangeLabels: js.UndefOr[Boolean] = js.undefined
  ): SliderVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeLabels)) __obj.updateDynamic("rangeLabels")(rangeLabels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderVisibleElements]
  }
}

