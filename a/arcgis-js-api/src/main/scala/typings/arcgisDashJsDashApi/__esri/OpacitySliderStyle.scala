package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacitySliderStyle extends Object {
  /**
    * The color of the slider's track. For single-color visualizations where only an Opacity variable is present, you should set this color to match the color of the symbol in the [SimpleRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    *
    * @default new Color([0, 121, 193])
    */
  var trackFillColor: js.UndefOr[Color] = js.undefined
}

object OpacitySliderStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    trackFillColor: Color = null
  ): OpacitySliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (trackFillColor != null) __obj.updateDynamic("trackFillColor")(trackFillColor)
    __obj.asInstanceOf[OpacitySliderStyle]
  }
}

