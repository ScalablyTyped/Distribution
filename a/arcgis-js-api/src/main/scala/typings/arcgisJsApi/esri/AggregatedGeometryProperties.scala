package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedGeometryProperties extends StObject {
  
  /**
  		 * A [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry representing a union of all polyline features encountered during the trace and specified by the output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#line)
  		 */
  var line: js.UndefOr[PolylineProperties] = js.undefined
  
  /**
  		 * A [multi-point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry representing a union of all point features encountered during the trace and specified by the output The aggregated geometries will only include geometries that belong to features with `assetgroups/assettypes` specified in the trace output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#multipoint)
  		 */
  var multipoint: js.UndefOr[MultipointProperties] = js.undefined
  
  /**
  		 * A [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry representing a union of all polygon features encountered during the trace and specified by the output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#polygon)
  		 */
  var polygon: js.UndefOr[PolygonProperties] = js.undefined
}
object AggregatedGeometryProperties {
  
  inline def apply(): AggregatedGeometryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedGeometryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedGeometryProperties] (val x: Self) extends AnyVal {
    
    inline def setLine(value: PolylineProperties): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMultipoint(value: MultipointProperties): Self = StObject.set(x, "multipoint", value.asInstanceOf[js.Any])
    
    inline def setMultipointUndefined: Self = StObject.set(x, "multipoint", js.undefined)
    
    inline def setPolygon(value: PolygonProperties): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
  }
}
