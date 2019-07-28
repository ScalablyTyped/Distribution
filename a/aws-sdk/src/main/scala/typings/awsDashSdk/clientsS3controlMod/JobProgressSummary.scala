package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobProgressSummary extends js.Object {
  /**
    * 
    */
  var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined
  /**
    * 
    */
  var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined
  /**
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
}

object JobProgressSummary {
  @scala.inline
  def apply(
    NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined,
    NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined,
    TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
  ): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NumberOfTasksFailed)) __obj.updateDynamic("NumberOfTasksFailed")(NumberOfTasksFailed)
    if (!js.isUndefined(NumberOfTasksSucceeded)) __obj.updateDynamic("NumberOfTasksSucceeded")(NumberOfTasksSucceeded)
    if (!js.isUndefined(TotalNumberOfTasks)) __obj.updateDynamic("TotalNumberOfTasks")(TotalNumberOfTasks)
    __obj.asInstanceOf[JobProgressSummary]
  }
}

