package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorediSCSIVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
}

object CreateStorediSCSIVolumeOutput {
  @scala.inline
  def apply(
    TargetARN: TargetARN = null,
    VolumeARN: VolumeARN = null,
    VolumeSizeInBytes: js.UndefOr[long] = js.undefined
  ): CreateStorediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    if (!js.isUndefined(VolumeSizeInBytes)) __obj.updateDynamic("VolumeSizeInBytes")(VolumeSizeInBytes)
    __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
  }
}

