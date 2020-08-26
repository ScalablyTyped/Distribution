package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramProperties extends WidgetProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a symbol indicating it is the average.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramDataLines]] = js.native
  /**
    * A function used to format labels on the histogram. Overrides the default label formatter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[LabelFormatter] = js.native
  /**
    * Determines the orientation of the Histogram widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[vertical | horizontal] = js.native
  /**
    * The maximum value or bound of the entire histogram. This should match the maximum bound of the last [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value or bound of the entire histogram. This should match the minimum bound of the first [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The view model for the Histogram widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [HistogramViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html) class to access all properties and methods on the Histogram widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramViewModelProperties] = js.native
}

object HistogramProperties {
  @scala.inline
  def apply(): HistogramProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramProperties]
  }
  @scala.inline
  implicit class HistogramPropertiesOps[Self <: HistogramProperties] (val x: Self) extends AnyVal {
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
    def setBarCreatedFunction(value: (/* index */ Double, /* element */ js.Any) => Unit): Self = this.set("barCreatedFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBarCreatedFunction: Self = this.set("barCreatedFunction", js.undefined)
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = this.set("bins", js.Array(value :_*))
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = this.set("bins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBins: Self = this.set("bins", js.undefined)
    @scala.inline
    def setDataLineCreatedFunction(
      value: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("dataLineCreatedFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDataLineCreatedFunction: Self = this.set("dataLineCreatedFunction", js.undefined)
    @scala.inline
    def setDataLinesVarargs(value: HistogramDataLines*): Self = this.set("dataLines", js.Array(value :_*))
    @scala.inline
    def setDataLines(value: js.Array[HistogramDataLines]): Self = this.set("dataLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLines: Self = this.set("dataLines", js.undefined)
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("labelFormatFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLabelFormatFunction: Self = this.set("labelFormatFunction", js.undefined)
    @scala.inline
    def setLayout(value: vertical | horizontal): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setViewModel(value: HistogramViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

