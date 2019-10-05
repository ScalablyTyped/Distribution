package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryStatisticsResult extends Object {
  /**
    * The average of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var avg: Double
  /**
    * The number of features evaluated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var count: Double
  /**
    * The maximum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var max: Double
  /**
    * The minimum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var min: Double
  /**
    * The standard deviation calculated from values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var stddev: Double
  /**
    * The sum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var sum: Double
  /**
    * The calculated variance from all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var variance: Double
}

object SummaryStatisticsResult {
  @scala.inline
  def apply(
    avg: Double,
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stddev: Double,
    sum: Double,
    variance: Double
  ): SummaryStatisticsResult = {
    val __obj = js.Dynamic.literal(avg = avg, constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max, min = min, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev, sum = sum, variance = variance)
  
    __obj.asInstanceOf[SummaryStatisticsResult]
  }
}

