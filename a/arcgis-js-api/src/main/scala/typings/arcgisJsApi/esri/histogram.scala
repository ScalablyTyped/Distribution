package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates a histogram based on data in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) for a given field. The returned object can be used for displaying a histogram in the UI within visualization authoring applications and analytical apps that query and display statistics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html)
  */
trait histogram extends js.Object {
  /**
    * Generates a histogram for data returned from a `field` in a given `layer`. The returned object can be used for displaying a histogram to the UI in visualization authoring applications and analytical apps that query and display statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram)
    *
    * @param params See the table below for details on parameters that may be passed to this function.
    * @param params.layer The layer for which to generate a histogram.
    * @param params.field The name of the numeric field for which the histogram will be generated. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The field by which to normalize the values returned from the given `field`.
    * @param params.classificationMethod
    * The method for classifying the data. See the table below for a list of possible values.
    *
    * | Possible Value | Description |
    * |---------------|------------ |
    * | natural-breaks | Data values that cluster are placed into a single class. Class breaks occur where gaps exist between clusters. You should use this method if your data is unevenly distributed; that is, many features have the same or similar values and there are gaps between groups of values. |
    * | equal-interval | Each class has an equal range of values; in other words, the difference between the high and low value is equal for each class. You should use this method if your data is evenly distributed and you want to emphasize the difference in values between the features. |
    * | quantile | Each class has roughly the same number of features. If your data is evenly distributed and you want to emphasize the difference in relative position between features, you should use the quantile classification method. If, for example, the point values are divided into five classes, points in the highest class would fall into the top fifth of all points.  |
    * | standard-deviation | Class breaks are placed above and below the mean value at intervals of `1`, `0.5`, or `0.25` standard deviations until all the data values are included in a class.  |
    * @param params.standardDeviationInterval When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g. `0.25`, `0.33`, `0.5`, `1`).
    * @param params.minValue The minimum bounding value for the histogram. Use this in conjunction with `maxValue` to generate a histogram between custom lower and upper bounds.
    * @param params.maxValue The maximum bounding value for the histogram. Use this in conjunction with `minValue` to generate a histogram between custom lower and upper bounds.
    * @param params.numBins Indicates the number of classes to generate for the histogram.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.view A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    * @param params.features A subset of features for which to generate the histogram.
    *
    */
  def histogram(params: histogramHistogramParams): js.Promise[HistogramResult]
}

@JSGlobal("__esri.histogram")
@js.native
object histogram
  extends TopLevel[js.Function1[/* params */ histogramHistogramParams, js.Promise[HistogramResult]]]

