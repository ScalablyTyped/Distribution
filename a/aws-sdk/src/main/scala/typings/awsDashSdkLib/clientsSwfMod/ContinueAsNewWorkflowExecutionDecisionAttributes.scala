package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * If set, specifies the policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
    */
  var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
  /**
    * If set, specifies the total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  An execution start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this field. If neither this field is set nor a default execution start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  /**
    * The input provided to the new workflow execution.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The IAM role to attach to the new (continued) execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.undefined
  /**
    * The list of tags to associate with the new workflow execution. A maximum of 5 tags can be specified. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
    */
  var tagList: js.UndefOr[TagList] = js.undefined
  /**
    * The task list to use for the decisions of the new (continued) workflow execution.
    */
  var taskList: js.UndefOr[TaskList] = js.undefined
  /**
    *  The task priority that, if set, specifies the priority for the decision tasks for this workflow execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  /**
    * Specifies the maximum duration of decision tasks for the new workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for the new workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  /**
    * The version of the workflow to start.
    */
  var workflowTypeVersion: js.UndefOr[Version] = js.undefined
}

object ContinueAsNewWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy = null,
    executionStartToCloseTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    lambdaRole: Arn = null,
    tagList: TagList = null,
    taskList: TaskList = null,
    taskPriority: TaskPriority = null,
    taskStartToCloseTimeout: DurationInSecondsOptional = null,
    workflowTypeVersion: Version = null
  ): ContinueAsNewWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (childPolicy != null) __obj.updateDynamic("childPolicy")(childPolicy.asInstanceOf[js.Any])
    if (executionStartToCloseTimeout != null) __obj.updateDynamic("executionStartToCloseTimeout")(executionStartToCloseTimeout)
    if (input != null) __obj.updateDynamic("input")(input)
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole)
    if (tagList != null) __obj.updateDynamic("tagList")(tagList)
    if (taskList != null) __obj.updateDynamic("taskList")(taskList)
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority)
    if (taskStartToCloseTimeout != null) __obj.updateDynamic("taskStartToCloseTimeout")(taskStartToCloseTimeout)
    if (workflowTypeVersion != null) __obj.updateDynamic("workflowTypeVersion")(workflowTypeVersion)
    __obj.asInstanceOf[ContinueAsNewWorkflowExecutionDecisionAttributes]
  }
}

