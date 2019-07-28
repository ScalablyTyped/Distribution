package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * Information about the block device for an EBS volume.
    */
  var Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice] = js.undefined
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  /**
    * The virtual device name (ephemeralN).
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: LaunchTemplateEbsBlockDevice = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs)
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice)
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName)
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
}

