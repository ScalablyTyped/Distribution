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
  def apply(DeviceName: XmlStringMaxLen255): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  @scala.inline
  implicit class BlockDeviceMappingOps[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceName(value: XmlStringMaxLen255): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbs(value: Ebs): Self = this.set("Ebs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbs: Self = this.set("Ebs", js.undefined)
    @scala.inline
    def setNoDevice(value: NoDevice): Self = this.set("NoDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDevice: Self = this.set("NoDevice", js.undefined)
    @scala.inline
    def setVirtualName(value: XmlStringMaxLen255): Self = this.set("VirtualName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualName: Self = this.set("VirtualName", js.undefined)
  }
  
}

