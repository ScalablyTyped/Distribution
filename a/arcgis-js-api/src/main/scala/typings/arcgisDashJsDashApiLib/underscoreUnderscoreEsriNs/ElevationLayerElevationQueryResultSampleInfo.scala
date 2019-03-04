package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerElevationQueryResultSampleInfo
  extends stdLib.Object {
  /**
    * The resolution at which the z-value was sampled. If no data was available for sampling for a given coordinate, the dem resolution value will be -1 for that coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var demResolution: scala.Double
}

object ElevationLayerElevationQueryResultSampleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    demResolution: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): ElevationLayerElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, demResolution = demResolution, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[ElevationLayerElevationQueryResultSampleInfo]
  }
}

