package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionInfos extends js.Object {
  /**
    * The list of workflow information structures.
    */
  var executionInfos: WorkflowExecutionInfoList = js.native
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
}

object WorkflowExecutionInfos {
  @scala.inline
  def apply(executionInfos: WorkflowExecutionInfoList, nextPageToken: PageToken = null): WorkflowExecutionInfos = {
    val __obj = js.Dynamic.literal(executionInfos = executionInfos.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfos]
  }
}

