package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Snapshot] = js.undefined
}

object CopyClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CopyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[CopyClusterSnapshotResult]
  }
}

