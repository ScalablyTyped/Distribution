package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingMaintenanceAction extends js.Object {
  /**
    * The type of pending database maintenance action.
    */
  var action: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The effective date of the pending database maintenance action.
    */
  var currentApplyDate: js.UndefOr[IsoDate] = js.undefined
  /**
    * Additional detail about the pending database maintenance action.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
}

object PendingMaintenanceAction {
  @scala.inline
  def apply(
    action: NonEmptyString = null,
    currentApplyDate: IsoDate = null,
    description: NonEmptyString = null
  ): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (currentApplyDate != null) __obj.updateDynamic("currentApplyDate")(currentApplyDate)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
}

