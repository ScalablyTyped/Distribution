package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersMerchant extends js.Object {
  /**
    * Id of the merchant.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * User-visible name of the merchant. Required.
    */
  var name: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersMerchant {
  @scala.inline
  def apply(id: String = null, name: String = null): GoogleActionsV2OrdersMerchant = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersMerchant]
  }
}

