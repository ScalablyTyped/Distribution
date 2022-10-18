package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadForecast extends StObject {
  
  /**
    * The metric specification for the load forecast.
    */
  var MetricSpecification: PredictiveScalingMetricSpecification
  
  /**
    * The timestamps for the data points, in UTC format.
    */
  var Timestamps: PredictiveScalingForecastTimestamps
  
  /**
    * The values of the data points.
    */
  var Values: PredictiveScalingForecastValues
}
object LoadForecast {
  
  inline def apply(
    MetricSpecification: PredictiveScalingMetricSpecification,
    Timestamps: PredictiveScalingForecastTimestamps,
    Values: PredictiveScalingForecastValues
  ): LoadForecast = {
    val __obj = js.Dynamic.literal(MetricSpecification = MetricSpecification.asInstanceOf[js.Any], Timestamps = Timestamps.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadForecast]
  }
  
  extension [Self <: LoadForecast](x: Self) {
    
    inline def setMetricSpecification(value: PredictiveScalingMetricSpecification): Self = StObject.set(x, "MetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setTimestamps(value: PredictiveScalingForecastTimestamps): Self = StObject.set(x, "Timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "Timestamps", js.Array(value*))
    
    inline def setValues(value: PredictiveScalingForecastValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: MetricScale*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
