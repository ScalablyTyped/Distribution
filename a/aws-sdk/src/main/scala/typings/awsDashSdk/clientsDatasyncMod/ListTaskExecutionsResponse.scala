package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTaskExecutionsResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.undefined
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined
}

object ListTaskExecutionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TaskExecutions: TaskExecutionList = null): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TaskExecutions != null) __obj.updateDynamic("TaskExecutions")(TaskExecutions)
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
}

