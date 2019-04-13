package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepExecution extends js.Object {
  /**
    * The action this step performs. The action determines the behavior of the step.
    */
  var Action: js.UndefOr[AutomationActionName] = js.undefined
  /**
    * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded, this field is not populated.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this field is not populated.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Information about the Automation failure.
    */
  var FailureDetails: js.UndefOr[FailureDetails] = js.undefined
  /**
    * If a step failed, this message explains why the execution failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  /**
    * Fully-resolved values passed into the step before execution.
    */
  var Inputs: js.UndefOr[NormalStringMap] = js.undefined
  /**
    * The flag which can be used to help decide whether the failure of current step leads to the Automation failure.
    */
  var IsCritical: js.UndefOr[Boolean] = js.undefined
  /**
    * The flag which can be used to end automation no matter whether the step succeeds or fails.
    */
  var IsEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of tries to run the action of the step. The default value is 1.
    */
  var MaxAttempts: js.UndefOr[Integer] = js.undefined
  /**
    * The next step after the step succeeds.
    */
  var NextStep: js.UndefOr[String] = js.undefined
  /**
    * The action to take if the step fails. The default value is Abort.
    */
  var OnFailure: js.UndefOr[String] = js.undefined
  /**
    * Returned values from the execution of the step.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * A user-specified list of parameters to override when running a step.
    */
  var OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * A message associated with the response code for an execution.
    */
  var Response: js.UndefOr[String] = js.undefined
  /**
    * The response code returned by the execution of the step.
    */
  var ResponseCode: js.UndefOr[String] = js.undefined
  /**
    * The unique ID of a step execution.
    */
  var StepExecutionId: js.UndefOr[String] = js.undefined
  /**
    * The name of this execution step.
    */
  var StepName: js.UndefOr[String] = js.undefined
  /**
    * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and TimedOut.
    */
  var StepStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined
  /**
    * The combination of AWS Regions and accounts targeted by the current Automation execution.
    */
  var TargetLocation: js.UndefOr[TargetLocation] = js.undefined
  /**
    * The targets for the step execution.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The timeout seconds of the step.
    */
  var TimeoutSeconds: js.UndefOr[Long] = js.undefined
  /**
    * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to run the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
    */
  var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined
}

object StepExecution {
  @scala.inline
  def apply(
    Action: AutomationActionName = null,
    ExecutionEndTime: DateTime = null,
    ExecutionStartTime: DateTime = null,
    FailureDetails: FailureDetails = null,
    FailureMessage: String = null,
    Inputs: NormalStringMap = null,
    IsCritical: js.UndefOr[Boolean] = js.undefined,
    IsEnd: js.UndefOr[Boolean] = js.undefined,
    MaxAttempts: js.UndefOr[Integer] = js.undefined,
    NextStep: String = null,
    OnFailure: String = null,
    Outputs: AutomationParameterMap = null,
    OverriddenParameters: AutomationParameterMap = null,
    Response: String = null,
    ResponseCode: String = null,
    StepExecutionId: String = null,
    StepName: String = null,
    StepStatus: AutomationExecutionStatus = null,
    TargetLocation: TargetLocation = null,
    Targets: Targets = null,
    TimeoutSeconds: js.UndefOr[Long] = js.undefined,
    ValidNextSteps: ValidNextStepList = null
  ): StepExecution = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action)
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime)
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime)
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs)
    if (!js.isUndefined(IsCritical)) __obj.updateDynamic("IsCritical")(IsCritical)
    if (!js.isUndefined(IsEnd)) __obj.updateDynamic("IsEnd")(IsEnd)
    if (!js.isUndefined(MaxAttempts)) __obj.updateDynamic("MaxAttempts")(MaxAttempts)
    if (NextStep != null) __obj.updateDynamic("NextStep")(NextStep)
    if (OnFailure != null) __obj.updateDynamic("OnFailure")(OnFailure)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    if (OverriddenParameters != null) __obj.updateDynamic("OverriddenParameters")(OverriddenParameters)
    if (Response != null) __obj.updateDynamic("Response")(Response)
    if (ResponseCode != null) __obj.updateDynamic("ResponseCode")(ResponseCode)
    if (StepExecutionId != null) __obj.updateDynamic("StepExecutionId")(StepExecutionId)
    if (StepName != null) __obj.updateDynamic("StepName")(StepName)
    if (StepStatus != null) __obj.updateDynamic("StepStatus")(StepStatus.asInstanceOf[js.Any])
    if (TargetLocation != null) __obj.updateDynamic("TargetLocation")(TargetLocation)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (!js.isUndefined(TimeoutSeconds)) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds)
    if (ValidNextSteps != null) __obj.updateDynamic("ValidNextSteps")(ValidNextSteps)
    __obj.asInstanceOf[StepExecution]
  }
}

