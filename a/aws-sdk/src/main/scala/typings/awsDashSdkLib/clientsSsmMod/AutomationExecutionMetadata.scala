package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationExecutionMetadata extends js.Object {
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  /**
    * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
    */
  var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[AutomationType] = js.undefined
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.undefined
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.undefined
  /**
    * The name of the Automation document used during execution.
    */
  var DocumentName: js.UndefOr[DocumentName] = js.undefined
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The IAM role ARN of the user who ran the Automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.undefined
  /**
    * The time the execution finished. This is not populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time the execution started.&gt;
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  /**
    * An Amazon S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.undefined
  /**
    * The MaxConcurrency value specified by the user when starting the Automation.
    */
  var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The MaxErrors value specified by the user when starting the Automation.
    */
  var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The ExecutionId of the parent Automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Target: js.UndefOr[String] = js.undefined
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[TargetMaps] = js.undefined
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  /**
    * The targets defined by the user when starting the Automation.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
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
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId)
    if (AutomationExecutionStatus != null) __obj.updateDynamic("AutomationExecutionStatus")(AutomationExecutionStatus.asInstanceOf[js.Any])
    if (AutomationType != null) __obj.updateDynamic("AutomationType")(AutomationType.asInstanceOf[js.Any])
    if (CurrentAction != null) __obj.updateDynamic("CurrentAction")(CurrentAction)
    if (CurrentStepName != null) __obj.updateDynamic("CurrentStepName")(CurrentStepName)
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (ExecutedBy != null) __obj.updateDynamic("ExecutedBy")(ExecutedBy)
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime)
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    if (LogFile != null) __obj.updateDynamic("LogFile")(LogFile)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    if (ParentAutomationExecutionId != null) __obj.updateDynamic("ParentAutomationExecutionId")(ParentAutomationExecutionId)
    if (ResolvedTargets != null) __obj.updateDynamic("ResolvedTargets")(ResolvedTargets)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    if (TargetMaps != null) __obj.updateDynamic("TargetMaps")(TargetMaps)
    if (TargetParameterName != null) __obj.updateDynamic("TargetParameterName")(TargetParameterName)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
}

