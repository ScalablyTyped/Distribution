package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyApplicationStateRequest extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsDashSdk.clientsMigrationhubMod.ApplicationId = js.native
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DryRun] = js.native
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var Status: ApplicationStatus = js.native
  /**
    * The timestamp when the application state changed.
    */
  var UpdateDateTime: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.UpdateDateTime] = js.native
}

object NotifyApplicationStateRequest {
  @scala.inline
  def apply(
    ApplicationId: ApplicationId,
    Status: ApplicationStatus,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    UpdateDateTime: UpdateDateTime = null
  ): NotifyApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (UpdateDateTime != null) __obj.updateDynamic("UpdateDateTime")(UpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyApplicationStateRequest]
  }
}

