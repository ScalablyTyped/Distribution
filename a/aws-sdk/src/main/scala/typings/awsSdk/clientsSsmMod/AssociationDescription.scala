package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationDescription extends StObject {
  
  var AlarmConfiguration: js.UndefOr[typings.awsSdk.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * By default, when you create a new associations, the system runs it immediately after it is created and then according to the schedule you specified. Specify this option if you don't want an association to run immediately after you create it. This parameter isn't supported for rate expressions.
    */
  var ApplyOnlyAtCronInterval: js.UndefOr[typings.awsSdk.clientsSsmMod.ApplyOnlyAtCronInterval] = js.undefined
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationName] = js.undefined
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationVersion] = js.undefined
  
  /**
    * Choose the parameter that will define how your automation will branch out. This target is required for associations that use an Automation runbook and target resources by using rate controls. Automation is a capability of Amazon Web Services Systems Manager.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationTargetParameterName] = js.undefined
  
  /**
    * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents your associations are gated under. The associations only run when that change calendar is open. For more information, see Amazon Web Services Systems Manager Change Calendar.
    */
  var CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined
  
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  
  /**
    * The date when the association was made.
    */
  var Date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The managed node ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date on which the association was successfully run.
    */
  var LastSuccessfulExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the association was last updated.
    */
  var LastUpdateAssociationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new managed node starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new managed node will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 managed nodes and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * An S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.undefined
  
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsSsmMod.Parameters] = js.undefined
  
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.clientsSsmMod.ScheduleExpression] = js.undefined
  
  /**
    * Number of days to wait after the scheduled day to run an association.
    */
  var ScheduleOffset: js.UndefOr[typings.awsSdk.clientsSsmMod.ScheduleOffset] = js.undefined
  
  /**
    * The association status.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
  
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT. In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API operation. In this case, compliance data isn't managed by State Manager, a capability of Amazon Web Services Systems Manager. It is managed by your direct call to the PutComplianceItems API operation. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined
  
  /**
    * The combination of Amazon Web Services Regions and Amazon Web Services accounts where you want to run the association.
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetLocations] = js.undefined
  
  /**
    * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified together.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetMaps] = js.undefined
  
  /**
    * The managed nodes targeted by the request. 
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The CloudWatch alarm that was invoked during the association.
    */
  var TriggeredAlarms: js.UndefOr[AlarmStateInformationList] = js.undefined
}
object AssociationDescription {
  
  inline def apply(): AssociationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationDescription] (val x: Self) extends AnyVal {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setApplyOnlyAtCronInterval(value: ApplyOnlyAtCronInterval): Self = StObject.set(x, "ApplyOnlyAtCronInterval", value.asInstanceOf[js.Any])
    
    inline def setApplyOnlyAtCronIntervalUndefined: Self = StObject.set(x, "ApplyOnlyAtCronInterval", js.undefined)
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    inline def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setAutomationTargetParameterName(value: AutomationTargetParameterName): Self = StObject.set(x, "AutomationTargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "AutomationTargetParameterName", js.undefined)
    
    inline def setCalendarNames(value: CalendarNameOrARNList): Self = StObject.set(x, "CalendarNames", value.asInstanceOf[js.Any])
    
    inline def setCalendarNamesUndefined: Self = StObject.set(x, "CalendarNames", js.undefined)
    
    inline def setCalendarNamesVarargs(value: CalendarNameOrARN*): Self = StObject.set(x, "CalendarNames", js.Array(value*))
    
    inline def setComplianceSeverity(value: AssociationComplianceSeverity): Self = StObject.set(x, "ComplianceSeverity", value.asInstanceOf[js.Any])
    
    inline def setComplianceSeverityUndefined: Self = StObject.set(x, "ComplianceSeverity", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    inline def setLastSuccessfulExecutionDate(value: js.Date): Self = StObject.set(x, "LastSuccessfulExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulExecutionDateUndefined: Self = StObject.set(x, "LastSuccessfulExecutionDate", js.undefined)
    
    inline def setLastUpdateAssociationDate(value: js.Date): Self = StObject.set(x, "LastUpdateAssociationDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateAssociationDateUndefined: Self = StObject.set(x, "LastUpdateAssociationDate", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputLocation(value: InstanceAssociationOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setOverview(value: AssociationOverview): Self = StObject.set(x, "Overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "Overview", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setScheduleOffset(value: ScheduleOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    inline def setStatus(value: AssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSyncCompliance(value: AssociationSyncCompliance): Self = StObject.set(x, "SyncCompliance", value.asInstanceOf[js.Any])
    
    inline def setSyncComplianceUndefined: Self = StObject.set(x, "SyncCompliance", js.undefined)
    
    inline def setTargetLocations(value: TargetLocations): Self = StObject.set(x, "TargetLocations", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationsUndefined: Self = StObject.set(x, "TargetLocations", js.undefined)
    
    inline def setTargetLocationsVarargs(value: TargetLocation*): Self = StObject.set(x, "TargetLocations", js.Array(value*))
    
    inline def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    inline def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value*))
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTriggeredAlarms(value: AlarmStateInformationList): Self = StObject.set(x, "TriggeredAlarms", value.asInstanceOf[js.Any])
    
    inline def setTriggeredAlarmsUndefined: Self = StObject.set(x, "TriggeredAlarms", js.undefined)
    
    inline def setTriggeredAlarmsVarargs(value: AlarmStateInformation*): Self = StObject.set(x, "TriggeredAlarms", js.Array(value*))
  }
}
