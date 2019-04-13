package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceBlockDeviceMappingSpecification extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.undefined
  /**
    * suppress the specified device included in the block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  /**
    * The virtual device name.
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}

object InstanceBlockDeviceMappingSpecification {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: EbsInstanceBlockDeviceSpecification = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): InstanceBlockDeviceMappingSpecification = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs)
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice)
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName)
    __obj.asInstanceOf[InstanceBlockDeviceMappingSpecification]
  }
}

