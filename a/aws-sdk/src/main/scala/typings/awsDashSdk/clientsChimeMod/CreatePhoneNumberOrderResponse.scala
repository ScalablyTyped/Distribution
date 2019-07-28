package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePhoneNumberOrderResponse extends js.Object {
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsDashSdk.clientsChimeMod.PhoneNumberOrder] = js.undefined
}

object CreatePhoneNumberOrderResponse {
  @scala.inline
  def apply(PhoneNumberOrder: PhoneNumberOrder = null): CreatePhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumberOrder != null) __obj.updateDynamic("PhoneNumberOrder")(PhoneNumberOrder)
    __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
  }
}

