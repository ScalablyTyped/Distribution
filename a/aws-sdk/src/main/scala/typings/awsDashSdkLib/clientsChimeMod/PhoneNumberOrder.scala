package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumberOrder extends js.Object {
  /**
    * The phone number order creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
    */
  var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined
  /**
    * The phone number order ID.
    */
  var PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined
  /**
    * The phone number order product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  /**
    * The status of the phone number order.
    */
  var Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined
  /**
    * The updated phone number order timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
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
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (OrderedPhoneNumbers != null) __obj.updateDynamic("OrderedPhoneNumbers")(OrderedPhoneNumbers)
    if (PhoneNumberOrderId != null) __obj.updateDynamic("PhoneNumberOrderId")(PhoneNumberOrderId)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp)
    __obj.asInstanceOf[PhoneNumberOrder]
  }
}

