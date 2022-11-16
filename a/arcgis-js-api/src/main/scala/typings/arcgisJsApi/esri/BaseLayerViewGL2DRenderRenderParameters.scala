package typings.arcgisJsApi.esri

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayerViewGL2DRenderRenderParameters extends StObject {
  
  /**
    * The WebGL or WebGL 2 context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var context: WebGLRenderingContext | Any
  
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var state: ViewState
  
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var stationary: Boolean
}
object BaseLayerViewGL2DRenderRenderParameters {
  
  inline def apply(context: WebGLRenderingContext | Any, state: ViewState, stationary: Boolean): BaseLayerViewGL2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerViewGL2DRenderRenderParameters]
  }
  
  extension [Self <: BaseLayerViewGL2DRenderRenderParameters](x: Self) {
    
    inline def setContext(value: WebGLRenderingContext | Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setState(value: ViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStationary(value: Boolean): Self = StObject.set(x, "stationary", value.asInstanceOf[js.Any])
  }
}
