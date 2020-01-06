package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsBlockDevice extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: js.UndefOr[typings.awsDashSdk.clientsEmrMod.VolumeSpecification] = js.native
}

object EbsBlockDevice {
  @scala.inline
  def apply(Device: String = null, VolumeSpecification: VolumeSpecification = null): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    if (VolumeSpecification != null) __obj.updateDynamic("VolumeSpecification")(VolumeSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDevice]
  }
}

