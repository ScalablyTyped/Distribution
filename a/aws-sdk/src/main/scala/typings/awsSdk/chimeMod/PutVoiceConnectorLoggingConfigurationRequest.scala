package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorLoggingConfigurationRequest extends js.Object {
  /**
    * The logging configuration details to add.
    */
  var LoggingConfiguration: typings.awsSdk.chimeMod.LoggingConfiguration = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorLoggingConfigurationRequest {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
  }
}

