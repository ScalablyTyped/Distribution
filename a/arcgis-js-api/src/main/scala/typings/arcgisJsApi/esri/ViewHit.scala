package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.GraphicHit
  - typings.arcgisJsApi.esri.MediaHit
*/
trait ViewHit extends StObject
object ViewHit {
  
  inline def GraphicHit(
    constructor: js.Function,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.GraphicHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.GraphicHit]
  }
  
  inline def MediaHit(
    constructor: js.Function,
    element: ImageElement,
    hasOwnProperty: PropertyKey => Boolean,
    layer: MediaLayer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.MediaHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.MediaHit]
  }
}
