package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParams
  extends StObject
     with Object {
  
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
    * Options for configuring the color portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var colorOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsColorOptions] = js.undefined
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The layer for which the visual variable is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  
  /**
    * A custom maximum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * A custom minimum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the field to normalize the values of the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Indicates whether symbol sizes should vary based on view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options for configuring the size portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var sizeOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSizeOptions] = js.undefined
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  
  /**
    * The type of symbol to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The view where the input layer is rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateContinuousRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParams]
  }
  
  @scala.inline
  implicit class univariateColorSizeCreateContinuousRendererParamsMutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setColorOptions(value: univariateColorSizeCreateContinuousRendererParamsColorOptions): Self = StObject.set(x, "colorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorOptionsUndefined: Self = StObject.set(x, "colorOptions", js.undefined)
    
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setSizeOptions(value: univariateColorSizeCreateContinuousRendererParamsSizeOptions): Self = StObject.set(x, "sizeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOptionsUndefined: Self = StObject.set(x, "sizeOptions", js.undefined)
    
    @scala.inline
    def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    @scala.inline
    def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
