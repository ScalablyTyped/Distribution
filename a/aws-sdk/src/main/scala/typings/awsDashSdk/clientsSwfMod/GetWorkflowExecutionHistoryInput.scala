package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowExecutionHistoryInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName
  /**
    * Specifies the workflow execution for which to return the history.
    */
  var execution: WorkflowExecution
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimeStamp of the events.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}

object GetWorkflowExecutionHistoryInput {
  @scala.inline
  def apply(
    domain: DomainName,
    execution: WorkflowExecution,
    maximumPageSize: Int | Double = null,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[Boolean] = js.undefined
  ): GetWorkflowExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(domain = domain, execution = execution)
    if (maximumPageSize != null) __obj.updateDynamic("maximumPageSize")(maximumPageSize.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.asInstanceOf[GetWorkflowExecutionHistoryInput]
  }
}

