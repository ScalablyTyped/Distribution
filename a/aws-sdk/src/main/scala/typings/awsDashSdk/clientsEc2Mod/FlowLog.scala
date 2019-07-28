package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLog extends js.Object {
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Information about the error that occurred. Rate limited indicates that CloudWatch Logs throttling has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups that you can create. Access error indicates that the IAM role associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs. Unknown error indicates an internal error.
    */
  var DeliverLogsErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the IAM role that posts logs to CloudWatch Logs.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the logs delivery (SUCCESS | FAILED).
    */
  var DeliverLogsStatus: js.UndefOr[String] = js.undefined
  /**
    * The flow log ID.
    */
  var FlowLogId: js.UndefOr[String] = js.undefined
  /**
    * The status of the flow log (ACTIVE).
    */
  var FlowLogStatus: js.UndefOr[String] = js.undefined
  /**
    * Specifies the destination to which the flow log data is published. Flow log data can be published to an CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is published.
    */
  var LogDestination: js.UndefOr[String] = js.undefined
  /**
    * Specifies the type of destination to which the flow log data is published. Flow log data can be published to CloudWatch Logs or Amazon S3.
    */
  var LogDestinationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LogDestinationType] = js.undefined
  /**
    * The name of the flow log group.
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the resource on which the flow log was created.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficType] = js.undefined
}

object FlowLog {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    DeliverLogsErrorMessage: String = null,
    DeliverLogsPermissionArn: String = null,
    DeliverLogsStatus: String = null,
    FlowLogId: String = null,
    FlowLogStatus: String = null,
    LogDestination: String = null,
    LogDestinationType: LogDestinationType = null,
    LogGroupName: String = null,
    ResourceId: String = null,
    TrafficType: TrafficType = null
  ): FlowLog = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DeliverLogsErrorMessage != null) __obj.updateDynamic("DeliverLogsErrorMessage")(DeliverLogsErrorMessage)
    if (DeliverLogsPermissionArn != null) __obj.updateDynamic("DeliverLogsPermissionArn")(DeliverLogsPermissionArn)
    if (DeliverLogsStatus != null) __obj.updateDynamic("DeliverLogsStatus")(DeliverLogsStatus)
    if (FlowLogId != null) __obj.updateDynamic("FlowLogId")(FlowLogId)
    if (FlowLogStatus != null) __obj.updateDynamic("FlowLogStatus")(FlowLogStatus)
    if (LogDestination != null) __obj.updateDynamic("LogDestination")(LogDestination)
    if (LogDestinationType != null) __obj.updateDynamic("LogDestinationType")(LogDestinationType.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (TrafficType != null) __obj.updateDynamic("TrafficType")(TrafficType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLog]
  }
}

