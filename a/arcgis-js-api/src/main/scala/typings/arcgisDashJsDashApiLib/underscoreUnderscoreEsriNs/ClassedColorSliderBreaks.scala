package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedColorSliderBreaks
  extends stdLib.Object {
  /**
    * Features with values within the provided `min` and `max` will be rendered with this color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var color: Color
  /**
    * The max value of the break. The `max` of each break should match the `min` value of the break directly above it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var max: scala.Double
  /**
    * The min value of the break. The `min` of each break should match the `max` value of the break directly below it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var min: scala.Double
}

object ClassedColorSliderBreaks {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): ClassedColorSliderBreaks = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ClassedColorSliderBreaks]
  }
}

