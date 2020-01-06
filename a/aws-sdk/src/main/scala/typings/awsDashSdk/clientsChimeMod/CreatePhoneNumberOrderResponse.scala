package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePhoneNumberOrderResponse extends js.Object {
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsDashSdk.clientsChimeMod.PhoneNumberOrder] = js.native
}

object CreatePhoneNumberOrderResponse {
  @scala.inline
  def apply(PhoneNumberOrder: PhoneNumberOrder = null): CreatePhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumberOrder != null) __obj.updateDynamic("PhoneNumberOrder")(PhoneNumberOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
  }
}

