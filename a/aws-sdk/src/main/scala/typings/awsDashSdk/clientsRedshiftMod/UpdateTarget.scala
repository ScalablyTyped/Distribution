package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTarget extends js.Object {
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.native
}

object UpdateTarget {
  @scala.inline
  def apply(
    DatabaseVersion: String = null,
    MaintenanceTrackName: String = null,
    SupportedOperations: SupportedOperationList = null
  ): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    if (DatabaseVersion != null) __obj.updateDynamic("DatabaseVersion")(DatabaseVersion.asInstanceOf[js.Any])
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName.asInstanceOf[js.Any])
    if (SupportedOperations != null) __obj.updateDynamic("SupportedOperations")(SupportedOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTarget]
  }
}

