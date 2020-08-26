package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object GetVoiceConnectorEmergencyCallingConfigurationRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  @scala.inline
  implicit class GetVoiceConnectorEmergencyCallingConfigurationRequestOps[Self <: GetVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
  }
  
}

