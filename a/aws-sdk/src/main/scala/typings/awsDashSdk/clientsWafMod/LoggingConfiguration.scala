package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An array of Amazon Kinesis Data Firehose ARNs.
    */
  var LogDestinationConfigs: typings.awsDashSdk.clientsWafMod.LogDestinationConfigs = js.native
  /**
    * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typings.awsDashSdk.clientsWafMod.RedactedFields] = js.native
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafMod.ResourceArn = js.native
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

