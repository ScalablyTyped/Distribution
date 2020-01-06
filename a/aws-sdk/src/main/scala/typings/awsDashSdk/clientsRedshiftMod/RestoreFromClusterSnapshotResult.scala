package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreFromClusterSnapshotResult extends js.Object {
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Cluster] = js.native
}

object RestoreFromClusterSnapshotResult {
  @scala.inline
  def apply(Cluster: Cluster = null): RestoreFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromClusterSnapshotResult]
  }
}

