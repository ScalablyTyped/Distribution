package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Merchant extends js.Object {
  /**
    * Merchant's address.
    */
  var address: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * Optional ID assigned to merchant if any.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The image associated with the merchant.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * The name of the merchant like \"Panera Bread\".
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Merchant's phone numbers.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.undefined
}

object GoogleActionsOrdersV3Merchant {
  @scala.inline
  def apply(
    address: GoogleActionsV2Location = null,
    id: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    name: String = null,
    phoneNumbers: js.Array[GoogleActionsOrdersV3PhoneNumber] = null
  ): GoogleActionsOrdersV3Merchant = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.asInstanceOf[GoogleActionsOrdersV3Merchant]
  }
}

