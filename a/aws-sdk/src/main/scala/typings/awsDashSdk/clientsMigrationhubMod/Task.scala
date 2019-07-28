package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ProgressPercent] = js.undefined
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typings.awsDashSdk.clientsMigrationhubMod.Status
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.StatusDetail] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    Status: Status,
    ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
    StatusDetail: StatusDetail = null
  ): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgressPercent)) __obj.updateDynamic("ProgressPercent")(ProgressPercent)
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail)
    __obj.asInstanceOf[Task]
  }
}

