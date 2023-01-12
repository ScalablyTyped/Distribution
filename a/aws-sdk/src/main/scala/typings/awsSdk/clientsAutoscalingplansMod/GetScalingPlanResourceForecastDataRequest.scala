package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScalingPlanResourceForecastDataRequest extends StObject {
  
  /**
    * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the start and end time is seven days.  Although this parameter can accept a date and time that is more than two days in the future, the availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
    */
  var EndTime: js.Date
  
  /**
    * The type of forecast data to get.    LoadForecast: The load metric forecast.     CapacityForecast: The capacity forecast.     ScheduledActionMinCapacity: The minimum capacity for each scheduled scaling action. This data is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.    ScheduledActionMaxCapacity: The maximum capacity for each scheduled scaling action. The calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.  
    */
  var ForecastDataType: typings.awsSdk.clientsAutoscalingplansMod.ForecastDataType
  
  /**
    * The ID of the resource. This string consists of a prefix (autoScalingGroup) followed by the name of a specified Auto Scaling group (my-asg). Example: autoScalingGroup/my-asg. 
    */
  var ResourceId: XmlString
  
  /**
    * The scalable dimension for the resource. The only valid value is autoscaling:autoScalingGroup:DesiredCapacity. 
    */
  var ScalableDimension: typings.awsSdk.clientsAutoscalingplansMod.ScalableDimension
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanName
  
  /**
    * The version number of the scaling plan. Currently, the only valid value is 1.
    */
  var ScalingPlanVersion: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanVersion
  
  /**
    * The namespace of the AWS service. The only valid value is autoscaling. 
    */
  var ServiceNamespace: typings.awsSdk.clientsAutoscalingplansMod.ServiceNamespace
  
  /**
    * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days before the current date and time. 
    */
  var StartTime: js.Date
}
object GetScalingPlanResourceForecastDataRequest {
  
  inline def apply(
    EndTime: js.Date,
    ForecastDataType: ForecastDataType,
    ResourceId: XmlString,
    ScalableDimension: ScalableDimension,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ServiceNamespace: ServiceNamespace,
    StartTime: js.Date
  ): GetScalingPlanResourceForecastDataRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], ForecastDataType = ForecastDataType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScalingPlanResourceForecastDataRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setForecastDataType(value: ForecastDataType): Self = StObject.set(x, "ForecastDataType", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: XmlString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setScalableDimension(value: ScalableDimension): Self = StObject.set(x, "ScalableDimension", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespace(value: ServiceNamespace): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
