package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VTLDevice extends js.Object {
  /**
    * A list of iSCSI information about a VTL device.
    */
  var DeviceiSCSIAttributes: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DeviceiSCSIAttributes] = js.undefined
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
    */
  var VTLDeviceARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VTLDeviceARN] = js.undefined
  /**
    * Specifies the model number of device that the VTL device emulates.
    */
  var VTLDeviceProductIdentifier: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VTLDeviceProductIdentifier] = js.undefined
  /**
    * Specifies the type of device that the VTL device emulates.
    */
  var VTLDeviceType: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VTLDeviceType] = js.undefined
  /**
    * Specifies the vendor of the device that the VTL device object emulates.
    */
  var VTLDeviceVendor: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VTLDeviceVendor] = js.undefined
}

object VTLDevice {
  @scala.inline
  def apply(
    DeviceiSCSIAttributes: DeviceiSCSIAttributes = null,
    VTLDeviceARN: VTLDeviceARN = null,
    VTLDeviceProductIdentifier: VTLDeviceProductIdentifier = null,
    VTLDeviceType: VTLDeviceType = null,
    VTLDeviceVendor: VTLDeviceVendor = null
  ): VTLDevice = {
    val __obj = js.Dynamic.literal()
    if (DeviceiSCSIAttributes != null) __obj.updateDynamic("DeviceiSCSIAttributes")(DeviceiSCSIAttributes)
    if (VTLDeviceARN != null) __obj.updateDynamic("VTLDeviceARN")(VTLDeviceARN)
    if (VTLDeviceProductIdentifier != null) __obj.updateDynamic("VTLDeviceProductIdentifier")(VTLDeviceProductIdentifier)
    if (VTLDeviceType != null) __obj.updateDynamic("VTLDeviceType")(VTLDeviceType)
    if (VTLDeviceVendor != null) __obj.updateDynamic("VTLDeviceVendor")(VTLDeviceVendor)
    __obj.asInstanceOf[VTLDevice]
  }
}

