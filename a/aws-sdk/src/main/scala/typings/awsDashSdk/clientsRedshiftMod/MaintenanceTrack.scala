package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceTrack extends js.Object {
  /**
    * The version number for the cluster release.
    */
  var DatabaseVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the maintenance track. Possible values are current and trailing.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  /**
    * An array of UpdateTarget objects to update with the maintenance track. 
    */
  var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined
}

object MaintenanceTrack {
  @scala.inline
  def apply(
    DatabaseVersion: String = null,
    MaintenanceTrackName: String = null,
    UpdateTargets: EligibleTracksToUpdateList = null
  ): MaintenanceTrack = {
    val __obj = js.Dynamic.literal()
    if (DatabaseVersion != null) __obj.updateDynamic("DatabaseVersion")(DatabaseVersion)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (UpdateTargets != null) __obj.updateDynamic("UpdateTargets")(UpdateTargets)
    __obj.asInstanceOf[MaintenanceTrack]
  }
}

