package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.above
import typings.arcgisJsApi.arcgisJsApiStrings.below
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeCreateContinuousRendererParams extends StObject {
  
  /**
  		 * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether the generated renderer is for a binning visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The layer for which the renderer is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * Provides options for setting a title to a field when an expression is provided instead of a field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var legendOptions: js.UndefOr[sizeCreateContinuousRendererParamsLegendOptions] = js.undefined
  
  /**
  		 * A custom maximum value set by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A custom minimum value set by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of the field to normalize the values of the given `field`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Only for polygon layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * Indicates whether symbol sizes should vary based on view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined size scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
  
  /**
  		 * A SQL expression evaluating to a number.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * A SQL where clause used to filter features for the statistics query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
  		 * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  
  /**
  		 * The type of symbol to generate.
  		 *
  		 * @default 2d
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
  		 * Sets the size stops based on meaningful data values.
  		 *
  		 * @default high-to-low
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var theme: js.UndefOr[`high-to-low` | above | below] = js.undefined
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * Text describing the value returned from the `valueExpression`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
  		 */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
  		 * The view where the input layer is rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: js.UndefOr[View] = js.undefined
}
object sizeCreateContinuousRendererParams {
  
  inline def apply(
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  ): sizeCreateContinuousRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeCreateContinuousRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sizeCreateContinuousRendererParams] (val x: Self) extends AnyVal {
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: sizeCreateContinuousRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    inline def setSizeSchemeUndefined: Self = StObject.set(x, "sizeScheme", js.undefined)
    
    inline def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    inline def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    inline def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    inline def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setTheme(value: `high-to-low` | above | below): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
