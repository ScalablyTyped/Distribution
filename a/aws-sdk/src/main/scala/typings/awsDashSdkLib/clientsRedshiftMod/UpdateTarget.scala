package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTarget extends js.Object {
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined
}

object UpdateTarget {
  @scala.inline
  def apply(
    DatabaseVersion: String = null,
    MaintenanceTrackName: String = null,
    SupportedOperations: SupportedOperationList = null
  ): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    if (DatabaseVersion != null) __obj.updateDynamic("DatabaseVersion")(DatabaseVersion)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (SupportedOperations != null) __obj.updateDynamic("SupportedOperations")(SupportedOperations)
    __obj.asInstanceOf[UpdateTarget]
  }
}

