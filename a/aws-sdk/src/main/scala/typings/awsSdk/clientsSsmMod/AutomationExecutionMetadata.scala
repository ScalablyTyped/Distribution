package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecutionMetadata extends StObject {
  
  /**
    * The details for the CloudWatch alarm applied to your automation.
    */
  var AlarmConfiguration: js.UndefOr[typings.awsSdk.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * The ID of a State Manager association used in the Automation operation.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationExecutionId] = js.undefined
  
  /**
    * The status of the execution.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationExecutionStatus] = js.undefined
  
  /**
    * The subtype of the Automation operation. Currently, the only supported value is ChangeRequest.
    */
  var AutomationSubtype: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationSubtype] = js.undefined
  
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple Amazon Web Services Regions and Amazon Web Services accounts. For more information, see Running Automation workflows in multiple Amazon Web Services Regions and accounts in the Amazon Web Services Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationType] = js.undefined
  
  /**
    * The name of the Change Manager change request.
    */
  var ChangeRequestName: js.UndefOr[typings.awsSdk.clientsSsmMod.ChangeRequestName] = js.undefined
  
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Automation runbook used during execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentName] = js.undefined
  
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The IAM role ARN of the user who ran the automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The time the execution finished. This isn't populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation runbook.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * An S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.undefined
  
  /**
    * The MaxConcurrency value specified by the user when starting the automation.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The MaxErrors value specified by the user when starting the automation.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  
  /**
    * The ID of an OpsItem that is created to represent a Change Manager change request.
    */
  var OpsItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation runbook.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * The execution ID of the parent automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsSdk.clientsSsmMod.ResolvedTargets] = js.undefined
  
  /**
    * Information about the Automation runbooks that are run during a runbook workflow in Change Manager.  The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change request have been received. 
    */
  var Runbooks: js.UndefOr[typings.awsSdk.clientsSsmMod.Runbooks] = js.undefined
  
  /**
    * The date and time the Automation operation is scheduled to start.
    */
  var ScheduledTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation runbook.
    */
  var Target: js.UndefOr[String] = js.undefined
  
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetMaps] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation runbook.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  
  /**
    * The targets defined by the user when starting the automation.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The CloudWatch alarm that was invoked by the automation.
    */
  var TriggeredAlarms: js.UndefOr[AlarmStateInformationList] = js.undefined
}
object AutomationExecutionMetadata {
  
  inline def apply(): AutomationExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
  
  extension [Self <: AutomationExecutionMetadata](x: Self) {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
    
    inline def setAutomationExecutionStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "AutomationExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionStatusUndefined: Self = StObject.set(x, "AutomationExecutionStatus", js.undefined)
    
    inline def setAutomationSubtype(value: AutomationSubtype): Self = StObject.set(x, "AutomationSubtype", value.asInstanceOf[js.Any])
    
    inline def setAutomationSubtypeUndefined: Self = StObject.set(x, "AutomationSubtype", js.undefined)
    
    inline def setAutomationType(value: AutomationType): Self = StObject.set(x, "AutomationType", value.asInstanceOf[js.Any])
    
    inline def setAutomationTypeUndefined: Self = StObject.set(x, "AutomationType", js.undefined)
    
    inline def setChangeRequestName(value: ChangeRequestName): Self = StObject.set(x, "ChangeRequestName", value.asInstanceOf[js.Any])
    
    inline def setChangeRequestNameUndefined: Self = StObject.set(x, "ChangeRequestName", js.undefined)
    
    inline def setCurrentAction(value: String): Self = StObject.set(x, "CurrentAction", value.asInstanceOf[js.Any])
    
    inline def setCurrentActionUndefined: Self = StObject.set(x, "CurrentAction", js.undefined)
    
    inline def setCurrentStepName(value: String): Self = StObject.set(x, "CurrentStepName", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepNameUndefined: Self = StObject.set(x, "CurrentStepName", js.undefined)
    
    inline def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setExecutedBy(value: String): Self = StObject.set(x, "ExecutedBy", value.asInstanceOf[js.Any])
    
    inline def setExecutedByUndefined: Self = StObject.set(x, "ExecutedBy", js.undefined)
    
    inline def setExecutionEndTime(value: js.Date): Self = StObject.set(x, "ExecutionEndTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionEndTimeUndefined: Self = StObject.set(x, "ExecutionEndTime", js.undefined)
    
    inline def setExecutionStartTime(value: js.Date): Self = StObject.set(x, "ExecutionStartTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartTimeUndefined: Self = StObject.set(x, "ExecutionStartTime", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setLogFile(value: String): Self = StObject.set(x, "LogFile", value.asInstanceOf[js.Any])
    
    inline def setLogFileUndefined: Self = StObject.set(x, "LogFile", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setMode(value: ExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
    inline def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setParentAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setParentAutomationExecutionIdUndefined: Self = StObject.set(x, "ParentAutomationExecutionId", js.undefined)
    
    inline def setResolvedTargets(value: ResolvedTargets): Self = StObject.set(x, "ResolvedTargets", value.asInstanceOf[js.Any])
    
    inline def setResolvedTargetsUndefined: Self = StObject.set(x, "ResolvedTargets", js.undefined)
    
    inline def setRunbooks(value: Runbooks): Self = StObject.set(x, "Runbooks", value.asInstanceOf[js.Any])
    
    inline def setRunbooksUndefined: Self = StObject.set(x, "Runbooks", js.undefined)
    
    inline def setRunbooksVarargs(value: Runbook*): Self = StObject.set(x, "Runbooks", js.Array(value*))
    
    inline def setScheduledTime(value: js.Date): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeUndefined: Self = StObject.set(x, "ScheduledTime", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    inline def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value*))
    
    inline def setTargetParameterName(value: AutomationParameterKey): Self = StObject.set(x, "TargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setTargetParameterNameUndefined: Self = StObject.set(x, "TargetParameterName", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTriggeredAlarms(value: AlarmStateInformationList): Self = StObject.set(x, "TriggeredAlarms", value.asInstanceOf[js.Any])
    
    inline def setTriggeredAlarmsUndefined: Self = StObject.set(x, "TriggeredAlarms", js.undefined)
    
    inline def setTriggeredAlarmsVarargs(value: AlarmStateInformation*): Self = StObject.set(x, "TriggeredAlarms", js.Array(value*))
  }
}
