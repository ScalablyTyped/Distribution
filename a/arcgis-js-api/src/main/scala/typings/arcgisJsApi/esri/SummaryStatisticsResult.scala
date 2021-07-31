package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryStatisticsResult
  extends StObject
     with Object {
  
  /**
    * The average of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var avg: Double
  
  /**
    * The number of features evaluated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var count: Double
  
  /**
    * The maximum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var max: Double
  
  /**
    * The minimum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var min: Double
  
  /**
    * The standard deviation calculated from values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var stddev: Double
  
  /**
    * The sum of all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
    */
  var sum: Double
  
  /**
    * The calculated variance from all values returned from the field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
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
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryStatisticsResult]
  }
  
  @scala.inline
  implicit class SummaryStatisticsResultMutableBuilder[Self <: SummaryStatisticsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
