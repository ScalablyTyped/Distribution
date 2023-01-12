package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.graphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewGraphicHit
  extends StObject
     with SceneViewViewHit {
  
  /**
    * The distance from the camera position to the point geometry hit on this graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GraphicHit)
    */
  var distance: Double
  
  /**
    * A graphic present in the view that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GraphicHit)
    */
  var graphic: Graphic
  
  /**
    * The layer that contains the feature/graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GraphicHit)
    */
  var layer: Layer
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GraphicHit)
    */
  var mapPoint: Point
  
  var `type`: graphic
}
object SceneViewGraphicHit {
  
  inline def apply(distance: Double, graphic: Graphic, layer: Layer, mapPoint: Point): SceneViewGraphicHit = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[SceneViewGraphicHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewGraphicHit] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: graphic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
