package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * The time when the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[Timestamp] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(SnapshotTime: Timestamp = null): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (SnapshotTime != null) __obj.updateDynamic("SnapshotTime")(SnapshotTime)
    __obj.asInstanceOf[Snapshot]
  }
}

