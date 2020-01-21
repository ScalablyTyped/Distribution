package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapStatisticsResult extends Object {
  /**
    * The average of all pixel intensity values for the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var avg: Double
  /**
    * The number of features evaluated in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * The maximum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var max: Double
  /**
    * The minimum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var min: Double
  /**
    * The standard deviation of the pixel intensity values of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var stddev: Double
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
    avg: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stddev: Double,
    count: Int | Double = null,
    summaryStatistics: SummaryStatisticsResult = null
  ): HeatmapStatisticsResult = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (summaryStatistics != null) __obj.updateDynamic("summaryStatistics")(summaryStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapStatisticsResult]
  }
}

