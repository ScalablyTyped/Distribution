package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
}

object GetInstanceSnapshotResult {
  @scala.inline
  def apply(instanceSnapshot: InstanceSnapshot = null): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (instanceSnapshot != null) __obj.updateDynamic("instanceSnapshot")(instanceSnapshot)
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
}

