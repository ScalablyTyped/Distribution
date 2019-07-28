package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSnapshot] = js.undefined
}

object CreateDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): CreateDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot)
    __obj.asInstanceOf[CreateDBSnapshotResult]
  }
}

