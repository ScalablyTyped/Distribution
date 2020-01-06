package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory of which to take a snapshot.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The descriptive name to apply to the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.native
}

object CreateSnapshotRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Name: SnapshotName = null): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
}

