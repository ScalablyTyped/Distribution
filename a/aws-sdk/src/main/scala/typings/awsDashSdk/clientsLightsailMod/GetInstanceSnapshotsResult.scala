package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceSnapshotsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshots request.
    */
  var instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get instance snapshots request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetInstanceSnapshotsResult {
  @scala.inline
  def apply(instanceSnapshots: InstanceSnapshotList = null, nextPageToken: String = null): GetInstanceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (instanceSnapshots != null) __obj.updateDynamic("instanceSnapshots")(instanceSnapshots)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetInstanceSnapshotsResult]
  }
}

