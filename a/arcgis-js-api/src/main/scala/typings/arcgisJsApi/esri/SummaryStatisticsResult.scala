package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryStatisticsResult extends Object {
  /**
    * The average of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var avg: Double = js.native
  /**
    * The number of features evaluated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var count: Double = js.native
  /**
    * The maximum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var max: Double = js.native
  /**
    * The minimum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var min: Double = js.native
  /**
    * The standard deviation calculated from values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var stddev: Double = js.native
  /**
    * The sum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var sum: Double = js.native
  /**
    * The calculated variance from all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var variance: Double = js.native
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
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryStatisticsResult]
  }
  @scala.inline
  implicit class SummaryStatisticsResultOps[Self <: SummaryStatisticsResult] (val x: Self) extends AnyVal {
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
    def setAvg(value: Double): Self = this.set("avg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariance(value: Double): Self = this.set("variance", value.asInstanceOf[js.Any])
  }
  
}

