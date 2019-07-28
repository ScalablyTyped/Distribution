package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details, and the Amazon Resource Name (ARN) of the web ACL to monitor.
    */
  var LoggingConfiguration: typings.awsDashSdk.clientsWafregionalMod.LoggingConfiguration
}

object PutLoggingConfigurationRequest {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration)
  
    __obj.asInstanceOf[PutLoggingConfigurationRequest]
  }
}

