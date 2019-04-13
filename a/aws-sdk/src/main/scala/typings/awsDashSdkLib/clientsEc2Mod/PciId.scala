package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PciId extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the subsystem.
    */
  var SubsystemId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the vendor for the subsystem.
    */
  var SubsystemVendorId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the vendor.
    */
  var VendorId: js.UndefOr[String] = js.undefined
}

object PciId {
  @scala.inline
  def apply(
    DeviceId: String = null,
    SubsystemId: String = null,
    SubsystemVendorId: String = null,
    VendorId: String = null
  ): PciId = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (SubsystemId != null) __obj.updateDynamic("SubsystemId")(SubsystemId)
    if (SubsystemVendorId != null) __obj.updateDynamic("SubsystemVendorId")(SubsystemVendorId)
    if (VendorId != null) __obj.updateDynamic("VendorId")(VendorId)
    __obj.asInstanceOf[PciId]
  }
}

