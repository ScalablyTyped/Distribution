package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromClusterSnapshotResult extends js.Object {
  var TableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
}

object RestoreTableFromClusterSnapshotResult {
  @scala.inline
  def apply(TableRestoreStatus: TableRestoreStatus = null): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (TableRestoreStatus != null) __obj.updateDynamic("TableRestoreStatus")(TableRestoreStatus)
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
}

