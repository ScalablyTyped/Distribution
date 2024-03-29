package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerElevationQueryResult extends StObject {
  
  /**
  		 * The geometry with sampled z-values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
  		 */
  var geometry: Point | Multipoint | Polyline
  
  /**
  		 * The value used when there is no data available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
  		 */
  var noDataValue: Double
  
  /**
  		 * Contains additional information about how the geometry was sampled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
  		 */
  var sampleInfo: js.UndefOr[js.Array[ElevationLayerElevationQueryResultSampleInfo]] = js.undefined
}
object ElevationLayerElevationQueryResult {
  
  inline def apply(geometry: Point | Multipoint | Polyline, noDataValue: Double): ElevationLayerElevationQueryResult = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLayerElevationQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationLayerElevationQueryResult] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: Point | Multipoint | Polyline): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setSampleInfo(value: js.Array[ElevationLayerElevationQueryResultSampleInfo]): Self = StObject.set(x, "sampleInfo", value.asInstanceOf[js.Any])
    
    inline def setSampleInfoUndefined: Self = StObject.set(x, "sampleInfo", js.undefined)
    
    inline def setSampleInfoVarargs(value: ElevationLayerElevationQueryResultSampleInfo*): Self = StObject.set(x, "sampleInfo", js.Array(value*))
  }
}
