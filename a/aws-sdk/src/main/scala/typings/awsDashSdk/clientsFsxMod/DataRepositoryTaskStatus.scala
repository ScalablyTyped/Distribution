package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskStatus extends js.Object {
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FailedCount] = js.native
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsDashSdk.clientsFsxMod.LastUpdatedTime] = js.native
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typings.awsDashSdk.clientsFsxMod.SucceededCount] = js.native
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsFsxMod.TotalCount] = js.native
}

object DataRepositoryTaskStatus {
  @scala.inline
  def apply(
    FailedCount: Int | Double = null,
    LastUpdatedTime: LastUpdatedTime = null,
    SucceededCount: Int | Double = null,
    TotalCount: Int | Double = null
  ): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    if (FailedCount != null) __obj.updateDynamic("FailedCount")(FailedCount.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (SucceededCount != null) __obj.updateDynamic("SucceededCount")(SucceededCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
}

