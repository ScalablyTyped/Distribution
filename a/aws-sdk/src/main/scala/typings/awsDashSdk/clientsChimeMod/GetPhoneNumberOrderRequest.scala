package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhoneNumberOrderRequest extends js.Object {
  /**
    * The ID for the phone number order.
    */
  var PhoneNumberOrderId: GuidString
}

object GetPhoneNumberOrderRequest {
  @scala.inline
  def apply(PhoneNumberOrderId: GuidString): GetPhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberOrderId = PhoneNumberOrderId)
  
    __obj.asInstanceOf[GetPhoneNumberOrderRequest]
  }
}

