package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
  /**
    * The time the volume was created from the recovery point.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.undefined
}

object CreateSnapshotFromVolumeRecoveryPointOutput {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null, VolumeARN: VolumeARN = null, VolumeRecoveryPointTime: String = null): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    if (VolumeRecoveryPointTime != null) __obj.updateDynamic("VolumeRecoveryPointTime")(VolumeRecoveryPointTime)
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
}

