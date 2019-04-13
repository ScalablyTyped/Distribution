package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[Snapshot] = js.undefined
}

object CopySnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[CopySnapshotResult]
  }
}

