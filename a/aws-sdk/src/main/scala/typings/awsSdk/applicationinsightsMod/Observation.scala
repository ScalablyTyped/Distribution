package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observation extends js.Object {
  
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
  implicit class ObservationOps[Self <: Observation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchEventDetailType(value: CloudWatchEventDetailType): Self = this.set("CloudWatchEventDetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchEventDetailType: Self = this.set("CloudWatchEventDetailType", js.undefined)
    
    @scala.inline
    def setCloudWatchEventId(value: CloudWatchEventId): Self = this.set("CloudWatchEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchEventId: Self = this.set("CloudWatchEventId", js.undefined)
    
    @scala.inline
    def setCloudWatchEventSource(value: CloudWatchEventSource): Self = this.set("CloudWatchEventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchEventSource: Self = this.set("CloudWatchEventSource", js.undefined)
    
    @scala.inline
    def setCodeDeployApplication(value: CodeDeployApplication): Self = this.set("CodeDeployApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeDeployApplication: Self = this.set("CodeDeployApplication", js.undefined)
    
    @scala.inline
    def setCodeDeployDeploymentGroup(value: CodeDeployDeploymentGroup): Self = this.set("CodeDeployDeploymentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeDeployDeploymentGroup: Self = this.set("CodeDeployDeploymentGroup", js.undefined)
    
    @scala.inline
    def setCodeDeployDeploymentId(value: CodeDeployDeploymentId): Self = this.set("CodeDeployDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeDeployDeploymentId: Self = this.set("CodeDeployDeploymentId", js.undefined)
    
    @scala.inline
    def setCodeDeployInstanceGroupId(value: CodeDeployInstanceGroupId): Self = this.set("CodeDeployInstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeDeployInstanceGroupId: Self = this.set("CodeDeployInstanceGroupId", js.undefined)
    
    @scala.inline
    def setCodeDeployState(value: CodeDeployState): Self = this.set("CodeDeployState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeDeployState: Self = this.set("CodeDeployState", js.undefined)
    
    @scala.inline
    def setEc2State(value: Ec2State): Self = this.set("Ec2State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2State: Self = this.set("Ec2State", js.undefined)
    
    @scala.inline
    def setEndTime(value: EndTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setHealthEventArn(value: HealthEventArn): Self = this.set("HealthEventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthEventArn: Self = this.set("HealthEventArn", js.undefined)
    
    @scala.inline
    def setHealthEventDescription(value: HealthEventDescription): Self = this.set("HealthEventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthEventDescription: Self = this.set("HealthEventDescription", js.undefined)
    
    @scala.inline
    def setHealthEventTypeCategory(value: HealthEventTypeCategory): Self = this.set("HealthEventTypeCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthEventTypeCategory: Self = this.set("HealthEventTypeCategory", js.undefined)
    
    @scala.inline
    def setHealthEventTypeCode(value: HealthEventTypeCode): Self = this.set("HealthEventTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthEventTypeCode: Self = this.set("HealthEventTypeCode", js.undefined)
    
    @scala.inline
    def setHealthService(value: HealthService): Self = this.set("HealthService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthService: Self = this.set("HealthService", js.undefined)
    
    @scala.inline
    def setId(value: ObservationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLineTime(value: LineTime): Self = this.set("LineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineTime: Self = this.set("LineTime", js.undefined)
    
    @scala.inline
    def setLogFilter(value: LogFilter): Self = this.set("LogFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFilter: Self = this.set("LogFilter", js.undefined)
    
    @scala.inline
    def setLogGroup(value: LogGroup): Self = this.set("LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroup: Self = this.set("LogGroup", js.undefined)
    
    @scala.inline
    def setLogText(value: LogText): Self = this.set("LogText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogText: Self = this.set("LogText", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    
    @scala.inline
    def setMetricNamespace(value: MetricNamespace): Self = this.set("MetricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricNamespace: Self = this.set("MetricNamespace", js.undefined)
    
    @scala.inline
    def setSourceARN(value: SourceARN): Self = this.set("SourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceARN: Self = this.set("SourceARN", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
    
    @scala.inline
    def setXRayErrorPercent(value: XRayErrorPercent): Self = this.set("XRayErrorPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayErrorPercent: Self = this.set("XRayErrorPercent", js.undefined)
    
    @scala.inline
    def setXRayFaultPercent(value: XRayFaultPercent): Self = this.set("XRayFaultPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayFaultPercent: Self = this.set("XRayFaultPercent", js.undefined)
    
    @scala.inline
    def setXRayNodeName(value: XRayNodeName): Self = this.set("XRayNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayNodeName: Self = this.set("XRayNodeName", js.undefined)
    
    @scala.inline
    def setXRayNodeType(value: XRayNodeType): Self = this.set("XRayNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayNodeType: Self = this.set("XRayNodeType", js.undefined)
    
    @scala.inline
    def setXRayRequestAverageLatency(value: XRayRequestAverageLatency): Self = this.set("XRayRequestAverageLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayRequestAverageLatency: Self = this.set("XRayRequestAverageLatency", js.undefined)
    
    @scala.inline
    def setXRayRequestCount(value: XRayRequestCount): Self = this.set("XRayRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayRequestCount: Self = this.set("XRayRequestCount", js.undefined)
    
    @scala.inline
    def setXRayThrottlePercent(value: XRayThrottlePercent): Self = this.set("XRayThrottlePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRayThrottlePercent: Self = this.set("XRayThrottlePercent", js.undefined)
  }
}
