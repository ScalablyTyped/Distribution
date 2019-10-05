package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeStop extends Object {
  /**
    * Features with the given stop `value` will be rendered with the associated color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var color: Color
  /**
    * Label describing the given `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Features with the given stop `value` will be rendered with the associated size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var size: Double
  /**
    * The data value associated with the given `color` and `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var value: Double
}

object ColorSizeStop {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double,
    value: Double,
    label: String = null
  ): ColorSizeStop = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size, value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ColorSizeStop]
  }
}

