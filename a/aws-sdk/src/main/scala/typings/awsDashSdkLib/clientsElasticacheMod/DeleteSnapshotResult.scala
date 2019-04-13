package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[Snapshot] = js.undefined
}

object DeleteSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot)
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
}

