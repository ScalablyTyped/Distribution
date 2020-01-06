package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsVolume extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * The volume identifier of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object EbsVolume {
  @scala.inline
  def apply(Device: String = null, VolumeId: String = null): EbsVolume = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsVolume]
  }
}

