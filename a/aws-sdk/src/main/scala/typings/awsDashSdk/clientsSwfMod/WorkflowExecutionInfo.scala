package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionInfo extends js.Object {
  /**
    * Set to true if a cancellation is requested for this workflow execution.
    */
  var cancelRequested: js.UndefOr[Canceled] = js.native
  /**
    * If the execution status is closed then this specifies how the execution was closed:    COMPLETED – the execution was successfully completed.    CANCELED – the execution was canceled.Cancellation allows the implementation to gracefully clean up before the execution is closed.    TERMINATED – the execution was force terminated.    FAILED – the execution failed to complete.    TIMED_OUT – the execution did not complete in the alloted time and was automatically timed out.    CONTINUED_AS_NEW – the execution is logically continued. This means the current execution was completed and a new execution was started to carry on the workflow.  
    */
  var closeStatus: js.UndefOr[CloseStatus] = js.native
  /**
    * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
    */
  var closeTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The workflow execution this information is about.
    */
  var execution: WorkflowExecution = js.native
  /**
    * The current status of the execution.
    */
  var executionStatus: ExecutionStatus = js.native
  /**
    * If this workflow execution is a child of another execution then contains the workflow execution that started this execution.
    */
  var parent: js.UndefOr[WorkflowExecution] = js.native
  /**
    * The time when the execution was started.
    */
  var startTimestamp: Timestamp = js.native
  /**
    * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The type of the workflow execution.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowExecutionInfo {
  @scala.inline
  def apply(
    execution: WorkflowExecution,
    executionStatus: ExecutionStatus,
    startTimestamp: Timestamp,
    workflowType: WorkflowType,
    cancelRequested: js.UndefOr[Boolean] = js.undefined,
    closeStatus: CloseStatus = null,
    closeTimestamp: Timestamp = null,
    parent: WorkflowExecution = null,
    tagList: TagList = null
  ): WorkflowExecutionInfo = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], executionStatus = executionStatus.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelRequested)) __obj.updateDynamic("cancelRequested")(cancelRequested.asInstanceOf[js.Any])
    if (closeStatus != null) __obj.updateDynamic("closeStatus")(closeStatus.asInstanceOf[js.Any])
    if (closeTimestamp != null) __obj.updateDynamic("closeTimestamp")(closeTimestamp.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tagList != null) __obj.updateDynamic("tagList")(tagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfo]
  }
}

