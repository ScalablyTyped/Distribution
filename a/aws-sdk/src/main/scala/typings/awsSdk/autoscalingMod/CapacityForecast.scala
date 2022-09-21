package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityForecast extends StObject {
  
  /**
    * The timestamps for the data points, in UTC format.
    */
  var Timestamps: PredictiveScalingForecastTimestamps
  
  /**
    * The values of the data points.
    */
  var Values: PredictiveScalingForecastValues
}
object CapacityForecast {
  
  inline def apply(Timestamps: PredictiveScalingForecastTimestamps, Values: PredictiveScalingForecastValues): CapacityForecast = {
    val __obj = js.Dynamic.literal(Timestamps = Timestamps.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityForecast]
  }
  
  extension [Self <: CapacityForecast](x: Self) {
    
    inline def setTimestamps(value: PredictiveScalingForecastTimestamps): Self = StObject.set(x, "Timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "Timestamps", js.Array(value*))
    
    inline def setValues(value: PredictiveScalingForecastValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: MetricScale*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
