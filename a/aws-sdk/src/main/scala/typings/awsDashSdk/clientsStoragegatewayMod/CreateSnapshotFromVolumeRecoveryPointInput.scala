package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field
    */
  var SnapshotDescription: typings.awsDashSdk.clientsStoragegatewayMod.SnapshotDescription
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN
}

object CreateSnapshotFromVolumeRecoveryPointInput {
  @scala.inline
  def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN): CreateSnapshotFromVolumeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription, VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
  }
}

