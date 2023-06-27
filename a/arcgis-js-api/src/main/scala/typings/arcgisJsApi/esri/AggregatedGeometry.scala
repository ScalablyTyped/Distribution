package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedGeometry
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * A [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry representing a union of all polyline features encountered during the trace and specified by the output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#line)
  		 */
  var line: Polyline = js.native
  
  /**
  		 * A [multi-point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry representing a union of all point features encountered during the trace and specified by the output The aggregated geometries will only include geometries that belong to features with `assetgroups/assettypes` specified in the trace output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#multipoint)
  		 */
  var multipoint: Multipoint = js.native
  
  /**
  		 * A [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry representing a union of all polygon features encountered during the trace and specified by the output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html#polygon)
  		 */
  var polygon: Polygon = js.native
}
