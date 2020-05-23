package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.native
  /**
    * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  /**
    * The phone number to route calls to after a proxy session expires.
    */
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  /**
    * The countries for proxy phone numbers to be selected from.
    */
  var PhoneNumberCountries: js.UndefOr[StringList] = js.native
}

object Proxy {
  @scala.inline
  def apply(
    DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.undefined,
    Disabled: js.UndefOr[Boolean] = js.undefined,
    FallBackPhoneNumber: E164PhoneNumber = null,
    PhoneNumberCountries: StringList = null
  ): Proxy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefaultSessionExpiryMinutes)) __obj.updateDynamic("DefaultSessionExpiryMinutes")(DefaultSessionExpiryMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.get.asInstanceOf[js.Any])
    if (FallBackPhoneNumber != null) __obj.updateDynamic("FallBackPhoneNumber")(FallBackPhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumberCountries != null) __obj.updateDynamic("PhoneNumberCountries")(PhoneNumberCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
}

