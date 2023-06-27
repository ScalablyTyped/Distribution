package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colormapCreateRendererParams extends StObject {
  
  /**
  		 * The input layer for which the renderer is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#createRenderer)
  		 */
  var layer: ImageryLayer | ImageryTileLayer
  
  /**
  		 * Specifies the function for how the requested image should be processed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#createRenderer)
  		 */
  var rasterFunction: js.UndefOr[RasterFunction] = js.undefined
  
  /**
  		 * Deprecated since 4.27.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#createRenderer)
  		 */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#createRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object colormapCreateRendererParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer): colormapCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[colormapCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colormapCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRasterFunction(value: RasterFunction): Self = StObject.set(x, "rasterFunction", value.asInstanceOf[js.Any])
    
    inline def setRasterFunctionUndefined: Self = StObject.set(x, "rasterFunction", js.undefined)
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
