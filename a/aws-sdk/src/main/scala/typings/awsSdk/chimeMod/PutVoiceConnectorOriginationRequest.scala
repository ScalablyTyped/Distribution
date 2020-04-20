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
}

