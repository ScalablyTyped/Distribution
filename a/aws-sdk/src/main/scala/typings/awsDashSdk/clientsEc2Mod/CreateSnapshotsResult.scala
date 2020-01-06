package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotsResult extends js.Object {
  /**
    * List of snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotSet] = js.native
}

object CreateSnapshotsResult {
  @scala.inline
  def apply(Snapshots: SnapshotSet = null): CreateSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsResult]
  }
}

