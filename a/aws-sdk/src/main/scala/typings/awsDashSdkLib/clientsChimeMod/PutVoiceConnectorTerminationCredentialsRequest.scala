package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The termination SIP credentials.
    */
  var Credentials: js.UndefOr[CredentialList] = js.undefined
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object PutVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, Credentials: CredentialList = null): PutVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
  }
}

