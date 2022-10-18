package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageForecastResponse extends StObject {
  
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.ForecastResultsByTime] = js.undefined
  
  /**
    * How much you're forecasted to use over the forecast period.
    */
  var Total: js.UndefOr[MetricValue] = js.undefined
}
object GetUsageForecastResponse {
  
  inline def apply(): GetUsageForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageForecastResponse]
  }
  
  extension [Self <: GetUsageForecastResponse](x: Self) {
    
    inline def setForecastResultsByTime(value: ForecastResultsByTime): Self = StObject.set(x, "ForecastResultsByTime", value.asInstanceOf[js.Any])
    
    inline def setForecastResultsByTimeUndefined: Self = StObject.set(x, "ForecastResultsByTime", js.undefined)
    
    inline def setForecastResultsByTimeVarargs(value: ForecastResult*): Self = StObject.set(x, "ForecastResultsByTime", js.Array(value*))
    
    inline def setTotal(value: MetricValue): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
