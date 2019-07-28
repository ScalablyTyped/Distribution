package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorOriginationRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object GetVoiceConnectorOriginationRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[GetVoiceConnectorOriginationRequest]
  }
}

