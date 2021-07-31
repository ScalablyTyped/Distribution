package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait histogramHistogramParams
  extends StObject
     with Object {
  
  /**
    * The method for classifying the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.undefined
  
  /**
    * A subset of features for which to generate the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * The name of the numeric field for which the histogram will be generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The layer for which to generate a histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  
  /**
    * The maximum bounding value for the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum bounding value for the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The field by which to normalize the values returned from the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the number of classes to generate for the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var numBins: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object histogramHistogramParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): histogramHistogramParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[histogramHistogramParams]
  }
  
  @scala.inline
  implicit class histogramHistogramParamsMutableBuilder[Self <: histogramHistogramParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
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
    def setNumBins(value: Double): Self = StObject.set(x, "numBins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBinsUndefined: Self = StObject.set(x, "numBins", js.undefined)
    
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
    def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
