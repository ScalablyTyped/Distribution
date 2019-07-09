package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeStop
  extends stdLib.Object {
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
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Features with the given stop `value` will be rendered with the associated size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var size: scala.Double
  /**
    * The data value associated with the given `color` and `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#ColorSizeStop)
    */
  var value: scala.Double
}

object ColorSizeStop {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    size: scala.Double,
    value: scala.Double,
    label: java.lang.String = null
  ): ColorSizeStop = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size, value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ColorSizeStop]
  }
}

