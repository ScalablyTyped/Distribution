package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[Snapshot] = js.undefined
}

object CreateClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CreateClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[CreateClusterSnapshotResult]
  }
}

