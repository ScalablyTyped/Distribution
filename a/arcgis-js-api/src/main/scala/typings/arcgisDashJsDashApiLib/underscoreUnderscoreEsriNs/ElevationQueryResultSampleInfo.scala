package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationQueryResultSampleInfo
  extends stdLib.Object {
  /**
    * The resolution at which the z-value was sampled. If no data was available for sampling for a given coordinate, the dem resolution value will be -1 for that coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var demResolution: scala.Double
  /**
    * The elevation source from which the data for the corresponding coordinate was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var source: ElevationLayer
}

object ElevationQueryResultSampleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    demResolution: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    source: ElevationLayer
  ): ElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, demResolution = demResolution, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, source = source)
  
    __obj.asInstanceOf[ElevationQueryResultSampleInfo]
  }
}

