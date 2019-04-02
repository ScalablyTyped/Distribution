package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapStatisticsResult
  extends stdLib.Object {
  /**
    * The average of all pixel intensity values for the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var avg: scala.Double
  /**
    * The number of features evaluated in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var max: scala.Double
  /**
    * The minimum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var min: scala.Double
  /**
    * The standard deviation of the pixel intensity values of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var stddev: scala.Double
  /**
    * The summary statistics for all values returned from the field, if provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var summaryStatistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
}

object HeatmapStatisticsResult {
  @scala.inline
  def apply(
    avg: scala.Double,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stddev: scala.Double,
    count: scala.Int | scala.Double = null,
    summaryStatistics: SummaryStatisticsResult = null
  ): HeatmapStatisticsResult = {
    val __obj = js.Dynamic.literal(avg = avg, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (summaryStatistics != null) __obj.updateDynamic("summaryStatistics")(summaryStatistics)
    __obj.asInstanceOf[HeatmapStatisticsResult]
  }
}

