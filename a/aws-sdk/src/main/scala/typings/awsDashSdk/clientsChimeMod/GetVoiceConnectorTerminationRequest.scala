package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorTerminationRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object GetVoiceConnectorTerminationRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[GetVoiceConnectorTerminationRequest]
  }
}

