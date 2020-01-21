package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * If true, associates the provided phone numbers with the provided Amazon Chime Voice Connector Group and removes any previously existing associations. If false, does not associate any phone numbers that have previously existing associations.
    */
  var ForceAssociate: js.UndefOr[NullableBoolean] = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
  @scala.inline
  def apply(
    VoiceConnectorGroupId: NonEmptyString,
    E164PhoneNumbers: E164PhoneNumberList = null,
    ForceAssociate: js.UndefOr[scala.Boolean] = js.undefined
  ): AssociatePhoneNumbersWithVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    if (E164PhoneNumbers != null) __obj.updateDynamic("E164PhoneNumbers")(E164PhoneNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceAssociate)) __obj.updateDynamic("ForceAssociate")(ForceAssociate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupRequest]
  }
}

