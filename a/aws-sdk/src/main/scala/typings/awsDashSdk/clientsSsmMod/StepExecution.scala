package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepExecution extends js.Object {
  /**
    * The action this step performs. The action determines the behavior of the step.
    */
  var Action: js.UndefOr[AutomationActionName] = js.native
  /**
    * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded, this field is not populated.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.native
  /**
    * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this field is not populated.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.native
  /**
    * Information about the Automation failure.
    */
  var FailureDetails: js.UndefOr[typings.awsDashSdk.clientsSsmMod.FailureDetails] = js.native
  /**
    * If a step failed, this message explains why the execution failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * Fully-resolved values passed into the step before execution.
    */
  var Inputs: js.UndefOr[NormalStringMap] = js.native
  /**
    * The flag which can be used to help decide whether the failure of current step leads to the Automation failure.
    */
  var IsCritical: js.UndefOr[Boolean] = js.native
  /**
    * The flag which can be used to end automation no matter whether the step succeeds or fails.
    */
  var IsEnd: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of tries to run the action of the step. The default value is 1.
    */
  var MaxAttempts: js.UndefOr[Integer] = js.native
  /**
    * The next step after the step succeeds.
    */
  var NextStep: js.UndefOr[String] = js.native
  /**
    * The action to take if the step fails. The default value is Abort.
    */
  var OnFailure: js.UndefOr[String] = js.native
  /**
    * Returned values from the execution of the step.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * A user-specified list of parameters to override when running a step.
    */
  var OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * A message associated with the response code for an execution.
    */
  var Response: js.UndefOr[String] = js.native
  /**
    * The response code returned by the execution of the step.
    */
  var ResponseCode: js.UndefOr[String] = js.native
  /**
    * The unique ID of a step execution.
    */
  var StepExecutionId: js.UndefOr[String] = js.native
  /**
    * The name of this execution step.
    */
  var StepName: js.UndefOr[String] = js.native
  /**
    * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and TimedOut.
    */
  var StepStatus: js.UndefOr[AutomationExecutionStatus] = js.native
  /**
    * The combination of AWS Regions and accounts targeted by the current Automation execution.
    */
  var TargetLocation: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetLocation] = js.native
  /**
    * The targets for the step execution.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.native
  /**
    * The timeout seconds of the step.
    */
  var TimeoutSeconds: js.UndefOr[Long] = js.native
  /**
    * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to run the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
    */
  var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.native
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
    IsCritical: js.UndefOr[scala.Boolean] = js.undefined,
    IsEnd: js.UndefOr[scala.Boolean] = js.undefined,
    MaxAttempts: Int | Double = null,
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
    TimeoutSeconds: Int | Double = null,
    ValidNextSteps: ValidNextStepList = null
  ): StepExecution = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime.asInstanceOf[js.Any])
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime.asInstanceOf[js.Any])
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(IsCritical)) __obj.updateDynamic("IsCritical")(IsCritical.asInstanceOf[js.Any])
    if (!js.isUndefined(IsEnd)) __obj.updateDynamic("IsEnd")(IsEnd.asInstanceOf[js.Any])
    if (MaxAttempts != null) __obj.updateDynamic("MaxAttempts")(MaxAttempts.asInstanceOf[js.Any])
    if (NextStep != null) __obj.updateDynamic("NextStep")(NextStep.asInstanceOf[js.Any])
    if (OnFailure != null) __obj.updateDynamic("OnFailure")(OnFailure.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (OverriddenParameters != null) __obj.updateDynamic("OverriddenParameters")(OverriddenParameters.asInstanceOf[js.Any])
    if (Response != null) __obj.updateDynamic("Response")(Response.asInstanceOf[js.Any])
    if (ResponseCode != null) __obj.updateDynamic("ResponseCode")(ResponseCode.asInstanceOf[js.Any])
    if (StepExecutionId != null) __obj.updateDynamic("StepExecutionId")(StepExecutionId.asInstanceOf[js.Any])
    if (StepName != null) __obj.updateDynamic("StepName")(StepName.asInstanceOf[js.Any])
    if (StepStatus != null) __obj.updateDynamic("StepStatus")(StepStatus.asInstanceOf[js.Any])
    if (TargetLocation != null) __obj.updateDynamic("TargetLocation")(TargetLocation.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (TimeoutSeconds != null) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds.asInstanceOf[js.Any])
    if (ValidNextSteps != null) __obj.updateDynamic("ValidNextSteps")(ValidNextSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecution]
  }
}

