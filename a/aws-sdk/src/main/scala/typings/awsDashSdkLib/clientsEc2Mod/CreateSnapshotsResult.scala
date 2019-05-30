package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotsResult extends js.Object {
  /**
    * List of snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotSet] = js.undefined
}

object CreateSnapshotsResult {
  @scala.inline
  def apply(Snapshots: SnapshotSet = null): CreateSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots)
    __obj.asInstanceOf[CreateSnapshotsResult]
  }
}

