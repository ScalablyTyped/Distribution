package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorLoggingConfigurationResponse extends js.Object {
  /**
    * The logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsDashSdk.clientsChimeMod.LoggingConfiguration] = js.native
}

object GetVoiceConnectorLoggingConfigurationResponse {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration = null): GetVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfiguration != null) __obj.updateDynamic("LoggingConfiguration")(LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
  }
}

