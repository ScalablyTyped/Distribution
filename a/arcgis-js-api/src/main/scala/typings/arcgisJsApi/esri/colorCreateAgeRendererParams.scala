package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.above
import typings.arcgisJsApi.arcgisJsApiStrings.below
import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.years
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreateAgeRendererParams extends StObject {
  
  /**
  		 * **This option only applies to generating renderers for mesh SceneLayers**.
  		 *
  		 * @default replace
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var colorMixMode: js.UndefOr[String] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  
  /**
  		 * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The name of the field, or a date value representing the end time in the age calculation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var endTime: js.Date | String | Double
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var legendOptions: js.UndefOr[colorCreateAgeRendererParamsLegendOptions] = js.undefined
  
  /**
  		 * Sets a maximum age for the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Sets a minimum age for the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * For polygon layers only.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * For point and polyline layers only.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The name of the field, or a date value representing the start time in the age calculation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var startTime: js.Date | String | Double
  
  /**
  		 * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  
  /**
  		 * The type of symbol to generate.
  		 *
  		 * @default 2d
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
  		 * Determines which values will be emphasized in the continuous ramp and the map.
  		 *
  		 * @default high-to-low
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
  		 */
  var theme: js.UndefOr[`high-to-low` | above | below | `above-and-below` | `centered-on` | extremes] = js.undefined
  
  /**
  		 * The time unit used to calculate the difference between `endTime` and `startTime`.
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[years | months | days | hours | minutes | seconds] = js.undefined
  
  /**
  		 * The view where the input layer is rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: View
}
object colorCreateAgeRendererParams {
  
  inline def apply(
    endTime: js.Date | String | Double,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    startTime: js.Date | String | Double,
    view: View
  ): colorCreateAgeRendererParams = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorCreateAgeRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colorCreateAgeRendererParams] (val x: Self) extends AnyVal {
    
    inline def setColorMixMode(value: String): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: colorCreateAgeRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setTheme(value: `high-to-low` | above | below | `above-and-below` | `centered-on` | extremes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUnit(value: years | months | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
