package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsInstanceBlockDeviceSpecification extends js.Object {
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}

object EbsInstanceBlockDeviceSpecification {
  @scala.inline
  def apply(DeleteOnTermination: js.UndefOr[Boolean] = js.undefined, VolumeId: String = null): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
}

