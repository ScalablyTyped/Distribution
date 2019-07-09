package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterInfoStatistics
  extends stdLib.Object {
  /**
    * The average of calculated pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var avg: scala.Double
  /**
    * The maximum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var max: scala.Double
  /**
    * The minimum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var min: scala.Double
  /**
    * The standard deviation of calculated pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var stddev: scala.Double
}

object RasterInfoStatistics {
  @scala.inline
  def apply(
    avg: scala.Double,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stddev: scala.Double
  ): RasterInfoStatistics = {
    val __obj = js.Dynamic.literal(avg = avg, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev)
  
    __obj.asInstanceOf[RasterInfoStatistics]
  }
}

