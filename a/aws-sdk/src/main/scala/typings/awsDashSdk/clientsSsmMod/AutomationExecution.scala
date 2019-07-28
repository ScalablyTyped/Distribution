package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationExecution extends js.Object {
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecutionId] = js.undefined
  /**
    * The execution status of the Automation.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecutionStatus] = js.undefined
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.undefined
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.undefined
  /**
    * The name of the Automation document used during the execution.
    */
  var DocumentName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentName] = js.undefined
  /**
    * The version of the document to use during execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user who ran the automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.undefined
  /**
    * The time the execution finished.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * A message describing why an execution has failed, if the status is set to Failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  /**
    * The MaxConcurrency value specified by the user when the execution started.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The MaxErrors value specified by the user when the execution started.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  /**
    * The list of execution outputs as defined in the automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The AutomationExecutionId of the parent automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  /**
    * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
    */
  var ProgressCounters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ProgressCounters] = js.undefined
  /**
    * A list of resolved targets in the rate control execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ResolvedTargets] = js.undefined
  /**
    * A list of details about the current state of all steps that comprise an execution. An Automation document contains a list of steps that are run in order.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
  /**
    * A boolean value that indicates if the response contains the full list of the Automation step executions. If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
    */
  var StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * The target of the execution.
    */
  var Target: js.UndefOr[String] = js.undefined
  /**
    * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
    */
  var TargetLocations: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetLocations] = js.undefined
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetMaps] = js.undefined
  /**
    * The parameter name.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  /**
    * The specified targets.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object AutomationExecution {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId = null,
    AutomationExecutionStatus: AutomationExecutionStatus = null,
    CurrentAction: String = null,
    CurrentStepName: String = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ExecutedBy: String = null,
    ExecutionEndTime: DateTime = null,
    ExecutionStartTime: DateTime = null,
    FailureMessage: String = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Mode: ExecutionMode = null,
    Outputs: AutomationParameterMap = null,
    Parameters: AutomationParameterMap = null,
    ParentAutomationExecutionId: AutomationExecutionId = null,
    ProgressCounters: ProgressCounters = null,
    ResolvedTargets: ResolvedTargets = null,
    StepExecutions: StepExecutionList = null,
    StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined,
    Target: String = null,
    TargetLocations: TargetLocations = null,
    TargetMaps: TargetMaps = null,
    TargetParameterName: AutomationParameterKey = null,
    Targets: Targets = null
  ): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId)
    if (AutomationExecutionStatus != null) __obj.updateDynamic("AutomationExecutionStatus")(AutomationExecutionStatus.asInstanceOf[js.Any])
    if (CurrentAction != null) __obj.updateDynamic("CurrentAction")(CurrentAction)
    if (CurrentStepName != null) __obj.updateDynamic("CurrentStepName")(CurrentStepName)
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (ExecutedBy != null) __obj.updateDynamic("ExecutedBy")(ExecutedBy)
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime)
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ParentAutomationExecutionId != null) __obj.updateDynamic("ParentAutomationExecutionId")(ParentAutomationExecutionId)
    if (ProgressCounters != null) __obj.updateDynamic("ProgressCounters")(ProgressCounters)
    if (ResolvedTargets != null) __obj.updateDynamic("ResolvedTargets")(ResolvedTargets)
    if (StepExecutions != null) __obj.updateDynamic("StepExecutions")(StepExecutions)
    if (!js.isUndefined(StepExecutionsTruncated)) __obj.updateDynamic("StepExecutionsTruncated")(StepExecutionsTruncated)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    if (TargetLocations != null) __obj.updateDynamic("TargetLocations")(TargetLocations)
    if (TargetMaps != null) __obj.updateDynamic("TargetMaps")(TargetMaps)
    if (TargetParameterName != null) __obj.updateDynamic("TargetParameterName")(TargetParameterName)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[AutomationExecution]
  }
}

