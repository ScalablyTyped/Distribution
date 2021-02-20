package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observation extends StObject {
  
  /**
    *  The detail type of the CloudWatch Event-based observation, for example, EC2 Instance State-change Notification. 
    */
  var CloudWatchEventDetailType: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventDetailType] = js.native
  
  /**
    *  The ID of the CloudWatch Event-based observation related to the detected problem. 
    */
  var CloudWatchEventId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventId] = js.native
  
  /**
    *  The source of the CloudWatch Event. 
    */
  var CloudWatchEventSource: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventSource] = js.native
  
  /**
    *  The CodeDeploy application to which the deployment belongs. 
    */
  var CodeDeployApplication: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployApplication] = js.native
  
  /**
    *  The deployment group to which the CodeDeploy deployment belongs. 
    */
  var CodeDeployDeploymentGroup: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployDeploymentGroup] = js.native
  
  /**
    *  The deployment ID of the CodeDeploy-based observation related to the detected problem. 
    */
  var CodeDeployDeploymentId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployDeploymentId] = js.native
  
  /**
    *  The instance group to which the CodeDeploy instance belongs. 
    */
  var CodeDeployInstanceGroupId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployInstanceGroupId] = js.native
  
  /**
    *  The status of the CodeDeploy deployment, for example SUCCESS or  FAILURE. 
    */
  var CodeDeployState: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployState] = js.native
  
  /**
    *  The state of the instance, such as STOPPING or TERMINATING. 
    */
  var Ec2State: js.UndefOr[typings.awsSdk.applicationinsightsMod.Ec2State] = js.native
  
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
    */
  var HealthEventArn: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventArn] = js.native
  
  /**
    *  The description of the AWS Health event provided by the service, such as Amazon EC2. 
    */
  var HealthEventDescription: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventDescription] = js.native
  
  /**
    *  The category of the AWS Health event, such as issue. 
    */
  var HealthEventTypeCategory: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventTypeCategory] = js.native
  
  /**
    *  The type of the AWS Health event, for example, AWS_EC2_POWER_CONNECTIVITY_ISSUE. 
    */
  var HealthEventTypeCode: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventTypeCode] = js.native
  
  /**
    *  The service to which the AWS Health Event belongs, such as EC2. 
    */
  var HealthService: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthService] = js.native
  
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.native
  
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.LineTime] = js.native
  
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogFilter] = js.native
  
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogGroup] = js.native
  
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogText] = js.native
  
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricName] = js.native
  
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricNamespace] = js.native
  
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceARN] = js.native
  
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceType] = js.native
  
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.native
  
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.applicationinsightsMod.Unit] = js.native
  
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typings.awsSdk.applicationinsightsMod.Value] = js.native
  
  /**
    *  The X-Ray request error percentage for this node. 
    */
  var XRayErrorPercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayErrorPercent] = js.native
  
  /**
    *  The X-Ray request fault percentage for this node. 
    */
  var XRayFaultPercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayFaultPercent] = js.native
  
  /**
    *  The name of the X-Ray node. 
    */
  var XRayNodeName: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayNodeName] = js.native
  
  /**
    *  The type of the X-Ray node. 
    */
  var XRayNodeType: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayNodeType] = js.native
  
  /**
    *  The X-Ray node request average latency for this node. 
    */
  var XRayRequestAverageLatency: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayRequestAverageLatency] = js.native
  
  /**
    *  The X-Ray request count for this node. 
    */
  var XRayRequestCount: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayRequestCount] = js.native
  
  /**
    *  The X-Ray request throttle percentage for this node. 
    */
  var XRayThrottlePercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayThrottlePercent] = js.native
}
object Observation {
  
  @scala.inline
  def apply(): Observation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observation]
  }
  
  @scala.inline
  implicit class ObservationMutableBuilder[Self <: Observation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchEventDetailType(value: CloudWatchEventDetailType): Self = StObject.set(x, "CloudWatchEventDetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchEventDetailTypeUndefined: Self = StObject.set(x, "CloudWatchEventDetailType", js.undefined)
    
    @scala.inline
    def setCloudWatchEventId(value: CloudWatchEventId): Self = StObject.set(x, "CloudWatchEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchEventIdUndefined: Self = StObject.set(x, "CloudWatchEventId", js.undefined)
    
    @scala.inline
    def setCloudWatchEventSource(value: CloudWatchEventSource): Self = StObject.set(x, "CloudWatchEventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchEventSourceUndefined: Self = StObject.set(x, "CloudWatchEventSource", js.undefined)
    
    @scala.inline
    def setCodeDeployApplication(value: CodeDeployApplication): Self = StObject.set(x, "CodeDeployApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeployApplicationUndefined: Self = StObject.set(x, "CodeDeployApplication", js.undefined)
    
    @scala.inline
    def setCodeDeployDeploymentGroup(value: CodeDeployDeploymentGroup): Self = StObject.set(x, "CodeDeployDeploymentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeployDeploymentGroupUndefined: Self = StObject.set(x, "CodeDeployDeploymentGroup", js.undefined)
    
    @scala.inline
    def setCodeDeployDeploymentId(value: CodeDeployDeploymentId): Self = StObject.set(x, "CodeDeployDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeployDeploymentIdUndefined: Self = StObject.set(x, "CodeDeployDeploymentId", js.undefined)
    
    @scala.inline
    def setCodeDeployInstanceGroupId(value: CodeDeployInstanceGroupId): Self = StObject.set(x, "CodeDeployInstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeployInstanceGroupIdUndefined: Self = StObject.set(x, "CodeDeployInstanceGroupId", js.undefined)
    
    @scala.inline
    def setCodeDeployState(value: CodeDeployState): Self = StObject.set(x, "CodeDeployState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeployStateUndefined: Self = StObject.set(x, "CodeDeployState", js.undefined)
    
    @scala.inline
    def setEc2State(value: Ec2State): Self = StObject.set(x, "Ec2State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2StateUndefined: Self = StObject.set(x, "Ec2State", js.undefined)
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setHealthEventArn(value: HealthEventArn): Self = StObject.set(x, "HealthEventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthEventArnUndefined: Self = StObject.set(x, "HealthEventArn", js.undefined)
    
    @scala.inline
    def setHealthEventDescription(value: HealthEventDescription): Self = StObject.set(x, "HealthEventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthEventDescriptionUndefined: Self = StObject.set(x, "HealthEventDescription", js.undefined)
    
    @scala.inline
    def setHealthEventTypeCategory(value: HealthEventTypeCategory): Self = StObject.set(x, "HealthEventTypeCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthEventTypeCategoryUndefined: Self = StObject.set(x, "HealthEventTypeCategory", js.undefined)
    
    @scala.inline
    def setHealthEventTypeCode(value: HealthEventTypeCode): Self = StObject.set(x, "HealthEventTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthEventTypeCodeUndefined: Self = StObject.set(x, "HealthEventTypeCode", js.undefined)
    
    @scala.inline
    def setHealthService(value: HealthService): Self = StObject.set(x, "HealthService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthServiceUndefined: Self = StObject.set(x, "HealthService", js.undefined)
    
    @scala.inline
    def setId(value: ObservationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLineTime(value: LineTime): Self = StObject.set(x, "LineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTimeUndefined: Self = StObject.set(x, "LineTime", js.undefined)
    
    @scala.inline
    def setLogFilter(value: LogFilter): Self = StObject.set(x, "LogFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFilterUndefined: Self = StObject.set(x, "LogFilter", js.undefined)
    
    @scala.inline
    def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    @scala.inline
    def setLogText(value: LogText): Self = StObject.set(x, "LogText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTextUndefined: Self = StObject.set(x, "LogText", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setMetricNamespace(value: MetricNamespace): Self = StObject.set(x, "MetricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespaceUndefined: Self = StObject.set(x, "MetricNamespace", js.undefined)
    
    @scala.inline
    def setSourceARN(value: SourceARN): Self = StObject.set(x, "SourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceARNUndefined: Self = StObject.set(x, "SourceARN", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    @scala.inline
    def setXRayErrorPercent(value: XRayErrorPercent): Self = StObject.set(x, "XRayErrorPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayErrorPercentUndefined: Self = StObject.set(x, "XRayErrorPercent", js.undefined)
    
    @scala.inline
    def setXRayFaultPercent(value: XRayFaultPercent): Self = StObject.set(x, "XRayFaultPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayFaultPercentUndefined: Self = StObject.set(x, "XRayFaultPercent", js.undefined)
    
    @scala.inline
    def setXRayNodeName(value: XRayNodeName): Self = StObject.set(x, "XRayNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayNodeNameUndefined: Self = StObject.set(x, "XRayNodeName", js.undefined)
    
    @scala.inline
    def setXRayNodeType(value: XRayNodeType): Self = StObject.set(x, "XRayNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayNodeTypeUndefined: Self = StObject.set(x, "XRayNodeType", js.undefined)
    
    @scala.inline
    def setXRayRequestAverageLatency(value: XRayRequestAverageLatency): Self = StObject.set(x, "XRayRequestAverageLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayRequestAverageLatencyUndefined: Self = StObject.set(x, "XRayRequestAverageLatency", js.undefined)
    
    @scala.inline
    def setXRayRequestCount(value: XRayRequestCount): Self = StObject.set(x, "XRayRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayRequestCountUndefined: Self = StObject.set(x, "XRayRequestCount", js.undefined)
    
    @scala.inline
    def setXRayThrottlePercent(value: XRayThrottlePercent): Self = StObject.set(x, "XRayThrottlePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRayThrottlePercentUndefined: Self = StObject.set(x, "XRayThrottlePercent", js.undefined)
  }
}
