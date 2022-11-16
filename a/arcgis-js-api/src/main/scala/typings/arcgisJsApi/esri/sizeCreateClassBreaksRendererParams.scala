package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.log
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeCreateClassBreaksRendererParams extends StObject {
  
  /**
    * The classification method used for generating breaks.
    *
    * @default equal-interval
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.undefined
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the field whose data will be queried for statistics and classified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the generated renderer is for a binning visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * Provides options for setting a title to describe a field instead of using the field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var legendOptions: js.UndefOr[sizeCreateClassBreaksRendererParamsLegendOptions] = js.undefined
  
  /**
    * A maximum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * A minimum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the field to normalize the values of the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationTotal: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates how the data is normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.undefined
  
  /**
    * The number of class breaks to generate.
    *
    * @default 5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  
  /**
    * Only for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * In authoring apps, the user may select a pre-defined size scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of symbol to generate.
    *
    * @default 2d
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The view where the input layer is rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object sizeCreateClassBreaksRendererParams {
  
  inline def apply(layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): sizeCreateClassBreaksRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeCreateClassBreaksRendererParams]
  }
  
  extension [Self <: sizeCreateClassBreaksRendererParams](x: Self) {
    
    inline def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    inline def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: sizeCreateClassBreaksRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTotalUndefined: Self = StObject.set(x, "normalizationTotal", js.undefined)
    
    inline def setNormalizationType(value: field | log | `percent-of-total`): Self = StObject.set(x, "normalizationType", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTypeUndefined: Self = StObject.set(x, "normalizationType", js.undefined)
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    inline def setSizeSchemeUndefined: Self = StObject.set(x, "sizeScheme", js.undefined)
    
    inline def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    inline def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    inline def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    inline def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    inline def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    inline def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
