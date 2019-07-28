package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Histogram extends Widget {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a symbol indicating it is the average.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#average)
    */
  var average: Double = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#barCreatedFunction)
    */
  @JSName("barCreatedFunction")
  var barCreatedFunction_Original: BarCreatedFunction = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins)
    */
  var bins: js.Array[Bin] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLineCreatedFunction)
    */
  @JSName("dataLineCreatedFunction")
  var dataLineCreatedFunction_Original: DataLineCreatedFunction = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
    */
  var dataLines: js.Array[HistogramDataLines] = js.native
  /**
    * A function used to format labels on the histogram. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: LabelFormatter = js.native
  /**
    * Determines the orientation of the Histogram widget.  **Possible Values:** vertical | horizontal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#layout)
    *
    * @default horizontal
    */
  var layout: String = js.native
  /**
    * The maximum value or bound of the entire histogram. This should match the maximum bound of the last [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#max)
    */
  var max: Double = js.native
  /**
    * The minimum value or bound of the entire histogram. This should match the minimum bound of the first [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#min)
    */
  var min: Double = js.native
  /**
    * The state of the widget.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#state)
    */
  val state: String = js.native
  /**
    * The view model for the Histogram widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [HistogramViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html) class to access all properties and methods on the Histogram widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#viewModel)
    */
  var viewModel: HistogramViewModel = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#barCreatedFunction)
    */
  def barCreatedFunction(index: Double, element: js.Any): Unit = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLineCreatedFunction)
    */
  def dataLineCreatedFunction(lineElement: js.Any): Unit = js.native
  def dataLineCreatedFunction(lineElement: js.Any, labelElement: js.Any): Unit = js.native
  def dataLineCreatedFunction(lineElement: js.Any, labelElement: js.Any, index: Double): Unit = js.native
  /**
    * A function used to format labels on the histogram. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: String): String = js.native
  def labelFormatFunction(value: Double, `type`: String, index: Double): String = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.Histogram")
@js.native
/**
  * Renders a histogram to visualize the spread of a dataset based on [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins) representing buckets, or sub-ranges, of data. Each [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin) is defined by a minimum and maximum value and a total count.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html)
  */
class HistogramCls () extends Histogram {
  def this(properties: HistogramProperties) = this()
}

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
  def histogram(params: histogramHistogramParams): IPromise[HistogramResult]
}

object histogram {
  @scala.inline
  def apply(histogram: histogramHistogramParams => IPromise[HistogramResult]): histogram = {
    val __obj = js.Dynamic.literal(histogram = js.Any.fromFunction1(histogram))
  
    __obj.asInstanceOf[histogram]
  }
}

