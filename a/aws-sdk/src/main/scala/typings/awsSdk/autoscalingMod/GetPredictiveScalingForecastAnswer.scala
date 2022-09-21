package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPredictiveScalingForecastAnswer extends StObject {
  
  /**
    * The capacity forecast.
    */
  var CapacityForecast: typings.awsSdk.autoscalingMod.CapacityForecast
  
  /**
    * The load forecast.
    */
  var LoadForecast: LoadForecasts
  
  /**
    * The time the forecast was made.
    */
  var UpdateTime: js.Date
}
object GetPredictiveScalingForecastAnswer {
  
  inline def apply(CapacityForecast: CapacityForecast, LoadForecast: LoadForecasts, UpdateTime: js.Date): GetPredictiveScalingForecastAnswer = {
    val __obj = js.Dynamic.literal(CapacityForecast = CapacityForecast.asInstanceOf[js.Any], LoadForecast = LoadForecast.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPredictiveScalingForecastAnswer]
  }
  
  extension [Self <: GetPredictiveScalingForecastAnswer](x: Self) {
    
    inline def setCapacityForecast(value: CapacityForecast): Self = StObject.set(x, "CapacityForecast", value.asInstanceOf[js.Any])
    
    inline def setLoadForecast(value: LoadForecasts): Self = StObject.set(x, "LoadForecast", value.asInstanceOf[js.Any])
    
    inline def setLoadForecastVarargs(value: LoadForecast*): Self = StObject.set(x, "LoadForecast", js.Array(value*))
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
