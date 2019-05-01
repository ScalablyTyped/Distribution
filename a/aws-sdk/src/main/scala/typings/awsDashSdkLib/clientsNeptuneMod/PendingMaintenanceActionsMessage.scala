package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingMaintenanceActionsMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
}

object PendingMaintenanceActionsMessage {
  @scala.inline
  def apply(Marker: String = null, PendingMaintenanceActions: PendingMaintenanceActions = null): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PendingMaintenanceActions != null) __obj.updateDynamic("PendingMaintenanceActions")(PendingMaintenanceActions)
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
}

