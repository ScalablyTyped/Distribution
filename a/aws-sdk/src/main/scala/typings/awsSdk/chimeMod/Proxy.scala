package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.native
  var Disabled: js.UndefOr[Boolean] = js.native
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  var PhoneNumberCountries: js.UndefOr[StringList] = js.native
}

object Proxy {
  @scala.inline
  def apply(
    DefaultSessionExpiryMinutes: Int | Double = null,
    Disabled: js.UndefOr[scala.Boolean] = js.undefined,
    FallBackPhoneNumber: E164PhoneNumber = null,
    PhoneNumberCountries: StringList = null
  ): Proxy = {
    val __obj = js.Dynamic.literal()
    if (DefaultSessionExpiryMinutes != null) __obj.updateDynamic("DefaultSessionExpiryMinutes")(DefaultSessionExpiryMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.asInstanceOf[js.Any])
    if (FallBackPhoneNumber != null) __obj.updateDynamic("FallBackPhoneNumber")(FallBackPhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumberCountries != null) __obj.updateDynamic("PhoneNumberCountries")(PhoneNumberCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
}

