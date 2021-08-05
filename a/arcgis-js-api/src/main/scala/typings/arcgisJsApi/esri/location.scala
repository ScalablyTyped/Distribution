package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating location-only visualizations (not data-driven) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html)
  */
trait location extends StObject {
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to a supported [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    */
  def createRenderer(params: locationCreateRendererParams): js.Promise[locationRendererResult]
}
object location {
  
  inline def apply(createRenderer: locationCreateRendererParams => js.Promise[locationRendererResult]): location = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[location]
  }
  
  extension [Self <: location](x: Self) {
    
    inline def setCreateRenderer(value: locationCreateRendererParams => js.Promise[locationRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
