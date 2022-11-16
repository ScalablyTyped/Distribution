package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait utilsGetSupportedRendererInfoParams extends StObject {
  
  /**
    * The input layer for which the renderer info is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getSupportedRendererInfo)
    */
  var layer: ImageryLayer | ImageryTileLayer | WCSLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getSupportedRendererInfo)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getSupportedRendererInfo)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object utilsGetSupportedRendererInfoParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer | WCSLayer): utilsGetSupportedRendererInfoParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[utilsGetSupportedRendererInfoParams]
  }
  
  extension [Self <: utilsGetSupportedRendererInfoParams](x: Self) {
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer | WCSLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
