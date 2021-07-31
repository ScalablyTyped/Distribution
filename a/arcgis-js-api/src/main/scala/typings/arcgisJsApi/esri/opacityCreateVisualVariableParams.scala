package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opacityCreateVisualVariableParams
  extends StObject
     with Object {
  
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The layer for which the visual variable is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var legendOptions: js.UndefOr[opacityCreateVisualVariableParamsLegendOptions] = js.undefined
  
  /**
    * A custom maximum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * A custom minimum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the field to normalize the values of the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object opacityCreateVisualVariableParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): opacityCreateVisualVariableParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[opacityCreateVisualVariableParams]
  }
  
  @scala.inline
  implicit class opacityCreateVisualVariableParamsMutableBuilder[Self <: opacityCreateVisualVariableParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptions(value: opacityCreateVisualVariableParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
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
