package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory of which to take a snapshot.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The descriptive name to apply to the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.undefined
}

object CreateSnapshotRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Name: SnapshotName = null): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
}

