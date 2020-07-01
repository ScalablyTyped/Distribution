package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockDeviceMapping extends js.Object {
  /**
    * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh). For more information, see Device Naming on Linux Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var DeviceName: XmlStringMaxLen255 = js.native
  /**
    * Parameters used to automatically set up EBS volumes when an instance is launched. You can specify either VirtualName or Ebs, but not both.
    */
  var Ebs: js.UndefOr[typings.awsSdk.autoscalingMod.Ebs] = js.native
  /**
    * Setting this value to true suppresses the specified device included in the block device mapping of the AMI. If NoDevice is true for the root device, instances might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches replacement instances. If you specify NoDevice, you cannot specify Ebs.
    */
  var NoDevice: js.UndefOr[typings.awsSdk.autoscalingMod.NoDevice] = js.native
  /**
    * The name of the virtual device (for example, ephemeral0). You can specify either VirtualName or Ebs, but not both.
    */
  var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.native
}

object BlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: XmlStringMaxLen255,
    Ebs: Ebs = null,
    NoDevice: js.UndefOr[NoDevice] = js.undefined,
    VirtualName: XmlStringMaxLen255 = null
  ): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs.asInstanceOf[js.Any])
    if (!js.isUndefined(NoDevice)) __obj.updateDynamic("NoDevice")(NoDevice.get.asInstanceOf[js.Any])
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
}

