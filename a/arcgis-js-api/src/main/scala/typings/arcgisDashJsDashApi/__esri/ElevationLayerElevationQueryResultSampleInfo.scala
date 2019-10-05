package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerElevationQueryResultSampleInfo extends Object {
  /**
    * The resolution at which the z-value was sampled. If no data was available for sampling for a given coordinate, the dem resolution value will be -1 for that coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var demResolution: Double
}

object ElevationLayerElevationQueryResultSampleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    demResolution: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, demResolution = demResolution, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ElevationLayerElevationQueryResultSampleInfo]
  }
}

