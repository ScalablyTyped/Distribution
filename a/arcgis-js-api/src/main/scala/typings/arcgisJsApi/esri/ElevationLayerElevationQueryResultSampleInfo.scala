package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayerElevationQueryResultSampleInfo extends Object {
  /**
    * The resolution at which the z-value was sampled. If no data was available for sampling for a given coordinate, the dem resolution value will be -1 for that coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var demResolution: Double = js.native
}

object ElevationLayerElevationQueryResultSampleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    demResolution: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], demResolution = demResolution.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationLayerElevationQueryResultSampleInfo]
  }
  @scala.inline
  implicit class ElevationLayerElevationQueryResultSampleInfoOps[Self <: ElevationLayerElevationQueryResultSampleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDemResolution(value: Double): Self = this.set("demResolution", value.asInstanceOf[js.Any])
  }
  
}

