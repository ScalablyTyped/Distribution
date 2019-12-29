package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartMappingSliderViewModelZoomOptions extends Object {
  /**
    * The upper bound of the zoom.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The lower bound of the zoom.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var min: js.UndefOr[Double] = js.undefined
}

object SmartMappingSliderViewModelZoomOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    max: Int | Double = null,
    min: Int | Double = null
  ): SmartMappingSliderViewModelZoomOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartMappingSliderViewModelZoomOptions]
  }
}

