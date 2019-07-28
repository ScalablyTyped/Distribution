package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeSnapshotAccessResult extends js.Object {
  var Snapshot: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Snapshot] = js.undefined
}

object AuthorizeSnapshotAccessResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): AuthorizeSnapshotAccessResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[AuthorizeSnapshotAccessResult]
  }
}

