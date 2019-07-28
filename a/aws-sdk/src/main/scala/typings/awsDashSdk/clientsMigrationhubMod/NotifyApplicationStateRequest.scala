package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyApplicationStateRequest extends js.Object {
  /**
    * The configurationId in ADS that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsDashSdk.clientsMigrationhubMod.ApplicationId
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DryRun] = js.undefined
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var Status: ApplicationStatus
}

object NotifyApplicationStateRequest {
  @scala.inline
  def apply(ApplicationId: ApplicationId, Status: ApplicationStatus, DryRun: js.UndefOr[DryRun] = js.undefined): NotifyApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, Status = Status.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[NotifyApplicationStateRequest]
  }
}

