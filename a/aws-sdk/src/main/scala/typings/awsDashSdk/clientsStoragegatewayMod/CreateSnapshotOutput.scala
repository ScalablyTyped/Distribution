package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotOutput extends js.Object {
  /**
    * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon Elastic Compute Cloud API DescribeSnapshots) or creating a volume from a snapshot (CreateStorediSCSIVolume).
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
}

object CreateSnapshotOutput {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null, VolumeARN: VolumeARN = null): CreateSnapshotOutput = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[CreateSnapshotOutput]
  }
}

