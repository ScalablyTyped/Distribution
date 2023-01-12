package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerElevationQueryResultSampleInfo extends StObject {
  
  /**
    * The resolution at which the z-value was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var demResolution: Double
}
object ElevationLayerElevationQueryResultSampleInfo {
  
  inline def apply(demResolution: Double): ElevationLayerElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(demResolution = demResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLayerElevationQueryResultSampleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationLayerElevationQueryResultSampleInfo] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
  }
}
