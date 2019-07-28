package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingMaintenanceAction extends js.Object {
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.undefined
  /**
    * The date of the maintenance window when the action will be applied. The maintenance action will be applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The effective date when the pending maintenance action will be applied to the resource. This date takes into account opt-in requests received from the ApplyPendingMaintenanceAction API, the AutoAppliedAfterDate, and the ForcedApplyDate. This value is blank if an opt-in request has not been received and nothing has been specified as AutoAppliedAfterDate or ForcedApplyDate.
    */
  var CurrentApplyDate: js.UndefOr[TStamp] = js.undefined
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The date when the maintenance action will be automatically applied. The maintenance action will be applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[TStamp] = js.undefined
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.undefined
}

object PendingMaintenanceAction {
  @scala.inline
  def apply(
    Action: String = null,
    AutoAppliedAfterDate: TStamp = null,
    CurrentApplyDate: TStamp = null,
    Description: String = null,
    ForcedApplyDate: TStamp = null,
    OptInStatus: String = null
  ): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action)
    if (AutoAppliedAfterDate != null) __obj.updateDynamic("AutoAppliedAfterDate")(AutoAppliedAfterDate)
    if (CurrentApplyDate != null) __obj.updateDynamic("CurrentApplyDate")(CurrentApplyDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ForcedApplyDate != null) __obj.updateDynamic("ForcedApplyDate")(ForcedApplyDate)
    if (OptInStatus != null) __obj.updateDynamic("OptInStatus")(OptInStatus)
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
}

