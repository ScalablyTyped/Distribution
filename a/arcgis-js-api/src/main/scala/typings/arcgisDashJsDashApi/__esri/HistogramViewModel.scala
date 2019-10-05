package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramViewModel extends Accessor {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a symbol indicating it is the average.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#average)
    */
  var average: Double = js.native
  /**
    * The range of values for the histogram calculated from the bins. This is calculated by subtracting the min value of the first bin from the max value of the last bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#binRange)
    */
  val binRange: Double = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins)
    */
  var bins: js.Array[Bin] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: LabelFormatter = js.native
  /**
    * The maximum value or bound of the entire histogram. This should match the maximum bound of the last [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#max)
    */
  var max: Double = js.native
  /**
    * The minimum value or bound of the entire histogram. This should match the minimum bound of the first [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#min)
    */
  var min: Double = js.native
  /**
    * The range of values for the histogram. This is calculated by subtracting the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#min) from the [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#max).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#range)
    */
  val range: Double = js.native
  /**
    * The current state of the view model.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#state)
    */
  val state: String = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: String): String = js.native
  def labelFormatFunction(value: Double, `type`: String, index: Double): String = js.native
}

@JSGlobal("__esri.HistogramViewModel")
@js.native
object HistogramViewModel extends TopLevel[HistogramViewModelConstructor]

