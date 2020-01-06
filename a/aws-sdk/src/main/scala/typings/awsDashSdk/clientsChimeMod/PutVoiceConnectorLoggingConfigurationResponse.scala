package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorLoggingConfigurationResponse extends js.Object {
  /**
    * The updated logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsDashSdk.clientsChimeMod.LoggingConfiguration] = js.native
}

object PutVoiceConnectorLoggingConfigurationResponse {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration = null): PutVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfiguration != null) __obj.updateDynamic("LoggingConfiguration")(LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
  }
}

