package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotLimitsResult extends js.Object {
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotLimits] = js.undefined
}

object GetSnapshotLimitsResult {
  @scala.inline
  def apply(SnapshotLimits: SnapshotLimits = null): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotLimits != null) __obj.updateDynamic("SnapshotLimits")(SnapshotLimits)
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
}

