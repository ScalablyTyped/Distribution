package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotRequest extends js.Object {
  /**
    * The date of the automatic snapshot to copy for the new manual snapshot. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.    Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  /**
    * The AWS Region where the source manual or automatic snapshot is located.
    */
  var sourceRegion: RegionName
  /**
    * The name of the source resource from which the automatic snapshot was created.  Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var sourceResourceName: js.UndefOr[String] = js.undefined
  /**
    * The name of the source instance or disk snapshot to be copied.  Define this parameter only when copying a manual snapshot as another manual snapshot. 
    */
  var sourceSnapshotName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the new instance or disk snapshot to be created as a copy.
    */
  var targetSnapshotName: ResourceName
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.  Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
}

object CopySnapshotRequest {
  @scala.inline
  def apply(
    sourceRegion: RegionName,
    targetSnapshotName: ResourceName,
    restoreDate: String = null,
    sourceResourceName: String = null,
    sourceSnapshotName: ResourceName = null,
    useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  ): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], targetSnapshotName = targetSnapshotName)
    if (restoreDate != null) __obj.updateDynamic("restoreDate")(restoreDate)
    if (sourceResourceName != null) __obj.updateDynamic("sourceResourceName")(sourceResourceName)
    if (sourceSnapshotName != null) __obj.updateDynamic("sourceSnapshotName")(sourceSnapshotName)
    if (!js.isUndefined(useLatestRestorableAutoSnapshot)) __obj.updateDynamic("useLatestRestorableAutoSnapshot")(useLatestRestorableAutoSnapshot)
    __obj.asInstanceOf[CopySnapshotRequest]
  }
}

