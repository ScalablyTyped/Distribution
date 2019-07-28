package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountClosedWorkflowExecutionsInput extends js.Object {
  /**
    * If specified, only workflow executions that match this close status are counted. This filter has an affect only if executionStatus is specified as CLOSED.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined
  /**
    * If specified, only workflow executions that meet the close time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
  /**
    * If specified, only workflow executions that meet the start time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.undefined
  /**
    * If specified, indicates the type of the workflow executions to be counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
}

object CountClosedWorkflowExecutionsInput {
  @scala.inline
  def apply(
    domain: DomainName,
    closeStatusFilter: CloseStatusFilter = null,
    closeTimeFilter: ExecutionTimeFilter = null,
    executionFilter: WorkflowExecutionFilter = null,
    startTimeFilter: ExecutionTimeFilter = null,
    tagFilter: TagFilter = null,
    typeFilter: WorkflowTypeFilter = null
  ): CountClosedWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (closeStatusFilter != null) __obj.updateDynamic("closeStatusFilter")(closeStatusFilter)
    if (closeTimeFilter != null) __obj.updateDynamic("closeTimeFilter")(closeTimeFilter)
    if (executionFilter != null) __obj.updateDynamic("executionFilter")(executionFilter)
    if (startTimeFilter != null) __obj.updateDynamic("startTimeFilter")(startTimeFilter)
    if (tagFilter != null) __obj.updateDynamic("tagFilter")(tagFilter)
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(typeFilter)
    __obj.asInstanceOf[CountClosedWorkflowExecutionsInput]
  }
}

