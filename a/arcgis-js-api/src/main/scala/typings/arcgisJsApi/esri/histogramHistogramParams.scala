package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait histogramHistogramParams extends Object {
  /**
    * The method for classifying the data. See the table below for a list of possible values.
    *
    * | Possible Value | Description |
    * |---------------|------------ |
    * | natural-breaks | Data values that cluster are placed into a single class. Class breaks occur where gaps exist between clusters. You should use this method if your data is unevenly distributed; that is, many features have the same or similar values and there are gaps between groups of values. |
    * | equal-interval | Each class has an equal range of values; in other words, the difference between the high and low value is equal for each class. You should use this method if your data is evenly distributed and you want to emphasize the difference in values between the features. |
    * | quantile | Each class has roughly the same number of features. If your data is evenly distributed and you want to emphasize the difference in relative position between features, you should use the quantile classification method. If, for example, the point values are divided into five classes, points in the highest class would fall into the top fifth of all points.  |
    * | standard-deviation | Class breaks are placed above and below the mean value at intervals of `1`, `0.5`, or `0.25` standard deviations until all the data values are included in a class.  |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.native
  /**
    * A subset of features for which to generate the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.native
  /**
    * The name of the numeric field for which the histogram will be generated. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The layer for which to generate a histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer = js.native
  /**
    * The maximum bounding value for the histogram. Use this in conjunction with `minValue` to generate a histogram between custom lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * The minimum bounding value for the histogram. Use this in conjunction with `maxValue` to generate a histogram between custom lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * The field by which to normalize the values returned from the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * Indicates the number of classes to generate for the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    *
    * @default 10
    */
  var numBins: js.UndefOr[Double] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var sqlExpression: js.UndefOr[String] = js.native
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var sqlWhere: js.UndefOr[String] = js.native
  /**
    * When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g. `0.25`, `0.33`, `0.5`, `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
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
  implicit class histogramHistogramParamsOps[Self <: histogramHistogramParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = this.set("classificationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationMethod: Self = this.set("classificationMethod", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setNormalizationField(value: String): Self = this.set("normalizationField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizationField: Self = this.set("normalizationField", js.undefined)
    @scala.inline
    def setNumBins(value: Double): Self = this.set("numBins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumBins: Self = this.set("numBins", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSqlExpression(value: String): Self = this.set("sqlExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlExpression: Self = this.set("sqlExpression", js.undefined)
    @scala.inline
    def setSqlWhere(value: String): Self = this.set("sqlWhere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlWhere: Self = this.set("sqlWhere", js.undefined)
    @scala.inline
    def setStandardDeviationInterval(value: Double): Self = this.set("standardDeviationInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviationInterval: Self = this.set("standardDeviationInterval", js.undefined)
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpression: Self = this.set("valueExpression", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

