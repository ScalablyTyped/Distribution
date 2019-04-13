package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDeviceMapping extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.undefined
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  /**
    * The virtual device name. For more information, see BlockDeviceMapping.
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}

object BlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: String = null,
    Ebs: EbsBlockDevice = null,
    NoDevice: String = null,
    VirtualName: String = null
  ): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs)
    if (NoDevice != null) __obj.updateDynamic("NoDevice")(NoDevice)
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName)
    __obj.asInstanceOf[BlockDeviceMapping]
  }
}

