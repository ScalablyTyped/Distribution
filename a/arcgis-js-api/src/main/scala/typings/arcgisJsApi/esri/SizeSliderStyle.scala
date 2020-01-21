package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderStyle extends Object {
  /**
    * The background color of the slider's track. Generally, this color should be subdued and not interfere with the `trackFillColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    *
    * @default new Color([224, 224, 224])
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.undefined
  /**
    * The color of the slider's track. For single-color visualizations where only a Size variable is present, you should set this color to match the color of the symbol in the [SimpleRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    *
    * @default new Color([149, 149, 149])
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}

object SizeSliderStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    trackBackgroundColor: Color_ = null,
    trackFillColor: Color_ = null
  ): SizeSliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (trackBackgroundColor != null) __obj.updateDynamic("trackBackgroundColor")(trackBackgroundColor.asInstanceOf[js.Any])
    if (trackFillColor != null) __obj.updateDynamic("trackFillColor")(trackFillColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderStyle]
  }
}

