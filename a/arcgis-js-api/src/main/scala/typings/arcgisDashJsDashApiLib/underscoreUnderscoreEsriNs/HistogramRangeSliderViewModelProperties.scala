package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRangeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes. The value set here determines the number of [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) allowed on the slider.  **Possible Values:** equal | not-equal | less-than | greater-than | at-most | at-least | between | not-between  See the table below for a description and requirements of all possible values. `value1` refers to the value of the first thumb position. `value2` refers to the value of the final thumb position, if applicable.
    *
    * Possible Value | Number of [Values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) | [Where clause](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
    *
    * @default equal
    */
  var rangeType: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates the standard deviation of the dataset above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[scala.Double] = js.undefined
}

object HistogramRangeSliderViewModelProperties {
  @scala.inline
  def apply(
    average: scala.Int | scala.Double = null,
    bins: js.Array[Bin] = null,
    labelFormatFunction: SliderLabelFormatter = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null,
    rangeType: js.Any = null,
    standardDeviation: scala.Int | scala.Double = null,
    values: js.Array[scala.Double] = null
  ): HistogramRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins)
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rangeType != null) __obj.updateDynamic("rangeType")(rangeType)
    if (standardDeviation != null) __obj.updateDynamic("standardDeviation")(standardDeviation.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[HistogramRangeSliderViewModelProperties]
  }
}

