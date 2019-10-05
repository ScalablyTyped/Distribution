package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksRequest extends js.Object {
  /**
    * The maximum number of tasks to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.MaxResults] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.undefined
}

object ListTasksRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTasksRequest]
  }
}

