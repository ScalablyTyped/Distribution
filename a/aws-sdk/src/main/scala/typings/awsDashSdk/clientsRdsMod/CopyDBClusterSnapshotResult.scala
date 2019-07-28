package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBClusterSnapshot] = js.undefined
}

object CopyDBClusterSnapshotResult {
  @scala.inline
  def apply(DBClusterSnapshot: DBClusterSnapshot = null): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshot != null) __obj.updateDynamic("DBClusterSnapshot")(DBClusterSnapshot)
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
}

