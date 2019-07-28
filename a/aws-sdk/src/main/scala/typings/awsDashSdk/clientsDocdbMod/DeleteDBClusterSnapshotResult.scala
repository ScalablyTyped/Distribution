package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.DBClusterSnapshot] = js.undefined
}

object DeleteDBClusterSnapshotResult {
  @scala.inline
  def apply(DBClusterSnapshot: DBClusterSnapshot = null): DeleteDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshot != null) __obj.updateDynamic("DBClusterSnapshot")(DBClusterSnapshot)
    __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
  }
}

