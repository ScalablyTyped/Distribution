package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLayerUpdateRouteLayerSolveResult
  extends StObject
     with Object {
  
  /**
    * Collection of direction polylines associated with line segments between turns.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var directionLines: Collection[DirectionLine]
  
  /**
    * Collection of direction items as points with various display information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var directionPoints: Collection[DirectionPoint]
  
  /**
    * Collection of polygon barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var polygonBarriers: Collection[PolygonBarrier]
  
  /**
    * Collection of polyline barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var polylineBarriers: Collection[PolylineBarrier]
  
  /**
    * Collection of point barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var readPointBarriers: Collection[PointBarrier]
  
  /**
    * Information about a solved route including the routes geometry and overall distance and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var routeInfo: RouteInfo
  
  /**
    * Collection of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#update)
    */
  var stops: Collection[Stop]
}
object RouteLayerUpdateRouteLayerSolveResult {
  
  inline def apply(
    constructor: js.Function,
    directionLines: Collection[DirectionLine],
    directionPoints: Collection[DirectionPoint],
    hasOwnProperty: PropertyKey => Boolean,
    polygonBarriers: Collection[PolygonBarrier],
    polylineBarriers: Collection[PolylineBarrier],
    propertyIsEnumerable: PropertyKey => Boolean,
    readPointBarriers: Collection[PointBarrier],
    routeInfo: RouteInfo,
    stops: Collection[Stop]
  ): RouteLayerUpdateRouteLayerSolveResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], directionLines = directionLines.asInstanceOf[js.Any], directionPoints = directionPoints.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), polygonBarriers = polygonBarriers.asInstanceOf[js.Any], polylineBarriers = polylineBarriers.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), readPointBarriers = readPointBarriers.asInstanceOf[js.Any], routeInfo = routeInfo.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLayerUpdateRouteLayerSolveResult]
  }
  
  extension [Self <: RouteLayerUpdateRouteLayerSolveResult](x: Self) {
    
    inline def setDirectionLines(value: Collection[DirectionLine]): Self = StObject.set(x, "directionLines", value.asInstanceOf[js.Any])
    
    inline def setDirectionPoints(value: Collection[DirectionPoint]): Self = StObject.set(x, "directionPoints", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriers(value: Collection[PolygonBarrier]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriers(value: Collection[PolylineBarrier]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setReadPointBarriers(value: Collection[PointBarrier]): Self = StObject.set(x, "readPointBarriers", value.asInstanceOf[js.Any])
    
    inline def setRouteInfo(value: RouteInfo): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
    
    inline def setStops(value: Collection[Stop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
