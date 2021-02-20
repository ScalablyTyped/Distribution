package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationLayerElevationQueryResultSampleInfo extends Object {
  
  /**
    * The resolution at which the z-value was sampled.
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
  implicit class ElevationLayerElevationQueryResultSampleInfoMutableBuilder[Self <: ElevationLayerElevationQueryResultSampleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemResolution(value: Double): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
  }
}
