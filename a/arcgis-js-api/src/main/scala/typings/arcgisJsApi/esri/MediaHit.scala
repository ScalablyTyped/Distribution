package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHit
  extends StObject
     with ViewHit {
  
  /**
    * An element representing a media element in [MediaLayer.source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source) that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#MediaHit)
    */
  var element: ImageElement | VideoElement
  
  /**
    * The media layer that contains the element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#MediaHit)
    */
  var layer: MediaLayer
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#MediaHit)
    */
  var mapPoint: Point
  
  var `type`: media
}
object MediaHit {
  
  inline def apply(element: ImageElement | VideoElement, layer: MediaLayer, mapPoint: Point): MediaHit = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[MediaHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaHit] (val x: Self) extends AnyVal {
    
    inline def setElement(value: ImageElement | VideoElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: MediaLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
