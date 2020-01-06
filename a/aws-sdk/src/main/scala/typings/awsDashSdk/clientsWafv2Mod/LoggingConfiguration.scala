package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL.
    */
  var LogDestinationConfigs: typings.awsDashSdk.clientsWafv2Mod.LogDestinationConfigs = js.native
  /**
    * The parts of the request that you want to keep out of the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.RedactedFields] = js.native
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafv2Mod.ResourceArn = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(
    LogDestinationConfigs: LogDestinationConfigs,
    ResourceArn: ResourceArn,
    RedactedFields: RedactedFields = null
  ): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (RedactedFields != null) __obj.updateDynamic("RedactedFields")(RedactedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
}

