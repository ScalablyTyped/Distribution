package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBClusterFromSnapshotResult extends js.Object {
  var DBCluster: js.UndefOr[DBCluster] = js.undefined
}

object RestoreDBClusterFromSnapshotResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
  }
}

