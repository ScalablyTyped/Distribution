package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutVoiceConnectorTerminationRequest extends js.Object {
  /**
    * The termination setting details to add.
    */
  var Termination: typings.awsDashSdk.clientsChimeMod.Termination
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object PutVoiceConnectorTerminationRequest {
  @scala.inline
  def apply(Termination: Termination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(Termination = Termination, VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
  }
}

