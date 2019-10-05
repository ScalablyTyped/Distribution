package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionInfo extends js.Object {
  /**
    * Set to true if a cancellation is requested for this workflow execution.
    */
  var cancelRequested: js.UndefOr[Canceled] = js.undefined
  /**
    * If the execution status is closed then this specifies how the execution was closed:    COMPLETED – the execution was successfully completed.    CANCELED – the execution was canceled.Cancellation allows the implementation to gracefully clean up before the execution is closed.    TERMINATED – the execution was force terminated.    FAILED – the execution failed to complete.    TIMED_OUT – the execution did not complete in the alloted time and was automatically timed out.    CONTINUED_AS_NEW – the execution is logically continued. This means the current execution was completed and a new execution was started to carry on the workflow.  
    */
  var closeStatus: js.UndefOr[CloseStatus] = js.undefined
  /**
    * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
    */
  var closeTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The workflow execution this information is about.
    */
  var execution: WorkflowExecution
  /**
    * The current status of the execution.
    */
  var executionStatus: ExecutionStatus
  /**
    * If this workflow execution is a child of another execution then contains the workflow execution that started this execution.
    */
  var parent: js.UndefOr[WorkflowExecution] = js.undefined
  /**
    * The time when the execution was started.
    */
  var startTimestamp: Timestamp
  /**
    * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.undefined
  /**
    * The type of the workflow execution.
    */
  var workflowType: WorkflowType
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
    val __obj = js.Dynamic.literal(execution = execution, executionStatus = executionStatus.asInstanceOf[js.Any], startTimestamp = startTimestamp, workflowType = workflowType)
    if (!js.isUndefined(cancelRequested)) __obj.updateDynamic("cancelRequested")(cancelRequested)
    if (closeStatus != null) __obj.updateDynamic("closeStatus")(closeStatus.asInstanceOf[js.Any])
    if (closeTimestamp != null) __obj.updateDynamic("closeTimestamp")(closeTimestamp)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (tagList != null) __obj.updateDynamic("tagList")(tagList)
    __obj.asInstanceOf[WorkflowExecutionInfo]
  }
}

