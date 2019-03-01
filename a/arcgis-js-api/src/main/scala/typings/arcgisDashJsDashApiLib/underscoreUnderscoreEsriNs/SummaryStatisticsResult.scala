package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryStatisticsResult
  extends stdLib.Object {
  /**
    * The average of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var avg: scala.Double
  /**
    * The number of features evaluated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var count: scala.Double
  /**
    * The maximum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var max: scala.Double
  /**
    * The minimum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var min: scala.Double
  /**
    * The standard deviation calculated from values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var stddev: scala.Double
  /**
    * The sum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var sum: scala.Double
  /**
    * The calculated variance from all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var variance: scala.Double
}

object SummaryStatisticsResult {
  @scala.inline
  def apply(
    avg: scala.Double,
    constructor: js.Function,
    count: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stddev: scala.Double,
    sum: scala.Double,
    variance: scala.Double
  ): SummaryStatisticsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avg")(avg)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("stddev")(stddev)
    __obj.updateDynamic("sum")(sum)
    __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[SummaryStatisticsResult]
  }
}

