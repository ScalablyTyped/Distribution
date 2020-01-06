package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountClosedWorkflowExecutionsInput extends js.Object {
  /**
    * If specified, only workflow executions that match this close status are counted. This filter has an affect only if executionStatus is specified as CLOSED.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.native
  /**
    * If specified, only workflow executions that meet the close time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName = js.native
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  /**
    * If specified, only workflow executions that meet the start time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  /**
    * If specified, indicates the type of the workflow executions to be counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
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
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (closeStatusFilter != null) __obj.updateDynamic("closeStatusFilter")(closeStatusFilter.asInstanceOf[js.Any])
    if (closeTimeFilter != null) __obj.updateDynamic("closeTimeFilter")(closeTimeFilter.asInstanceOf[js.Any])
    if (executionFilter != null) __obj.updateDynamic("executionFilter")(executionFilter.asInstanceOf[js.Any])
    if (startTimeFilter != null) __obj.updateDynamic("startTimeFilter")(startTimeFilter.asInstanceOf[js.Any])
    if (tagFilter != null) __obj.updateDynamic("tagFilter")(tagFilter.asInstanceOf[js.Any])
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(typeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountClosedWorkflowExecutionsInput]
  }
}

