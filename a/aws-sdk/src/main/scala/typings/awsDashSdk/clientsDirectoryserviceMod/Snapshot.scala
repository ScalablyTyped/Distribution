package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The descriptive name of the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.undefined
  /**
    * The snapshot identifier.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId] = js.undefined
  /**
    * The date and time that the snapshot was taken.
    */
  var StartTime: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.StartTime] = js.undefined
  /**
    * The snapshot status.
    */
  var Status: js.UndefOr[SnapshotStatus] = js.undefined
  /**
    * The snapshot type.
    */
  var Type: js.UndefOr[SnapshotType] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    Name: SnapshotName = null,
    SnapshotId: SnapshotId = null,
    StartTime: StartTime = null,
    Status: SnapshotStatus = null,
    Type: SnapshotType = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

