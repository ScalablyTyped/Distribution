package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: typings.awsSdk.chimeMod.EmergencyCallingConfiguration = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorEmergencyCallingConfigurationRequest {
  @scala.inline
  def apply(EmergencyCallingConfiguration: EmergencyCallingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(EmergencyCallingConfiguration = EmergencyCallingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  @scala.inline
  implicit class PutVoiceConnectorEmergencyCallingConfigurationRequestOps[Self <: PutVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = this.set("EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
  }
  
}

