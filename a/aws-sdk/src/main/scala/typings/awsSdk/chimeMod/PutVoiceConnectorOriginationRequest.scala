package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorOriginationRequest extends js.Object {
  /**
    * The origination setting details to add.
    */
  var Origination: typings.awsSdk.chimeMod.Origination = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorOriginationRequest {
  @scala.inline
  def apply(Origination: Origination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(Origination = Origination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
  }
  @scala.inline
  implicit class PutVoiceConnectorOriginationRequestOps[Self <: PutVoiceConnectorOriginationRequest] (val x: Self) extends AnyVal {
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
    def setOrigination(value: Origination): Self = this.set("Origination", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
  }
  
}

