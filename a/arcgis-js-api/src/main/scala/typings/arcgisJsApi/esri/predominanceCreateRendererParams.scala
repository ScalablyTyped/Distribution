package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait predominanceCreateRendererParams extends StObject {
  
  /**
  		 * **This option only applies to generating renderers for mesh SceneLayers**.
  		 *
  		 * @default replace
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var colorMixMode: js.UndefOr[String] = js.undefined
  
  /**
  		 * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A set of competing numeric fields used as the basis of the predominance visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var fields: js.Array[predominanceCreateRendererParamsFields]
  
  /**
  		 * Indicates whether the generated renderer is for a binning visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to include data-driven opacity in the final renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var includeOpacityVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to include data-driven size in the final renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var includeSizeVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var legendOptions: js.UndefOr[predominanceCreateRendererParamsLegendOptions] = js.undefined
  
  /**
  		 * Only for polygon layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined predominance scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var predominanceScheme: js.UndefOr[PredominanceScheme] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * Indicates whether symbol sizes should vary based on view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * @default count
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var sortBy: js.UndefOr[count | value] = js.undefined
  
  /**
  		 * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  
  /**
  		 * The type of symbol to generate.
  		 *
  		 * @default 2d
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
  		 * The view instance in which the visualization will be rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: View
}
object predominanceCreateRendererParams {
  
  inline def apply(
    fields: js.Array[predominanceCreateRendererParamsFields],
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    view: View
  ): predominanceCreateRendererParams = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: predominanceCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setColorMixMode(value: String): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setFields(value: js.Array[predominanceCreateRendererParamsFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: predominanceCreateRendererParamsFields*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setIncludeOpacityVariable(value: Boolean): Self = StObject.set(x, "includeOpacityVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeOpacityVariableUndefined: Self = StObject.set(x, "includeOpacityVariable", js.undefined)
    
    inline def setIncludeSizeVariable(value: Boolean): Self = StObject.set(x, "includeSizeVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeSizeVariableUndefined: Self = StObject.set(x, "includeSizeVariable", js.undefined)
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: predominanceCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setPredominanceScheme(value: PredominanceScheme): Self = StObject.set(x, "predominanceScheme", value.asInstanceOf[js.Any])
    
    inline def setPredominanceSchemeUndefined: Self = StObject.set(x, "predominanceScheme", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setSortBy(value: count | value): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
