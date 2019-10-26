package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DeliveryAddressValueSpec extends js.Object {
  /**
    * Configuration for delivery address dialog.
    */
  var addressOptions: js.UndefOr[GoogleActionsV2DeliveryAddressValueSpecAddressOptions] = js.undefined
}

object GoogleActionsV2DeliveryAddressValueSpec {
  @scala.inline
  def apply(addressOptions: GoogleActionsV2DeliveryAddressValueSpecAddressOptions = null): GoogleActionsV2DeliveryAddressValueSpec = {
    val __obj = js.Dynamic.literal()
    if (addressOptions != null) __obj.updateDynamic("addressOptions")(addressOptions)
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpec]
  }
}

