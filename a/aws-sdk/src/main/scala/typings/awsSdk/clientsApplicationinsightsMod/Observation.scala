package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observation extends StObject {
  
  /**
    *  The detail type of the CloudWatch Event-based observation, for example, EC2 Instance State-change Notification. 
    */
  var CloudWatchEventDetailType: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CloudWatchEventDetailType] = js.undefined
  
  /**
    *  The ID of the CloudWatch Event-based observation related to the detected problem. 
    */
  var CloudWatchEventId: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CloudWatchEventId] = js.undefined
  
  /**
    *  The source of the CloudWatch Event. 
    */
  var CloudWatchEventSource: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CloudWatchEventSource] = js.undefined
  
  /**
    *  The CodeDeploy application to which the deployment belongs. 
    */
  var CodeDeployApplication: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CodeDeployApplication] = js.undefined
  
  /**
    *  The deployment group to which the CodeDeploy deployment belongs. 
    */
  var CodeDeployDeploymentGroup: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CodeDeployDeploymentGroup] = js.undefined
  
  /**
    *  The deployment ID of the CodeDeploy-based observation related to the detected problem. 
    */
  var CodeDeployDeploymentId: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CodeDeployDeploymentId] = js.undefined
  
  /**
    *  The instance group to which the CodeDeploy instance belongs. 
    */
  var CodeDeployInstanceGroupId: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CodeDeployInstanceGroupId] = js.undefined
  
  /**
    *  The status of the CodeDeploy deployment, for example SUCCESS or  FAILURE. 
    */
  var CodeDeployState: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CodeDeployState] = js.undefined
  
  /**
    *  The cause of an EBS CloudWatch event. 
    */
  var EbsCause: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.EbsCause] = js.undefined
  
  /**
    *  The type of EBS CloudWatch event, such as createVolume, deleteVolume or attachVolume. 
    */
  var EbsEvent: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.EbsEvent] = js.undefined
  
  /**
    *  The request ID of an EBS CloudWatch event. 
    */
  var EbsRequestId: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.EbsRequestId] = js.undefined
  
  /**
    *  The result of an EBS CloudWatch event, such as failed or succeeded. 
    */
  var EbsResult: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.EbsResult] = js.undefined
  
  /**
    *  The state of the instance, such as STOPPING or TERMINATING. 
    */
  var Ec2State: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.Ec2State] = js.undefined
  
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the AWS Health Event-based observation.
    */
  var HealthEventArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.HealthEventArn] = js.undefined
  
  /**
    *  The description of the AWS Health event provided by the service, such as Amazon EC2. 
    */
  var HealthEventDescription: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.HealthEventDescription] = js.undefined
  
  /**
    *  The category of the AWS Health event, such as issue. 
    */
  var HealthEventTypeCategory: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.HealthEventTypeCategory] = js.undefined
  
  /**
    *  The type of the AWS Health event, for example, AWS_EC2_POWER_CONNECTIVITY_ISSUE. 
    */
  var HealthEventTypeCode: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.HealthEventTypeCode] = js.undefined
  
  /**
    *  The service to which the AWS Health Event belongs, such as EC2. 
    */
  var HealthService: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.HealthService] = js.undefined
  
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.undefined
  
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.LogFilter] = js.undefined
  
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.LogGroup] = js.undefined
  
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.LogText] = js.undefined
  
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.MetricName] = js.undefined
  
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.MetricNamespace] = js.undefined
  
  /**
    *  The category of an RDS event. 
    */
  var RdsEventCategories: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.RdsEventCategories] = js.undefined
  
  /**
    *  The message of an RDS event. 
    */
  var RdsEventMessage: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.RdsEventMessage] = js.undefined
  
  /**
    *  The name of the S3 CloudWatch Event-based observation. 
    */
  var S3EventName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.S3EventName] = js.undefined
  
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.SourceARN] = js.undefined
  
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.SourceType] = js.undefined
  
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the step function-based observation. 
    */
  var StatesArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.StatesArn] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the step function execution-based observation. 
    */
  var StatesExecutionArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.StatesExecutionArn] = js.undefined
  
  /**
    *  The input to the step function-based observation. 
    */
  var StatesInput: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.StatesInput] = js.undefined
  
  /**
    *  The status of the step function-related observation. 
    */
  var StatesStatus: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.StatesStatus] = js.undefined
  
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.Unit] = js.undefined
  
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.Value] = js.undefined
  
  /**
    *  The X-Ray request error percentage for this node. 
    */
  var XRayErrorPercent: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayErrorPercent] = js.undefined
  
  /**
    *  The X-Ray request fault percentage for this node. 
    */
  var XRayFaultPercent: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayFaultPercent] = js.undefined
  
  /**
    *  The name of the X-Ray node. 
    */
  var XRayNodeName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayNodeName] = js.undefined
  
  /**
    *  The type of the X-Ray node. 
    */
  var XRayNodeType: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayNodeType] = js.undefined
  
  /**
    *  The X-Ray node request average latency for this node. 
    */
  var XRayRequestAverageLatency: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayRequestAverageLatency] = js.undefined
  
  /**
    *  The X-Ray request count for this node. 
    */
  var XRayRequestCount: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayRequestCount] = js.undefined
  
  /**
    *  The X-Ray request throttle percentage for this node. 
    */
  var XRayThrottlePercent: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.XRayThrottlePercent] = js.undefined
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
    
    inline def setEbsCause(value: EbsCause): Self = StObject.set(x, "EbsCause", value.asInstanceOf[js.Any])
    
    inline def setEbsCauseUndefined: Self = StObject.set(x, "EbsCause", js.undefined)
    
    inline def setEbsEvent(value: EbsEvent): Self = StObject.set(x, "EbsEvent", value.asInstanceOf[js.Any])
    
    inline def setEbsEventUndefined: Self = StObject.set(x, "EbsEvent", js.undefined)
    
    inline def setEbsRequestId(value: EbsRequestId): Self = StObject.set(x, "EbsRequestId", value.asInstanceOf[js.Any])
    
    inline def setEbsRequestIdUndefined: Self = StObject.set(x, "EbsRequestId", js.undefined)
    
    inline def setEbsResult(value: EbsResult): Self = StObject.set(x, "EbsResult", value.asInstanceOf[js.Any])
    
    inline def setEbsResultUndefined: Self = StObject.set(x, "EbsResult", js.undefined)
    
    inline def setEc2State(value: Ec2State): Self = StObject.set(x, "Ec2State", value.asInstanceOf[js.Any])
    
    inline def setEc2StateUndefined: Self = StObject.set(x, "Ec2State", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
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
    
    inline def setLineTime(value: js.Date): Self = StObject.set(x, "LineTime", value.asInstanceOf[js.Any])
    
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
    
    inline def setRdsEventCategories(value: RdsEventCategories): Self = StObject.set(x, "RdsEventCategories", value.asInstanceOf[js.Any])
    
    inline def setRdsEventCategoriesUndefined: Self = StObject.set(x, "RdsEventCategories", js.undefined)
    
    inline def setRdsEventMessage(value: RdsEventMessage): Self = StObject.set(x, "RdsEventMessage", value.asInstanceOf[js.Any])
    
    inline def setRdsEventMessageUndefined: Self = StObject.set(x, "RdsEventMessage", js.undefined)
    
    inline def setS3EventName(value: S3EventName): Self = StObject.set(x, "S3EventName", value.asInstanceOf[js.Any])
    
    inline def setS3EventNameUndefined: Self = StObject.set(x, "S3EventName", js.undefined)
    
    inline def setSourceARN(value: SourceARN): Self = StObject.set(x, "SourceARN", value.asInstanceOf[js.Any])
    
    inline def setSourceARNUndefined: Self = StObject.set(x, "SourceARN", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatesArn(value: StatesArn): Self = StObject.set(x, "StatesArn", value.asInstanceOf[js.Any])
    
    inline def setStatesArnUndefined: Self = StObject.set(x, "StatesArn", js.undefined)
    
    inline def setStatesExecutionArn(value: StatesExecutionArn): Self = StObject.set(x, "StatesExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setStatesExecutionArnUndefined: Self = StObject.set(x, "StatesExecutionArn", js.undefined)
    
    inline def setStatesInput(value: StatesInput): Self = StObject.set(x, "StatesInput", value.asInstanceOf[js.Any])
    
    inline def setStatesInputUndefined: Self = StObject.set(x, "StatesInput", js.undefined)
    
    inline def setStatesStatus(value: StatesStatus): Self = StObject.set(x, "StatesStatus", value.asInstanceOf[js.Any])
    
    inline def setStatesStatusUndefined: Self = StObject.set(x, "StatesStatus", js.undefined)
    
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
