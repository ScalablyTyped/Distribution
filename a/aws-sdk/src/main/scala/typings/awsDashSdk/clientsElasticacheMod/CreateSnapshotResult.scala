package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.Snapshot] = js.undefined
}

object CreateSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[CreateSnapshotResult]
  }
}

