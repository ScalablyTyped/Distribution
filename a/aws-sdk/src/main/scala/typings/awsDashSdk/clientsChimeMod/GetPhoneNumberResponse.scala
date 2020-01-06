package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberResponse extends js.Object {
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsDashSdk.clientsChimeMod.PhoneNumber] = js.native
}

object GetPhoneNumberResponse {
  @scala.inline
  def apply(PhoneNumber: PhoneNumber = null): GetPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberResponse]
  }
}

