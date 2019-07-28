package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePhoneNumberRequestItem extends js.Object {
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
}

object UpdatePhoneNumberRequestItem {
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString, ProductType: PhoneNumberProductType = null): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
}

