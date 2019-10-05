package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAttachment extends js.Object {
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The attachment state of the volume.
    */
  var State: js.UndefOr[VolumeAttachmentState] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}

object VolumeAttachment {
  @scala.inline
  def apply(
    AttachTime: DateTime = null,
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    Device: String = null,
    InstanceId: String = null,
    State: VolumeAttachmentState = null,
    VolumeId: String = null
  ): VolumeAttachment = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    __obj.asInstanceOf[VolumeAttachment]
  }
}

