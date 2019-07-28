package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeAppliance extends js.Object {
  /**
    * The description of the smart home appliance.
    */
  var Description: js.UndefOr[ApplianceDescription] = js.undefined
  /**
    * The friendly name of the smart home appliance.
    */
  var FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.undefined
  /**
    * The name of the manufacturer of the smart home appliance.
    */
  var ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined
}

object SmartHomeAppliance {
  @scala.inline
  def apply(
    Description: ApplianceDescription = null,
    FriendlyName: ApplianceFriendlyName = null,
    ManufacturerName: ApplianceManufacturerName = null
  ): SmartHomeAppliance = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FriendlyName != null) __obj.updateDynamic("FriendlyName")(FriendlyName)
    if (ManufacturerName != null) __obj.updateDynamic("ManufacturerName")(ManufacturerName)
    __obj.asInstanceOf[SmartHomeAppliance]
  }
}

