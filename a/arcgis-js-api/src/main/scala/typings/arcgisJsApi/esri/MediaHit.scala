package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.media
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHit
  extends StObject
     with Object
     with ViewHit {
  
  /**
    * An element representing a media element in [MediaLayer.source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source) that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#MediaHit)
    */
  var element: ImageElement
  
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
  
  inline def apply(
    constructor: js.Function,
    element: ImageElement,
    hasOwnProperty: PropertyKey => Boolean,
    layer: MediaLayer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MediaHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[MediaHit]
  }
  
  extension [Self <: MediaHit](x: Self) {
    
    inline def setElement(value: ImageElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: MediaLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
