package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderStatistics
  extends stdLib.Object {
  /**
    * The average of all data values represented in the size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics)
    */
  var avg: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum of all data values represented in the size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics)
    */
  var max: scala.Double
  /**
    * The minimum of all data values represented in the size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics)
    */
  var min: scala.Double
}

object SizeSliderStatistics {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    avg: scala.Int | scala.Double = null
  ): SizeSliderStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (avg != null) __obj.updateDynamic("avg")(avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderStatistics]
  }
}

