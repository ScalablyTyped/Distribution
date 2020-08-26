package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePhoneNumberOrderResponse extends js.Object {
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumberOrder] = js.native
}

object CreatePhoneNumberOrderResponse {
  @scala.inline
  def apply(): CreatePhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
  }
  @scala.inline
  implicit class CreatePhoneNumberOrderResponseOps[Self <: CreatePhoneNumberOrderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhoneNumberOrder(value: PhoneNumberOrder): Self = this.set("PhoneNumberOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberOrder: Self = this.set("PhoneNumberOrder", js.undefined)
  }
  
}

