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
  def apply(
    CreatedTimestamp: Iso8601Timestamp = null,
    OrderedPhoneNumbers: OrderedPhoneNumberList = null,
    PhoneNumberOrderId: GuidString = null,
    ProductType: PhoneNumberProductType = null,
    Status: PhoneNumberOrderStatus = null,
    UpdatedTimestamp: Iso8601Timestamp = null
  ): PhoneNumberOrder = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (OrderedPhoneNumbers != null) __obj.updateDynamic("OrderedPhoneNumbers")(OrderedPhoneNumbers.asInstanceOf[js.Any])
    if (PhoneNumberOrderId != null) __obj.updateDynamic("PhoneNumberOrderId")(PhoneNumberOrderId.asInstanceOf[js.Any])
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberOrder]
  }
}

