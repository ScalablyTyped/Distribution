package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsBlockDeviceConfig extends js.Object {
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: typings.awsDashSdk.clientsEmrMod.VolumeSpecification
  /**
    * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the instance group
    */
  var VolumesPerInstance: js.UndefOr[Integer] = js.undefined
}

object EbsBlockDeviceConfig {
  @scala.inline
  def apply(VolumeSpecification: VolumeSpecification, VolumesPerInstance: js.UndefOr[Integer] = js.undefined): EbsBlockDeviceConfig = {
    val __obj = js.Dynamic.literal(VolumeSpecification = VolumeSpecification)
    if (!js.isUndefined(VolumesPerInstance)) __obj.updateDynamic("VolumesPerInstance")(VolumesPerInstance)
    __obj.asInstanceOf[EbsBlockDeviceConfig]
  }
}

