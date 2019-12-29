package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.horizontal
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramProperties extends WidgetProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a symbol indicating it is the average.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#average)
    */
  var average: js.UndefOr[Double] = js.undefined
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.undefined
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.undefined
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramDataLines]] = js.undefined
  /**
    * A function used to format labels on the histogram. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[LabelFormatter] = js.undefined
  /**
    * Determines the orientation of the Histogram widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  /**
    * The maximum value or bound of the entire histogram. This should match the maximum bound of the last [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#max)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value or bound of the entire histogram. This should match the minimum bound of the first [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#min)
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The view model for the Histogram widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [HistogramViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html) class to access all properties and methods on the Histogram widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramViewModelProperties] = js.undefined
}

object HistogramProperties {
  @scala.inline
  def apply(
    average: Int | Double = null,
    barCreatedFunction: (/* index */ Double, /* element */ js.Any) => Unit = null,
    bins: js.Array[Bin] = null,
    container: String | HTMLElement = null,
    dataLineCreatedFunction: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit = null,
    dataLines: js.Array[HistogramDataLines] = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    layout: vertical | horizontal = null,
    max: Int | Double = null,
    min: Int | Double = null,
    viewModel: HistogramViewModelProperties = null
  ): HistogramProperties = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (barCreatedFunction != null) __obj.updateDynamic("barCreatedFunction")(js.Any.fromFunction2(barCreatedFunction))
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dataLineCreatedFunction != null) __obj.updateDynamic("dataLineCreatedFunction")(js.Any.fromFunction3(dataLineCreatedFunction))
    if (dataLines != null) __obj.updateDynamic("dataLines")(dataLines.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramProperties]
  }
}

