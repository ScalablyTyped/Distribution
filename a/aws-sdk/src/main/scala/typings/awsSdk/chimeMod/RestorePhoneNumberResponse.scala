package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePhoneNumberResponse extends js.Object {
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumber] = js.native
}

object RestorePhoneNumberResponse {
  @scala.inline
  def apply(PhoneNumber: PhoneNumber = null): RestorePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePhoneNumberResponse]
  }
}

