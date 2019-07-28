package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsInstanceBlockDevice extends js.Object {
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}

object EbsInstanceBlockDevice {
  @scala.inline
  def apply(
    AttachTime: DateTime = null,
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    Status: AttachmentStatus = null,
    VolumeId: String = null
  ): EbsInstanceBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    __obj.asInstanceOf[EbsInstanceBlockDevice]
  }
}

