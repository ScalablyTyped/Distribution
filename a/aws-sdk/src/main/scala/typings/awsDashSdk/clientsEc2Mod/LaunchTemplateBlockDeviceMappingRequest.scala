package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateBlockDeviceMappingRequest extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[LaunchTemplateEbsBlockDeviceRequest] = js.undefined
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume.
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}

object LaunchTemplateBlockDeviceMappingRequest {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: LaunchTemplateEbsBlockDeviceRequest = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): LaunchTemplateBlockDeviceMappingRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs)
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice)
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName)
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingRequest]
  }
}

