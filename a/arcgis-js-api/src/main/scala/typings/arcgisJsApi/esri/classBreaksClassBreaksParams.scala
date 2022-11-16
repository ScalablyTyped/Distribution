package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait classBreaksClassBreaksParams extends StObject {
  
  /**
    * The method for classifying the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.undefined
  
  /**
    * A subset of features for which to generate the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * The class breaks will be generated based on values of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * A feature filter used to filter statistic queries by geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var filter: js.UndefOr[FeatureFilter] = js.undefined
  
  /**
    * Indicates whether the generated statistics are for a binning or clustering visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer from which to generate class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * The maximum bounding value for the class breaks definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum bounding value for the class breaks definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The field by which to normalize the values returned from the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the number of classes to generate for the class breaks definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Only applicable when the input `layer` is a service-backed FeatureLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var useFeaturesInView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object classBreaksClassBreaksParams {
  
  inline def apply(
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  ): classBreaksClassBreaksParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[classBreaksClassBreaksParams]
  }
  
  extension [Self <: classBreaksClassBreaksParams](x: Self) {
    
    inline def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    inline def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    inline def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: FeatureFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    inline def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    inline def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    inline def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    inline def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    inline def setUseFeaturesInView(value: Boolean): Self = StObject.set(x, "useFeaturesInView", value.asInstanceOf[js.Any])
    
    inline def setUseFeaturesInViewUndefined: Self = StObject.set(x, "useFeaturesInView", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
