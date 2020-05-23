package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CloudWatchEventDetailType: CloudWatchEventDetailType = null,
    CloudWatchEventId: CloudWatchEventId = null,
    CloudWatchEventSource: CloudWatchEventSource = null,
    CodeDeployApplication: CodeDeployApplication = null,
    CodeDeployDeploymentGroup: CodeDeployDeploymentGroup = null,
    CodeDeployDeploymentId: CodeDeployDeploymentId = null,
    CodeDeployInstanceGroupId: CodeDeployInstanceGroupId = null,
    CodeDeployState: CodeDeployState = null,
    Ec2State: Ec2State = null,
    EndTime: EndTime = null,
    HealthEventArn: HealthEventArn = null,
    HealthEventDescription: HealthEventDescription = null,
    HealthEventTypeCategory: HealthEventTypeCategory = null,
    HealthEventTypeCode: HealthEventTypeCode = null,
    HealthService: HealthService = null,
    Id: ObservationId = null,
    LineTime: LineTime = null,
    LogFilter: LogFilter = null,
    LogGroup: LogGroup = null,
    LogText: LogText = null,
    MetricName: MetricName = null,
    MetricNamespace: MetricNamespace = null,
    SourceARN: SourceARN = null,
    SourceType: SourceType = null,
    StartTime: StartTime = null,
    Unit: Unit = null,
    Value: js.UndefOr[Value] = js.undefined,
    XRayErrorPercent: js.UndefOr[XRayErrorPercent] = js.undefined,
    XRayFaultPercent: js.UndefOr[XRayFaultPercent] = js.undefined,
    XRayNodeName: XRayNodeName = null,
    XRayNodeType: XRayNodeType = null,
    XRayRequestAverageLatency: js.UndefOr[XRayRequestAverageLatency] = js.undefined,
    XRayRequestCount: js.UndefOr[XRayRequestCount] = js.undefined,
    XRayThrottlePercent: js.UndefOr[XRayThrottlePercent] = js.undefined
  ): Observation = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchEventDetailType != null) __obj.updateDynamic("CloudWatchEventDetailType")(CloudWatchEventDetailType.asInstanceOf[js.Any])
    if (CloudWatchEventId != null) __obj.updateDynamic("CloudWatchEventId")(CloudWatchEventId.asInstanceOf[js.Any])
    if (CloudWatchEventSource != null) __obj.updateDynamic("CloudWatchEventSource")(CloudWatchEventSource.asInstanceOf[js.Any])
    if (CodeDeployApplication != null) __obj.updateDynamic("CodeDeployApplication")(CodeDeployApplication.asInstanceOf[js.Any])
    if (CodeDeployDeploymentGroup != null) __obj.updateDynamic("CodeDeployDeploymentGroup")(CodeDeployDeploymentGroup.asInstanceOf[js.Any])
    if (CodeDeployDeploymentId != null) __obj.updateDynamic("CodeDeployDeploymentId")(CodeDeployDeploymentId.asInstanceOf[js.Any])
    if (CodeDeployInstanceGroupId != null) __obj.updateDynamic("CodeDeployInstanceGroupId")(CodeDeployInstanceGroupId.asInstanceOf[js.Any])
    if (CodeDeployState != null) __obj.updateDynamic("CodeDeployState")(CodeDeployState.asInstanceOf[js.Any])
    if (Ec2State != null) __obj.updateDynamic("Ec2State")(Ec2State.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (HealthEventArn != null) __obj.updateDynamic("HealthEventArn")(HealthEventArn.asInstanceOf[js.Any])
    if (HealthEventDescription != null) __obj.updateDynamic("HealthEventDescription")(HealthEventDescription.asInstanceOf[js.Any])
    if (HealthEventTypeCategory != null) __obj.updateDynamic("HealthEventTypeCategory")(HealthEventTypeCategory.asInstanceOf[js.Any])
    if (HealthEventTypeCode != null) __obj.updateDynamic("HealthEventTypeCode")(HealthEventTypeCode.asInstanceOf[js.Any])
    if (HealthService != null) __obj.updateDynamic("HealthService")(HealthService.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LineTime != null) __obj.updateDynamic("LineTime")(LineTime.asInstanceOf[js.Any])
    if (LogFilter != null) __obj.updateDynamic("LogFilter")(LogFilter.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup.asInstanceOf[js.Any])
    if (LogText != null) __obj.updateDynamic("LogText")(LogText.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (MetricNamespace != null) __obj.updateDynamic("MetricNamespace")(MetricNamespace.asInstanceOf[js.Any])
    if (SourceARN != null) __obj.updateDynamic("SourceARN")(SourceARN.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(XRayErrorPercent)) __obj.updateDynamic("XRayErrorPercent")(XRayErrorPercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(XRayFaultPercent)) __obj.updateDynamic("XRayFaultPercent")(XRayFaultPercent.get.asInstanceOf[js.Any])
    if (XRayNodeName != null) __obj.updateDynamic("XRayNodeName")(XRayNodeName.asInstanceOf[js.Any])
    if (XRayNodeType != null) __obj.updateDynamic("XRayNodeType")(XRayNodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(XRayRequestAverageLatency)) __obj.updateDynamic("XRayRequestAverageLatency")(XRayRequestAverageLatency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(XRayRequestCount)) __obj.updateDynamic("XRayRequestCount")(XRayRequestCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(XRayThrottlePercent)) __obj.updateDynamic("XRayThrottlePercent")(XRayThrottlePercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
}

