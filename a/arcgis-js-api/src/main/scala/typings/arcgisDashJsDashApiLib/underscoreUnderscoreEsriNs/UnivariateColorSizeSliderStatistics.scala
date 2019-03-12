package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnivariateColorSizeSliderStatistics
  extends stdLib.Object {
  /**
    * The average of all data values represented in the size and color visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics)
    */
  var avg: scala.Double
  /**
    * The maximum of all data values represented in the size and color visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics)
    */
  var max: scala.Double
  /**
    * The minimum of all data values represented in the size and color visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics)
    */
  var min: scala.Double
  /**
    * The standard deviation calculated from all data values represented in the size and color visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics)
    */
  var stddev: scala.Double
}

object UnivariateColorSizeSliderStatistics {
  @scala.inline
  def apply(
    avg: scala.Double,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stddev: scala.Double
  ): UnivariateColorSizeSliderStatistics = {
    val __obj = js.Dynamic.literal(avg = avg, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev)
  
    __obj.asInstanceOf[UnivariateColorSizeSliderStatistics]
  }
}

