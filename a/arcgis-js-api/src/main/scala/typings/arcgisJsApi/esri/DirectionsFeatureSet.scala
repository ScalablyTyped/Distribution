package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsFeatureSet
  extends StObject
     with FeatureSet {
  
  /**
  		 * The extent of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#extent)
  		 */
  var extent: Extent = js.native
  
  /**
  		 * The geometry type of the Directions FeatureSet.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#geometryType)
  		 */
  @JSName("geometryType")
  var geometryType_DirectionsFeatureSet: polyline = js.native
  
  /**
  		 * A single polyline representing the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#mergedGeometry)
  		 */
  var mergedGeometry: Polyline = js.native
  
  /**
  		 * The ID of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#routeId)
  		 */
  var routeId: Double = js.native
  
  /**
  		 * The name of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#routeName)
  		 */
  var routeName: String = js.native
  
  /**
  		 * A flattened array of all [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#strings)
  		 */
  var strings: js.Array[DirectionsString] = js.native
  
  /**
  		 * The total drive time for the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#totalDriveTime)
  		 */
  var totalDriveTime: Double = js.native
  
  /**
  		 * The total length of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#totalLength)
  		 */
  var totalLength: Double = js.native
  
  /**
  		 * The total time for the route including wait and service time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#totalTime)
  		 */
  var totalTime: Double = js.native
}
