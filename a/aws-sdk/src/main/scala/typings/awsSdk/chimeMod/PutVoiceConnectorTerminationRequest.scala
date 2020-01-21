package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorTerminationRequest extends js.Object {
  /**
    * The termination setting details to add.
    */
  var Termination: typings.awsSdk.chimeMod.Termination = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorTerminationRequest {
  @scala.inline
  def apply(Termination: Termination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(Termination = Termination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
  }
}

