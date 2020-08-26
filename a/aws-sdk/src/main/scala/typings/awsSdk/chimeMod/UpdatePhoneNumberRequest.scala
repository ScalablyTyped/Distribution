package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberRequest extends js.Object {
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
  /**
    * The product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}

object UpdatePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
  @scala.inline
  implicit class UpdatePhoneNumberRequestOps[Self <: UpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
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
    def setPhoneNumberId(value: String): Self = this.set("PhoneNumberId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallingName(value: CallingName): Self = this.set("CallingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallingName: Self = this.set("CallingName", js.undefined)
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
  }
  
}

