package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryStatisticsResult extends StObject {
  
  /**
  		 * The average of all values returned from the field or expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
  		 */
  var avg: Double
  
  /**
  		 * The total number of features with a non-null value for the given field.
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
  		 * The median of all values returned from the field or expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
  		 */
  var median: Double
  
  /**
  		 * The minimum of all values returned from the field or expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
  		 */
  var min: Double
  
  /**
  		 * The number of null values stored in the given field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#SummaryStatisticsResult)
  		 */
  var nullcount: js.UndefOr[Double] = js.undefined
  
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
  
  inline def apply(
    avg: Double,
    count: Double,
    max: Double,
    median: Double,
    min: Double,
    stddev: Double,
    sum: Double,
    variance: Double
  ): SummaryStatisticsResult = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryStatisticsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummaryStatisticsResult] (val x: Self) extends AnyVal {
    
    inline def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setNullcount(value: Double): Self = StObject.set(x, "nullcount", value.asInstanceOf[js.Any])
    
    inline def setNullcountUndefined: Self = StObject.set(x, "nullcount", js.undefined)
    
    inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
