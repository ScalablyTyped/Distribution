package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotResult extends js.Object {
  /**
    * The identifier of the snapshot that was created.
    */
  var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
}

object CreateSnapshotResult {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    __obj.asInstanceOf[CreateSnapshotResult]
  }
}

