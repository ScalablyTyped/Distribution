package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends js.Object {
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  var ProxyPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
}

object Participant {
  @scala.inline
  def apply(PhoneNumber: E164PhoneNumber = null, ProxyPhoneNumber: E164PhoneNumber = null): Participant = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (ProxyPhoneNumber != null) __obj.updateDynamic("ProxyPhoneNumber")(ProxyPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
}

