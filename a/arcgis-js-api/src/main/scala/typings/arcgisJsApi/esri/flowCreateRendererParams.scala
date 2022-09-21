package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`wave-front`
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait flowCreateRendererParams
  extends StObject
     with Object {
  
  /**
    * Defines the flow direction of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.undefined
  
  /**
    * The flow scheme used to set colors and sizes to the flow lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var flowScheme: js.UndefOr[FlowScheme] = js.undefined
  
  /**
    * When `true`, the color of stream lines will vary depending on the magnitude of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var includeColorVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the opacity of stream lines will vary depending on the magnitude of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var includeOpacityVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the width of stream lines will vary depending on the magnitude of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var includeSizeVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer
  
  /**
    * Provides options for setting a title to the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var legendOptions: js.UndefOr[flowCreateRendererParamsLegendOptions] = js.undefined
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Determines how flow lines will render.
    *
    * @default "flow-line"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
    */
  var theme: js.UndefOr[`flow-line` | `wave-front`] = js.undefined
  
  /**
    * The view where the input layer is rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView] = js.undefined
}
object flowCreateRendererParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: ImageryLayer | ImageryTileLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): flowCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[flowCreateRendererParams]
  }
  
  extension [Self <: flowCreateRendererParams](x: Self) {
    
    inline def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    inline def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    inline def setFlowScheme(value: FlowScheme): Self = StObject.set(x, "flowScheme", value.asInstanceOf[js.Any])
    
    inline def setFlowSchemeUndefined: Self = StObject.set(x, "flowScheme", js.undefined)
    
    inline def setIncludeColorVariable(value: Boolean): Self = StObject.set(x, "includeColorVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeColorVariableUndefined: Self = StObject.set(x, "includeColorVariable", js.undefined)
    
    inline def setIncludeOpacityVariable(value: Boolean): Self = StObject.set(x, "includeOpacityVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeOpacityVariableUndefined: Self = StObject.set(x, "includeOpacityVariable", js.undefined)
    
    inline def setIncludeSizeVariable(value: Boolean): Self = StObject.set(x, "includeSizeVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeSizeVariableUndefined: Self = StObject.set(x, "includeSizeVariable", js.undefined)
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: flowCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTheme(value: `flow-line` | `wave-front`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
