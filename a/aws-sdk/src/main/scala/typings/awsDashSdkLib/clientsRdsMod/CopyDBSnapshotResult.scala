package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
}

object CopyDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): CopyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot)
    __obj.asInstanceOf[CopyDBSnapshotResult]
  }
}

