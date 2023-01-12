package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewRouteHit
  extends StObject
     with SceneViewViewHit {
  
  /**
    * The route layer that contains the element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#RouteHit)
    */
  var layer: RouteLayer
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#RouteHit)
    */
  var mapPoint: Point
  
  /**
    * The route hit test will contain all intersecting network elements which, includes one of the following: DirectionLine, DirectionPoint, PointBarrier, PolylineBarrier, PolygonBarrier, Stop, or RouteInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#RouteHit)
    */
  var networkFeature: DirectionLine | DirectionPoint | PointBarrier | PolygonBarrier | RouteInfo | Stop
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.route
}
object SceneViewRouteHit {
  
  inline def apply(
    layer: RouteLayer,
    mapPoint: Point,
    networkFeature: DirectionLine | DirectionPoint | PointBarrier | PolygonBarrier | RouteInfo | Stop
  ): SceneViewRouteHit = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], networkFeature = networkFeature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[SceneViewRouteHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewRouteHit] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: RouteLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setNetworkFeature(value: DirectionLine | DirectionPoint | PointBarrier | PolygonBarrier | RouteInfo | Stop): Self = StObject.set(x, "networkFeature", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.route): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
