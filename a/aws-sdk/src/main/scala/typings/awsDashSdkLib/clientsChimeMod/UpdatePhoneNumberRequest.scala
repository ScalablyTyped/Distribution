package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePhoneNumberRequest extends js.Object {
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
  /**
    * The product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
}

object UpdatePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String, ProductType: PhoneNumberProductType = null): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
}

