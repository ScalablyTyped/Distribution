package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotLimits extends js.Object {
  /**
    * The current number of manual snapshots of the directory.
    */
  var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined
  /**
    * The maximum number of manual snapshots allowed.
    */
  var ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined
  /**
    * Indicates if the manual snapshot limit has been reached.
    */
  var ManualSnapshotsLimitReached: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.ManualSnapshotsLimitReached] = js.undefined
}

object SnapshotLimits {
  @scala.inline
  def apply(
    ManualSnapshotsCurrentCount: Int | Double = null,
    ManualSnapshotsLimit: Int | Double = null,
    ManualSnapshotsLimitReached: js.UndefOr[Boolean] = js.undefined
  ): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    if (ManualSnapshotsCurrentCount != null) __obj.updateDynamic("ManualSnapshotsCurrentCount")(ManualSnapshotsCurrentCount.asInstanceOf[js.Any])
    if (ManualSnapshotsLimit != null) __obj.updateDynamic("ManualSnapshotsLimit")(ManualSnapshotsLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(ManualSnapshotsLimitReached)) __obj.updateDynamic("ManualSnapshotsLimitReached")(ManualSnapshotsLimitReached)
    __obj.asInstanceOf[SnapshotLimits]
  }
}

