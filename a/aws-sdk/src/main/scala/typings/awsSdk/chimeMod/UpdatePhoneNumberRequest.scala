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
  def apply(PhoneNumberId: String, CallingName: CallingName = null, ProductType: PhoneNumberProductType = null): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    if (CallingName != null) __obj.updateDynamic("CallingName")(CallingName.asInstanceOf[js.Any])
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
}

