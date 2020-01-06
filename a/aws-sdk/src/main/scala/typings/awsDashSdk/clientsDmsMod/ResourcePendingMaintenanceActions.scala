package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePendingMaintenanceActions extends js.Object {
  /**
    * Detailed information about the pending maintenance action.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsDashSdk.clientsDmsMod.PendingMaintenanceActionDetails] = js.native
  /**
    * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN) for AWS DMS in the DMS documentation.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
}

object ResourcePendingMaintenanceActions {
  @scala.inline
  def apply(
    PendingMaintenanceActionDetails: PendingMaintenanceActionDetails = null,
    ResourceIdentifier: String = null
  ): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    if (PendingMaintenanceActionDetails != null) __obj.updateDynamic("PendingMaintenanceActionDetails")(PendingMaintenanceActionDetails.asInstanceOf[js.Any])
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
}

