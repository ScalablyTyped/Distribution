package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typings.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typings.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.between
import typings.arcgisJsApi.arcgisJsApiStrings.equal
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramRangeSliderProperties extends WidgetProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a line and an average symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramRangeSliderDataLines]] = js.native
  /**
    * Sets the color of the histogram bars that are excluded based on the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType). For example, when a rangeType of `between` is used, all bars **not** between the slider thumbs will be rendered with the color set here.  To change the style of histogram bars representing included data based on the [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType), use the [includedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor)
    *
    * @default #d7e5f0
    */
  var excludedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Sets the color of the histogram bars that are included in the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType). For example, when a rangeType of `between` is used, all bars between the slider thumbs will be rendered with the color set here.  To change the style of histogram bars representing excluded data based on the [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType), use the [excludedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor)
    *
    * @default #599dd4
    */
  var includedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * The maximum value or upper bound of the slider. If the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) _in the constructor_ is greater than the `maxValue` set in this property, then the `maxValue` will update to match the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value or lower bound of the slider. If the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) _in the constructor_ is greater than the `minValue` set in this property, then the `minValue` will update to match the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Defines how slider thumb values should be rounded. This number indicates the number of decimal places slider thumb values should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) when the data range ([max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max) - [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)) is less than `10`.  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The label of the thumb will display two decimal places, but the precision of the actual thumb value will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new HistogramRangeSliderViewModel({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision)
    *
    * @default 4
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Indicates how the histogram bins should be rendered as the user slides the thumbs. By default, blue bars indicate data bins included in the range. Gray bars indicate data bins excluded from the range. These colors can be customized with the [includedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) and [excludedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) properties.  This property also determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#generateWhereClause) for filtering purposes. The value set here determines the number of [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) allowed on the slider.  See the table below for a description and requirements of all possible values. `value1` refers to the value of the first thumb position. `value2` refers to the value of the final thumb position, if applicable.
    *
    * Possible Value | Number of [Values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) | [Where clause](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#generateWhereClause)
    * ---------------|----------------------------|----------------------
    * equal | 1 | `${field} = ${value1}`
    * not-equal | 1 | `${field} <> ${value1}`
    * less-than | 1 | `${field} < ${value1}`
    * greater-than | 1 | `${field} > ${value1}`
    * at-most | 1 | `${field} <= ${value1}`
    * at-least | 1 | `${field} >= ${value1}`
    * between | 2 | `${field} BETWEEN ${value1} AND ${value2}`
    * not-between | 2 | `${field} NOT BETWEEN ${value1} AND ${value2}`
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType)
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
  ] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, computed [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines) will render on the histogram at the location of the given standard deviation above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  /**
    * Indicates the number of standard deviation lines to render on the histogram from the [average].
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviationCount)
    *
    * @default 1
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
  /**
    * An array of either one or two numbers representing thumb positions on the slider. The number of values that should be indicated here depends on the associated [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The view model for the widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel class to access all properties and methods on the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramRangeSliderViewModelProperties] = js.native
}

object HistogramRangeSliderProperties {
  @scala.inline
  def apply(): HistogramRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderProperties]
  }
  @scala.inline
  implicit class HistogramRangeSliderPropertiesOps[Self <: HistogramRangeSliderProperties] (val x: Self) extends AnyVal {
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
    def setDataLinesVarargs(value: HistogramRangeSliderDataLines*): Self = this.set("dataLines", js.Array(value :_*))
    @scala.inline
    def setDataLines(value: js.Array[HistogramRangeSliderDataLines]): Self = this.set("dataLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLines: Self = this.set("dataLines", js.undefined)
    @scala.inline
    def setExcludedBarColorVarargs(value: Double*): Self = this.set("excludedBarColor", js.Array(value :_*))
    @scala.inline
    def setExcludedBarColor(value: Color_ | js.Array[Double] | String): Self = this.set("excludedBarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedBarColor: Self = this.set("excludedBarColor", js.undefined)
    @scala.inline
    def setIncludedBarColorVarargs(value: Double*): Self = this.set("includedBarColor", js.Array(value :_*))
    @scala.inline
    def setIncludedBarColor(value: Color_ | js.Array[Double] | String): Self = this.set("includedBarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedBarColor: Self = this.set("includedBarColor", js.undefined)
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
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
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
    ): Self = this.set("rangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeType: Self = this.set("rangeType", js.undefined)
    @scala.inline
    def setStandardDeviation(value: Double): Self = this.set("standardDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviation: Self = this.set("standardDeviation", js.undefined)
    @scala.inline
    def setStandardDeviationCount(value: Double): Self = this.set("standardDeviationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviationCount: Self = this.set("standardDeviationCount", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setViewModel(value: HistogramRangeSliderViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

