package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberOrder extends js.Object {
  /**
    * The phone number order creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
    */
  var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.native
  /**
    * The phone number order ID.
    */
  var PhoneNumberOrderId: js.UndefOr[GuidString] = js.native
  /**
    * The phone number order product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
  /**
    * The status of the phone number order.
    */
  var Status: js.UndefOr[PhoneNumberOrderStatus] = js.native
  /**
    * The updated phone number order timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object PhoneNumberOrder {
  @scala.inline
  def apply(): PhoneNumberOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberOrder]
  }
  @scala.inline
  implicit class PhoneNumberOrderOps[Self <: PhoneNumberOrder] (val x: Self) extends AnyVal {
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
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setOrderedPhoneNumbersVarargs(value: OrderedPhoneNumber*): Self = this.set("OrderedPhoneNumbers", js.Array(value :_*))
    @scala.inline
    def setOrderedPhoneNumbers(value: OrderedPhoneNumberList): Self = this.set("OrderedPhoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedPhoneNumbers: Self = this.set("OrderedPhoneNumbers", js.undefined)
    @scala.inline
    def setPhoneNumberOrderId(value: GuidString): Self = this.set("PhoneNumberOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberOrderId: Self = this.set("PhoneNumberOrderId", js.undefined)
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
    @scala.inline
    def setStatus(value: PhoneNumberOrderStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
  }
  
}

