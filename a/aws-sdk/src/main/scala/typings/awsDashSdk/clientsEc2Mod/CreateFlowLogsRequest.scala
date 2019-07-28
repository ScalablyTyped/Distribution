package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowLogsRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType. If LogDestinationType is not specified or cloud-watch-logs, specify the Amazon Resource Name (ARN) of the CloudWatch Logs log group. If LogDestinationType is s3, specify the ARN of the Amazon S3 bucket. You can also specify a subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format: bucket_ARN/subfolder_name/. For example, to specify a subfolder named my-logs in a bucket named my-bucket, use the following ARN: arn:aws:s3:::my-bucket/my-logs/. You cannot use AWSLogs as a subfolder name. This is a reserved term.
    */
  var LogDestination: js.UndefOr[String] = js.undefined
  /**
    * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify cloud-watch-logs. To publish flow log data to Amazon S3, specify s3. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName. Default: cloud-watch-logs 
    */
  var LogDestinationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LogDestinationType] = js.undefined
  /**
    * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the subnet, network interface, or VPC for which you want to create a flow log. Constraints: Maximum of 1000 resources
    */
  var ResourceIds: ValueStringList
  /**
    * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
    */
  var ResourceType: FlowLogsResourceType
  /**
    * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
    */
  var TrafficType: typings.awsDashSdk.clientsEc2Mod.TrafficType
}

object CreateFlowLogsRequest {
  @scala.inline
  def apply(
    ResourceIds: ValueStringList,
    ResourceType: FlowLogsResourceType,
    TrafficType: TrafficType,
    ClientToken: String = null,
    DeliverLogsPermissionArn: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    LogDestination: String = null,
    LogDestinationType: LogDestinationType = null,
    LogGroupName: String = null
  ): CreateFlowLogsRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds, ResourceType = ResourceType.asInstanceOf[js.Any], TrafficType = TrafficType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (DeliverLogsPermissionArn != null) __obj.updateDynamic("DeliverLogsPermissionArn")(DeliverLogsPermissionArn)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LogDestination != null) __obj.updateDynamic("LogDestination")(LogDestination)
    if (LogDestinationType != null) __obj.updateDynamic("LogDestinationType")(LogDestinationType.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    __obj.asInstanceOf[CreateFlowLogsRequest]
  }
}

