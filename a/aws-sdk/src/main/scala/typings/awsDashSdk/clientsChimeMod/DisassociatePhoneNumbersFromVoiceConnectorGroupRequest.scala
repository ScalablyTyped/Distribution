package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString, E164PhoneNumbers: E164PhoneNumberList = null): DisassociatePhoneNumbersFromVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    if (E164PhoneNumbers != null) __obj.updateDynamic("E164PhoneNumbers")(E164PhoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupRequest]
  }
}

