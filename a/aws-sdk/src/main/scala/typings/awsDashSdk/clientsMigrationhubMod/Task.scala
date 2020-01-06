package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ProgressPercent] = js.native
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typings.awsDashSdk.clientsMigrationhubMod.Status = js.native
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.StatusDetail] = js.native
}

object Task {
  @scala.inline
  def apply(Status: Status, ProgressPercent: Int | Double = null, StatusDetail: StatusDetail = null): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (ProgressPercent != null) __obj.updateDynamic("ProgressPercent")(ProgressPercent.asInstanceOf[js.Any])
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

