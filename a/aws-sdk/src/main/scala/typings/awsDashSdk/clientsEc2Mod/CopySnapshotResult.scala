package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotResult extends js.Object {
  /**
    * The ID of the new snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}

object CopySnapshotResult {
  @scala.inline
  def apply(SnapshotId: String = null): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    __obj.asInstanceOf[CopySnapshotResult]
  }
}

