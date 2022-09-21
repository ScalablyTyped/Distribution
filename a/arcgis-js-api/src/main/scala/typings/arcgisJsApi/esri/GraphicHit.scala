package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.graphic
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicHit
  extends StObject
     with Object
     with ViewHit {
  
  /**
    * A graphic representing a feature in the view that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GraphicHit)
    */
  var graphic: Graphic
  
  /**
    * The layer that contains the feature/graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GraphicHit)
    */
  var layer: Layer
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GraphicHit)
    */
  var mapPoint: Point
  
  var `type`: graphic
}
object GraphicHit {
  
  inline def apply(
    constructor: js.Function,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GraphicHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[GraphicHit]
  }
  
  extension [Self <: GraphicHit](x: Self) {
    
    inline def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: graphic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
