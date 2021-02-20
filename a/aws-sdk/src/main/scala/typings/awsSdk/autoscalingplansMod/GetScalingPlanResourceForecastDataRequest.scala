package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScalingPlanResourceForecastDataRequest extends StObject {
  
  /**
    * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the start and end time is seven days.  Although this parameter can accept a date and time that is more than two days in the future, the availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
    */
  var EndTime: TimestampType = js.native
  
  /**
    * The type of forecast data to get.    LoadForecast: The load metric forecast.     CapacityForecast: The capacity forecast.     ScheduledActionMinCapacity: The minimum capacity for each scheduled scaling action. This data is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.    ScheduledActionMaxCapacity: The maximum capacity for each scheduled scaling action. The calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.  
    */
  var ForecastDataType: typings.awsSdk.autoscalingplansMod.ForecastDataType = js.native
  
  /**
    * The ID of the resource. This string consists of the resource type and unique identifier.    Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
    */
  var ResourceId: XmlString = js.native
  
  /**
    * The scalable dimension for the resource.
    */
  var ScalableDimension: typings.awsSdk.autoscalingplansMod.ScalableDimension = js.native
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
  
  /**
    * The namespace of the AWS service.
    */
  var ServiceNamespace: typings.awsSdk.autoscalingplansMod.ServiceNamespace = js.native
  
  /**
    * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days before the current date and time. 
    */
  var StartTime: TimestampType = js.native
}
object GetScalingPlanResourceForecastDataRequest {
  
  @scala.inline
  def apply(
    EndTime: TimestampType,
    ForecastDataType: ForecastDataType,
    ResourceId: XmlString,
    ScalableDimension: ScalableDimension,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ServiceNamespace: ServiceNamespace,
    StartTime: TimestampType
  ): GetScalingPlanResourceForecastDataRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], ForecastDataType = ForecastDataType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataRequest]
  }
  
  @scala.inline
  implicit class GetScalingPlanResourceForecastDataRequestMutableBuilder[Self <: GetScalingPlanResourceForecastDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastDataType(value: ForecastDataType): Self = StObject.set(x, "ForecastDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: XmlString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableDimension(value: ScalableDimension): Self = StObject.set(x, "ScalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: ServiceNamespace): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
