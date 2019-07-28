package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhoneNumberOrderResponse extends js.Object {
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsDashSdk.clientsChimeMod.PhoneNumberOrder] = js.undefined
}

object GetPhoneNumberOrderResponse {
  @scala.inline
  def apply(PhoneNumberOrder: PhoneNumberOrder = null): GetPhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumberOrder != null) __obj.updateDynamic("PhoneNumberOrder")(PhoneNumberOrder)
    __obj.asInstanceOf[GetPhoneNumberOrderResponse]
  }
}

