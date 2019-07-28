package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOpenWorkflowExecutionsInput extends js.Object {
  /**
    * The name of the domain that contains the workflow executions to list.
    */
  var domain: DomainName
  /**
    * If specified, only workflow executions matching the workflow ID specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * When set to true, returns the results in reverse order. By default the results are returned in descending order of the start time of the executions.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  /**
    * Workflow executions are included in the returned results based on whether their start times are within the range specified by this filter.
    */
  var startTimeFilter: ExecutionTimeFilter
  /**
    * If specified, only executions that have the matching tag are listed.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.undefined
  /**
    * If specified, only executions of the type specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
}

object ListOpenWorkflowExecutionsInput {
  @scala.inline
  def apply(
    domain: DomainName,
    startTimeFilter: ExecutionTimeFilter,
    executionFilter: WorkflowExecutionFilter = null,
    maximumPageSize: js.UndefOr[PageSize] = js.undefined,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
    tagFilter: TagFilter = null,
    typeFilter: WorkflowTypeFilter = null
  ): ListOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain, startTimeFilter = startTimeFilter)
    if (executionFilter != null) __obj.updateDynamic("executionFilter")(executionFilter)
    if (!js.isUndefined(maximumPageSize)) __obj.updateDynamic("maximumPageSize")(maximumPageSize)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    if (tagFilter != null) __obj.updateDynamic("tagFilter")(tagFilter)
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(typeFilter)
    __obj.asInstanceOf[ListOpenWorkflowExecutionsInput]
  }
}

