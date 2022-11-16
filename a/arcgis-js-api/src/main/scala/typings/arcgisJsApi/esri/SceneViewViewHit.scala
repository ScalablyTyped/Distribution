package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SceneViewGraphicHit
  - typings.arcgisJsApi.esri.SceneViewMediaHit
  - typings.arcgisJsApi.esri.SceneViewRouteHit
*/
trait SceneViewViewHit extends StObject
object SceneViewViewHit {
  
  inline def SceneViewGraphicHit(distance: Double, graphic: Graphic, layer: Layer, mapPoint: Point): typings.arcgisJsApi.esri.SceneViewGraphicHit = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SceneViewGraphicHit]
  }
  
  inline def SceneViewMediaHit(distance: Double, element: ImageElement | VideoElement, layer: MediaLayer, mapPoint: Point): typings.arcgisJsApi.esri.SceneViewMediaHit = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SceneViewMediaHit]
  }
  
  inline def SceneViewRouteHit(
    layer: RouteLayer,
    mapPoint: Point,
    networkFeature: DirectionLine | DirectionPoint | PointBarrier | PolygonBarrier | RouteInfo | Stop
  ): typings.arcgisJsApi.esri.SceneViewRouteHit = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], networkFeature = networkFeature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SceneViewRouteHit]
  }
}
