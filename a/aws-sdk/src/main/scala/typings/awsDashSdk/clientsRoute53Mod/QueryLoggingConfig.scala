package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLoggingConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
    */
  var CloudWatchLogsLogGroupArn: typings.awsDashSdk.clientsRoute53Mod.CloudWatchLogsLogGroupArn
  /**
    * The ID of the hosted zone that CloudWatch Logs is logging queries for. 
    */
  var HostedZoneId: ResourceId
  /**
    * The ID for a configuration for DNS query logging.
    */
  var Id: QueryLoggingConfigId
}

object QueryLoggingConfig {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
    HostedZoneId: ResourceId,
    Id: QueryLoggingConfigId
  ): QueryLoggingConfig = {
    val __obj = js.Dynamic.literal(CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn, HostedZoneId = HostedZoneId, Id = Id)
  
    __obj.asInstanceOf[QueryLoggingConfig]
  }
}

