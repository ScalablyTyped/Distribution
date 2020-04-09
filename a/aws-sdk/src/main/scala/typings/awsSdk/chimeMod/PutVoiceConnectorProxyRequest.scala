package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorProxyRequest extends js.Object {
  var DefaultSessionExpiryMinutes: Integer = js.native
  var Disabled: js.UndefOr[Boolean] = js.native
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  var PhoneNumberPoolCountries: CountryList = js.native
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object PutVoiceConnectorProxyRequest {
  @scala.inline
  def apply(
    DefaultSessionExpiryMinutes: Integer,
    PhoneNumberPoolCountries: CountryList,
    VoiceConnectorId: NonEmptyString128,
    Disabled: js.UndefOr[scala.Boolean] = js.undefined,
    FallBackPhoneNumber: E164PhoneNumber = null
  ): PutVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(DefaultSessionExpiryMinutes = DefaultSessionExpiryMinutes.asInstanceOf[js.Any], PhoneNumberPoolCountries = PhoneNumberPoolCountries.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.asInstanceOf[js.Any])
    if (FallBackPhoneNumber != null) __obj.updateDynamic("FallBackPhoneNumber")(FallBackPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorProxyRequest]
  }
}

