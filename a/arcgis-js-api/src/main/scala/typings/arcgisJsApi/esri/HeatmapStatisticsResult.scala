package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapStatisticsResult extends StObject {
  
  /**
  		 * The maximum density value of all pixels in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
  		 */
  var max: Double
  
  /**
  		 * The minimum density value of all pixels in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
  		 */
  var min: Double
  
  /**
  		 * The summary statistics for all values returned from the field, if provided.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#HeatmapStatisticsResult)
  		 */
  var summaryStatistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
}
object HeatmapStatisticsResult {
  
  inline def apply(max: Double, min: Double): HeatmapStatisticsResult = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapStatisticsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapStatisticsResult] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSummaryStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "summaryStatistics", value.asInstanceOf[js.Any])
    
    inline def setSummaryStatisticsUndefined: Self = StObject.set(x, "summaryStatistics", js.undefined)
  }
}
