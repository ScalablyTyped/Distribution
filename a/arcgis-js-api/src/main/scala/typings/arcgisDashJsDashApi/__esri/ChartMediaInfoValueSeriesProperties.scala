package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartMediaInfoValueSeriesProperties extends js.Object {
  /**
    * String value indicating the tooltip for a series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#tooltip)
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * Numerical value indicating the x-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#x)
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Numerical value indicating the y-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#y)
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ChartMediaInfoValueSeriesProperties {
  @scala.inline
  def apply(tooltip: String = null, x: Int | Double = null, y: Int | Double = null): ChartMediaInfoValueSeriesProperties = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMediaInfoValueSeriesProperties]
  }
}

