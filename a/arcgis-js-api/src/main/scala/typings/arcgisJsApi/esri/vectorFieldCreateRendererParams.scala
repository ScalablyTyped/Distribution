package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-ft`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-km`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-kn`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-m`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-mi`
import typings.arcgisJsApi.arcgisJsApiStrings.`classified-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`ocean-current-kn`
import typings.arcgisJsApi.arcgisJsApiStrings.`ocean-current-m`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-scalar`
import typings.arcgisJsApi.arcgisJsApiStrings.`single-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`wind-barb`
import typings.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typings.arcgisJsApi.arcgisJsApiStrings.geographic
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait vectorFieldCreateRendererParams extends StObject {
  
  /**
  		 * Defines the flow direction of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.undefined
  
  /**
  		 * The input layer for which the renderer is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var layer: ImageryLayer | ImageryTileLayer
  
  /**
  		 * Specifies the function for how the requested image should be processed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var rasterFunction: js.UndefOr[RasterFunction] = js.undefined
  
  /**
  		 * Deprecated since 4.27.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
  		 * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var rotationType: js.UndefOr[geographic | arithmetic] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * The predefined symbol styles used to represent the vector flow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
  		 */
  var style: js.UndefOr[
    `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
  ] = js.undefined
}
object vectorFieldCreateRendererParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer): vectorFieldCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[vectorFieldCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vectorFieldCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    inline def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRasterFunction(value: RasterFunction): Self = StObject.set(x, "rasterFunction", value.asInstanceOf[js.Any])
    
    inline def setRasterFunctionUndefined: Self = StObject.set(x, "rasterFunction", js.undefined)
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setRotationType(value: geographic | arithmetic): Self = StObject.set(x, "rotationType", value.asInstanceOf[js.Any])
    
    inline def setRotationTypeUndefined: Self = StObject.set(x, "rotationType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStyle(
      value: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
