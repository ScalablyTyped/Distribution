package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFlowExecutionMessagesRequest extends js.Object {
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: FlowExecutionId
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFlowExecutionMessagesRequest {
  @scala.inline
  def apply(flowExecutionId: FlowExecutionId, maxResults: Int | Double = null, nextToken: NextToken = null): ListFlowExecutionMessagesRequest = {
    val __obj = js.Dynamic.literal(flowExecutionId = flowExecutionId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListFlowExecutionMessagesRequest]
  }
}

