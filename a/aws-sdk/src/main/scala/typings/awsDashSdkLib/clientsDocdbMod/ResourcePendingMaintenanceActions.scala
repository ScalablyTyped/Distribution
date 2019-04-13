package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcePendingMaintenanceActions extends js.Object {
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.undefined
}

object ResourcePendingMaintenanceActions {
  @scala.inline
  def apply(
    PendingMaintenanceActionDetails: PendingMaintenanceActionDetails = null,
    ResourceIdentifier: String = null
  ): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    if (PendingMaintenanceActionDetails != null) __obj.updateDynamic("PendingMaintenanceActionDetails")(PendingMaintenanceActionDetails)
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier)
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
}

