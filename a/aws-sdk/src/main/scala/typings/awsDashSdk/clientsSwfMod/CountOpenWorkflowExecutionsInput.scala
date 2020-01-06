package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountOpenWorkflowExecutionsInput extends js.Object {
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName = js.native
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  /**
    * Specifies the start time criteria that workflow executions must meet in order to be counted.
    */
  var startTimeFilter: ExecutionTimeFilter = js.native
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  /**
    * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}

object CountOpenWorkflowExecutionsInput {
  @scala.inline
  def apply(
    domain: DomainName,
    startTimeFilter: ExecutionTimeFilter,
    executionFilter: WorkflowExecutionFilter = null,
    tagFilter: TagFilter = null,
    typeFilter: WorkflowTypeFilter = null
  ): CountOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], startTimeFilter = startTimeFilter.asInstanceOf[js.Any])
    if (executionFilter != null) __obj.updateDynamic("executionFilter")(executionFilter.asInstanceOf[js.Any])
    if (tagFilter != null) __obj.updateDynamic("tagFilter")(tagFilter.asInstanceOf[js.Any])
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(typeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
  }
}

