package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePendingMaintenanceActionsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The pending maintenance action.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsDashSdk.clientsDmsMod.PendingMaintenanceActions] = js.undefined
}

object DescribePendingMaintenanceActionsResponse {
  @scala.inline
  def apply(Marker: String = null, PendingMaintenanceActions: PendingMaintenanceActions = null): DescribePendingMaintenanceActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PendingMaintenanceActions != null) __obj.updateDynamic("PendingMaintenanceActions")(PendingMaintenanceActions)
    __obj.asInstanceOf[DescribePendingMaintenanceActionsResponse]
  }
}

