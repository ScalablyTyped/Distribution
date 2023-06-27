package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Direction lines contains a set of line features for each segment of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directionLines)
  		 */
  var directionLines: FeatureSet = js.native
  
  /**
  		 * Direction points contains a set of point features representing the direction maneuvers such as arriving to or departing from a stop, turning left or right, and other events along your route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directionPoints)
  		 */
  var directionPoints: FeatureSet = js.native
  
  /**
  		 * Direction are returned if [RouteParameters.returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnDirections) is set to `true` and [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsOutputType) is set to `complete`, `complete-no-events`, `instructions-only', `standard` or `summary-only` in a [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directions)
  		 */
  var directions: DirectionsFeatureSet = js.native
  
  /**
  		 * This property returns a Graphic that represent the overall path with attributes containing the total cost.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#route)
  		 */
  var route: Graphic = js.native
  
  /**
  		 * The name of the route.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#routeName)
  		 */
  var routeName: String = js.native
  
  /**
  		 * Array of stops.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#stops)
  		 */
  var stops: js.Array[Graphic] = js.native
  
  /**
  		 * This provides access to the edges that are traversed while solving a network analysis layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedEdges)
  		 */
  var traversedEdges: FeatureSet = js.native
  
  /**
  		 * This provides access to the junctions that are traversed while solving a network analysis layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedJunctions)
  		 */
  var traversedJunctions: FeatureSet = js.native
  
  /**
  		 * This provides access to the turns that are traversed while solving a network analysis layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedTurns)
  		 */
  var traversedTurns: FeatureSet = js.native
}
