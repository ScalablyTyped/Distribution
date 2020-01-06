package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
  var DBInstance: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBInstance] = js.native
}

object RestoreDBInstanceFromDBSnapshotResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): RestoreDBInstanceFromDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
  }
}

