package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesProperties extends js.Object {
  /**
    * String value indicating the tooltip for a series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#tooltipField)
    */
  var tooltipField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Numerical value indicating the x-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#x)
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Numerical value indicating the y-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#y)
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object SeriesProperties {
  @scala.inline
  def apply(
    tooltipField: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): SeriesProperties = {
    val __obj = js.Dynamic.literal()
    if (tooltipField != null) __obj.updateDynamic("tooltipField")(tooltipField)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesProperties]
  }
}

