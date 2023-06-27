package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains helper methods for generating a [FlowRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html) for a `Vector-UV` or `Vector-MagDir` [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html)
	 */
trait flow extends StObject {
  
  /**
  		 * Generates a [FlowRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html) to display raster data with stream lines.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
  		 */
  def createRenderer(params: flowCreateRendererParams): js.Promise[FlowRendererResult]
}
object flow {
  
  inline def apply(createRenderer: flowCreateRendererParams => js.Promise[FlowRendererResult]): flow = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[flow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: flow] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: flowCreateRendererParams => js.Promise[FlowRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
