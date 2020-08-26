package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
    */
  var Usernames: SensitiveStringList = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object DeleteVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(Usernames: SensitiveStringList, VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(Usernames = Usernames.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
  }
  @scala.inline
  implicit class DeleteVoiceConnectorTerminationCredentialsRequestOps[Self <: DeleteVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
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
    def setUsernamesVarargs(value: SensitiveString*): Self = this.set("Usernames", js.Array(value :_*))
    @scala.inline
    def setUsernames(value: SensitiveStringList): Self = this.set("Usernames", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
  }
  
}

