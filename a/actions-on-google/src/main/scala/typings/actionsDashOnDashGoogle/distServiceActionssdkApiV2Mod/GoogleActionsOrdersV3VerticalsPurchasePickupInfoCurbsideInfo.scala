package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo extends js.Object {
  /**
    * Partners need additional information to facilitate curbside pickup
    * orders. Depending upon what fulfillment type is chosen, corresponding
    * details would be collected from the user.
    */
  var curbsideFulfillmentType: js.UndefOr[
    GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType
  ] = js.undefined
  /**
    * Vehicle details of the user placing the order.
    */
  var userVehicle: js.UndefOr[GoogleActionsOrdersV3VerticalsCommonVehicle] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo {
  @scala.inline
  def apply(
    curbsideFulfillmentType: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType = null,
    userVehicle: GoogleActionsOrdersV3VerticalsCommonVehicle = null
  ): GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo = {
    val __obj = js.Dynamic.literal()
    if (curbsideFulfillmentType != null) __obj.updateDynamic("curbsideFulfillmentType")(curbsideFulfillmentType.asInstanceOf[js.Any])
    if (userVehicle != null) __obj.updateDynamic("userVehicle")(userVehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo]
  }
}

