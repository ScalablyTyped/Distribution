package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteResultProperties extends StObject {
  
  /**
    * Direction lines contains a set of line features for each segment of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directionLines)
    */
  var directionLines: js.UndefOr[FeatureSetProperties] = js.undefined
  
  /**
    * Direction points contains a set of point features representing the direction maneuvers such as arriving to or departing from a stop, turning left or right, and other events along your route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directionPoints)
    */
  var directionPoints: js.UndefOr[FeatureSetProperties] = js.undefined
  
  /**
    * Route directions are returned if `RouteParameters.returnDirections = true` and `RouteParameters.directionsOutputType` is not set to "featuresets"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.undefined
  
  /**
    * The Route graphic that is returned if `RouteParameters.returnRoutes = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#route)
    */
  var route: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * The name of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.undefined
  
  /**
    * Array of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#stops)
    */
  var stops: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * This provides access to the edges that are traversed while solving a network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedEdges)
    */
  var traversedEdges: js.UndefOr[FeatureSetProperties] = js.undefined
  
  /**
    * This provides access to the junctions that are traversed while solving a network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedJunctions)
    */
  var traversedJunctions: js.UndefOr[FeatureSetProperties] = js.undefined
  
  /**
    * This provides access to the turns that are traversed while solving a network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html#traversedTurns)
    */
  var traversedTurns: js.UndefOr[FeatureSetProperties] = js.undefined
}
object RouteResultProperties {
  
  inline def apply(): RouteResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResultProperties]
  }
  
  extension [Self <: RouteResultProperties](x: Self) {
    
    inline def setDirectionLines(value: FeatureSetProperties): Self = StObject.set(x, "directionLines", value.asInstanceOf[js.Any])
    
    inline def setDirectionLinesUndefined: Self = StObject.set(x, "directionLines", js.undefined)
    
    inline def setDirectionPoints(value: FeatureSetProperties): Self = StObject.set(x, "directionPoints", value.asInstanceOf[js.Any])
    
    inline def setDirectionPointsUndefined: Self = StObject.set(x, "directionPoints", js.undefined)
    
    inline def setDirections(value: DirectionsFeatureSetProperties): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setRoute(value: GraphicProperties): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    inline def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setStops(value: js.Array[GraphicProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: GraphicProperties*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setTraversedEdges(value: FeatureSetProperties): Self = StObject.set(x, "traversedEdges", value.asInstanceOf[js.Any])
    
    inline def setTraversedEdgesUndefined: Self = StObject.set(x, "traversedEdges", js.undefined)
    
    inline def setTraversedJunctions(value: FeatureSetProperties): Self = StObject.set(x, "traversedJunctions", value.asInstanceOf[js.Any])
    
    inline def setTraversedJunctionsUndefined: Self = StObject.set(x, "traversedJunctions", js.undefined)
    
    inline def setTraversedTurns(value: FeatureSetProperties): Self = StObject.set(x, "traversedTurns", value.asInstanceOf[js.Any])
    
    inline def setTraversedTurnsUndefined: Self = StObject.set(x, "traversedTurns", js.undefined)
  }
}
