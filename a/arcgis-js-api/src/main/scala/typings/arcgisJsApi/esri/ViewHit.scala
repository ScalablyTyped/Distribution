package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.GraphicHit
  - typings.arcgisJsApi.esri.MediaHit
  - typings.arcgisJsApi.esri.RouteHit
*/
trait ViewHit extends StObject
object ViewHit {
  
  inline def GraphicHit(graphic: Graphic, layer: Layer, mapPoint: Point): typings.arcgisJsApi.esri.GraphicHit = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.GraphicHit]
  }
  
  inline def MediaHit(element: ImageElement | VideoElement, layer: MediaLayer, mapPoint: Point): typings.arcgisJsApi.esri.MediaHit = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.MediaHit]
  }
  
  inline def RouteHit(
    layer: RouteLayer,
    mapPoint: Point,
    networkFeature: DirectionLine | DirectionPoint | PointBarrier | PolygonBarrier | RouteInfo | Stop
  ): typings.arcgisJsApi.esri.RouteHit = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], networkFeature = networkFeature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RouteHit]
  }
}
