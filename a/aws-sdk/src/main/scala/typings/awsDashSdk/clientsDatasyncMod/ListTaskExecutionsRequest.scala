package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTaskExecutionsRequest extends js.Object {
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.MaxResults] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskArn] = js.undefined
}

object ListTaskExecutionsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    TaskArn: TaskArn = null
  ): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
}

