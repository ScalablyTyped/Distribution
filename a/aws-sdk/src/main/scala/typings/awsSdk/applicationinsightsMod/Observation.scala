package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observation extends StObject {
  
  /**
    *  The detail type of the CloudWatch Event-based observation, for example, EC2 Instance State-change Notification. 
    */
  var CloudWatchEventDetailType: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventDetailType] = js.undefined
  
  /**
    *  The ID of the CloudWatch Event-based observation related to the detected problem. 
    */
  var CloudWatchEventId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventId] = js.undefined
  
  /**
    *  The source of the CloudWatch Event. 
    */
  var CloudWatchEventSource: js.UndefOr[typings.awsSdk.applicationinsightsMod.CloudWatchEventSource] = js.undefined
  
  /**
    *  The CodeDeploy application to which the deployment belongs. 
    */
  var CodeDeployApplication: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployApplication] = js.undefined
  
  /**
    *  The deployment group to which the CodeDeploy deployment belongs. 
    */
  var CodeDeployDeploymentGroup: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployDeploymentGroup] = js.undefined
  
  /**
    *  The deployment ID of the CodeDeploy-based observation related to the detected problem. 
    */
  var CodeDeployDeploymentId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployDeploymentId] = js.undefined
  
  /**
    *  The instance group to which the CodeDeploy instance belongs. 
    */
  var CodeDeployInstanceGroupId: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployInstanceGroupId] = js.undefined
  
  /**
    *  The status of the CodeDeploy deployment, for example SUCCESS or  FAILURE. 
    */
  var CodeDeployState: js.UndefOr[typings.awsSdk.applicationinsightsMod.CodeDeployState] = js.undefined
  
  /**
    *  The state of the instance, such as STOPPING or TERMINATING. 
    */
  var Ec2State: js.UndefOr[typings.awsSdk.applicationinsightsMod.Ec2State] = js.undefined
  
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
    */
  var HealthEventArn: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventArn] = js.undefined
  
  /**
    *  The description of the AWS Health event provided by the service, such as Amazon EC2. 
    */
  var HealthEventDescription: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventDescription] = js.undefined
  
  /**
    *  The category of the AWS Health event, such as issue. 
    */
  var HealthEventTypeCategory: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventTypeCategory] = js.undefined
  
  /**
    *  The type of the AWS Health event, for example, AWS_EC2_POWER_CONNECTIVITY_ISSUE. 
    */
  var HealthEventTypeCode: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthEventTypeCode] = js.undefined
  
  /**
    *  The service to which the AWS Health Event belongs, such as EC2. 
    */
  var HealthService: js.UndefOr[typings.awsSdk.applicationinsightsMod.HealthService] = js.undefined
  
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.undefined
  
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.LineTime] = js.undefined
  
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogFilter] = js.undefined
  
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogGroup] = js.undefined
  
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogText] = js.undefined
  
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricName] = js.undefined
  
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricNamespace] = js.undefined
  
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceARN] = js.undefined
  
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceType] = js.undefined
  
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.undefined
  
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.applicationinsightsMod.Unit] = js.undefined
  
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typings.awsSdk.applicationinsightsMod.Value] = js.undefined
  
  /**
    *  The X-Ray request error percentage for this node. 
    */
  var XRayErrorPercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayErrorPercent] = js.undefined
  
  /**
    *  The X-Ray request fault percentage for this node. 
    */
  var XRayFaultPercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayFaultPercent] = js.undefined
  
  /**
    *  The name of the X-Ray node. 
    */
  var XRayNodeName: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayNodeName] = js.undefined
  
  /**
    *  The type of the X-Ray node. 
    */
  var XRayNodeType: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayNodeType] = js.undefined
  
  /**
    *  The X-Ray node request average latency for this node. 
    */
  var XRayRequestAverageLatency: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayRequestAverageLatency] = js.undefined
  
  /**
    *  The X-Ray request count for this node. 
    */
  var XRayRequestCount: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayRequestCount] = js.undefined
  
  /**
    *  The X-Ray request throttle percentage for this node. 
    */
  var XRayThrottlePercent: js.UndefOr[typings.awsSdk.applicationinsightsMod.XRayThrottlePercent] = js.undefined
}
object Observation {
  
  inline def apply(): Observation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observation]
  }
  
  extension [Self <: Observation](x: Self) {
    
    inline def setCloudWatchEventDetailType(value: CloudWatchEventDetailType): Self = StObject.set(x, "CloudWatchEventDetailType", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEventDetailTypeUndefined: Self = StObject.set(x, "CloudWatchEventDetailType", js.undefined)
    
    inline def setCloudWatchEventId(value: CloudWatchEventId): Self = StObject.set(x, "CloudWatchEventId", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEventIdUndefined: Self = StObject.set(x, "CloudWatchEventId", js.undefined)
    
    inline def setCloudWatchEventSource(value: CloudWatchEventSource): Self = StObject.set(x, "CloudWatchEventSource", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEventSourceUndefined: Self = StObject.set(x, "CloudWatchEventSource", js.undefined)
    
    inline def setCodeDeployApplication(value: CodeDeployApplication): Self = StObject.set(x, "CodeDeployApplication", value.asInstanceOf[js.Any])
    
    inline def setCodeDeployApplicationUndefined: Self = StObject.set(x, "CodeDeployApplication", js.undefined)
    
    inline def setCodeDeployDeploymentGroup(value: CodeDeployDeploymentGroup): Self = StObject.set(x, "CodeDeployDeploymentGroup", value.asInstanceOf[js.Any])
    
    inline def setCodeDeployDeploymentGroupUndefined: Self = StObject.set(x, "CodeDeployDeploymentGroup", js.undefined)
    
    inline def setCodeDeployDeploymentId(value: CodeDeployDeploymentId): Self = StObject.set(x, "CodeDeployDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setCodeDeployDeploymentIdUndefined: Self = StObject.set(x, "CodeDeployDeploymentId", js.undefined)
    
    inline def setCodeDeployInstanceGroupId(value: CodeDeployInstanceGroupId): Self = StObject.set(x, "CodeDeployInstanceGroupId", value.asInstanceOf[js.Any])
    
    inline def setCodeDeployInstanceGroupIdUndefined: Self = StObject.set(x, "CodeDeployInstanceGroupId", js.undefined)
    
    inline def setCodeDeployState(value: CodeDeployState): Self = StObject.set(x, "CodeDeployState", value.asInstanceOf[js.Any])
    
    inline def setCodeDeployStateUndefined: Self = StObject.set(x, "CodeDeployState", js.undefined)
    
    inline def setEc2State(value: Ec2State): Self = StObject.set(x, "Ec2State", value.asInstanceOf[js.Any])
    
    inline def setEc2StateUndefined: Self = StObject.set(x, "Ec2State", js.undefined)
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setHealthEventArn(value: HealthEventArn): Self = StObject.set(x, "HealthEventArn", value.asInstanceOf[js.Any])
    
    inline def setHealthEventArnUndefined: Self = StObject.set(x, "HealthEventArn", js.undefined)
    
    inline def setHealthEventDescription(value: HealthEventDescription): Self = StObject.set(x, "HealthEventDescription", value.asInstanceOf[js.Any])
    
    inline def setHealthEventDescriptionUndefined: Self = StObject.set(x, "HealthEventDescription", js.undefined)
    
    inline def setHealthEventTypeCategory(value: HealthEventTypeCategory): Self = StObject.set(x, "HealthEventTypeCategory", value.asInstanceOf[js.Any])
    
    inline def setHealthEventTypeCategoryUndefined: Self = StObject.set(x, "HealthEventTypeCategory", js.undefined)
    
    inline def setHealthEventTypeCode(value: HealthEventTypeCode): Self = StObject.set(x, "HealthEventTypeCode", value.asInstanceOf[js.Any])
    
    inline def setHealthEventTypeCodeUndefined: Self = StObject.set(x, "HealthEventTypeCode", js.undefined)
    
    inline def setHealthService(value: HealthService): Self = StObject.set(x, "HealthService", value.asInstanceOf[js.Any])
    
    inline def setHealthServiceUndefined: Self = StObject.set(x, "HealthService", js.undefined)
    
    inline def setId(value: ObservationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLineTime(value: LineTime): Self = StObject.set(x, "LineTime", value.asInstanceOf[js.Any])
    
    inline def setLineTimeUndefined: Self = StObject.set(x, "LineTime", js.undefined)
    
    inline def setLogFilter(value: LogFilter): Self = StObject.set(x, "LogFilter", value.asInstanceOf[js.Any])
    
    inline def setLogFilterUndefined: Self = StObject.set(x, "LogFilter", js.undefined)
    
    inline def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    inline def setLogText(value: LogText): Self = StObject.set(x, "LogText", value.asInstanceOf[js.Any])
    
    inline def setLogTextUndefined: Self = StObject.set(x, "LogText", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setMetricNamespace(value: MetricNamespace): Self = StObject.set(x, "MetricNamespace", value.asInstanceOf[js.Any])
    
    inline def setMetricNamespaceUndefined: Self = StObject.set(x, "MetricNamespace", js.undefined)
    
    inline def setSourceARN(value: SourceARN): Self = StObject.set(x, "SourceARN", value.asInstanceOf[js.Any])
    
    inline def setSourceARNUndefined: Self = StObject.set(x, "SourceARN", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    inline def setXRayErrorPercent(value: XRayErrorPercent): Self = StObject.set(x, "XRayErrorPercent", value.asInstanceOf[js.Any])
    
    inline def setXRayErrorPercentUndefined: Self = StObject.set(x, "XRayErrorPercent", js.undefined)
    
    inline def setXRayFaultPercent(value: XRayFaultPercent): Self = StObject.set(x, "XRayFaultPercent", value.asInstanceOf[js.Any])
    
    inline def setXRayFaultPercentUndefined: Self = StObject.set(x, "XRayFaultPercent", js.undefined)
    
    inline def setXRayNodeName(value: XRayNodeName): Self = StObject.set(x, "XRayNodeName", value.asInstanceOf[js.Any])
    
    inline def setXRayNodeNameUndefined: Self = StObject.set(x, "XRayNodeName", js.undefined)
    
    inline def setXRayNodeType(value: XRayNodeType): Self = StObject.set(x, "XRayNodeType", value.asInstanceOf[js.Any])
    
    inline def setXRayNodeTypeUndefined: Self = StObject.set(x, "XRayNodeType", js.undefined)
    
    inline def setXRayRequestAverageLatency(value: XRayRequestAverageLatency): Self = StObject.set(x, "XRayRequestAverageLatency", value.asInstanceOf[js.Any])
    
    inline def setXRayRequestAverageLatencyUndefined: Self = StObject.set(x, "XRayRequestAverageLatency", js.undefined)
    
    inline def setXRayRequestCount(value: XRayRequestCount): Self = StObject.set(x, "XRayRequestCount", value.asInstanceOf[js.Any])
    
    inline def setXRayRequestCountUndefined: Self = StObject.set(x, "XRayRequestCount", js.undefined)
    
    inline def setXRayThrottlePercent(value: XRayThrottlePercent): Self = StObject.set(x, "XRayThrottlePercent", value.asInstanceOf[js.Any])
    
    inline def setXRayThrottlePercentUndefined: Self = StObject.set(x, "XRayThrottlePercent", js.undefined)
  }
}
