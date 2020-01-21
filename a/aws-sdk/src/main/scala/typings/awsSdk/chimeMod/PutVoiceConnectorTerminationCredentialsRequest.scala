package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The termination SIP credentials.
    */
  var Credentials: js.UndefOr[CredentialList] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, Credentials: CredentialList = null): PutVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
  }
}

