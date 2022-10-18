package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPredictiveScalingForecastType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the start and end time is 30 days.  Although this parameter can accept a date and time that is more than two days in the future, the availability of forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two days in advance.
    */
  var EndTime: js.Date
  
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255
  
  /**
    * The inclusive start time of the time range for the forecast data to get. At most, the date and time can be one year before the current date and time.
    */
  var StartTime: js.Date
}
object GetPredictiveScalingForecastType {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    EndTime: js.Date,
    PolicyName: XmlStringMaxLen255,
    StartTime: js.Date
  ): GetPredictiveScalingForecastType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPredictiveScalingForecastType]
  }
  
  extension [Self <: GetPredictiveScalingForecastType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: XmlStringMaxLen255): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
