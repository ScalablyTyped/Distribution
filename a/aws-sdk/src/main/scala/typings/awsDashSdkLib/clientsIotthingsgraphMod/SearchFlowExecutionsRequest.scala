package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFlowExecutionsRequest extends js.Object {
  /**
    * The date and time of the latest flow execution to return.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of a flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The date and time of the earliest flow execution to return.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: Urn
}

object SearchFlowExecutionsRequest {
  @scala.inline
  def apply(
    systemInstanceId: Urn,
    endTime: Timestamp = null,
    flowExecutionId: FlowExecutionId = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    startTime: Timestamp = null
  ): SearchFlowExecutionsRequest = {
    val __obj = js.Dynamic.literal(systemInstanceId = systemInstanceId)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (flowExecutionId != null) __obj.updateDynamic("flowExecutionId")(flowExecutionId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[SearchFlowExecutionsRequest]
  }
}

