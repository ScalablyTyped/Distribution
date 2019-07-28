package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBClusterSnapshot] = js.undefined
}

object CreateDBClusterSnapshotResult {
  @scala.inline
  def apply(DBClusterSnapshot: DBClusterSnapshot = null): CreateDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshot != null) __obj.updateDynamic("DBClusterSnapshot")(DBClusterSnapshot)
    __obj.asInstanceOf[CreateDBClusterSnapshotResult]
  }
}

