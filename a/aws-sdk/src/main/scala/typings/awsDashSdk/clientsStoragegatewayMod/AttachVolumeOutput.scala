package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name for the initiator that was used to connect to the target.
    */
  var TargetARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume that was attached to the gateway.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
}

object AttachVolumeOutput {
  @scala.inline
  def apply(TargetARN: TargetARN = null, VolumeARN: VolumeARN = null): AttachVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[AttachVolumeOutput]
  }
}

