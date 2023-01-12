package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssociationRequest extends StObject {
  
  var AlarmConfiguration: js.UndefOr[typings.awsSdk.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * By default, when you create a new association, the system runs it immediately after it is created and then according to the schedule you specified. Specify this option if you don't want an association to run immediately after you create it. This parameter isn't supported for rate expressions.
    */
  var ApplyOnlyAtCronInterval: js.UndefOr[typings.awsSdk.clientsSsmMod.ApplyOnlyAtCronInterval] = js.undefined
  
  /**
    * Specify a descriptive name for the association.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationName] = js.undefined
  
  /**
    * Choose the parameter that will define how your automation will branch out. This target is required for associations that use an Automation runbook and target resources by using rate controls. Automation is a capability of Amazon Web Services Systems Manager.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationTargetParameterName] = js.undefined
  
  /**
    * The names or Amazon Resource Names (ARNs) of the Change Calendar type documents you want to gate your associations under. The associations only run when that change calendar is open. For more information, see Amazon Web Services Systems Manager Change Calendar.
    */
  var CalendarNames: js.UndefOr[CalendarNameOrARNList] = js.undefined
  
  /**
    * The severity level to assign to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.  State Manager doesn't support running associations that use a new version of a document if that document is shared from another account. State Manager always runs the default version of a document if shared from another account, even though the Systems Manager console shows that a new version was processed. If you want to run an association using a new version of a document shared form another account, you must set the document version to default. 
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The managed node ID.   InstanceId has been deprecated. To specify a managed node ID for an association, use the Targets parameter. Requests that include the parameter InstanceID with Systems Manager documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter InstanceId, you can't use the parameters AssociationName, DocumentVersion, MaxErrors, MaxConcurrency, OutputLocation, or ScheduleExpression. To use these parameters, you must use the Targets parameter. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new managed node starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new managed node will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 managed nodes and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The name of the SSM Command document or Automation runbook that contains the configuration information for the managed node. You can specify Amazon Web Services-predefined documents, documents you created, or a document that is shared with you from another account. For Systems Manager documents (SSM documents) that are shared with you from other Amazon Web Services accounts, you must specify the complete SSM document ARN, in the following format:  arn:partition:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For Amazon Web Services-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
    */
  var Name: DocumentARN
  
  /**
    * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  
  /**
    * The parameters for the runtime configuration of the document.
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsSsmMod.Parameters] = js.undefined
  
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.clientsSsmMod.ScheduleExpression] = js.undefined
  
  /**
    * Number of days to wait after the scheduled day to run an association. For example, if you specified a cron schedule of cron(0 0 ? * THU#2 *), you could specify an offset of 3 to run the association each Sunday after the second Thursday of the month. For more information about cron schedules for associations, see Reference: Cron and rate expressions for Systems Manager in the Amazon Web Services Systems Manager User Guide.   To use offsets, you must specify the ApplyOnlyAtCronInterval parameter. This option tells the system not to run an association immediately after you create it.  
    */
  var ScheduleOffset: js.UndefOr[typings.awsSdk.clientsSsmMod.ScheduleOffset] = js.undefined
  
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT. In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API operation. In this case, compliance data isn't managed by State Manager. It is managed by your direct call to the PutComplianceItems API operation. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined
  
  /**
    * Adds or overwrites one or more tags for a State Manager association. Tags are metadata that you can assign to your Amazon Web Services resources. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A location is a combination of Amazon Web Services Regions and Amazon Web Services accounts where you want to run the association. Use this action to create an association in multiple Regions and multiple accounts.
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetLocations] = js.undefined
  
  /**
    * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified together.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetMaps] = js.undefined
  
  /**
    * The targets for the association. You can target managed nodes by using tags, Amazon Web Services resource groups, all managed nodes in an Amazon Web Services account, or individual managed node IDs. You can target all managed nodes in an Amazon Web Services account by specifying the InstanceIds key with a value of *. For more information about choosing targets for an association, see Using targets and rate controls with State Manager associations in the Amazon Web Services Systems Manager User Guide.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
}
object CreateAssociationRequest {
  
  inline def apply(Name: DocumentARN): CreateAssociationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setApplyOnlyAtCronInterval(value: ApplyOnlyAtCronInterval): Self = StObject.set(x, "ApplyOnlyAtCronInterval", value.asInstanceOf[js.Any])
    
    inline def setApplyOnlyAtCronIntervalUndefined: Self = StObject.set(x, "ApplyOnlyAtCronInterval", js.undefined)
    
    inline def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    inline def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    inline def setAutomationTargetParameterName(value: AutomationTargetParameterName): Self = StObject.set(x, "AutomationTargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "AutomationTargetParameterName", js.undefined)
    
    inline def setCalendarNames(value: CalendarNameOrARNList): Self = StObject.set(x, "CalendarNames", value.asInstanceOf[js.Any])
    
    inline def setCalendarNamesUndefined: Self = StObject.set(x, "CalendarNames", js.undefined)
    
    inline def setCalendarNamesVarargs(value: CalendarNameOrARN*): Self = StObject.set(x, "CalendarNames", js.Array(value*))
    
    inline def setComplianceSeverity(value: AssociationComplianceSeverity): Self = StObject.set(x, "ComplianceSeverity", value.asInstanceOf[js.Any])
    
    inline def setComplianceSeverityUndefined: Self = StObject.set(x, "ComplianceSeverity", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputLocation(value: InstanceAssociationOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setScheduleOffset(value: ScheduleOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    inline def setSyncCompliance(value: AssociationSyncCompliance): Self = StObject.set(x, "SyncCompliance", value.asInstanceOf[js.Any])
    
    inline def setSyncComplianceUndefined: Self = StObject.set(x, "SyncCompliance", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetLocations(value: TargetLocations): Self = StObject.set(x, "TargetLocations", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationsUndefined: Self = StObject.set(x, "TargetLocations", js.undefined)
    
    inline def setTargetLocationsVarargs(value: TargetLocation*): Self = StObject.set(x, "TargetLocations", js.Array(value*))
    
    inline def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    inline def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value*))
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
