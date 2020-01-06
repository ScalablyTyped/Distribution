package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeSnapshotAccessResult extends js.Object {
  var Snapshot: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Snapshot] = js.native
}

object RevokeSnapshotAccessResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): RevokeSnapshotAccessResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSnapshotAccessResult]
  }
}

