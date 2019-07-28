package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountOpenWorkflowExecutionsInput extends js.Object {
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
  /**
    * Specifies the start time criteria that workflow executions must meet in order to be counted.
    */
  var startTimeFilter: ExecutionTimeFilter
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.undefined
  /**
    * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
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
    val __obj = js.Dynamic.literal(domain = domain, startTimeFilter = startTimeFilter)
    if (executionFilter != null) __obj.updateDynamic("executionFilter")(executionFilter)
    if (tagFilter != null) __obj.updateDynamic("tagFilter")(tagFilter)
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(typeFilter)
    __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
  }
}

