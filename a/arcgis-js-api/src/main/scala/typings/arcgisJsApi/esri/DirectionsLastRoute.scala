package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsLastRoute
  extends StObject
     with RouteLayerSolveResult {
  
  /**
    * Collection of point barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("pointBarriers")
  var pointBarriers_DirectionsLastRoute: Collection[PointBarrier]
  
  /**
    * Collection of polygon barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("polygonBarriers")
  var polygonBarriers_DirectionsLastRoute: Collection[PolygonBarrier]
  
  /**
    * Collection of polyline barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("polylineBarriers")
  var polylineBarriers_DirectionsLastRoute: Collection[PolylineBarrier]
}
object DirectionsLastRoute {
  
  inline def apply(
    directionLines: Collection[DirectionLine],
    directionPoints: Collection[DirectionPoint],
    pointBarriers: Collection[PointBarrier],
    polygonBarriers: Collection[PolygonBarrier],
    polylineBarriers: Collection[PolylineBarrier],
    routeInfo: RouteInfo,
    stops: Collection[Stop]
  ): DirectionsLastRoute = {
    val __obj = js.Dynamic.literal(directionLines = directionLines.asInstanceOf[js.Any], directionPoints = directionPoints.asInstanceOf[js.Any], pointBarriers = pointBarriers.asInstanceOf[js.Any], polygonBarriers = polygonBarriers.asInstanceOf[js.Any], polylineBarriers = polylineBarriers.asInstanceOf[js.Any], routeInfo = routeInfo.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLastRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsLastRoute] (val x: Self) extends AnyVal {
    
    inline def setPointBarriers(value: Collection[PointBarrier]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriers(value: Collection[PolygonBarrier]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriers(value: Collection[PolylineBarrier]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
  }
}
