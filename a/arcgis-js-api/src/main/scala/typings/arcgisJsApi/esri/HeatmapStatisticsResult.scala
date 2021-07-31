package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapStatisticsResult
  extends StObject
     with Object {
  
  /**
    * The average of all pixel intensity values for the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var avg: Double
  
  /**
    * The number of features evaluated in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var max: Double
  
  /**
    * The minimum pixel intensity value of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var min: Double
  
  /**
    * The standard deviation of the pixel intensity values of all pixels in the given view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
    */
  var stddev: Double
  
  /**
    * The summary statistics for all values returned from the field, if provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
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
    stddev: Double
  ): HeatmapStatisticsResult = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapStatisticsResult]
  }
  
  @scala.inline
  implicit class HeatmapStatisticsResultMutableBuilder[Self <: HeatmapStatisticsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "summaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryStatisticsUndefined: Self = StObject.set(x, "summaryStatistics", js.undefined)
  }
}
