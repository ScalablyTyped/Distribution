package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberRequestItem extends js.Object {
  /**
    * The outbound calling name to update.
    */
  var CallingName: js.UndefOr[typings.awsDashSdk.clientsChimeMod.CallingName] = js.native
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString = js.native
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}

object UpdatePhoneNumberRequestItem {
  @scala.inline
  def apply(
    PhoneNumberId: NonEmptyString,
    CallingName: CallingName = null,
    ProductType: PhoneNumberProductType = null
  ): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    if (CallingName != null) __obj.updateDynamic("CallingName")(CallingName.asInstanceOf[js.Any])
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
}

