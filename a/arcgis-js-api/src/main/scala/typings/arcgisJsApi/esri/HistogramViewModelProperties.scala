package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramViewModelProperties extends js.Object {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a symbol indicating it is the average.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[LabelFormatter] = js.native
  /**
    * The maximum value or bound of the entire histogram. This should match the maximum bound of the last [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value or bound of the entire histogram. This should match the minimum bound of the first [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#min)
    */
  var min: js.UndefOr[Double] = js.native
}

object HistogramViewModelProperties {
  @scala.inline
  def apply(): HistogramViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramViewModelProperties]
  }
  @scala.inline
  implicit class HistogramViewModelPropertiesOps[Self <: HistogramViewModelProperties] (val x: Self) extends AnyVal {
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
    def setAverage(value: Double): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = this.set("bins", js.Array(value :_*))
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = this.set("bins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBins: Self = this.set("bins", js.undefined)
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("labelFormatFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLabelFormatFunction: Self = this.set("labelFormatFunction", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

