package typings
package awsDashSdkLib.clientsDirectoryserviceMod

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
  var ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached] = js.undefined
}

object SnapshotLimits {
  @scala.inline
  def apply(
    ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined,
    ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined,
    ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached] = js.undefined
  ): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ManualSnapshotsCurrentCount)) __obj.updateDynamic("ManualSnapshotsCurrentCount")(ManualSnapshotsCurrentCount)
    if (!js.isUndefined(ManualSnapshotsLimit)) __obj.updateDynamic("ManualSnapshotsLimit")(ManualSnapshotsLimit)
    if (!js.isUndefined(ManualSnapshotsLimitReached)) __obj.updateDynamic("ManualSnapshotsLimitReached")(ManualSnapshotsLimitReached)
    __obj.asInstanceOf[SnapshotLimits]
  }
}

