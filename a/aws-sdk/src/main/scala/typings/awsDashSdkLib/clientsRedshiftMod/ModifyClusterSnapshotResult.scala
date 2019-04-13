package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[Snapshot] = js.undefined
}

object ModifyClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): ModifyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[ModifyClusterSnapshotResult]
  }
}

