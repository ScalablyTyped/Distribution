package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfiguration extends js.Object {
  /**
    * An array of Amazon Kinesis Data Firehose ARNs.
    */
  var LogDestinationConfigs: typings.awsDashSdk.clientsWafregionalMod.LogDestinationConfigs
  /**
    * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.RedactedFields] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafregionalMod.ResourceArn
}

object LoggingConfiguration {
  @scala.inline
  def apply(
    LogDestinationConfigs: LogDestinationConfigs,
    ResourceArn: ResourceArn,
    RedactedFields: RedactedFields = null
  ): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs, ResourceArn = ResourceArn)
    if (RedactedFields != null) __obj.updateDynamic("RedactedFields")(RedactedFields)
    __obj.asInstanceOf[LoggingConfiguration]
  }
}

