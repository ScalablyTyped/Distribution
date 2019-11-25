package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePickupInfo extends js.Object {
  /**
    * Details specific to the curbside information. If pickup_type is not
    * \"CURBSIDE\", this field would be ignored.
    */
  var curbsideInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] = js.undefined
  /**
    * Pick up method, such as INSTORE, CURBSIDE etc.
    */
  var pickupType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePickupInfo {
  @scala.inline
  def apply(
    curbsideInfo: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo = null,
    pickupType: GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType = null
  ): GoogleActionsOrdersV3VerticalsPurchasePickupInfo = {
    val __obj = js.Dynamic.literal()
    if (curbsideInfo != null) __obj.updateDynamic("curbsideInfo")(curbsideInfo.asInstanceOf[js.Any])
    if (pickupType != null) __obj.updateDynamic("pickupType")(pickupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfo]
  }
}

