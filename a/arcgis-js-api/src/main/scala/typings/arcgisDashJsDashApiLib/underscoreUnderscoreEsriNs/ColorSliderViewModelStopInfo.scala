package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderViewModelStopInfo
  extends stdLib.Object {
  /**
    * The color of the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#StopInfo)
    */
  var color: Color
  /**
    * The offset of the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#StopInfo)
    */
  var offset: scala.Double
}

object ColorSliderViewModelStopInfo {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    offset: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): ColorSliderViewModelStopInfo = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), offset = offset, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ColorSliderViewModelStopInfo]
  }
}

