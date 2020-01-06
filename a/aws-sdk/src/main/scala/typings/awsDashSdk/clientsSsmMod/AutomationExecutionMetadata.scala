package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationExecutionMetadata extends js.Object {
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecutionId] = js.native
  /**
    * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecutionStatus] = js.native
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationType] = js.native
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.native
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.native
  /**
    * The name of the Automation document used during execution.
    */
  var DocumentName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentName] = js.native
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * The IAM role ARN of the user who ran the Automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.native
  /**
    * The time the execution finished. This is not populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.native
  /**
    * The time the execution started.&gt;
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * An Amazon S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.native
  /**
    * The MaxConcurrency value specified by the user when starting the Automation.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.native
  /**
    * The MaxErrors value specified by the user when starting the Automation.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.native
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The ExecutionId of the parent Automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.native
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ResolvedTargets] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Target: js.UndefOr[String] = js.native
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetMaps] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  /**
    * The targets defined by the user when starting the Automation.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.native
}

object AutomationExecutionMetadata {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId = null,
    AutomationExecutionStatus: AutomationExecutionStatus = null,
    AutomationType: AutomationType = null,
    CurrentAction: String = null,
    CurrentStepName: String = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ExecutedBy: String = null,
    ExecutionEndTime: DateTime = null,
    ExecutionStartTime: DateTime = null,
    FailureMessage: String = null,
    LogFile: String = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Mode: ExecutionMode = null,
    Outputs: AutomationParameterMap = null,
    ParentAutomationExecutionId: AutomationExecutionId = null,
    ResolvedTargets: ResolvedTargets = null,
    Target: String = null,
    TargetMaps: TargetMaps = null,
    TargetParameterName: AutomationParameterKey = null,
    Targets: Targets = null
  ): AutomationExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId.asInstanceOf[js.Any])
    if (AutomationExecutionStatus != null) __obj.updateDynamic("AutomationExecutionStatus")(AutomationExecutionStatus.asInstanceOf[js.Any])
    if (AutomationType != null) __obj.updateDynamic("AutomationType")(AutomationType.asInstanceOf[js.Any])
    if (CurrentAction != null) __obj.updateDynamic("CurrentAction")(CurrentAction.asInstanceOf[js.Any])
    if (CurrentStepName != null) __obj.updateDynamic("CurrentStepName")(CurrentStepName.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (ExecutedBy != null) __obj.updateDynamic("ExecutedBy")(ExecutedBy.asInstanceOf[js.Any])
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime.asInstanceOf[js.Any])
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    if (LogFile != null) __obj.updateDynamic("LogFile")(LogFile.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (ParentAutomationExecutionId != null) __obj.updateDynamic("ParentAutomationExecutionId")(ParentAutomationExecutionId.asInstanceOf[js.Any])
    if (ResolvedTargets != null) __obj.updateDynamic("ResolvedTargets")(ResolvedTargets.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    if (TargetMaps != null) __obj.updateDynamic("TargetMaps")(TargetMaps.asInstanceOf[js.Any])
    if (TargetParameterName != null) __obj.updateDynamic("TargetParameterName")(TargetParameterName.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
}

