package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueryLoggingConfigRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is the format of the ARN: arn:aws:logs:region:account-id:log-group:log_group_name  To get the ARN for a log group, you can use the CloudWatch console, the DescribeLogGroups API action, the describe-log-groups command, or the applicable command in one of the AWS SDKs.
    */
  var CloudWatchLogsLogGroupArn: typings.awsDashSdk.clientsRoute53Mod.CloudWatchLogsLogGroupArn = js.native
  /**
    * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
    */
  var HostedZoneId: ResourceId = js.native
}

object CreateQueryLoggingConfigRequest {
  @scala.inline
  def apply(CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn, HostedZoneId: ResourceId): CreateQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateQueryLoggingConfigRequest]
  }
}

