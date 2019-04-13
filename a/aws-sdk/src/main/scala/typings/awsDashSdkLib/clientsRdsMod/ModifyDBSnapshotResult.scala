package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
}

object ModifyDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): ModifyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot)
    __obj.asInstanceOf[ModifyDBSnapshotResult]
  }
}

