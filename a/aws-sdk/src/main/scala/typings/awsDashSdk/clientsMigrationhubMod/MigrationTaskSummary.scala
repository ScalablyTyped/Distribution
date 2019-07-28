package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationTaskSummary extends js.Object {
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName] = js.undefined
  /**
    * 
    */
  var ProgressPercent: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ProgressPercent] = js.undefined
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream] = js.undefined
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.Status] = js.undefined
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.StatusDetail] = js.undefined
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.UpdateDateTime] = js.undefined
}

object MigrationTaskSummary {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName = null,
    ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
    ProgressUpdateStream: ProgressUpdateStream = null,
    Status: Status = null,
    StatusDetail: StatusDetail = null,
    UpdateDateTime: UpdateDateTime = null
  ): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    if (MigrationTaskName != null) __obj.updateDynamic("MigrationTaskName")(MigrationTaskName)
    if (!js.isUndefined(ProgressPercent)) __obj.updateDynamic("ProgressPercent")(ProgressPercent)
    if (ProgressUpdateStream != null) __obj.updateDynamic("ProgressUpdateStream")(ProgressUpdateStream)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail)
    if (UpdateDateTime != null) __obj.updateDynamic("UpdateDateTime")(UpdateDateTime)
    __obj.asInstanceOf[MigrationTaskSummary]
  }
}

