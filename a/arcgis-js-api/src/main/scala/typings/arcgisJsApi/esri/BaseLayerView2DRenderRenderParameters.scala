package typings.arcgisJsApi.esri

import typings.std.CanvasRenderingContext2D
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayerView2DRenderRenderParameters
  extends StObject
     with Object {
  
  /**
    * The [canvas 2D context](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) in which to draw content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var context: CanvasRenderingContext2D
  
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var state: ViewState
  
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var stationary: Boolean
}
object BaseLayerView2DRenderRenderParameters {
  
  inline def apply(
    constructor: js.Function,
    context: CanvasRenderingContext2D,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: ViewState,
    stationary: Boolean
  ): BaseLayerView2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerView2DRenderRenderParameters]
  }
  
  extension [Self <: BaseLayerView2DRenderRenderParameters](x: Self) {
    
    inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setState(value: ViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStationary(value: Boolean): Self = StObject.set(x, "stationary", value.asInstanceOf[js.Any])
  }
}
