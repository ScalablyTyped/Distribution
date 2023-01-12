package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLayerSolveResult extends StObject {
  
  /**
    * Represents polyline segments associated with individual direction items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var directionLines: Collection[DirectionLine]
  
  /**
    * Represents direction items as points with various display information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var directionPoints: Collection[DirectionPoint]
  
  /**
    * Point barrier(s) to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var pointBarriers: js.UndefOr[Collection[PointBarrier]] = js.undefined
  
  /**
    * Polygon barrier(s) to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var polygonBarriers: js.UndefOr[Collection[PolygonBarrier]] = js.undefined
  
  /**
    * Polyline barrier(s) to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var polylineBarriers: js.UndefOr[Collection[PolylineBarrier]] = js.undefined
  
  /**
    * Contains information about a solved route including the routes geometry and overall distance and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var routeInfo: RouteInfo
  
  /**
    * Respresents the start, end, or midpoint of a route created using the [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#RouteLayerSolveResult)
    */
  var stops: Collection[Stop]
}
object RouteLayerSolveResult {
  
  inline def apply(
    directionLines: Collection[DirectionLine],
    directionPoints: Collection[DirectionPoint],
    routeInfo: RouteInfo,
    stops: Collection[Stop]
  ): RouteLayerSolveResult = {
    val __obj = js.Dynamic.literal(directionLines = directionLines.asInstanceOf[js.Any], directionPoints = directionPoints.asInstanceOf[js.Any], routeInfo = routeInfo.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLayerSolveResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteLayerSolveResult] (val x: Self) extends AnyVal {
    
    inline def setDirectionLines(value: Collection[DirectionLine]): Self = StObject.set(x, "directionLines", value.asInstanceOf[js.Any])
    
    inline def setDirectionPoints(value: Collection[DirectionPoint]): Self = StObject.set(x, "directionPoints", value.asInstanceOf[js.Any])
    
    inline def setPointBarriers(value: Collection[PointBarrier]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPolygonBarriers(value: Collection[PolygonBarrier]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolylineBarriers(value: Collection[PolylineBarrier]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setRouteInfo(value: RouteInfo): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
    
    inline def setStops(value: Collection[Stop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
