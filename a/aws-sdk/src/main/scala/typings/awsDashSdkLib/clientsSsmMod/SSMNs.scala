package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/ssm", "SSM")
@js.native
object SSMNs extends js.Object {
  trait Activation extends js.Object {
    /**
      * The ID created by Systems Manager when you submitted the activation.
      */
    var ActivationId: js.UndefOr[ActivationId] = js.undefined
    /**
      * The date the activation was created.
      */
    var CreatedDate: js.UndefOr[CreatedDate] = js.undefined
    /**
      * A name for the managed instance when it is created.
      */
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined
    /**
      * A user defined description of the activation.
      */
    var Description: js.UndefOr[ActivationDescription] = js.undefined
    /**
      * The date when this activation can no longer be used to register managed instances.
      */
    var ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined
    /**
      * Whether or not the activation is expired.
      */
    var Expired: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
      */
    var IamRole: js.UndefOr[IamRole] = js.undefined
    /**
      * The maximum number of managed instances that can be registered using this activation.
      */
    var RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined
    /**
      * The number of managed instances already registered with this activation.
      */
    var RegistrationsCount: js.UndefOr[RegistrationsCount] = js.undefined
    /**
      * Tags assigned to the activation.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait AddTagsToResourceRequest extends js.Object {
    /**
      * The resource ID you want to tag. Use the ID of the resource. Here are some examples: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde PatchBaseline: pb-012345abcde For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
      */
    var ResourceId: ResourceId
    /**
      * Specifies the type of resource you are tagging.  The ManagedInstance type for this API action is for on-premises managed instances. You must specify the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
      */
    var ResourceType: ResourceTypeForTagging
    /**
      *  One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the parameter with no value, and we set the value to an empty string.   Do not enter personally identifiable information in this field. 
      */
    var Tags: TagList
  }
  
  trait AddTagsToResourceResult extends js.Object
  
  trait Association extends js.Object {
    /**
      * The ID created by the system when you create an association. An association is a binding between a document and a set of targets with a schedule.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The association name.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * The association version.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * The version of the document used in the association.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The ID of the instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The date on which the association was last run.
      */
    var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * Information about the association.
      */
    var Overview: js.UndefOr[AssociationOverview] = js.undefined
    /**
      * A cron expression that specifies a schedule when the association runs.
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The instances targeted by the request to create an association. 
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait AssociationDescription extends js.Object {
    /**
      * The association ID.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The association name.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * The association version.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
      */
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined
    /**
      * The severity level that is assigned to the association.
      */
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
    /**
      * The date when the association was made.
      */
    var Date: js.UndefOr[DateTime] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The ID of the instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The date on which the association was last run.
      */
    var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The last date on which the association was successfully run.
      */
    var LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The date when the association was last updated.
      */
    var LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to execute an association while Systems Manager is executing MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * An Amazon S3 bucket where you want to store the output details of the request.
      */
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    /**
      * Information about the association.
      */
    var Overview: js.UndefOr[AssociationOverview] = js.undefined
    /**
      * A description of the parameters for a document. 
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * A cron expression that specifies a schedule when the association runs.
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The association status.
      */
    var Status: js.UndefOr[AssociationStatus] = js.undefined
    /**
      * The instances targeted by the request. 
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait AssociationExecution extends js.Object {
    /**
      * The association ID.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The association version.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * The time the execution started.
      */
    var CreatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * Detailed status information about the execution.
      */
    var DetailedStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The execution ID for the association. If the association does not run at intervals or according to a schedule, then the ExecutionID is the same as the AssociationID.
      */
    var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
    /**
      * The date of the last execution.
      */
    var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * An aggregate status of the resources in the execution based on the status type.
      */
    var ResourceCountByStatus: js.UndefOr[ResourceCountByStatus] = js.undefined
    /**
      * The status of the association execution.
      */
    var Status: js.UndefOr[StatusName] = js.undefined
  }
  
  trait AssociationExecutionFilter extends js.Object {
    /**
      * The key value used in the request.
      */
    var Key: AssociationExecutionFilterKey
    /**
      * The filter type specified in the request.
      */
    var Type: AssociationFilterOperatorType
    /**
      * The value specified for the key.
      */
    var Value: AssociationExecutionFilterValue
  }
  
  trait AssociationExecutionTarget extends js.Object {
    /**
      * The association ID.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The association version.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * Detailed information about the execution status.
      */
    var DetailedStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The execution ID. If the association does not run at intervals or according to a schedule, then the ExecutionID is the same as the AssociationID.
      */
    var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
    /**
      * The date of the last execution.
      */
    var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The location where the association details are saved.
      */
    var OutputSource: js.UndefOr[OutputSource] = js.undefined
    /**
      * The resource ID, for example, the instance ID where the association ran.
      */
    var ResourceId: js.UndefOr[AssociationResourceId] = js.undefined
    /**
      * The resource type, for example, instance.
      */
    var ResourceType: js.UndefOr[AssociationResourceType] = js.undefined
    /**
      * The association execution status.
      */
    var Status: js.UndefOr[StatusName] = js.undefined
  }
  
  trait AssociationExecutionTargetsFilter extends js.Object {
    /**
      * The key value used in the request.
      */
    var Key: AssociationExecutionTargetsFilterKey
    /**
      * The value specified for the key.
      */
    var Value: AssociationExecutionTargetsFilterValue
  }
  
  trait AssociationFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var key: AssociationFilterKey
    /**
      * The filter value.
      */
    var value: AssociationFilterValue
  }
  
  trait AssociationOverview extends js.Object {
    /**
      * Returns the number of targets for the association status. For example, if you created an association with two instances, and one of them was successful, this would return the count of instances by status.
      */
    var AssociationStatusAggregatedCount: js.UndefOr[AssociationStatusAggregatedCount] = js.undefined
    /**
      * A detailed status of the association.
      */
    var DetailedStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The status of the association. Status can be: Pending, Success, or Failed.
      */
    var Status: js.UndefOr[StatusName] = js.undefined
  }
  
  trait AssociationStatus extends js.Object {
    /**
      * A user-defined string.
      */
    var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
    /**
      * The date when the status changed.
      */
    var Date: DateTime
    /**
      * The reason for the status.
      */
    var Message: StatusMessage
    /**
      * The status.
      */
    var Name: AssociationStatusName
  }
  
  trait AssociationStatusAggregatedCount
    extends /* key */ org.scalablytyped.runtime.StringDictionary[InstanceCount]
  
  trait AssociationVersionInfo extends js.Object {
    /**
      * The ID created by the system when the association was created.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The name specified for the association version when the association version was created.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * The association version.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * The severity level that is assigned to the association.
      */
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
    /**
      * The date the association version was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The version of a Systems Manager document used when the association version was created.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to execute an association while Systems Manager is executing MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The name specified when the association was created.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * The location in Amazon S3 specified for the association when the association version was created.
      */
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    /**
      * Parameters specified when the association version was created.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The cron or rate schedule specified for the association when the association version was created.
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The targets specified for the association when the association version was created. 
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait AttachmentContent extends js.Object {
    /**
      * The cryptographic hash value of the document content.
      */
    var Hash: js.UndefOr[AttachmentHash] = js.undefined
    /**
      * The hash algorithm used to calculate the hash value.
      */
    var HashType: js.UndefOr[AttachmentHashType] = js.undefined
    /**
      * The name of an attachment.
      */
    var Name: js.UndefOr[AttachmentName] = js.undefined
    /**
      * The size of an attachment in bytes.
      */
    var Size: js.UndefOr[ContentLength] = js.undefined
    /**
      * The URL location of the attachment content.
      */
    var Url: js.UndefOr[AttachmentUrl] = js.undefined
  }
  
  trait AttachmentInformation extends js.Object {
    /**
      * The name of the attachment.
      */
    var Name: js.UndefOr[AttachmentName] = js.undefined
  }
  
  trait AttachmentsSource extends js.Object {
    /**
      * The key of a key and value pair that identifies the location of an attachment to a document.
      */
    var Key: js.UndefOr[AttachmentsSourceKey] = js.undefined
    /**
      * The URL of the location of a document attachment, such as the URL of an Amazon S3 bucket.
      */
    var Values: js.UndefOr[AttachmentsSourceValues] = js.undefined
  }
  
  trait AutomationExecution extends js.Object {
    /**
      * The execution ID.
      */
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
    /**
      * The execution status of the Automation.
      */
    var AutomationExecutionStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined
    /**
      * The action of the currently executing step.
      */
    var CurrentAction: js.UndefOr[String] = js.undefined
    /**
      * The name of the currently executing step.
      */
    var CurrentStepName: js.UndefOr[String] = js.undefined
    /**
      * The name of the Automation document used during the execution.
      */
    var DocumentName: js.UndefOr[DocumentName] = js.undefined
    /**
      * The version of the document to use during execution.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the user who executed the automation.
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
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The MaxErrors value specified by the user when the execution started.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
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
    var ProgressCounters: js.UndefOr[ProgressCounters] = js.undefined
    /**
      * A list of resolved targets in the rate control execution.
      */
    var ResolvedTargets: js.UndefOr[ResolvedTargets] = js.undefined
    /**
      * A list of details about the current state of all steps that comprise an execution. An Automation document contains a list of steps that are executed in order.
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
      * The combination of AWS Regions and/or AWS accounts where you want to execute the Automation.
      */
    var TargetLocations: js.UndefOr[TargetLocations] = js.undefined
    /**
      * The specified key-value mapping of document parameters to target resources.
      */
    var TargetMaps: js.UndefOr[TargetMaps] = js.undefined
    /**
      * The parameter name.
      */
    var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
    /**
      * The specified targets.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait AutomationExecutionFilter extends js.Object {
    /**
      * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix, ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
      */
    var Key: AutomationExecutionFilterKey
    /**
      * The values used to limit the execution information associated with the filter's key.
      */
    var Values: AutomationExecutionFilterValueList
  }
  
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
      * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that executes in multiple AWS Regions and accounts. For more information, see Concurrently Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
      */
    var AutomationType: js.UndefOr[AutomationType] = js.undefined
    /**
      * The action of the currently executing step.
      */
    var CurrentAction: js.UndefOr[String] = js.undefined
    /**
      * The name of the currently executing step.
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
      * The IAM role ARN of the user who executed the Automation.
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
  
  trait AutomationParameterMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AutomationParameterValueList]
  
  trait CancelCommandRequest extends js.Object {
    /**
      * The ID of the command you want to cancel.
      */
    var CommandId: CommandId
    /**
      * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is canceled on every instance on which it was requested.
      */
    var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  }
  
  trait CancelCommandResult extends js.Object
  
  trait CancelMaintenanceWindowExecutionRequest extends js.Object {
    /**
      * The ID of the Maintenance Window execution to stop.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait CancelMaintenanceWindowExecutionResult extends js.Object {
    /**
      * The ID of the Maintenance Window execution that has been stopped.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchOutputConfig extends js.Object {
    /**
      * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
      */
    var CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined
    /**
      * Enables Systems Manager to send command output to CloudWatch Logs.
      */
    var CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined
  }
  
  trait Command extends js.Object {
    /**
      * CloudWatch Logs information where you want Systems Manager to send the command output.
      */
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
    /**
      * A unique identifier for this command.
      */
    var CommandId: js.UndefOr[CommandId] = js.undefined
    /**
      * User-specified information about the command, such as a brief description of what the command should do.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
    /**
      * The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
      */
    var CompletedCount: js.UndefOr[CompletedCount] = js.undefined
    /**
      * The number of targets for which the status is Delivery Timed Out.
      */
    var DeliveryTimedOutCount: js.UndefOr[DeliveryTimedOutCount] = js.undefined
    /**
      * The name of the document requested for execution.
      */
    var DocumentName: js.UndefOr[DocumentName] = js.undefined
    /**
      * The SSM document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The number of targets for which the status is Failed or Execution Timed Out.
      */
    var ErrorCount: js.UndefOr[ErrorCount] = js.undefined
    /**
      * If this time is reached and the command has not already started executing, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.
      */
    var ExpiresAfter: js.UndefOr[DateTime] = js.undefined
    /**
      * The instance IDs against which this command was requested.
      */
    var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
    /**
      * The maximum number of instances that are allowed to execute the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Executing Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see Executing Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * Configurations for sending notifications about command status changes. 
      */
    var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
    /**
      * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.
      */
    var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.
      */
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
      */
    var OutputS3Region: js.UndefOr[S3Region] = js.undefined
    /**
      * The parameter values to be inserted in the document when executing the command.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The date and time the command was requested.
      */
    var RequestedDateTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. 
      */
    var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The status of the command.
      */
    var Status: js.UndefOr[CommandStatus] = js.undefined
    /**
      * A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to any instances.   In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.   Success: The command successfully executed on all invocations. This is a terminal state.   Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.   Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.   Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.   Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before executing it on any instance. This is a terminal state.  
      */
    var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    /**
      * The number of targets for the command.
      */
    var TargetCount: js.UndefOr[TargetCount] = js.undefined
    /**
      * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait CommandFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var key: CommandFilterKey
    /**
      * The filter value. Valid values for each filter key are as follows:    InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-07-07T00:00:00Z to see a list of command executions occurring July 7, 2018, and later.    InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-07-07T00:00:00Z to see a list of command executions from before July 7, 2018.    Status: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:    Pending     InProgress     Success     Cancelled     Failed     TimedOut     Cancelling       DocumentName: Specify name of the SSM document for which you want to see command execution results. For example, specify AWS-RunPatchBaseline to see command executions that used this SSM document to perform security patching operations on instances.     ExecutionStage: Specify one of the following values:    Executing: Returns a list of command executions that are currently still running.    Complete: Returns a list of command executions that have already completed.     
      */
    var value: CommandFilterValue
  }
  
  trait CommandInvocation extends js.Object {
    /**
      * CloudWatch Logs information where you want Systems Manager to send the command output.
      */
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
    /**
      * The command against which this invocation was requested.
      */
    var CommandId: js.UndefOr[CommandId] = js.undefined
    var CommandPlugins: js.UndefOr[CommandPluginList] = js.undefined
    /**
      * User-specified information about the command, such as a brief description of what the command should do.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
    /**
      * The document name that was requested for execution.
      */
    var DocumentName: js.UndefOr[DocumentName] = js.undefined
    /**
      * The SSM document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The instance ID in which this invocation was requested.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.
      */
    var InstanceName: js.UndefOr[InstanceTagName] = js.undefined
    /**
      * Configurations for sending notifications about command status changes on a per instance basis.
      */
    var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
    /**
      * The time and date the request was sent to this instance.
      */
    var RequestedDateTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.
      */
    var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
      */
    var StandardErrorUrl: js.UndefOr[Url] = js.undefined
    /**
      * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
      */
    var StandardOutputUrl: js.UndefOr[Url] = js.undefined
    /**
      * Whether or not the invocation succeeded, failed, or is pending.
      */
    var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
    /**
      * A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
      */
    var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
    /**
      *  Gets the trace output sent by the agent. 
      */
    var TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined
  }
  
  trait CommandPlugin extends js.Object {
    /**
      * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent. 
      */
    var Name: js.UndefOr[CommandPluginName] = js.undefined
    /**
      * Output of the plugin execution.
      */
    var Output: js.UndefOr[CommandPluginOutput] = js.undefined
    /**
      * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
      */
    var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
      */
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
      */
    var OutputS3Region: js.UndefOr[S3Region] = js.undefined
    /**
      * A numeric response code generated after executing the plugin. 
      */
    var ResponseCode: js.UndefOr[ResponseCode] = js.undefined
    /**
      * The time the plugin stopped executing. Could stop prematurely if, for example, a cancel command was sent. 
      */
    var ResponseFinishDateTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time the plugin started executing. 
      */
    var ResponseStartDateTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string is empty.
      */
    var StandardErrorUrl: js.UndefOr[Url] = js.undefined
    /**
      * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the command was not specified, then this string is empty.
      */
    var StandardOutputUrl: js.UndefOr[Url] = js.undefined
    /**
      * The status of this plugin. You can execute a document with multiple plugins.
      */
    var Status: js.UndefOr[CommandPluginStatus] = js.undefined
    /**
      * A detailed status of the plugin execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
      */
    var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
  }
  
  trait ComplianceExecutionSummary extends js.Object {
    /**
      * An ID created by the system when PutComplianceItems was called. For example, CommandID is a valid execution ID. You can use this ID in subsequent calls.
      */
    var ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined
    /**
      * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
      */
    var ExecutionTime: DateTime
    /**
      * The type of execution. For example, Command is a valid execution type.
      */
    var ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined
  }
  
  trait ComplianceItem extends js.Object {
    /**
      * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:string are all valid compliance types.
      */
    var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
    /**
      * A "Key": "Value" tag combination for the compliance item.
      */
    var Details: js.UndefOr[ComplianceItemDetails] = js.undefined
    /**
      * A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.
      */
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined
    /**
      * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.
      */
    var Id: js.UndefOr[ComplianceItemId] = js.undefined
    /**
      * An ID for the resource. For a managed instance, this is the instance ID.
      */
    var ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined
    /**
      * The type of resource. ManagedInstance is currently the only supported resource type.
      */
    var ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined
    /**
      * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
      */
    var Severity: js.UndefOr[ComplianceSeverity] = js.undefined
    /**
      * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
      */
    var Status: js.UndefOr[ComplianceStatus] = js.undefined
    /**
      * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
      */
    var Title: js.UndefOr[ComplianceItemTitle] = js.undefined
  }
  
  trait ComplianceItemDetails
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait ComplianceItemEntry extends js.Object {
    /**
      * A "Key": "Value" tag combination for the compliance item.
      */
    var Details: js.UndefOr[ComplianceItemDetails] = js.undefined
    /**
      * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article.
      */
    var Id: js.UndefOr[ComplianceItemId] = js.undefined
    /**
      * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
      */
    var Severity: ComplianceSeverity
    /**
      * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
      */
    var Status: ComplianceStatus
    /**
      * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services. 
      */
    var Title: js.UndefOr[ComplianceItemTitle] = js.undefined
  }
  
  trait ComplianceStringFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined
    /**
      * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or GreaterThan.
      */
    var Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined
    /**
      * The value for which to search.
      */
    var Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined
  }
  
  trait ComplianceSummaryItem extends js.Object {
    /**
      * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
      */
    var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
    /**
      * A list of COMPLIANT items for the specified compliance type.
      */
    var CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined
    /**
      * A list of NON_COMPLIANT items for the specified compliance type.
      */
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined
  }
  
  trait CompliantSummary extends js.Object {
    /**
      * The total number of resources that are compliant.
      */
    var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * A summary of the compliance severity by compliance type.
      */
    var SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
  }
  
  trait CreateActivationRequest extends js.Object {
    /**
      * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS command line tools to list EC2 resources.  Do not enter personally identifiable information in this field. 
      */
    var DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined
    /**
      * A user-defined description of the resource that you want to register with Amazon EC2.   Do not enter personally identifiable information in this field. 
      */
    var Description: js.UndefOr[ActivationDescription] = js.undefined
    /**
      * The date by which this activation request should expire. The default value is 24 hours.
      */
    var ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined
    /**
      * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance. 
      */
    var IamRole: IamRole
    /**
      * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
      */
    var RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined
    /**
      * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises servers or VMs.  You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how to add tags to your managed instances, see AddTagsToResource. For information about how to remove tags from your managed instances, see RemoveTagsFromResource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateActivationResult extends js.Object {
    /**
      * The code the system generates when it processes the activation. The activation code functions like a password to validate the activation ID. 
      */
    var ActivationCode: js.UndefOr[ActivationCode] = js.undefined
    /**
      * The ID number generated by the system when it processed the activation. The activation ID functions like a user name.
      */
    var ActivationId: js.UndefOr[ActivationId] = js.undefined
  }
  
  trait CreateAssociationBatchRequest extends js.Object {
    /**
      * One or more associations.
      */
    var Entries: CreateAssociationBatchRequestEntries
  }
  
  trait CreateAssociationBatchRequestEntry extends js.Object {
    /**
      * Specify a descriptive name for the association.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
      */
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined
    /**
      * The severity level to assign to the association.
      */
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The ID of the instance. 
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to execute an association while Systems Manager is executing MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The name of the SSM document that contains the configuration information for the instance. You can specify Command, Policy, or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:aws:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
      */
    var Name: DocumentARN
    /**
      * An Amazon S3 bucket where you want to store the results of this request.
      */
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    /**
      * A description of the parameters for a document. 
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * A cron expression that specifies a schedule when the association runs.
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The instances targeted by the request.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait CreateAssociationBatchResult extends js.Object {
    /**
      * Information about the associations that failed.
      */
    var Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined
    /**
      * Information about the associations that succeeded.
      */
    var Successful: js.UndefOr[AssociationDescriptionList] = js.undefined
  }
  
  trait CreateAssociationRequest extends js.Object {
    /**
      * Specify a descriptive name for the association.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
      */
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined
    /**
      * The severity level to assign to the association.
      */
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
    /**
      * The document version you want to associate with the target(s). Can be a specific version or the default version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to execute an association while Systems Manager is executing MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The name of the SSM document that contains the configuration information for the instance. You can specify Command, Policy, or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:partition:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
      */
    var Name: DocumentARN
    /**
      * An Amazon S3 bucket where you want to store the output details of the request.
      */
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    /**
      * The parameters for the documents runtime configuration. 
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * A cron expression when the association will be applied to the target(s).
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The targets (either instances or tags) for the association.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait CreateAssociationResult extends js.Object {
    /**
      * Information about the association.
      */
    var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
  }
  
  trait CreateDocumentRequest extends js.Object {
    /**
      * A list of key and value pairs that describe attachments to a version of a document.
      */
    var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
    /**
      * A valid JSON or YAML string.
      */
    var Content: DocumentContent
    /**
      * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The type of document to create. Valid document types include: Command, Policy, Automation, Session, and Package.
      */
    var DocumentType: js.UndefOr[DocumentType] = js.undefined
    /**
      * A name for the Systems Manager document.  Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document prefixes:    aws     amazon     amzn    
      */
    var Name: DocumentName
    /**
      * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource action. 
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
      */
    var TargetType: js.UndefOr[TargetType] = js.undefined
    /**
      * An optional field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait CreateDocumentResult extends js.Object {
    /**
      * Information about the Systems Manager document.
      */
    var DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
  }
  
  trait CreateMaintenanceWindowRequest extends js.Object {
    /**
      * Enables a Maintenance Window task to execute on managed instances, even if you have not registered those instances as targets. If enabled, then you must specify the unregistered instances (by instance ID) when you register a task with the Maintenance Window  If you don't enable this option, then you must specify previously-registered targets when you register a task with the Maintenance Window. 
      */
    var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
    /**
      * User-provided idempotency token.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    var Cutoff: MaintenanceWindowCutoff
    /**
      * An optional description for the Maintenance Window. We recommend specifying a description to help you organize your Maintenance Windows. 
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The duration of the Maintenance Window in hours.
      */
    var Duration: MaintenanceWindowDurationHours
    /**
      * The date and time, in ISO-8601 Extended format, for when you want the Maintenance Window to become inactive. EndDate allows you to set a date and time in the future when the Maintenance Window will no longer run.
      */
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The name of the Maintenance Window.
      */
    var Name: MaintenanceWindowName
    /**
      * The schedule of the Maintenance Window in the form of a cron or rate expression.
      */
    var Schedule: MaintenanceWindowSchedule
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
      */
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when you want the Maintenance Window to become active. StartDate allows you to delay activation of the Maintenance Window until the specified future date.
      */
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a Maintenance Window to identify the type of tasks it will run, the types of targets, and the environment it will run in. In this case, you could specify the following key name/value pairs:    Key=TaskType,Value=AgentUpdate     Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing Maintenance Window, use the AddTagsToResource action. 
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the created Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait CreatePatchBaselineRequest extends js.Object {
    /**
      * A set of rules used to include patches in the baseline.
      */
    var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
    /**
      * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
      */
    var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
      */
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
      */
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    /**
      * User-provided idempotency token.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * A description of the patch baseline.
      */
    var Description: js.UndefOr[BaselineDescription] = js.undefined
    /**
      * A set of global filters used to include patches in the baseline.
      */
    var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    /**
      * The name of the patch baseline.
      */
    var Name: BaselineName
    /**
      * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
      */
    var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
      */
    var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
    /**
      * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
      */
    var Sources: js.UndefOr[PatchSourceList] = js.undefined
    /**
      * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the severity level of patches it specifies and the operating system family it applies to. In this case, you could specify the following key name/value pairs:    Key=PatchSeverity,Value=Critical     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreatePatchBaselineResult extends js.Object {
    /**
      * The ID of the created patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
  }
  
  trait CreateResourceDataSyncRequest extends js.Object {
    /**
      * Amazon S3 configuration details for the sync.
      */
    var S3Destination: ResourceDataSyncS3Destination
    /**
      * A name for the configuration.
      */
    var SyncName: ResourceDataSyncName
  }
  
  trait CreateResourceDataSyncResult extends js.Object
  
  trait DeleteActivationRequest extends js.Object {
    /**
      * The ID of the activation that you want to delete.
      */
    var ActivationId: ActivationId
  }
  
  trait DeleteActivationResult extends js.Object
  
  trait DeleteAssociationRequest extends js.Object {
    /**
      * The association ID that you want to delete.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The ID of the instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
  }
  
  trait DeleteAssociationResult extends js.Object
  
  trait DeleteDocumentRequest extends js.Object {
    /**
      * The name of the document.
      */
    var Name: DocumentName
  }
  
  trait DeleteDocumentResult extends js.Object
  
  trait DeleteInventoryRequest extends js.Object {
    /**
      * User-provided idempotency token.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * Use this option to view a summary of the deletion request without deleting any data or the data type. This option is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is what you intend to delete, you can run the same command without specifying the DryRun option.
      */
    var DryRun: js.UndefOr[DryRun] = js.undefined
    /**
      * Use the SchemaDeleteOption to delete a custom inventory type (schema). If you don't choose this option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of the following options: DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and any earlier versions. To enable this schema again, you must call the PutInventory action for a version greater than the disbled version. DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the schema later, if you want.
      */
    var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.undefined
    /**
      * The name of the custom inventory type for which you want to delete either all previously collected data, or the inventory type itself. 
      */
    var TypeName: InventoryItemTypeName
  }
  
  trait DeleteInventoryResult extends js.Object {
    /**
      * Every DeleteInventory action is assigned a unique ID. This option returns a unique ID. You can use this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has completed before you begin other actions. 
      */
    var DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined
    /**
      * A summary of the delete operation. For more information about this summary, see Understanding the Delete Inventory Summary in the AWS Systems Manager User Guide.
      */
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined
    /**
      * The name of the inventory data type specified in the request.
      */
    var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
  }
  
  trait DeleteMaintenanceWindowRequest extends js.Object {
    /**
      * The ID of the Maintenance Window to delete.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait DeleteMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the deleted Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait DeleteParameterRequest extends js.Object {
    /**
      * The name of the parameter to delete.
      */
    var Name: PSParameterName
  }
  
  trait DeleteParameterResult extends js.Object
  
  trait DeleteParametersRequest extends js.Object {
    /**
      * The names of the parameters to delete.
      */
    var Names: ParameterNameList
  }
  
  trait DeleteParametersResult extends js.Object {
    /**
      * The names of the deleted parameters.
      */
    var DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined
    /**
      * The names of parameters that weren't deleted because the parameters are not valid.
      */
    var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
  }
  
  trait DeletePatchBaselineRequest extends js.Object {
    /**
      * The ID of the patch baseline to delete.
      */
    var BaselineId: BaselineId
  }
  
  trait DeletePatchBaselineResult extends js.Object {
    /**
      * The ID of the deleted patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
  }
  
  trait DeleteResourceDataSyncRequest extends js.Object {
    /**
      * The name of the configuration to delete.
      */
    var SyncName: ResourceDataSyncName
  }
  
  trait DeleteResourceDataSyncResult extends js.Object
  
  trait DeregisterManagedInstanceRequest extends js.Object {
    /**
      * The ID assigned to the managed instance when you registered it using the activation process. 
      */
    var InstanceId: ManagedInstanceId
  }
  
  trait DeregisterManagedInstanceResult extends js.Object
  
  trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
    /**
      * The ID of the patch baseline to deregister the patch group from.
      */
    var BaselineId: BaselineId
    /**
      * The name of the patch group that should be deregistered from the patch baseline.
      */
    var PatchGroup: PatchGroup
  }
  
  trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
    /**
      * The ID of the patch baseline the patch group was deregistered from.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The name of the patch group deregistered from the patch baseline.
      */
    var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
  }
  
  trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
    /**
      * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and does not deregister the target from the Maintenance Window.
      */
    var Safe: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the Maintenance Window the target should be removed from.
      */
    var WindowId: MaintenanceWindowId
    /**
      * The ID of the target definition to remove.
      */
    var WindowTargetId: MaintenanceWindowTargetId
  }
  
  trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the Maintenance Window the target was removed from.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The ID of the removed target definition.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
  }
  
  trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
    /**
      * The ID of the Maintenance Window the task should be removed from.
      */
    var WindowId: MaintenanceWindowId
    /**
      * The ID of the task to remove from the Maintenance Window.
      */
    var WindowTaskId: MaintenanceWindowTaskId
  }
  
  trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the Maintenance Window the task was removed from.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The ID of the task removed from the Maintenance Window.
      */
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
  }
  
  trait DescribeActivationsFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined
    /**
      * The filter values.
      */
    var FilterValues: js.UndefOr[StringList] = js.undefined
  }
  
  trait DescribeActivationsRequest extends js.Object {
    /**
      * A filter to view information about your activations.
      */
    var Filters: js.UndefOr[DescribeActivationsFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeActivationsResult extends js.Object {
    /**
      * A list of activations for your AWS account.
      */
    var ActivationList: js.UndefOr[ActivationList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAssociationExecutionTargetsRequest extends js.Object {
    /**
      * The association ID that includes the execution for which you want to view details.
      */
    var AssociationId: AssociationId
    /**
      * The execution ID for which you want to view details.
      */
    var ExecutionId: AssociationExecutionId
    /**
      * Filters for the request. You can specify the following filters and values. Status (EQUAL) ResourceId (EQUAL) ResourceType (EQUAL)
      */
    var Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAssociationExecutionTargetsResult extends js.Object {
    /**
      * Information about the execution.
      */
    var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAssociationExecutionsRequest extends js.Object {
    /**
      * The association ID for which you want to view execution history details.
      */
    var AssociationId: AssociationId
    /**
      * Filters for the request. You can specify the following filters and values. ExecutionId (EQUAL) Status (EQUAL) CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
      */
    var Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAssociationExecutionsResult extends js.Object {
    /**
      * A list of the executions for the specified association ID.
      */
    var AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAssociationRequest extends js.Object {
    /**
      * The association ID for which you want information.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * Specify the association version to retrieve. To view the latest version, either specify $LATEST for this parameter, or omit this parameter. To view a list of all associations for an instance, use ListAssociations. To get a list of versions for a specific association, use ListAssociationVersions. 
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
  }
  
  trait DescribeAssociationResult extends js.Object {
    /**
      * Information about the association.
      */
    var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
  }
  
  trait DescribeAutomationExecutionsRequest extends js.Object {
    /**
      * Filters used to limit the scope of executions that are requested.
      */
    var Filters: js.UndefOr[AutomationExecutionFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAutomationExecutionsResult extends js.Object {
    /**
      * The list of details about each automation execution which has occurred which matches the filter specification, if any.
      */
    var AutomationExecutionMetadataList: js.UndefOr[AutomationExecutionMetadataList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAutomationStepExecutionsRequest extends js.Object {
    /**
      * The Automation execution ID for which you want step execution descriptions.
      */
    var AutomationExecutionId: AutomationExecutionId
    /**
      * One or more filters to limit the number of step executions returned by the request.
      */
    var Filters: js.UndefOr[StepExecutionFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A boolean that indicates whether to list step executions in reverse order by start time. The default value is false.
      */
    var ReverseOrder: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DescribeAutomationStepExecutionsResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of details about the current state of all steps that make up an execution.
      */
    var StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
  }
  
  trait DescribeAvailablePatchesRequest extends js.Object {
    /**
      * Filters used to scope down the returned patches.
      */
    var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
    /**
      * The maximum number of patches to return (per page).
      */
    var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAvailablePatchesResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of patches. Each entry in the array is a patch structure.
      */
    var Patches: js.UndefOr[PatchList] = js.undefined
  }
  
  trait DescribeDocumentPermissionRequest extends js.Object {
    /**
      * The name of the document for which you are the owner.
      */
    var Name: DocumentName
    /**
      * The permission type for the document. The permission type can be Share.
      */
    var PermissionType: DocumentPermissionType
  }
  
  trait DescribeDocumentPermissionResponse extends js.Object {
    /**
      * The account IDs that have permission to use this document. The ID can be either an AWS account or All.
      */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  trait DescribeDocumentRequest extends js.Object {
    /**
      * The document version for which you want information. Can be a specific version or the default version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: DocumentARN
    /**
      * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait DescribeDocumentResult extends js.Object {
    /**
      * Information about the Systems Manager document.
      */
    var Document: js.UndefOr[DocumentDescription] = js.undefined
  }
  
  trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
    /**
      * The instance ID for which you want to view all associations.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
    /**
      * The associations for the requested instance.
      */
    var Associations: js.UndefOr[InstanceAssociationList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
    /**
      * The ID of the patch baseline to retrieve the effective patches for.
      */
    var BaselineId: BaselineId
    /**
      * The maximum number of patches to return (per page).
      */
    var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
    /**
      * An array of patches and patch status.
      */
    var EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstanceAssociationsStatusRequest extends js.Object {
    /**
      * The instance IDs for which you want association status information.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstanceAssociationsStatusResult extends js.Object {
    /**
      * Status information about the association.
      */
    var InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstanceInformationRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag. Specify tags by using a key-value mapping.
      */
    var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined
    /**
      * This is a legacy method. We recommend that you don't use this method. Instead, use the InstanceInformationFilter action. The InstanceInformationFilter action enables you to return instance information by using tags that are specified as a key-value mapping.  If you do use this method, then you can't use the InstanceInformationFilter action. Using this method and the InstanceInformationFilter action causes an exception error. 
      */
    var InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
      */
    var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstanceInformationResult extends js.Object {
    /**
      * The instance information list.
      */
    var InstanceInformationList: js.UndefOr[InstanceInformationList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
    /**
      * Each entry in the array is a structure containing: Key (string between 1 and 200 characters)  Values (array containing a single string)  Type (string "Equal", "NotEqual", "LessThan", "GreaterThan")
      */
    var Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined
    /**
      * The maximum number of patches to return (per page).
      */
    var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the patch group for which the patch state information should be retrieved.
      */
    var PatchGroup: PatchGroup
  }
  
  trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
    /**
      * The high-level patch state for the requested instances. 
      */
    var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancePatchStatesRequest extends js.Object {
    /**
      * The ID of the instance whose patch state information should be retrieved.
      */
    var InstanceIds: InstanceIdList
    /**
      * The maximum number of instances to return (per page).
      */
    var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancePatchStatesResult extends js.Object {
    /**
      * The high-level patch state for the requested instances.
      */
    var InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancePatchesRequest extends js.Object {
    /**
      * Each entry in the array is a structure containing: Key (string, between 1 and 128 characters) Values (array of strings, each string between 1 and 256 characters)
      */
    var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
    /**
      * The ID of the instance whose patch state information should be retrieved.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of patches to return (per page).
      */
    var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancePatchesResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Each entry in the array is a structure containing: Title (string) KBId (string) Classification (string) Severity (string) State (string, such as "INSTALLED" or "FAILED") InstalledTime (DateTime) InstalledBy (string)
      */
    var Patches: js.UndefOr[PatchComplianceDataList] = js.undefined
  }
  
  trait DescribeInventoryDeletionsRequest extends js.Object {
    /**
      * Specify the delete inventory ID for which you want information. This ID was returned by the DeleteInventory action.
      */
    var DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInventoryDeletionsResult extends js.Object {
    /**
      * A list of status items for deleted inventory.
      */
    var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends js.Object {
    /**
      * Optional filters used to scope down the returned task invocations. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the specific task in the Maintenance Window task that should be retrieved.
      */
    var TaskId: MaintenanceWindowExecutionTaskId
    /**
      * The ID of the Maintenance Window execution the task is part of.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the task invocation results per invocation.
      */
    var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
    /**
      * Optional filters used to scope down the returned tasks. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED. 
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the Maintenance Window execution whose task executions should be retrieved.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the task executions.
      */
    var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
    /**
      * Each entry in the array is a structure containing: Key (string, between 1 and 128 characters) Values (array of strings, each string is between 1 and 256 characters) The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as 2016-11-04T05:00:00Z.
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the Maintenance Window whose executions should be retrieved.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the Maintenance Windows execution.
      */
    var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowScheduleRequest extends js.Object {
    /**
      * Filters used to limit the range of results. For example, you can limit Maintenance Window executions to only those scheduled before or after a certain date and time.
      */
    var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of resource you want to retrieve information about. For example, "INSTANCE".
      */
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
    /**
      * The instance ID or key/value pair to retrieve information about.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The ID of the Maintenance Window to retrieve information about.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait DescribeMaintenanceWindowScheduleResult extends js.Object {
    /**
      * The token for the next set of items to return. (You use this token in the next call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about Maintenance Window executions scheduled for the specified time range.
      */
    var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
    /**
      * Optional filters that can be used to narrow down the scope of the returned window targets. The supported filter keys are Type, WindowTargetId and OwnerInformation.
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the Maintenance Window whose targets should be retrieved.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait DescribeMaintenanceWindowTargetsResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the targets in the Maintenance Window.
      */
    var Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowTasksRequest extends js.Object {
    /**
      * Optional filters used to narrow down the scope of the returned tasks. The supported filter keys are WindowTaskId, TaskArn, Priority, and TaskType.
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the Maintenance Window whose tasks should be retrieved.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait DescribeMaintenanceWindowTasksResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the tasks in the Maintenance Window.
      */
    var Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of resource you want to retrieve information about. For example, "INSTANCE".
      */
    var ResourceType: MaintenanceWindowResourceType
    /**
      * The instance ID or key/value pair to retrieve information about.
      */
    var Targets: Targets
  }
  
  trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
    /**
      * The token for the next set of items to return. (You use this token in the next call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the Maintenance Window targets and tasks an instance is associated with.
      */
    var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined
  }
  
  trait DescribeMaintenanceWindowsRequest extends js.Object {
    /**
      * Optional filters used to narrow down the scope of the returned Maintenance Windows. Supported filter keys are Name and Enabled.
      */
    var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeMaintenanceWindowsResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the Maintenance Windows.
      */
    var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined
  }
  
  trait DescribeParametersRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[ParametersFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Filters to limit the request results.
      */
    var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
  }
  
  trait DescribeParametersResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Parameters returned by the request.
      */
    var Parameters: js.UndefOr[ParameterMetadataList] = js.undefined
  }
  
  trait DescribePatchBaselinesRequest extends js.Object {
    /**
      * Each element in the array is a structure containing:  Key: (string, "NAME_PREFIX" or "OWNER") Value: (array of strings, exactly 1 entry, between 1 and 255 characters)
      */
    var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
    /**
      * The maximum number of patch baselines to return (per page).
      */
    var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribePatchBaselinesResult extends js.Object {
    /**
      * An array of PatchBaselineIdentity elements.
      */
    var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribePatchGroupStateRequest extends js.Object {
    /**
      * The name of the patch group whose patch snapshot should be retrieved.
      */
    var PatchGroup: PatchGroup
  }
  
  trait DescribePatchGroupStateResult extends js.Object {
    /**
      * The number of instances in the patch group.
      */
    var Instances: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with patches from the patch baseline that failed to install.
      */
    var InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with patches installed that aren't defined in the patch baseline.
      */
    var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with installed patches.
      */
    var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
      */
    var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined
    /**
      * The number of instances with missing patches from the patch baseline.
      */
    var InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with patches that aren't applicable.
      */
    var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined
  }
  
  trait DescribePatchGroupsRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
    /**
      * The maximum number of patch groups to return (per page).
      */
    var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribePatchGroupsResult extends js.Object {
    /**
      * Each entry in the array contains: PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$) PatchBaselineIdentity: A PatchBaselineIdentity element. 
      */
    var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeSessionsRequest extends js.Object {
    /**
      * One or more filters to limit the type of sessions returned by the request.
      */
    var Filters: js.UndefOr[SessionFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[SessionMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The session status to retrieve a list of sessions for. For example, "Active".
      */
    var State: SessionState
  }
  
  trait DescribeSessionsResponse extends js.Object {
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of sessions meeting the request parameters.
      */
    var Sessions: js.UndefOr[SessionList] = js.undefined
  }
  
  trait DocumentDefaultVersionDescription extends js.Object {
    /**
      * The default version of the document.
      */
    var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The default version of the artifact associated with the document.
      */
    var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.undefined
    /**
      * The name of the document.
      */
    var Name: js.UndefOr[DocumentName] = js.undefined
  }
  
  trait DocumentDescription extends js.Object {
    /**
      * Details about the document attachments, including names, locations, sizes, etc.
      */
    var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined
    /**
      * The date when the document was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The default version.
      */
    var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * A description of the document. 
      */
    var Description: js.UndefOr[DescriptionInDocument] = js.undefined
    /**
      * The document format, either JSON or YAML.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The type of document.
      */
    var DocumentType: js.UndefOr[DocumentType] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
      */
    var Hash: js.UndefOr[DocumentHash] = js.undefined
    /**
      * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
      */
    var HashType: js.UndefOr[DocumentHashType] = js.undefined
    /**
      * The latest version of the document.
      */
    var LatestVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * The AWS user account that created the document.
      */
    var Owner: js.UndefOr[DocumentOwner] = js.undefined
    /**
      * A description of the parameters for a document.
      */
    var Parameters: js.UndefOr[DocumentParameterList] = js.undefined
    /**
      * The list of OS platforms compatible with this Systems Manager document. 
      */
    var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
    /**
      * The schema version.
      */
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
    /**
      * The SHA1 hash of the document, which you can use for verification.
      */
    var Sha1: js.UndefOr[DocumentSha1] = js.undefined
    /**
      * The status of the Systems Manager document.
      */
    var Status: js.UndefOr[DocumentStatus] = js.undefined
    /**
      * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
      */
    var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
    /**
      * The tags, or metadata, that have been applied to the document.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
      */
    var TargetType: js.UndefOr[TargetType] = js.undefined
    /**
      * The version of the artifact associated with the document.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait DocumentFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var key: DocumentFilterKey
    /**
      * The value of the filter.
      */
    var value: DocumentFilterValue
  }
  
  trait DocumentIdentifier extends js.Object {
    /**
      * The document format, either JSON or YAML.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The document type.
      */
    var DocumentType: js.UndefOr[DocumentType] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * The AWS user account that created the document.
      */
    var Owner: js.UndefOr[DocumentOwner] = js.undefined
    /**
      * The operating system platform. 
      */
    var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
    /**
      * The schema version.
      */
    var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
    /**
      * The tags, or metadata, that have been applied to the document.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
      */
    var TargetType: js.UndefOr[TargetType] = js.undefined
    /**
      * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait DocumentKeyValuesFilter extends js.Object {
    /**
      * The name of the filter key.
      */
    var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.undefined
    /**
      * The value for the filter key.
      */
    var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined
  }
  
  trait DocumentParameter extends js.Object {
    /**
      * If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.
      */
    var DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined
    /**
      * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.
      */
    var Description: js.UndefOr[DocumentParameterDescrption] = js.undefined
    /**
      * The name of the parameter.
      */
    var Name: js.UndefOr[DocumentParameterName] = js.undefined
    /**
      * The type of parameter. The type can be either String or StringList.
      */
    var Type: js.UndefOr[DocumentParameterType] = js.undefined
  }
  
  trait DocumentVersionInfo extends js.Object {
    /**
      * The date the document was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The document format, either JSON or YAML.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * An identifier for the default version of the document.
      */
    var IsDefaultVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * The document name.
      */
    var Name: js.UndefOr[DocumentName] = js.undefined
    /**
      * The status of the Systems Manager document, such as Creating, Active, Failed, and Deleting.
      */
    var Status: js.UndefOr[DocumentStatus] = js.undefined
    /**
      * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
      */
    var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
    /**
      * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait EffectivePatch extends js.Object {
    /**
      * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
      */
    var Patch: js.UndefOr[Patch] = js.undefined
    /**
      * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
      */
    var PatchStatus: js.UndefOr[PatchStatus] = js.undefined
  }
  
  trait FailedCreateAssociation extends js.Object {
    /**
      * The association.
      */
    var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined
    /**
      * The source of the failure.
      */
    var Fault: js.UndefOr[Fault] = js.undefined
    /**
      * A description of the failure.
      */
    var Message: js.UndefOr[BatchErrorMessage] = js.undefined
  }
  
  trait FailureDetails extends js.Object {
    /**
      * Detailed information about the Automation step failure.
      */
    var Details: js.UndefOr[AutomationParameterMap] = js.undefined
    /**
      * The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.
      */
    var FailureStage: js.UndefOr[String] = js.undefined
    /**
      * The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.
      */
    var FailureType: js.UndefOr[String] = js.undefined
  }
  
  trait GetAutomationExecutionRequest extends js.Object {
    /**
      * The unique identifier for an existing automation execution to examine. The execution ID is returned by StartAutomationExecution when the execution of an Automation document is initiated.
      */
    var AutomationExecutionId: AutomationExecutionId
  }
  
  trait GetAutomationExecutionResult extends js.Object {
    /**
      * Detailed information about the current state of an automation execution.
      */
    var AutomationExecution: js.UndefOr[AutomationExecution] = js.undefined
  }
  
  trait GetCommandInvocationRequest extends js.Object {
    /**
      * (Required) The parent command ID of the invocation plugin.
      */
    var CommandId: CommandId
    /**
      * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
      */
    var InstanceId: InstanceId
    /**
      * (Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.
      */
    var PluginName: js.UndefOr[CommandPluginName] = js.undefined
  }
  
  trait GetCommandInvocationResult extends js.Object {
    /**
      * CloudWatch Logs information where Systems Manager sent the command output.
      */
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
    /**
      * The parent command ID of the invocation plugin.
      */
    var CommandId: js.UndefOr[CommandId] = js.undefined
    /**
      * The comment text for the command.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
    /**
      * The name of the document that was executed. For example, AWS-RunShellScript.
      */
    var DocumentName: js.UndefOr[DocumentName] = js.undefined
    /**
      * The SSM document version used in the request.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * Duration since ExecutionStartDateTime.
      */
    var ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined
    /**
      * The date and time the plugin was finished executing. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedAfter filter.  aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z  If the plugin has not started to execute, the string is empty.
      */
    var ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined
    /**
      * The date and time the plugin started executing. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedBefore filter.  aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z  If the plugin has not started to execute, the string is empty.
      */
    var ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined
    /**
      * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
      */
    var PluginName: js.UndefOr[CommandPluginName] = js.undefined
    /**
      * The error level response code for the plugin script. If the response code is -1, then the command has not started executing on the instance, or it was not received by the instance.
      */
    var ResponseCode: js.UndefOr[ResponseCode] = js.undefined
    /**
      * The first 8,000 characters written by the plugin to stderr. If the command has not finished executing, then this string is empty.
      */
    var StandardErrorContent: js.UndefOr[StandardErrorContent] = js.undefined
    /**
      * The URL for the complete text written by the plugin to stderr. If the command has not finished executing, then this string is empty.
      */
    var StandardErrorUrl: js.UndefOr[Url] = js.undefined
    /**
      * The first 24,000 characters written by the plugin to stdout. If the command has not finished executing, if ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
      */
    var StandardOutputContent: js.UndefOr[StandardOutputContent] = js.undefined
    /**
      * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not specified, then this string is empty.
      */
    var StandardOutputUrl: js.UndefOr[Url] = js.undefined
    /**
      * The status of this invocation plugin. This status can be different than StatusDetails.
      */
    var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
    /**
      * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Delayed: The system attempted to send the command to the target, but the target was not available. The instance might not be available because of network issues, the instance was stopped, etc. The system will try to deliver the command again.   Success: The command or plugin was executed successfully. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: The command started to execute on the instance, but the execution was not complete before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't executed successfully on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
      */
    var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
  }
  
  trait GetConnectionStatusRequest extends js.Object {
    /**
      * The ID of the instance.
      */
    var Target: SessionTarget
  }
  
  trait GetConnectionStatusResponse extends js.Object {
    /**
      * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
      */
    var Status: js.UndefOr[ConnectionStatus] = js.undefined
    /**
      * The ID of the instance to check connection status. 
      */
    var Target: js.UndefOr[SessionTarget] = js.undefined
  }
  
  trait GetDefaultPatchBaselineRequest extends js.Object {
    /**
      * Returns the default patch baseline for the specified operating system.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  }
  
  trait GetDefaultPatchBaselineResult extends js.Object {
    /**
      * The ID of the default patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The operating system for the returned patch baseline. 
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  }
  
  trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
    /**
      * The ID of the instance for which the appropriate patch snapshot should be retrieved.
      */
    var InstanceId: InstanceId
    /**
      * The user-defined snapshot ID.
      */
    var SnapshotId: SnapshotId
  }
  
  trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
    /**
      * The ID of the instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the instance for the specified patch snapshot.
      */
    var Product: js.UndefOr[Product] = js.undefined
    /**
      * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
      */
    var SnapshotDownloadUrl: js.UndefOr[SnapshotDownloadUrl] = js.undefined
    /**
      * The user-defined snapshot ID.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  trait GetDocumentRequest extends js.Object {
    /**
      * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The document version for which you want information.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: DocumentARN
    /**
      * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait GetDocumentResult extends js.Object {
    /**
      * A description of the document attachments, including names, locations, sizes, etc.
      */
    var AttachmentsContent: js.UndefOr[AttachmentContentList] = js.undefined
    /**
      * The contents of the Systems Manager document.
      */
    var Content: js.UndefOr[DocumentContent] = js.undefined
    /**
      * The document format, either JSON or YAML.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The document type.
      */
    var DocumentType: js.UndefOr[DocumentType] = js.undefined
    /**
      * The document version.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the Systems Manager document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * The status of the Systems Manager document, such as Creating, Active, Updating, Failed, and Deleting.
      */
    var Status: js.UndefOr[DocumentStatus] = js.undefined
    /**
      * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
      */
    var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
    /**
      * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait GetInventoryRequest extends js.Object {
    /**
      * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
      */
    var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[InventoryFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of inventory item types to return.
      */
    var ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined
  }
  
  trait GetInventoryResult extends js.Object {
    /**
      * Collection of inventory entities such as a collection of instance inventory. 
      */
    var Entities: js.UndefOr[InventoryResultEntityList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetInventorySchemaRequest extends js.Object {
    /**
      * Returns inventory schemas that support aggregation. For example, this call returns the AWS:InstanceInformation type, because it supports aggregation based on the PlatformName, PlatformType, and PlatformVersion attributes.
      */
    var Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Returns the sub-type schema for a specified inventory type.
      */
    var SubType: js.UndefOr[IsSubTypeSchema] = js.undefined
    /**
      * The type of inventory item to return.
      */
    var TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.undefined
  }
  
  trait GetInventorySchemaResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Inventory schemas returned by the request.
      */
    var Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.undefined
  }
  
  trait GetMaintenanceWindowExecutionRequest extends js.Object {
    /**
      * The ID of the Maintenance Window execution that includes the task.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait GetMaintenanceWindowExecutionResult extends js.Object {
    /**
      * The time the Maintenance Window finished executing.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time the Maintenance Window started executing.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the Maintenance Window execution.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the Status. Only available for certain status values.
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The ID of the task executions from the Maintenance Window execution.
      */
    var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined
    /**
      * The ID of the Maintenance Window execution.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  }
  
  trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
    /**
      * The invocation ID to retrieve.
      */
    var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    /**
      * The ID of the specific task in the Maintenance Window task that should be retrieved. 
      */
    var TaskId: MaintenanceWindowExecutionTaskId
    /**
      * The ID of the Maintenance Window execution for which the task is a part.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
    /**
      * The time that the task finished executing on the target.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The execution ID.
      */
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined
    /**
      * The invocation ID.
      */
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined
    /**
      * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window. 
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The parameters used at the time that the task executed.
      */
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined
    /**
      * The time that the task started executing on the target.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The task status for an invocation.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the status. Details are only available for certain status values.
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The task execution ID.
      */
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
    /**
      * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION, AUTOMATION, RUN_COMMAND.
      */
    var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The Maintenance Window execution ID.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    /**
      * The Maintenance Window target ID.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
  }
  
  trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
    /**
      * The ID of the specific task execution in the Maintenance Window task that should be retrieved.
      */
    var TaskId: MaintenanceWindowExecutionTaskId
    /**
      * The ID of the Maintenance Window execution that includes the task.
      */
    var WindowExecutionId: MaintenanceWindowExecutionId
  }
  
  trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
    /**
      * The time the task execution completed.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The defined maximum number of task executions that could be run in parallel.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The defined maximum number of task execution errors allowed before scheduling of the task execution would have been stopped.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The priority of the task.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * The role that was assumed when executing the task.
      */
    var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The time the task execution started.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the task.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the Status. Only available for certain status values.
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The ARN of the executed task.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The ID of the specific task execution in the Maintenance Window task that was retrieved.
      */
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
    /**
      * The parameters passed to the task when it was executed.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined
    /**
      * The type of task executed.
      */
    var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The ID of the Maintenance Window execution that includes the task.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  }
  
  trait GetMaintenanceWindowRequest extends js.Object {
    /**
      * The ID of the desired Maintenance Window.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait GetMaintenanceWindowResult extends js.Object {
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
    /**
      * The date the Maintenance Window was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
    /**
      * The description of the Maintenance Window.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The duration of the Maintenance Window in hours.
      */
    var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
    /**
      * Whether the Maintenance Windows is enabled.
      */
    var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become inactive. The Maintenance Window will not run after this specified time.
      */
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The date the Maintenance Window was last modified.
      */
    var ModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the Maintenance Window.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The next time the Maintenance Window will actually run, taking into account any specified times for the Maintenance Window to become active or inactive.
      */
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The schedule of the Maintenance Window in the form of a cron or rate expression.
      */
    var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
      */
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become active. The Maintenance Window will not run before this specified time.
      */
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The ID of the created Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait GetMaintenanceWindowTaskRequest extends js.Object {
    /**
      * The Maintenance Window ID that includes the task to retrieve.
      */
    var WindowId: MaintenanceWindowId
    /**
      * The Maintenance Window task ID to retrieve.
      */
    var WindowTaskId: MaintenanceWindowTaskId
  }
  
  trait GetMaintenanceWindowTaskResult extends js.Object {
    /**
      * The retrieved task description.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The location in Amazon S3 where the task results are logged.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
    /**
      * The maximum number of targets allowed to run this task in parallel.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The maximum number of errors allowed before the task stops being scheduled.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The retrieved task name.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The priority of the task when it executes. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * The IAM service role to assume during task execution.
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The targets where the task should execute.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTION tasks, the value is the state machine ARN.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The parameters to pass to the task when it executes.
      */
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
    /**
      * The parameters to pass to the task when it executes.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    /**
      * The type of task to execute.
      */
    var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The retrieved Maintenance Window ID.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The retrieved Maintenance Window task ID.
      */
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
  }
  
  trait GetParameterHistoryRequest extends js.Object {
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of a parameter you want to query.
      */
    var Name: PSParameterName
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
      */
    var WithDecryption: js.UndefOr[Boolean] = js.undefined
  }
  
  trait GetParameterHistoryResult extends js.Object {
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of parameters returned by the request.
      */
    var Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
  }
  
  trait GetParameterRequest extends js.Object {
    /**
      * The name of the parameter you want to query.
      */
    var Name: PSParameterName
    /**
      * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
      */
    var WithDecryption: js.UndefOr[Boolean] = js.undefined
  }
  
  trait GetParameterResult extends js.Object {
    /**
      * Information about a parameter.
      */
    var Parameter: js.UndefOr[Parameter] = js.undefined
  }
  
  trait GetParametersByPathRequest extends js.Object {
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Filters to limit the request results.  You can't filter using the parameter name. 
      */
    var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
    /**
      * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: /Finance/Prod/IAD/WinServ2016/license33 
      */
    var Path: PSParameterName
    /**
      * Retrieve all parameters within a hierarchy.  If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path /a, then the user can also access /a/b. Even if a user has explicitly been denied access in IAM for parameter /a, they can still call the GetParametersByPath API action recursively and view /a/b. 
      */
    var Recursive: js.UndefOr[Boolean] = js.undefined
    /**
      * Retrieve all parameters in a hierarchy with their value decrypted.
      */
    var WithDecryption: js.UndefOr[Boolean] = js.undefined
  }
  
  trait GetParametersByPathResult extends js.Object {
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of parameters found in the specified hierarchy.
      */
    var Parameters: js.UndefOr[ParameterList] = js.undefined
  }
  
  trait GetParametersRequest extends js.Object {
    /**
      * Names of the parameters for which you want to query information.
      */
    var Names: ParameterNameList
    /**
      * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
      */
    var WithDecryption: js.UndefOr[Boolean] = js.undefined
  }
  
  trait GetParametersResult extends js.Object {
    /**
      * A list of parameters that are not formatted correctly or do not run when executed.
      */
    var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
    /**
      * A list of details for a parameter.
      */
    var Parameters: js.UndefOr[ParameterList] = js.undefined
  }
  
  trait GetPatchBaselineForPatchGroupRequest extends js.Object {
    /**
      * Returns he operating system rule specified for patch groups using the patch baseline.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * The name of the patch group whose patch baseline should be retrieved.
      */
    var PatchGroup: PatchGroup
  }
  
  trait GetPatchBaselineForPatchGroupResult extends js.Object {
    /**
      * The ID of the patch baseline that should be used for the patch group.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The operating system rule specified for patch groups using the patch baseline.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * The name of the patch group.
      */
    var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
  }
  
  trait GetPatchBaselineRequest extends js.Object {
    /**
      * The ID of the patch baseline to retrieve.
      */
    var BaselineId: BaselineId
  }
  
  trait GetPatchBaselineResult extends js.Object {
    /**
      * A set of rules used to include patches in the baseline.
      */
    var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
    /**
      * A list of explicitly approved patches for the baseline.
      */
    var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * Returns the specified compliance severity level for approved patches in the patch baseline.
      */
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
      */
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the retrieved patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The date the patch baseline was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * A description of the patch baseline.
      */
    var Description: js.UndefOr[BaselineDescription] = js.undefined
    /**
      * A set of global filters used to exclude patches from the baseline.
      */
    var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    /**
      * The date the patch baseline was last modified.
      */
    var ModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the patch baseline.
      */
    var Name: js.UndefOr[BaselineName] = js.undefined
    /**
      * Returns the operating system specified for the patch baseline.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * Patch groups included in the patch baseline.
      */
    var PatchGroups: js.UndefOr[PatchGroupList] = js.undefined
    /**
      * A list of explicitly rejected patches for the baseline.
      */
    var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
      */
    var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
    /**
      * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
      */
    var Sources: js.UndefOr[PatchSourceList] = js.undefined
  }
  
  trait InstanceAggregatedAssociationOverview extends js.Object {
    /**
      * Detailed status information about the aggregated associations.
      */
    var DetailedStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The number of associations for the instance(s).
      */
    var InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined
  }
  
  trait InstanceAssociation extends js.Object {
    /**
      * The association ID.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * Version information for the association on the instance.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * The content of the association document for the instance(s).
      */
    var Content: js.UndefOr[DocumentContent] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
  }
  
  trait InstanceAssociationOutputLocation extends js.Object {
    /**
      * An Amazon S3 bucket where you want to store the results of this request.
      */
    var S3Location: js.UndefOr[S3OutputLocation] = js.undefined
  }
  
  trait InstanceAssociationOutputUrl extends js.Object {
    /**
      * The URL of Amazon S3 bucket where you want to store the results of this request.
      */
    var S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined
  }
  
  trait InstanceAssociationStatusAggregatedCount
    extends /* key */ org.scalablytyped.runtime.StringDictionary[InstanceCount]
  
  trait InstanceAssociationStatusInfo extends js.Object {
    /**
      * The association ID.
      */
    var AssociationId: js.UndefOr[AssociationId] = js.undefined
    /**
      * The name of the association applied to the instance.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * The version of the association applied to the instance.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * Detailed status information about the instance association.
      */
    var DetailedStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The association document verions.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * An error code returned by the request to create the association.
      */
    var ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined
    /**
      * The date the instance association executed. 
      */
    var ExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * Summary information about association execution.
      */
    var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined
    /**
      * The instance ID where the association was created.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The name of the association.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * A URL for an Amazon S3 bucket where you want to store the results of this request.
      */
    var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined
    /**
      * Status information about the instance association.
      */
    var Status: js.UndefOr[StatusName] = js.undefined
  }
  
  trait InstanceInformation extends js.Object {
    /**
      * The activation ID created by Systems Manager when the server or VM was registered.
      */
    var ActivationId: js.UndefOr[ActivationId] = js.undefined
    /**
      * The version of SSM Agent running on your Linux instance. 
      */
    var AgentVersion: js.UndefOr[Version] = js.undefined
    /**
      * Information about the association.
      */
    var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.undefined
    /**
      * The status of the association.
      */
    var AssociationStatus: js.UndefOr[StatusName] = js.undefined
    /**
      * The fully qualified host name of the managed instance.
      */
    var ComputerName: js.UndefOr[ComputerName] = js.undefined
    /**
      * The IP address of the managed instance.
      */
    var IPAddress: js.UndefOr[IPAddress] = js.undefined
    /**
      * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instances. This call does not return the IAM role for Amazon EC2 instances. 
      */
    var IamRole: js.UndefOr[IamRole] = js.undefined
    /**
      * The instance ID. 
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * Indicates whether latest version of SSM Agent is running on your instance. Some older versions of Windows Server use the EC2Config service to process SSM requests. For this reason, this field does not indicate whether or not the latest version is installed on Windows managed instances.
      */
    var IsLatestVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * The date the association was last executed.
      */
    var LastAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The date and time when agent last pinged Systems Manager service. 
      */
    var LastPingDateTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The last date the association was successfully run.
      */
    var LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the managed instance.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * Connection status of SSM Agent. 
      */
    var PingStatus: js.UndefOr[PingStatus] = js.undefined
    /**
      * The name of the operating system platform running on your instance. 
      */
    var PlatformName: js.UndefOr[String] = js.undefined
    /**
      * The operating system platform type. 
      */
    var PlatformType: js.UndefOr[PlatformType] = js.undefined
    /**
      * The version of the OS platform running on your instance. 
      */
    var PlatformVersion: js.UndefOr[String] = js.undefined
    /**
      * The date the server or VM was registered with AWS as a managed instance.
      */
    var RegistrationDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The type of instance. Instances are either EC2 instances or managed instances. 
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait InstanceInformationFilter extends js.Object {
    /**
      * The name of the filter. 
      */
    var key: InstanceInformationFilterKey
    /**
      * The filter values.
      */
    var valueSet: InstanceInformationFilterValueSet
  }
  
  trait InstanceInformationStringFilter extends js.Object {
    /**
      * The filter key name to describe your instances. For example: "InstanceIds"|"AgentVersion"|"PingStatus"|"PlatformTypes"|"ActivationIds"|"IamRole"|"ResourceType"|"AssociationStatus"|"Tag Key"
      */
    var Key: InstanceInformationStringFilterKey
    /**
      * The filter values.
      */
    var Values: InstanceInformationFilterValueSet
  }
  
  trait InstancePatchState extends js.Object {
    /**
      * The ID of the patch baseline used to patch the instance.
      */
    var BaselineId: BaselineId
    /**
      * The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.
      */
    var FailedCount: js.UndefOr[PatchFailedCount] = js.undefined
    /**
      * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an Amazon S3 bucket in YAML format and specify in the SSM document AWS-RunPatchBaseline, overrides the patches specified by the default patch baseline. For more information about the InstallOverrideList parameter, see About the SSM Document AWS-RunPatchBaseline in the AWS Systems Manager User Guide.
      */
    var InstallOverrideList: js.UndefOr[InstallOverrideList] = js.undefined
    /**
      * The number of patches from the patch baseline that are installed on the instance.
      */
    var InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined
    /**
      * The number of patches not specified in the patch baseline that are installed on the instance.
      */
    var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined
    /**
      * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of InstalledRejected were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero). 
      */
    var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined
    /**
      * The ID of the managed instance the high-level patch compliance information was collected for.
      */
    var InstanceId: InstanceId
    /**
      * The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.
      */
    var MissingCount: js.UndefOr[PatchMissingCount] = js.undefined
    /**
      * The number of patches from the patch baseline that aren't applicable for the instance and hence aren't installed on the instance.
      */
    var NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined
    /**
      * The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).
      */
    var Operation: PatchOperationType
    /**
      * The time the most recent patching operation completed on the instance.
      */
    var OperationEndTime: DateTime
    /**
      * The time the most recent patching operation was started on the instance.
      */
    var OperationStartTime: DateTime
    /**
      * Placeholder information. This field will always be empty in the current release of the service.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The name of the patch group the managed instance belongs to.
      */
    var PatchGroup: PatchGroup
    /**
      * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  trait InstancePatchStateFilter extends js.Object {
    /**
      * The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.
      */
    var Key: InstancePatchStateFilterKey
    /**
      * The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.
      */
    var Type: InstancePatchStateOperatorType
    /**
      * The value for the filter, must be an integer greater than or equal to 0.
      */
    var Values: InstancePatchStateFilterValues
  }
  
  trait InventoryAggregator extends js.Object {
    /**
      * Nested aggregators to further refine aggregation for an inventory type.
      */
    var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
    /**
      * The inventory type and attribute name for aggregation.
      */
    var Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined
    /**
      * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
      */
    var Groups: js.UndefOr[InventoryGroupList] = js.undefined
  }
  
  trait InventoryDeletionStatusItem extends js.Object {
    /**
      * The deletion ID returned by the DeleteInventory action.
      */
    var DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined
    /**
      * The UTC timestamp when the delete operation started.
      */
    var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined
    /**
      * Information about the delete operation. For more information about this summary, see Understanding the Delete Inventory Summary in the AWS Systems Manager User Guide.
      */
    var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined
    /**
      * The status of the operation. Possible values are InProgress and Complete.
      */
    var LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined
    /**
      * Information about the status.
      */
    var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined
    /**
      * The UTC timestamp of when the last status report.
      */
    var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined
    /**
      * The name of the inventory data type.
      */
    var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
  }
  
  trait InventoryDeletionSummary extends js.Object {
    /**
      * Remaining number of items to delete.
      */
    var RemainingCount: js.UndefOr[RemainingCount] = js.undefined
    /**
      * A list of counts and versions for deleted items.
      */
    var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined
    /**
      * The total number of items to delete. This count does not change during the delete operation.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait InventoryDeletionSummaryItem extends js.Object {
    /**
      * A count of the number of deleted items.
      */
    var Count: js.UndefOr[ResourceCount] = js.undefined
    /**
      * The remaining number of items to delete.
      */
    var RemainingCount: js.UndefOr[RemainingCount] = js.undefined
    /**
      * The inventory type version.
      */
    var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
  }
  
  trait InventoryFilter extends js.Object {
    /**
      * The name of the filter key.
      */
    var Key: InventoryFilterKey
    /**
      * The type of filter. Valid values include the following: "Equal"|"NotEqual"|"BeginWith"|"LessThan"|"GreaterThan"
      */
    var Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined
    /**
      * Inventory filter values. Example: inventory filter where instance IDs are specified as values Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal 
      */
    var Values: InventoryFilterValueList
  }
  
  trait InventoryGroup extends js.Object {
    /**
      * Filters define the criteria for the group. The matchingCount field displays the number of resources that match the criteria. The notMatchingCount field displays the number of resources that don't match the criteria. 
      */
    var Filters: InventoryFilterList
    /**
      * The name of the group.
      */
    var Name: InventoryGroupName
  }
  
  trait InventoryItem extends js.Object {
    /**
      * The time the inventory information was collected.
      */
    var CaptureTime: InventoryItemCaptureTime
    /**
      * The inventory data of the inventory type.
      */
    var Content: js.UndefOr[InventoryItemEntryList] = js.undefined
    /**
      * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
      */
    var ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
    /**
      * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify the ExecutionId, ExecutionType, ComplianceType properties of the AWS:ComplianceItem type.
      */
    var Context: js.UndefOr[InventoryItemContentContext] = js.undefined
    /**
      * The schema version for the inventory item.
      */
    var SchemaVersion: InventoryItemSchemaVersion
    /**
      * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
      */
    var TypeName: InventoryItemTypeName
  }
  
  trait InventoryItemAttribute extends js.Object {
    /**
      * The data type of the inventory item attribute. 
      */
    var DataType: InventoryAttributeDataType
    /**
      * Name of the inventory item attribute.
      */
    var Name: InventoryItemAttributeName
  }
  
  trait InventoryItemContentContext
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait InventoryItemEntry
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait InventoryItemSchema extends js.Object {
    /**
      * The schema attributes for inventory. This contains data type and attribute name.
      */
    var Attributes: InventoryItemAttributeList
    /**
      * The alias name of the inventory type. The alias name is used for display purposes.
      */
    var DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.undefined
    /**
      * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
      */
    var TypeName: InventoryItemTypeName
    /**
      * The schema version for the inventory item.
      */
    var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
  }
  
  trait InventoryResultEntity extends js.Object {
    /**
      * The data section in the inventory result entity JSON.
      */
    var Data: js.UndefOr[InventoryResultItemMap] = js.undefined
    /**
      * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed instance ID. For EC2 instance inventory, the result will be the instance ID. 
      */
    var Id: js.UndefOr[InventoryResultEntityId] = js.undefined
  }
  
  trait InventoryResultItem extends js.Object {
    /**
      * The time inventory item data was captured.
      */
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined
    /**
      * Contains all the inventory data of the item type. Results include attribute names and values. 
      */
    var Content: InventoryItemEntryList
    /**
      * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
      */
    var ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
    /**
      * The schema version for the inventory result item/
      */
    var SchemaVersion: InventoryItemSchemaVersion
    /**
      * The name of the inventory result item type.
      */
    var TypeName: InventoryItemTypeName
  }
  
  trait InventoryResultItemMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[InventoryResultItem]
  
  trait LabelParameterVersionRequest extends js.Object {
    /**
      * One or more labels to attach to the specified parameter version.
      */
    var Labels: ParameterLabelList
    /**
      * The parameter name on which you want to attach one or more labels.
      */
    var Name: PSParameterName
    /**
      * The specific version of the parameter on which you want to attach one or more labels. If no version is specified, the system attaches the label to the latest version.)
      */
    var ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
  }
  
  trait LabelParameterVersionResult extends js.Object {
    /**
      * The label does not meet the requirements. For information about parameter label requirements, see Labeling Parameters in the AWS Systems Manager User Guide.
      */
    var InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined
  }
  
  trait ListAssociationVersionsRequest extends js.Object {
    /**
      * The association ID for which you want to view all versions.
      */
    var AssociationId: AssociationId
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAssociationVersionsResult extends js.Object {
    /**
      * Information about all versions of the association for the specified association ID.
      */
    var AssociationVersions: js.UndefOr[AssociationVersionList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAssociationsRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAssociationsResult extends js.Object {
    /**
      * The associations.
      */
    var Associations: js.UndefOr[AssociationList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCommandInvocationsRequest extends js.Object {
    /**
      * (Optional) The invocations for a specific command ID.
      */
    var CommandId: js.UndefOr[CommandId] = js.undefined
    /**
      * (Optional) If set this returns the response of the command executions and any command output. By default this is set to False. 
      */
    var Details: js.UndefOr[Boolean] = js.undefined
    /**
      * (Optional) One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[CommandFilterList] = js.undefined
    /**
      * (Optional) The command execution details for a specific instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[CommandMaxResults] = js.undefined
    /**
      * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCommandInvocationsResult extends js.Object {
    /**
      * (Optional) A list of all invocations. 
      */
    var CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined
    /**
      * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCommandsRequest extends js.Object {
    /**
      * (Optional) If provided, lists only the specified command.
      */
    var CommandId: js.UndefOr[CommandId] = js.undefined
    /**
      * (Optional) One or more filters. Use a filter to return a more specific list of results. 
      */
    var Filters: js.UndefOr[CommandFilterList] = js.undefined
    /**
      * (Optional) Lists commands issued against this instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[CommandMaxResults] = js.undefined
    /**
      * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCommandsResult extends js.Object {
    /**
      * (Optional) The list of commands requested by the user. 
      */
    var Commands: js.UndefOr[CommandList] = js.undefined
    /**
      * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListComplianceItemsRequest extends js.Object {
    /**
      * One or more compliance filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID for the resources from which to get compliance information. Currently, you can only specify one resource ID.
      */
    var ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined
    /**
      * The type of resource from which to get compliance information. Currently, the only supported resource type is ManagedInstance.
      */
    var ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined
  }
  
  trait ListComplianceItemsResult extends js.Object {
    /**
      * A list of compliance information for the specified resource ID. 
      */
    var ComplianceItems: js.UndefOr[ComplianceItemList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListComplianceSummariesRequest extends js.Object {
    /**
      * One or more compliance or inventory filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. Currently, you can specify null or 50. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListComplianceSummariesResult extends js.Object {
    /**
      * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns State Manager associations, patches, or custom compliance types according to the filter criteria that you specified.
      */
    var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.undefined
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDocumentVersionsRequest extends js.Object {
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the document about which you want version information.
      */
    var Name: DocumentName
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDocumentVersionsResult extends js.Object {
    /**
      * The document versions.
      */
    var DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDocumentsRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDocumentsResult extends js.Object {
    /**
      * The names of the Systems Manager documents.
      */
    var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListInventoryEntriesRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[InventoryFilterList] = js.undefined
    /**
      * The instance ID for which you want inventory information.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of inventory item for which you want information.
      */
    var TypeName: InventoryItemTypeName
  }
  
  trait ListInventoryEntriesResult extends js.Object {
    /**
      * The time that inventory information was collected for the instance(s).
      */
    var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined
    /**
      * A list of inventory items on the instance(s).
      */
    var Entries: js.UndefOr[InventoryItemEntryList] = js.undefined
    /**
      * The instance ID targeted by the request to query inventory information.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The inventory schema version used by the instance(s).
      */
    var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
    /**
      * The type of inventory item returned by the request.
      */
    var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
  }
  
  trait ListResourceComplianceSummariesRequest extends js.Object {
    /**
      * One or more filters. Use a filter to return a more specific list of results.
      */
    var Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResourceComplianceSummariesResult extends js.Object {
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A summary count for specified or targeted managed instances. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
      */
    var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined
  }
  
  trait ListResourceDataSyncRequest extends js.Object {
    /**
      * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResourceDataSyncResult extends js.Object {
    /**
      * The token for the next set of items to return. Use this token to get the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of your current Resource Data Sync configurations and their statuses.
      */
    var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The resource ID for which you want to see a list of tags.
      */
    var ResourceId: ResourceId
    /**
      * Returns a list of tags for a specific resource type.
      */
    var ResourceType: ResourceTypeForTagging
  }
  
  trait ListTagsForResourceResult extends js.Object {
    /**
      * A list of tags.
      */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  trait LoggingInfo extends js.Object {
    /**
      * The name of an Amazon S3 bucket where execution logs are stored .
      */
    var S3BucketName: S3BucketName
    /**
      * (Optional) The Amazon S3 bucket subfolder. 
      */
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The region where the Amazon S3 bucket is located.
      */
    var S3Region: S3Region
  }
  
  trait MaintenanceWindowAutomationParameters extends js.Object {
    /**
      * The version of an Automation document to use during task execution.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The parameters for the AUTOMATION task. For information about specifying and updating task parameters, see RegisterTaskWithMaintenanceWindow and UpdateMaintenanceWindowTask.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters.  TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. For AUTOMATION task types, Systems Manager ignores any values specified for these parameters. 
      */
    var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  }
  
  trait MaintenanceWindowExecution extends js.Object {
    /**
      * The time the execution finished.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time the execution started.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the execution.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the Status. Only available for certain status values.
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The ID of the Maintenance Window execution.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    /**
      * The ID of the Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
    /**
      * The time the task execution finished.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time the task execution started.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the task execution.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the status of the task execution. Only available for certain status values.
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The ARN of the executed task.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The ID of the specific task execution in the Maintenance Window execution.
      */
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
    /**
      * The type of executed task.
      */
    var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The ID of the Maintenance Window execution that ran the task.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  }
  
  trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
    /**
      * The time the invocation finished.
      */
    var EndTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.
      */
    var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined
    /**
      * The ID of the task invocation.
      */
    var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined
    /**
      * User-provided value that was specified when the target was registered with the Maintenance Window. This was also included in any CloudWatch events raised during the task invocation.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The parameters that were provided for the invocation when it was executed.
      */
    var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined
    /**
      * The time the invocation started.
      */
    var StartTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the task invocation.
      */
    var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
    /**
      * The details explaining the status of the task invocation. Only available for certain Status values. 
      */
    var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
    /**
      * The ID of the specific task execution in the Maintenance Window execution.
      */
    var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
    /**
      * The task type.
      */
    var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The ID of the Maintenance Window execution that ran the task.
      */
    var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
    /**
      * The ID of the target definition in this Maintenance Window the invocation was performed for.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
  }
  
  trait MaintenanceWindowFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined
    /**
      * The filter values.
      */
    var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
  }
  
  trait MaintenanceWindowIdentity extends js.Object {
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
    /**
      * A description of the Maintenance Window.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The duration of the Maintenance Window in hours.
      */
    var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
    /**
      * Whether the Maintenance Window is enabled.
      */
    var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become inactive.
      */
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The name of the Maintenance Window.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The next time the Maintenance Window will actually run, taking into account any specified times for the Maintenance Window to become active or inactive.
      */
    var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The schedule of the Maintenance Window in the form of a cron or rate expression.
      */
    var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format.
      */
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become active.
      */
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The ID of the Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait MaintenanceWindowIdentityForTarget extends js.Object {
    /**
      * The name of the Maintenance Window.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The ID of the Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait MaintenanceWindowLambdaParameters extends js.Object {
    /**
      * Pass client-specific information to the Lambda function that you are invoking. You can then process the client information in your Lambda function as you choose through the context variable.
      */
    var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined
    /**
      * JSON to provide to your Lambda function as input.
      */
    var Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined
    /**
      * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses the alias ARN to invoke the Lambda function version to which the alias points.
      */
    var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined
  }
  
  trait MaintenanceWindowRunCommandParameters extends js.Object {
    /**
      * Information about the command(s) to execute.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
    /**
      * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
      */
    var DocumentHash: js.UndefOr[DocumentHash] = js.undefined
    /**
      * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
      */
    var DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined
    /**
      * Configurations for sending notifications about command status changes on a per-instance basis.
      */
    var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
    /**
      * The name of the Amazon S3 bucket.
      */
    var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The Amazon S3 bucket subfolder.
      */
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The parameters for the RUN_COMMAND task execution.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The IAM service role to assume during task execution.
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * If this time is reached and the command has not already started executing, it doesn't run.
      */
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
  }
  
  trait MaintenanceWindowStepFunctionsParameters extends js.Object {
    /**
      * The inputs for the STEP_FUNCTION task.
      */
    var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined
    /**
      * The name of the STEP_FUNCTION task.
      */
    var Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined
  }
  
  trait MaintenanceWindowTarget extends js.Object {
    /**
      * A description of the target.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The target name.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The type of target.
      */
    var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
    /**
      * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The Maintenance Window ID where the target is registered.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The ID of the target.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
  }
  
  trait MaintenanceWindowTask extends js.Object {
    /**
      * A description of the task.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * Information about an Amazon S3 bucket to write task-level logs to.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The task name.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The priority of the task in the Maintenance Window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * The role that should be assumed when executing the task
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The resource that the task uses during execution. For RUN_COMMAND and AUTOMATION task types, TaskArn is the Systems Manager document name or ARN. For LAMBDA tasks, it's the function name or ARN. For STEP_FUNCTION tasks, it's the state machine ARN.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The parameters that should be passed to the task when it is executed.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    /**
      * The type of task. The type can be one of the following: RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTION.
      */
    var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
    /**
      * The Maintenance Window ID where the task is registered.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The task ID.
      */
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
  }
  
  trait MaintenanceWindowTaskInvocationParameters extends js.Object {
    /**
      * The parameters for an AUTOMATION task type.
      */
    var Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.undefined
    /**
      * The parameters for a LAMBDA task type.
      */
    var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.undefined
    /**
      * The parameters for a RUN_COMMAND task type.
      */
    var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.undefined
    /**
      * The parameters for a STEP_FUNCTION task type.
      */
    var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined
  }
  
  trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
    /**
      * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
      */
    var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined
  }
  
  trait MaintenanceWindowTaskParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MaintenanceWindowTaskParameterValueExpression]
  
  trait ModifyDocumentPermissionRequest extends js.Object {
    /**
      * The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or All.
      */
    var AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined
    /**
      * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a group of account IDs or All. This action has a higher priority than AccountIdsToAdd. If you specify an account ID to add and the same ID to remove, the system removes access to the document.
      */
    var AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined
    /**
      * The name of the document that you want to share.
      */
    var Name: DocumentName
    /**
      * The permission type for the document. The permission type can be Share.
      */
    var PermissionType: DocumentPermissionType
  }
  
  trait ModifyDocumentPermissionResponse extends js.Object
  
  trait NonCompliantSummary extends js.Object {
    /**
      * The total number of compliance items that are not compliant.
      */
    var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * A summary of the non-compliance severity by compliance type
      */
    var SeveritySummary: js.UndefOr[SeveritySummary] = js.undefined
  }
  
  trait NormalStringMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait NotificationConfig extends js.Object {
    /**
      * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
      */
    var NotificationArn: js.UndefOr[NotificationArn] = js.undefined
    /**
      * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Configuring Amazon SNS Notifications for Run Command in the AWS Systems Manager User Guide.
      */
    var NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined
    /**
      * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
      */
    var NotificationType: js.UndefOr[NotificationType] = js.undefined
  }
  
  trait OutputSource extends js.Object {
    /**
      * The ID of the output source, for example the URL of an Amazon S3 bucket.
      */
    var OutputSourceId: js.UndefOr[OutputSourceId] = js.undefined
    /**
      * The type of source where the association execution details are stored, for example, Amazon S3.
      */
    var OutputSourceType: js.UndefOr[OutputSourceType] = js.undefined
  }
  
  trait Parameter extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the parameter.
      */
    var ARN: js.UndefOr[String] = js.undefined
    /**
      * Date the parameter was last changed or updated and the parameter version was created.
      */
    var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the parameter.
      */
    var Name: js.UndefOr[PSParameterName] = js.undefined
    /**
      * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats: parameter_name:version parameter_name:label
      */
    var Selector: js.UndefOr[PSParameterSelector] = js.undefined
    /**
      * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.
      */
    var SourceResult: js.UndefOr[String] = js.undefined
    /**
      * The type of parameter. Valid values include the following: String, String list, Secure string.
      */
    var Type: js.UndefOr[ParameterType] = js.undefined
    /**
      * The parameter value.
      */
    var Value: js.UndefOr[PSParameterValue] = js.undefined
    /**
      * The parameter version.
      */
    var Version: js.UndefOr[PSParameterVersion] = js.undefined
  }
  
  trait ParameterHistory extends js.Object {
    /**
      * Parameter names can include the following letters and symbols. a-zA-Z0-9_.-
      */
    var AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined
    /**
      * Information about the parameter.
      */
    var Description: js.UndefOr[ParameterDescription] = js.undefined
    /**
      * The ID of the query key used for this parameter.
      */
    var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
    /**
      * Labels assigned to the parameter version.
      */
    var Labels: js.UndefOr[ParameterLabelList] = js.undefined
    /**
      * Date the parameter was last changed or updated.
      */
    var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
      */
    var LastModifiedUser: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter.
      */
    var Name: js.UndefOr[PSParameterName] = js.undefined
    /**
      * The type of parameter used.
      */
    var Type: js.UndefOr[ParameterType] = js.undefined
    /**
      * The parameter value.
      */
    var Value: js.UndefOr[PSParameterValue] = js.undefined
    /**
      * The parameter version.
      */
    var Version: js.UndefOr[PSParameterVersion] = js.undefined
  }
  
  trait ParameterMetadata extends js.Object {
    /**
      * A parameter name can include only the following letters and symbols. a-zA-Z0-9_.-
      */
    var AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined
    /**
      * Description of the parameter actions.
      */
    var Description: js.UndefOr[ParameterDescription] = js.undefined
    /**
      * The ID of the query key used for this parameter.
      */
    var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
    /**
      * Date the parameter was last changed or updated.
      */
    var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
      */
    var LastModifiedUser: js.UndefOr[String] = js.undefined
    /**
      * The parameter name.
      */
    var Name: js.UndefOr[PSParameterName] = js.undefined
    /**
      * The type of parameter. Valid parameter types include the following: String, String list, Secure string.
      */
    var Type: js.UndefOr[ParameterType] = js.undefined
    /**
      * The parameter version.
      */
    var Version: js.UndefOr[PSParameterVersion] = js.undefined
  }
  
  trait ParameterStringFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var Key: ParameterStringFilterKey
    /**
      * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
      */
    var Option: js.UndefOr[ParameterStringQueryOption] = js.undefined
    /**
      * The value you want to search for.
      */
    var Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined
  }
  
  trait Parameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ParameterValueList]
  
  trait ParametersFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var Key: ParametersFilterKey
    /**
      * The filter values.
      */
    var Values: ParametersFilterValueList
  }
  
  trait Patch extends js.Object {
    /**
      * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
      */
    var Classification: js.UndefOr[PatchClassification] = js.undefined
    /**
      * The URL where more information can be obtained about the patch.
      */
    var ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined
    /**
      * The description of the patch.
      */
    var Description: js.UndefOr[PatchDescription] = js.undefined
    /**
      * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
      */
    var Id: js.UndefOr[PatchId] = js.undefined
    /**
      * The Microsoft Knowledge Base ID of the patch.
      */
    var KbNumber: js.UndefOr[PatchKbNumber] = js.undefined
    /**
      * The language of the patch if it's language-specific.
      */
    var Language: js.UndefOr[PatchLanguage] = js.undefined
    /**
      * The ID of the MSRC bulletin the patch is related to.
      */
    var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined
    /**
      * The severity of the patch (for example Critical, Important, Moderate).
      */
    var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined
    /**
      * The specific product the patch is applicable for (for example, WindowsServer2016).
      */
    var Product: js.UndefOr[PatchProduct] = js.undefined
    /**
      * The product family the patch is applicable for (for example, Windows).
      */
    var ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined
    /**
      * The date the patch was released.
      */
    var ReleaseDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The title of the patch.
      */
    var Title: js.UndefOr[PatchTitle] = js.undefined
    /**
      * The name of the vendor providing the patch.
      */
    var Vendor: js.UndefOr[PatchVendor] = js.undefined
  }
  
  trait PatchBaselineIdentity extends js.Object {
    /**
      * The description of the patch baseline.
      */
    var BaselineDescription: js.UndefOr[BaselineDescription] = js.undefined
    /**
      * The ID of the patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The name of the patch baseline.
      */
    var BaselineName: js.UndefOr[BaselineName] = js.undefined
    /**
      * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
      */
    var DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined
    /**
      * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  }
  
  trait PatchComplianceData extends js.Object {
    /**
      * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
      */
    var Classification: PatchClassification
    /**
      * The date/time the patch was installed on the instance. Note that not all operating systems provide this level of information.
      */
    var InstalledTime: DateTime
    /**
      * The operating system-specific ID of the patch.
      */
    var KBId: PatchKbNumber
    /**
      * The severity of the patch (for example, Critical, Important, Moderate).
      */
    var Severity: PatchSeverity
    /**
      * The state of the patch on the instance, such as INSTALLED or FAILED. For descriptions of each patch state, see About Patch Compliance in the AWS Systems Manager User Guide.
      */
    var State: PatchComplianceDataState
    /**
      * The title of the patch.
      */
    var Title: PatchTitle
  }
  
  trait PatchFilter extends js.Object {
    /**
      * The key for the filter. See PatchFilter for lists of valid keys for each operating system type.
      */
    var Key: PatchFilterKey
    /**
      * The value for the filter key. See PatchFilter for lists of valid values for each key based on operating system type.
      */
    var Values: PatchFilterValueList
  }
  
  trait PatchFilterGroup extends js.Object {
    /**
      * The set of patch filters that make up the group.
      */
    var PatchFilters: PatchFilterList
  }
  
  trait PatchGroupPatchBaselineMapping extends js.Object {
    /**
      * The patch baseline the patch group is registered with.
      */
    var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined
    /**
      * The name of the patch group registered with the patch baseline.
      */
    var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
  }
  
  trait PatchOrchestratorFilter extends js.Object {
    /**
      * The key for the filter.
      */
    var Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined
    /**
      * The value for the filter.
      */
    var Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
  }
  
  trait PatchRule extends js.Object {
    /**
      * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. 
      */
    var ApproveAfterDays: ApproveAfterDays
    /**
      * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels include the following: Unspecified, Critical, High, Medium, Low, and Informational.
      */
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates available in the specified repository. The default value is 'false'. Applies to Linux instances only.
      */
    var EnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    /**
      * The patch filter group that defines the criteria for the rule.
      */
    var PatchFilterGroup: PatchFilterGroup
  }
  
  trait PatchRuleGroup extends js.Object {
    /**
      * The rules that make up the rule group.
      */
    var PatchRules: PatchRuleList
  }
  
  trait PatchSource extends js.Object {
    /**
      * The value of the yum repo configuration. For example:  [main]   cachedir=/var/cache/yum/$basesearch$releasever   keepcache=0   debuglevel=2 
      */
    var Configuration: PatchSourceConfiguration
    /**
      * The name specified to identify the patch source.
      */
    var Name: PatchSourceName
    /**
      * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see PatchFilter.
      */
    var Products: PatchSourceProductList
  }
  
  trait PatchStatus extends js.Object {
    /**
      * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
      */
    var ApprovalDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The compliance severity level for a patch.
      */
    var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
      */
    var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined
  }
  
  trait ProgressCounters extends js.Object {
    /**
      * The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.
      */
    var CancelledSteps: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of steps that failed to execute in all specified AWS Regions and accounts for the current Automation execution.
      */
    var FailedSteps: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.
      */
    var SuccessSteps: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.
      */
    var TimedOutSteps: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of steps executed in all specified AWS Regions and accounts for the current Automation execution.
      */
    var TotalSteps: js.UndefOr[Integer] = js.undefined
  }
  
  trait PutComplianceItemsRequest extends js.Object {
    /**
      * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or Custom:string.
      */
    var ComplianceType: ComplianceTypeName
    /**
      * A summary of the call execution that includes an execution ID, the type of execution (for example, Command), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
      */
    var ExecutionSummary: ComplianceExecutionSummary
    /**
      * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten or ignored. If the content hashes match, the request to put compliance information is ignored.
      */
    var ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.undefined
    /**
      * Information about the compliance as defined by the resource type. For example, for a patch compliance type, Items includes information about the PatchSeverity, Classification, etc.
      */
    var Items: ComplianceItemEntryList
    /**
      * Specify an ID for this resource. For a managed instance, this is the instance ID.
      */
    var ResourceId: ComplianceResourceId
    /**
      * Specify the type of resource. ManagedInstance is currently the only supported resource type.
      */
    var ResourceType: ComplianceResourceType
  }
  
  trait PutComplianceItemsResult extends js.Object
  
  trait PutInventoryRequest extends js.Object {
    /**
      * One or more instance IDs where you want to add or update inventory items.
      */
    var InstanceId: InstanceId
    /**
      * The inventory items that you want to add or update on instances.
      */
    var Items: InventoryItemList
  }
  
  trait PutInventoryResult extends js.Object {
    /**
      * Information about the request.
      */
    var Message: js.UndefOr[PutInventoryMessage] = js.undefined
  }
  
  trait PutParameterRequest extends js.Object {
    /**
      * A regular expression used to validate the parameter value. For example, for String types with values restricted to numbers, you can specify the following: AllowedPattern=^\d+$ 
      */
    var AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined
    /**
      * Information about the parameter that you want to add to the system. Optional but recommended.  Do not enter personally identifiable information in this field. 
      */
    var Description: js.UndefOr[ParameterDescription] = js.undefined
    /**
      * The KMS Key ID that you want to use to encrypt a parameter. Either the default AWS Key Management Service (AWS KMS) key automatically assigned to your AWS account or a custom key. Required for parameters that use the SecureString data type. If you don't specify a key ID, the system uses the default key associated with your AWS account.   To use your default AWS KMS key, choose the SecureString data type, and do not specify the Key ID when you create the parameter. The system automatically populates Key ID with your default KMS key.   To use a custom KMS key, choose the SecureString data type with the Key ID parameter.  
      */
    var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
    /**
      * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes the complete hierarchy of the parameter path and name. For example: /Dev/DBServer/MySQL/db-string13  Naming Constraints:   Parameter names are case sensitive.   A parameter name must be unique within an AWS Region   A parameter name can't be prefixed with "aws" or "ssm" (case-insensitive).   Parameter names can include only the following symbols and letters: a-zA-Z0-9_.-/    A parameter name can't include spaces.   Parameter hierarchies are limited to a maximum depth of fifteen levels.   For additional information about valid values for parameter names, see Requirements and Constraints for Parameter Names in the AWS Systems Manager User Guide.  The maximum length constraint listed below includes capacity for additional system attributes that are not part of the name. The maximum length for the fully qualified parameter name is 1011 characters.  
      */
    var Name: PSParameterName
    /**
      * Overwrite an existing parameter. If not specified, will default to "false".
      */
    var Overwrite: js.UndefOr[Boolean] = js.undefined
    /**
      * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a Systems Manager parameter to identify the type of resource to which it applies, the environment, or the type of configuration data referenced by the parameter. In this case, you could specify the following key name/value pairs:    Key=Resource,Value=S3bucket     Key=OS,Value=Windows     Key=ParameterType,Value=LicenseKey     To add tags to an existing Systems Manager parameter, use the AddTagsToResource action. 
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The type of parameter that you want to add to the system. Items in a StringList must be separated by a comma (,). You can't use other punctuation or special character to escape items in the list. If you have a parameter value that requires a comma, then use the String data type.   SecureString is not currently supported for AWS CloudFormation templates or in the China Regions. 
      */
    var Type: ParameterType
    /**
      * The parameter value that you want to add to the system.
      */
    var Value: PSParameterValue
  }
  
  trait PutParameterResult extends js.Object {
    /**
      * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
      */
    var Version: js.UndefOr[PSParameterVersion] = js.undefined
  }
  
  trait RegisterDefaultPatchBaselineRequest extends js.Object {
    /**
      * The ID of the patch baseline that should be the default patch baseline.
      */
    var BaselineId: BaselineId
  }
  
  trait RegisterDefaultPatchBaselineResult extends js.Object {
    /**
      * The ID of the default patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
  }
  
  trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
    /**
      * The ID of the patch baseline to register the patch group with.
      */
    var BaselineId: BaselineId
    /**
      * The name of the patch group that should be registered with the patch baseline.
      */
    var PatchGroup: PatchGroup
  }
  
  trait RegisterPatchBaselineForPatchGroupResult extends js.Object {
    /**
      * The ID of the patch baseline the patch group was registered with.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The name of the patch group registered with the patch baseline.
      */
    var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
  }
  
  trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
    /**
      * User-provided idempotency token.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * An optional description for the target.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * An optional name for the target.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The type of target being registered with the Maintenance Window.
      */
    var ResourceType: MaintenanceWindowResourceType
    /**
      * The targets (either instances or tags).  Specify instances using the following format:  Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify tags using either of the following formats:  Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;   Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt; 
      */
    var Targets: Targets
    /**
      * The ID of the Maintenance Window the target should be registered with.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the target definition in this Maintenance Window.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
  }
  
  trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
    /**
      * User-provided idempotency token.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * An optional description for the task.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * A structure containing information about an Amazon S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    var MaxConcurrency: MaxConcurrency
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    var MaxErrors: MaxErrors
    /**
      * An optional name for the task.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * The role to assume when running the Maintenance Window task. If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when you run RegisterTaskWithMaintenanceWindow without specifying a service role ARN. For more information, see Service-Linked Role Permissions for Systems Manager and Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?  in the AWS Systems Manager User Guide.
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The targets (either instances or Maintenance Window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify Maintenance Window targets using the following format:  Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
      */
    var Targets: Targets
    /**
      * The ARN of the task to execute 
      */
    var TaskArn: MaintenanceWindowTaskArn
    /**
      * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
      */
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
    /**
      * The parameters that should be passed to the task when it is executed.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    /**
      * The type of task being registered.
      */
    var TaskType: MaintenanceWindowTaskType
    /**
      * The ID of the Maintenance Window the task should be added to.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
    /**
      * The ID of the task in the Maintenance Window.
      */
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
  }
  
  trait RemoveTagsFromResourceRequest extends js.Object {
    /**
      * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde PatchBaseline: pb-012345abcde For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
      */
    var ResourceId: ResourceId
    /**
      * The type of resource of which you want to remove a tag.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
      */
    var ResourceType: ResourceTypeForTagging
    /**
      * Tag keys that you want to remove from the specified resource.
      */
    var TagKeys: KeyList
  }
  
  trait RemoveTagsFromResourceResult extends js.Object
  
  trait ResolvedTargets extends js.Object {
    /**
      * A list of parameter values sent to targets that resolved during the Automation execution.
      */
    var ParameterValues: js.UndefOr[TargetParameterList] = js.undefined
    /**
      * A boolean value indicating whether the resolved target list is truncated.
      */
    var Truncated: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ResourceComplianceSummaryItem extends js.Object {
    /**
      * The compliance type.
      */
    var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
    /**
      * A list of items that are compliant for the resource.
      */
    var CompliantSummary: js.UndefOr[CompliantSummary] = js.undefined
    /**
      * Information about the execution.
      */
    var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined
    /**
      * A list of items that aren't compliant for the resource.
      */
    var NonCompliantSummary: js.UndefOr[NonCompliantSummary] = js.undefined
    /**
      * The highest severity item found for the resource. The resource is compliant for this item.
      */
    var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined
    /**
      * The resource ID.
      */
    var ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined
    /**
      * The resource type.
      */
    var ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined
    /**
      * The compliance status for the resource.
      */
    var Status: js.UndefOr[ComplianceStatus] = js.undefined
  }
  
  trait ResourceDataSyncItem extends js.Object {
    /**
      * The status reported by the last sync.
      */
    var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined
    /**
      * The last time the sync operations returned a status of SUCCESSFUL (UTC).
      */
    var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined
    /**
      * The status message details reported by the last sync.
      */
    var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined
    /**
      * The last time the configuration attempted to sync (UTC).
      */
    var LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined
    /**
      * Configuration information for the target Amazon S3 bucket.
      */
    var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined
    /**
      * The date and time the configuration was created (UTC).
      */
    var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined
    /**
      * The name of the Resource Data Sync.
      */
    var SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
  }
  
  trait ResourceDataSyncS3Destination extends js.Object {
    /**
      * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same region as the destination Amazon S3 bucket.
      */
    var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined
    /**
      * The name of the Amazon S3 bucket where the aggregated data is stored.
      */
    var BucketName: ResourceDataSyncS3BucketName
    /**
      * An Amazon S3 prefix for the bucket.
      */
    var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined
    /**
      * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
      */
    var Region: ResourceDataSyncS3Region
    /**
      * A supported sync format. The following format is currently supported: JsonSerDe
      */
    var SyncFormat: ResourceDataSyncS3Format
  }
  
  trait ResultAttribute extends js.Object {
    /**
      * Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.
      */
    var TypeName: InventoryItemTypeName
  }
  
  trait ResumeSessionRequest extends js.Object {
    /**
      * The ID of the disconnected session to resume.
      */
    var SessionId: SessionId
  }
  
  trait ResumeSessionResponse extends js.Object {
    /**
      * The ID of the session.
      */
    var SessionId: js.UndefOr[SessionId] = js.undefined
    /**
      * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: wss://ssm-messages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output).  region represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in the AWS Systems Manager table of regions and endpoints in the AWS General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
      */
    var StreamUrl: js.UndefOr[StreamUrl] = js.undefined
    /**
      * An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.
      */
    var TokenValue: js.UndefOr[TokenValue] = js.undefined
  }
  
  trait S3OutputLocation extends js.Object {
    /**
      * The name of the Amazon S3 bucket.
      */
    var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The Amazon S3 bucket subfolder.
      */
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
      */
    var OutputS3Region: js.UndefOr[S3Region] = js.undefined
  }
  
  trait S3OutputUrl extends js.Object {
    /**
      * A URL for an Amazon S3 bucket where you want to store the results of this request.
      */
    var OutputUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait ScheduledWindowExecution extends js.Object {
    /**
      * The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
      */
    var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The name of the Maintenance Window to be run.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The ID of the Maintenance Window to be run.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait SendAutomationSignalRequest extends js.Object {
    /**
      * The unique identifier for an existing Automation execution that you want to send the signal to.
      */
    var AutomationExecutionId: AutomationExecutionId
    /**
      * The data sent with the signal. The data schema depends on the type of signal used in the request. 
      */
    var Payload: js.UndefOr[AutomationParameterMap] = js.undefined
    /**
      * The type of signal. Valid signal types include the following: Approve and Reject 
      */
    var SignalType: SignalType
  }
  
  trait SendAutomationSignalResult extends js.Object
  
  trait SendCommandRequest extends js.Object {
    /**
      * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
      */
    var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
    /**
      * User-specified information about the command, such as a brief description of what the command should do.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
    /**
      * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
      */
    var DocumentHash: js.UndefOr[DocumentHash] = js.undefined
    /**
      * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
      */
    var DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined
    /**
      * Required. The name of the Systems Manager document to execute. This can be a public document or a custom document.
      */
    var DocumentName: DocumentARN
    /**
      * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you execute commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The instance IDs where the command should execute. You can specify a maximum of 50 IDs. If you prefer not to list individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which accepts EC2 tags. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
      */
    var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
    /**
      * (Optional) The maximum number of instances that are allowed to execute the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using Concurrency Controls in the AWS Systems Manager User Guide.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using Error Controls in the AWS Systems Manager User Guide.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * Configurations for sending notifications.
      */
    var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
    /**
      * The name of the S3 bucket where command execution responses should be stored.
      */
    var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The directory structure within the S3 bucket where the responses should be stored.
      */
    var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
      */
    var OutputS3Region: js.UndefOr[S3Region] = js.undefined
    /**
      * The required and optional parameters specified in the document being executed.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The IAM role that Systems Manager uses to send notifications. 
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * If this time is reached and the command has not already started executing, it will not run.
      */
    var TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
  }
  
  trait SendCommandResult extends js.Object {
    /**
      * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
      */
    var Command: js.UndefOr[Command] = js.undefined
  }
  
  trait Session extends js.Object {
    /**
      * Reserved for future use.
      */
    var Details: js.UndefOr[SessionDetails] = js.undefined
    /**
      * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell.
      */
    var DocumentName: js.UndefOr[DocumentName] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, when the session was terminated.
      */
    var EndDate: js.UndefOr[DateTime] = js.undefined
    /**
      * Reserved for future use.
      */
    var OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined
    /**
      * The ID of the AWS user account that started the session.
      */
    var Owner: js.UndefOr[SessionOwner] = js.undefined
    /**
      * The ID of the session.
      */
    var SessionId: js.UndefOr[SessionId] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, when the session began.
      */
    var StartDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The status of the session. For example, "Connected" or "Terminated".
      */
    var Status: js.UndefOr[SessionStatus] = js.undefined
    /**
      * The instance that the Session Manager session connected to.
      */
    var Target: js.UndefOr[SessionTarget] = js.undefined
  }
  
  trait SessionFilter extends js.Object {
    /**
      * The name of the filter.
      */
    var key: SessionFilterKey
    /**
      * The filter value. Valid values for each filter key are as follows:   InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.   InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.   Target: Specify an instance to which session connections have been made.   Owner: Specify an AWS user account to see a list of sessions started by that user.   Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:   Connected   Connecting   Disconnected   Terminated   Terminating   Failed    
      */
    var value: SessionFilterValue
  }
  
  trait SessionManagerOutputUrl extends js.Object {
    /**
      * Reserved for future use.
      */
    var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined
    /**
      * Reserved for future use.
      */
    var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined
  }
  
  trait SessionManagerParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[SessionManagerParameterValueList]
  
  trait SeveritySummary extends js.Object {
    /**
      * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
      */
    var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
      */
    var HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
      */
    var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
      */
    var LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
      */
    var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
    /**
      * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
      */
    var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  }
  
  trait StartAssociationsOnceRequest extends js.Object {
    /**
      * The association IDs that you want to execute immediately and only one time.
      */
    var AssociationIds: AssociationIdList
  }
  
  trait StartAssociationsOnceResult extends js.Object
  
  trait StartAutomationExecutionRequest extends js.Object {
    /**
      * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and can't be reused.
      */
    var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
      * The name of the Automation document to use for this execution.
      */
    var DocumentName: DocumentARN
    /**
      * The version of the Automation document to use for this execution.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a percentage, such as 10%. The default value is 10.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops running the automation on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If you specify 0, then the system stops running the automation on additional targets after the first error result is returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the automation on additional targets when the sixth error is received. Executions that are already running an automation when max-errors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set max-concurrency to 1 so the executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode is Auto.
      */
    var Mode: js.UndefOr[ExecutionMode] = js.undefined
    /**
      * A key-value map of execution parameters, which match the declared parameters in the Automation document.
      */
    var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
    /**
      * A location is a combination of AWS Regions and/or AWS accounts where you want to execute the Automation. Use this action to start an Automation in multiple Regions and multiple accounts. For more information, see Concurrently Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
      */
    var TargetLocations: js.UndefOr[TargetLocations] = js.undefined
    /**
      * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified together.
      */
    var TargetMaps: js.UndefOr[TargetMaps] = js.undefined
    /**
      * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify targets.
      */
    var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
    /**
      * A key-value mapping to target resources. Required if you specify TargetParameterName.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait StartAutomationExecutionResult extends js.Object {
    /**
      * The unique ID of a newly scheduled automation execution.
      */
    var AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  }
  
  trait StartSessionRequest extends js.Object {
    /**
      * The name of the SSM document to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell. If no document name is provided, a shell to the instance is launched by default.
      */
    var DocumentName: js.UndefOr[DocumentARN] = js.undefined
    /**
      * Reserved for future use.
      */
    var Parameters: js.UndefOr[SessionManagerParameters] = js.undefined
    /**
      * The instance to connect to for the session.
      */
    var Target: SessionTarget
  }
  
  trait StartSessionResponse extends js.Object {
    /**
      * The ID of the session.
      */
    var SessionId: js.UndefOr[SessionId] = js.undefined
    /**
      * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: wss://ssm-messages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output)   region represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in the AWS Systems Manager table of regions and endpoints in the AWS General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
      */
    var StreamUrl: js.UndefOr[StreamUrl] = js.undefined
    /**
      * An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.
      */
    var TokenValue: js.UndefOr[TokenValue] = js.undefined
  }
  
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
      * A user-specified list of parameters to override when executing a step.
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
      * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to execute the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
      */
    var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined
  }
  
  trait StepExecutionFilter extends js.Object {
    /**
      * One or more keys to limit the results. Valid filter keys include the following: StepName, Action, StepExecutionId, StepExecutionStatus, StartTimeBefore, StartTimeAfter.
      */
    var Key: StepExecutionFilterKey
    /**
      * The values of the filter key.
      */
    var Values: StepExecutionFilterValueList
  }
  
  trait StopAutomationExecutionRequest extends js.Object {
    /**
      * The execution ID of the Automation to stop.
      */
    var AutomationExecutionId: AutomationExecutionId
    /**
      * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
      */
    var Type: js.UndefOr[StopType] = js.undefined
  }
  
  trait StopAutomationExecutionResult extends js.Object
  
  trait Tag extends js.Object {
    /**
      * The name of the tag.
      */
    var Key: TagKey
    /**
      * The value of the tag.
      */
    var Value: TagValue
  }
  
  trait Target extends js.Object {
    /**
      * User-defined criteria for sending commands that target instances that meet the criteria. Key can be tag:&lt;Amazon EC2 tag&gt; or InstanceIds. For more information about how to send commands that target instances using Key,Value parameters, see Targeting Multiple Instances in the AWS Systems Manager User Guide.
      */
    var Key: js.UndefOr[TargetKey] = js.undefined
    /**
      * User-defined criteria that maps to Key. For example, if you specified tag:ServerRole, you could specify value:WebServer to execute a command on instances that include Amazon EC2 tags of ServerRole,WebServer. For more information about how to send commands that target instances using Key,Value parameters, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
      */
    var Values: js.UndefOr[TargetValues] = js.undefined
  }
  
  trait TargetLocation extends js.Object {
    /**
      * The AWS accounts targeted by the current Automation execution.
      */
    var Accounts: js.UndefOr[Accounts] = js.undefined
    /**
      * The Automation execution role used by the currently executing Automation.
      */
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
    /**
      * The AWS Regions targeted by the current Automation execution.
      */
    var Regions: js.UndefOr[Regions] = js.undefined
    /**
      * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently 
      */
    var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The maxium number of errors allowed before the system stops queueing additional Automation executions for the currently executing Automation. 
      */
    var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined
  }
  
  trait TargetMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TargetMapValueList]
  
  trait TerminateSessionRequest extends js.Object {
    /**
      * The ID of the session to terminate.
      */
    var SessionId: SessionId
  }
  
  trait TerminateSessionResponse extends js.Object {
    /**
      * The ID of the session that has been terminated.
      */
    var SessionId: js.UndefOr[SessionId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
      */
    def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
      */
    def cancelCommand(): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelCommand(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelCommandResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
      */
    def cancelCommand(params: CancelCommandRequest): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelCommand(
      params: CancelCommandRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelCommandResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
      */
    def cancelMaintenanceWindowExecution(): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelMaintenanceWindowExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelMaintenanceWindowExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
      */
    def cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelMaintenanceWindowExecution(
      params: CancelMaintenanceWindowExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelMaintenanceWindowExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed instance. For more information about activations, see Setting Up Systems Manager in Hybrid Environments.
      */
    def createActivation(): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createActivation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed instance. For more information about activations, see Setting Up Systems Manager in Hybrid Environments.
      */
    def createActivation(params: CreateActivationRequest): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createActivation(
      params: CreateActivationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
      */
    def createAssociation(): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
      */
    def createAssociation(params: CreateAssociationRequest): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAssociation(
      params: CreateAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
      */
    def createAssociationBatch(): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAssociationBatch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssociationBatchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
      */
    def createAssociationBatch(params: CreateAssociationBatchRequest): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAssociationBatch(
      params: CreateAssociationBatchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssociationBatchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
      */
    def createDocument(): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
      */
    def createDocument(params: CreateDocumentRequest): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDocument(
      params: CreateDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Maintenance Window.
      */
    def createMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Maintenance Window.
      */
    def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMaintenanceWindow(
      params: CreateMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
      */
    def createPatchBaseline(): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
      */
    def createPatchBaseline(params: CreatePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPatchBaseline(
      params: CreatePatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync. By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide.
      */
    def createResourceDataSync(): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResourceDataSync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync. By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide.
      */
    def createResourceDataSync(params: CreateResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResourceDataSync(
      params: CreateResourceDataSyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
      */
    def deleteActivation(): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteActivation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteActivationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
      */
    def deleteActivation(params: DeleteActivationRequest): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteActivation(
      params: DeleteActivationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteActivationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
      */
    def deleteAssociation(): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
      */
    def deleteAssociation(params: DeleteAssociationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAssociation(
      params: DeleteAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
      */
    def deleteDocument(): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
      */
    def deleteDocument(params: DeleteDocumentRequest): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDocument(
      params: DeleteDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
      */
    def deleteInventory(): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInventory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
      */
    def deleteInventory(params: DeleteInventoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInventory(
      params: DeleteInventoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Maintenance Window.
      */
    def deleteMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Maintenance Window.
      */
    def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMaintenanceWindow(
      params: DeleteMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a parameter from the system.
      */
    def deleteParameter(): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a parameter from the system.
      */
    def deleteParameter(params: DeleteParameterRequest): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameter(
      params: DeleteParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
      */
    def deleteParameters(): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
      */
    def deleteParameters(params: DeleteParametersRequest): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameters(
      params: DeleteParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a patch baseline.
      */
    def deletePatchBaseline(): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a patch baseline.
      */
    def deletePatchBaseline(params: DeletePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePatchBaseline(
      params: DeletePatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not delete data in the target Amazon S3 bucket.
      */
    def deleteResourceDataSync(): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResourceDataSync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not delete data in the target Amazon S3 bucket.
      */
    def deleteResourceDataSync(params: DeleteResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResourceDataSync(
      params: DeleteResourceDataSyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
      */
    def deregisterManagedInstance(): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterManagedInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterManagedInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
      */
    def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterManagedInstance(
      params: DeregisterManagedInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterManagedInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a patch group from a patch baseline.
      */
    def deregisterPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterPatchBaselineForPatchGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a patch group from a patch baseline.
      */
    def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterPatchBaselineForPatchGroup(
      params: DeregisterPatchBaselineForPatchGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a target from a Maintenance Window.
      */
    def deregisterTargetFromMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterTargetFromMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTargetFromMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a target from a Maintenance Window.
      */
    def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterTargetFromMaintenanceWindow(
      params: DeregisterTargetFromMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTargetFromMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a task from a Maintenance Window.
      */
    def deregisterTaskFromMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterTaskFromMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTaskFromMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a task from a Maintenance Window.
      */
    def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterTaskFromMaintenanceWindow(
      params: DeregisterTaskFromMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTaskFromMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Details about the activation, including: the date and time the activation was created, the expiration date, the IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
      */
    def describeActivations(): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Details about the activation, including: the date and time the activation was created, the expiration date, the IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
      */
    def describeActivations(params: DescribeActivationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivations(
      params: DescribeActivationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
      */
    def describeAssociation(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
      */
    def describeAssociation(params: DescribeAssociationRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociation(
      params: DescribeAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to view information about a specific execution of a specific association.
      */
    def describeAssociationExecutionTargets(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociationExecutionTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationExecutionTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to view information about a specific execution of a specific association.
      */
    def describeAssociationExecutionTargets(params: DescribeAssociationExecutionTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociationExecutionTargets(
      params: DescribeAssociationExecutionTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationExecutionTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to view all executions for a specific association ID. 
      */
    def describeAssociationExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociationExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to view all executions for a specific association ID. 
      */
    def describeAssociationExecutions(params: DescribeAssociationExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAssociationExecutions(
      params: DescribeAssociationExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssociationExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides details about all active and terminated Automation executions.
      */
    def describeAutomationExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAutomationExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAutomationExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides details about all active and terminated Automation executions.
      */
    def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAutomationExecutions(
      params: DescribeAutomationExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAutomationExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Information about all active and terminated step executions in an Automation workflow.
      */
    def describeAutomationStepExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAutomationStepExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAutomationStepExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Information about all active and terminated step executions in an Automation workflow.
      */
    def describeAutomationStepExecutions(params: DescribeAutomationStepExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAutomationStepExecutions(
      params: DescribeAutomationStepExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAutomationStepExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all patches that could possibly be included in a patch baseline.
      */
    def describeAvailablePatches(): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAvailablePatches(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAvailablePatchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all patches that could possibly be included in a patch baseline.
      */
    def describeAvailablePatches(params: DescribeAvailablePatchesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAvailablePatches(
      params: DescribeAvailablePatchesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAvailablePatchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified Systems Manager document.
      */
    def describeDocument(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified Systems Manager document.
      */
    def describeDocument(params: DescribeDocumentRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocument(
      params: DescribeDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
      */
    def describeDocumentPermission(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocumentPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
      */
    def describeDocumentPermission(params: DescribeDocumentPermissionRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocumentPermission(
      params: DescribeDocumentPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * All associations for the instance(s).
      */
    def describeEffectiveInstanceAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEffectiveInstanceAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEffectiveInstanceAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * All associations for the instance(s).
      */
    def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEffectiveInstanceAssociations(
      params: DescribeEffectiveInstanceAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEffectiveInstanceAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
      */
    def describeEffectivePatchesForPatchBaseline(): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEffectivePatchesForPatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEffectivePatchesForPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
      */
    def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEffectivePatchesForPatchBaseline(
      params: DescribeEffectivePatchesForPatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEffectivePatchesForPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The status of the associations for the instance(s).
      */
    def describeInstanceAssociationsStatus(): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceAssociationsStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstanceAssociationsStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The status of the associations for the instance(s).
      */
    def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceAssociationsStatus(
      params: DescribeInstanceAssociationsStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstanceAssociationsStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
      */
    def describeInstanceInformation(): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceInformation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstanceInformationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
      */
    def describeInstanceInformation(params: DescribeInstanceInformationRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceInformation(
      params: DescribeInstanceInformationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstanceInformationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the high-level patch state of one or more instances.
      */
    def describeInstancePatchStates(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatchStates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchStatesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the high-level patch state of one or more instances.
      */
    def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatchStates(
      params: DescribeInstancePatchStatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchStatesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the high-level patch state for the instances in the specified patch group.
      */
    def describeInstancePatchStatesForPatchGroup(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatchStatesForPatchGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchStatesForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the high-level patch state for the instances in the specified patch group.
      */
    def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatchStatesForPatchGroup(
      params: DescribeInstancePatchStatesForPatchGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchStatesForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
      */
    def describeInstancePatches(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatches(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
      */
    def describeInstancePatches(params: DescribeInstancePatchesRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancePatches(
      params: DescribeInstancePatchesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancePatchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a specific delete inventory operation.
      */
    def describeInventoryDeletions(): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInventoryDeletions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInventoryDeletionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a specific delete inventory operation.
      */
    def describeInventoryDeletions(params: DescribeInventoryDeletionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInventoryDeletions(
      params: DescribeInventoryDeletionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInventoryDeletionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the individual task executions (one per target) for a particular task executed as part of a Maintenance Window execution.
      */
    def describeMaintenanceWindowExecutionTaskInvocations(): awsDashSdkLib.libRequestMod.Request[
        DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Retrieves the individual task executions (one per target) for a particular task executed as part of a Maintenance Window execution.
      */
    def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeMaintenanceWindowExecutionTaskInvocations(
      params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * For a given Maintenance Window execution, lists the tasks that were executed.
      */
    def describeMaintenanceWindowExecutionTasks(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowExecutionTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionTasksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a given Maintenance Window execution, lists the tasks that were executed.
      */
    def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowExecutionTasks(
      params: DescribeMaintenanceWindowExecutionTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionTasksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was scheduled to be active, and information about tasks registered and run with the Maintenance Window.
      */
    def describeMaintenanceWindowExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was scheduled to be active, and information about tasks registered and run with the Maintenance Window.
      */
    def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowExecutions(
      params: DescribeMaintenanceWindowExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowExecutionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about upcoming executions of a Maintenance Window.
      */
    def describeMaintenanceWindowSchedule(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowScheduleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about upcoming executions of a Maintenance Window.
      */
    def describeMaintenanceWindowSchedule(params: DescribeMaintenanceWindowScheduleRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowSchedule(
      params: DescribeMaintenanceWindowScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowScheduleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the targets registered with the Maintenance Window.
      */
    def describeMaintenanceWindowTargets(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the targets registered with the Maintenance Window.
      */
    def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowTargets(
      params: DescribeMaintenanceWindowTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tasks in a Maintenance Window.
      */
    def describeMaintenanceWindowTasks(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowTasksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tasks in a Maintenance Window.
      */
    def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowTasks(
      params: DescribeMaintenanceWindowTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowTasksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Maintenance Windows in an AWS account.
      */
    def describeMaintenanceWindows(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindows(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Maintenance Windows in an AWS account.
      */
    def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindows(
      params: DescribeMaintenanceWindowsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
      */
    def describeMaintenanceWindowsForTarget(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowsForTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowsForTargetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
      */
    def describeMaintenanceWindowsForTarget(params: DescribeMaintenanceWindowsForTargetRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMaintenanceWindowsForTarget(
      params: DescribeMaintenanceWindowsForTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMaintenanceWindowsForTargetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a parameter. Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.
      */
    def describeParameters(): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a parameter. Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.
      */
    def describeParameters(params: DescribeParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameters(
      params: DescribeParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the patch baselines in your AWS account.
      */
    def describePatchBaselines(): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchBaselines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchBaselinesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the patch baselines in your AWS account.
      */
    def describePatchBaselines(params: DescribePatchBaselinesRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchBaselines(
      params: DescribePatchBaselinesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchBaselinesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns high-level aggregated patch compliance state for a patch group.
      */
    def describePatchGroupState(): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchGroupState(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchGroupStateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns high-level aggregated patch compliance state for a patch group.
      */
    def describePatchGroupState(params: DescribePatchGroupStateRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchGroupState(
      params: DescribePatchGroupStateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchGroupStateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all patch groups that have been registered with patch baselines.
      */
    def describePatchGroups(): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all patch groups that have been registered with patch baselines.
      */
    def describePatchGroups(params: DescribePatchGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePatchGroups(
      params: DescribePatchGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePatchGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
      */
    def describeSessions(): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSessionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
      */
    def describeSessions(params: DescribeSessionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSessions(
      params: DescribeSessionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSessionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get detailed information about a particular Automation execution.
      */
    def getAutomationExecution(): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAutomationExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get detailed information about a particular Automation execution.
      */
    def getAutomationExecution(params: GetAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAutomationExecution(
      params: GetAutomationExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about command execution for an invocation or plugin. 
      */
    def getCommandInvocation(): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommandInvocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommandInvocationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about command execution for an invocation or plugin. 
      */
    def getCommandInvocation(params: GetCommandInvocationRequest): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommandInvocation(
      params: GetCommandInvocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommandInvocationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
      */
    def getConnectionStatus(): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConnectionStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
      */
    def getConnectionStatus(params: GetConnectionStatusRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConnectionStatus(
      params: GetConnectionStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectionStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
      */
    def getDefaultPatchBaseline(): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDefaultPatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDefaultPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
      */
    def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDefaultPatchBaseline(
      params: GetDefaultPatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDefaultPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
      */
    def getDeployablePatchSnapshotForInstance(): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeployablePatchSnapshotForInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeployablePatchSnapshotForInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
      */
    def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeployablePatchSnapshotForInstance(
      params: GetDeployablePatchSnapshotForInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeployablePatchSnapshotForInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the contents of the specified Systems Manager document.
      */
    def getDocument(): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the contents of the specified Systems Manager document.
      */
    def getDocument(params: GetDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocument(
      params: GetDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Query inventory information.
      */
    def getInventory(): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInventory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Query inventory information.
      */
    def getInventory(params: GetInventoryRequest): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInventory(
      params: GetInventoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
      */
    def getInventorySchema(): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInventorySchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInventorySchemaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
      */
    def getInventorySchema(params: GetInventorySchemaRequest): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInventorySchema(
      params: GetInventorySchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInventorySchemaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a Maintenance Window.
      */
    def getMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a Maintenance Window.
      */
    def getMaintenanceWindow(params: GetMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindow(
      params: GetMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details about a specific task executed as part of a Maintenance Window execution.
      */
    def getMaintenanceWindowExecution(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details about a specific task executed as part of a Maintenance Window execution.
      */
    def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowExecution(
      params: GetMaintenanceWindowExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details about a specific task executed as part of a Maintenance Window execution.
      */
    def getMaintenanceWindowExecutionTask(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowExecutionTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details about a specific task executed as part of a Maintenance Window execution.
      */
    def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowExecutionTask(
      params: GetMaintenanceWindowExecutionTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a task invocation. A task invocation is a specific task executing on a specific target. Maintenance Windows report status for all invocations. 
      */
    def getMaintenanceWindowExecutionTaskInvocation(): awsDashSdkLib.libRequestMod.Request[
        GetMaintenanceWindowExecutionTaskInvocationResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def getMaintenanceWindowExecutionTaskInvocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetMaintenanceWindowExecutionTaskInvocationResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Retrieves a task invocation. A task invocation is a specific task executing on a specific target. Maintenance Windows report status for all invocations. 
      */
    def getMaintenanceWindowExecutionTaskInvocation(params: GetMaintenanceWindowExecutionTaskInvocationRequest): awsDashSdkLib.libRequestMod.Request[
        GetMaintenanceWindowExecutionTaskInvocationResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def getMaintenanceWindowExecutionTaskInvocation(
      params: GetMaintenanceWindowExecutionTaskInvocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetMaintenanceWindowExecutionTaskInvocationResult, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Lists the tasks in a Maintenance Window.
      */
    def getMaintenanceWindowTask(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tasks in a Maintenance Window.
      */
    def getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMaintenanceWindowTask(
      params: GetMaintenanceWindowTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMaintenanceWindowTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
      */
    def getParameter(): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
      */
    def getParameter(params: GetParameterRequest): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameter(
      params: GetParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Query a list of all parameters used by the AWS account.
      */
    def getParameterHistory(): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameterHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParameterHistoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Query a list of all parameters used by the AWS account.
      */
    def getParameterHistory(params: GetParameterHistoryRequest): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameterHistory(
      params: GetParameterHistoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParameterHistoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
      */
    def getParameters(): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
      */
    def getParameters(params: GetParametersRequest): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParameters(
      params: GetParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve parameters in a specific hierarchy. For more information, see Working with Systems Manager Parameters in the AWS Systems Manager User Guide.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.  This API action doesn't support filtering by tags.  
      */
    def getParametersByPath(): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParametersByPath(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersByPathResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve parameters in a specific hierarchy. For more information, see Working with Systems Manager Parameters in the AWS Systems Manager User Guide.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.  This API action doesn't support filtering by tags.  
      */
    def getParametersByPath(params: GetParametersByPathRequest): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParametersByPath(
      params: GetParametersByPathRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersByPathResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a patch baseline.
      */
    def getPatchBaseline(): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a patch baseline.
      */
    def getPatchBaseline(params: GetPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPatchBaseline(
      params: GetPatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the patch baseline that should be used for the specified patch group.
      */
    def getPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPatchBaselineForPatchGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the patch baseline that should be used for the specified patch group.
      */
    def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPatchBaselineForPatchGroup(
      params: GetPatchBaselineForPatchGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
      */
    def labelParameterVersion(): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def labelParameterVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LabelParameterVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
      */
    def labelParameterVersion(params: LabelParameterVersionRequest): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def labelParameterVersion(
      params: LabelParameterVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LabelParameterVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all versions of an association for a specific association ID.
      */
    def listAssociationVersions(): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociationVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociationVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all versions of an association for a specific association ID.
      */
    def listAssociationVersions(params: ListAssociationVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociationVersions(
      params: ListAssociationVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociationVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the associations for the specified Systems Manager document or instance.
      */
    def listAssociations(): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the associations for the specified Systems Manager document or instance.
      */
    def listAssociations(params: ListAssociationsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociations(
      params: ListAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user executes SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
      */
    def listCommandInvocations(): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCommandInvocations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCommandInvocationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user executes SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
      */
    def listCommandInvocations(params: ListCommandInvocationsRequest): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCommandInvocations(
      params: ListCommandInvocationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCommandInvocationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the commands requested by users of the AWS account.
      */
    def listCommands(): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCommands(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCommandsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the commands requested by users of the AWS account.
      */
    def listCommands(params: ListCommandsRequest): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCommands(
      params: ListCommandsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCommandsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
      */
    def listComplianceItems(): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceItems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceItemsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
      */
    def listComplianceItems(params: ListComplianceItemsRequest): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceItems(
      params: ListComplianceItemsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceItemsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
      */
    def listComplianceSummaries(): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
      */
    def listComplianceSummaries(params: ListComplianceSummariesRequest): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceSummaries(
      params: ListComplianceSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all versions for a document.
      */
    def listDocumentVersions(): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDocumentVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDocumentVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all versions for a document.
      */
    def listDocumentVersions(params: ListDocumentVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDocumentVersions(
      params: ListDocumentVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDocumentVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your Systems Manager documents.
      */
    def listDocuments(): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDocuments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDocumentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your Systems Manager documents.
      */
    def listDocuments(params: ListDocumentsRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDocuments(
      params: ListDocumentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDocumentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * A list of inventory items returned by the request.
      */
    def listInventoryEntries(): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInventoryEntries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInventoryEntriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * A list of inventory items returned by the request.
      */
    def listInventoryEntries(params: ListInventoryEntriesRequest): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInventoryEntries(
      params: ListInventoryEntriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInventoryEntriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
      */
    def listResourceComplianceSummaries(): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceComplianceSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceComplianceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
      */
    def listResourceComplianceSummaries(params: ListResourceComplianceSummariesRequest): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceComplianceSummaries(
      params: ListResourceComplianceSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceComplianceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
      */
    def listResourceDataSync(): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceDataSync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
      */
    def listResourceDataSync(params: ListResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceDataSync(
      params: ListResourceDataSyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceDataSyncResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the tags assigned to the specified resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the tags assigned to the specified resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
      */
    def modifyDocumentPermission(): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDocumentPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDocumentPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
      */
    def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDocumentPermission(
      params: ModifyDocumentPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDocumentPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
      */
    def putComplianceItems(): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putComplianceItems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutComplianceItemsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
      */
    def putComplianceItems(params: PutComplianceItemsRequest): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putComplianceItems(
      params: PutComplianceItemsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutComplianceItemsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
      */
    def putInventory(): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putInventory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
      */
    def putInventory(params: PutInventoryRequest): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putInventory(
      params: PutInventoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutInventoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a parameter to the system.
      */
    def putParameter(): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a parameter to the system.
      */
    def putParameter(params: PutParameterRequest): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putParameter(
      params: PutParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutParameterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines the default patch baseline.
      */
    def registerDefaultPatchBaseline(): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerDefaultPatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterDefaultPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines the default patch baseline.
      */
    def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerDefaultPatchBaseline(
      params: RegisterDefaultPatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterDefaultPatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a patch baseline for a patch group.
      */
    def registerPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerPatchBaselineForPatchGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a patch baseline for a patch group.
      */
    def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerPatchBaselineForPatchGroup(
      params: RegisterPatchBaselineForPatchGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterPatchBaselineForPatchGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a target with a Maintenance Window.
      */
    def registerTargetWithMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerTargetWithMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTargetWithMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a target with a Maintenance Window.
      */
    def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerTargetWithMaintenanceWindow(
      params: RegisterTargetWithMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTargetWithMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new task to a Maintenance Window.
      */
    def registerTaskWithMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerTaskWithMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTaskWithMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new task to a Maintenance Window.
      */
    def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerTaskWithMaintenanceWindow(
      params: RegisterTaskWithMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTaskWithMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes all tags from the specified resource.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes all tags from the specified resource.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
      */
    def resumeSession(): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resumeSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResumeSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
      */
    def resumeSession(params: ResumeSessionRequest): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resumeSession(
      params: ResumeSessionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResumeSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
      */
    def sendAutomationSignal(): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendAutomationSignal(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendAutomationSignalResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
      */
    def sendAutomationSignal(params: SendAutomationSignalRequest): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendAutomationSignal(
      params: SendAutomationSignalRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendAutomationSignalResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Executes commands on one or more managed instances.
      */
    def sendCommand(): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendCommand(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendCommandResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Executes commands on one or more managed instances.
      */
    def sendCommand(params: SendCommandRequest): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendCommand(
      params: SendCommandRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendCommandResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to execute an association immediately and only one time. This action can be helpful when troubleshooting associations.
      */
    def startAssociationsOnce(): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startAssociationsOnce(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAssociationsOnceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use this API action to execute an association immediately and only one time. This action can be helpful when troubleshooting associations.
      */
    def startAssociationsOnce(params: StartAssociationsOnceRequest): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startAssociationsOnce(
      params: StartAssociationsOnceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAssociationsOnceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates execution of an Automation document.
      */
    def startAutomationExecution(): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startAutomationExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates execution of an Automation document.
      */
    def startAutomationExecution(params: StartAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startAutomationExecution(
      params: StartAutomationExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. 
      */
    def startSession(): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. 
      */
    def startSession(params: StartSessionRequest): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSession(
      params: StartSessionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stop an Automation that is currently executing.
      */
    def stopAutomationExecution(): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopAutomationExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stop an Automation that is currently executing.
      */
    def stopAutomationExecution(params: StopAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopAutomationExecution(
      params: StopAutomationExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopAutomationExecutionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
      */
    def terminateSession(): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
      */
    def terminateSession(params: TerminateSessionRequest): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateSession(
      params: TerminateSessionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateSessionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.
      */
    def updateAssociation(): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.
      */
    def updateAssociation(params: UpdateAssociationRequest): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssociation(
      params: UpdateAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of the Systems Manager document associated with the specified instance.
      */
    def updateAssociationStatus(): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssociationStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAssociationStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of the Systems Manager document associated with the specified instance.
      */
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssociationStatus(
      params: UpdateAssociationStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAssociationStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The document you want to update.
      */
    def updateDocument(): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The document you want to update.
      */
    def updateDocument(params: UpdateDocumentRequest): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocument(
      params: UpdateDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDocumentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the default version of a document. 
      */
    def updateDocumentDefaultVersion(): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocumentDefaultVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDocumentDefaultVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the default version of a document. 
      */
    def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocumentDefaultVersion(
      params: UpdateDocumentDefaultVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDocumentDefaultVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Maintenance Window. Only specified parameters are modified.
      */
    def updateMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Maintenance Window. Only specified parameters are modified.
      */
    def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindow(
      params: UpdateMaintenanceWindowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the following: The target from being an ID target to a Tag target, or a Tag target to an ID target. IDs for an ID target. Tags for a Tag target. Owner. Name. Description. If a parameter is null, then the corresponding field is not modified.
      */
    def updateMaintenanceWindowTarget(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindowTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowTargetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the following: The target from being an ID target to a Tag target, or a Tag target to an ID target. IDs for an ID target. Tags for a Tag target. Owner. Name. Description. If a parameter is null, then the corresponding field is not modified.
      */
    def updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindowTarget(
      params: UpdateMaintenanceWindowTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowTargetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
      */
    def updateMaintenanceWindowTask(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindowTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
      */
    def updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMaintenanceWindowTask(
      params: UpdateMaintenanceWindowTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMaintenanceWindowTaskResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
      */
    def updateManagedInstanceRole(): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateManagedInstanceRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateManagedInstanceRoleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
      */
    def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateManagedInstanceRole(
      params: UpdateManagedInstanceRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateManagedInstanceRoleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
      */
    def updatePatchBaseline(): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePatchBaseline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
      */
    def updatePatchBaseline(params: UpdatePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePatchBaseline(
      params: UpdatePatchBaselineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePatchBaselineResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateAssociationRequest extends js.Object {
    /**
      * The ID of the association you want to update. 
      */
    var AssociationId: AssociationId
    /**
      * The name of the association that you want to update.
      */
    var AssociationName: js.UndefOr[AssociationName] = js.undefined
    /**
      * This parameter is provided for concurrency control purposes. You must specify the latest association version in the service. If you want to ensure that this request succeeds, either specify $LATEST, or omit this parameter.
      */
    var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
    /**
      * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
      */
    var AutomationTargetParameterName: js.UndefOr[AutomationTargetParameterName] = js.undefined
    /**
      * The severity level to assign to the association.
      */
    var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
    /**
      * The document version you want update for the association. 
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to execute an association while Systems Manager is executing MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The name of the SSM document that contains the configuration information for the instance. You can specify Command, Policy, or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:aws:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
      */
    var Name: js.UndefOr[DocumentARN] = js.undefined
    /**
      * An Amazon S3 bucket where you want to store the results of this request.
      */
    var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
    /**
      * The parameters you want to update for the association. If you create a parameter using Parameter Store, you can reference the parameter using {{ssm:parameter-name}}
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The cron expression used to schedule the association that you want to update.
      */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
      * The targets of the association.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait UpdateAssociationResult extends js.Object {
    /**
      * The description of the association that was updated.
      */
    var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
  }
  
  trait UpdateAssociationStatusRequest extends js.Object {
    /**
      * The association status.
      */
    var AssociationStatus: AssociationStatus
    /**
      * The ID of the instance.
      */
    var InstanceId: InstanceId
    /**
      * The name of the Systems Manager document.
      */
    var Name: DocumentARN
  }
  
  trait UpdateAssociationStatusResult extends js.Object {
    /**
      * Information about the association.
      */
    var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
  }
  
  trait UpdateDocumentDefaultVersionRequest extends js.Object {
    /**
      * The version of a custom document that you want to set as the default version.
      */
    var DocumentVersion: DocumentVersionNumber
    /**
      * The name of a custom document that you want to set as the default version.
      */
    var Name: DocumentName
  }
  
  trait UpdateDocumentDefaultVersionResult extends js.Object {
    /**
      * The description of a custom document that you want to set as the default version.
      */
    var Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
  }
  
  trait UpdateDocumentRequest extends js.Object {
    /**
      * A list of key and value pairs that describe attachments to a version of a document.
      */
    var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
    /**
      * A valid JSON or YAML string.
      */
    var Content: DocumentContent
    /**
      * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.
      */
    var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
    /**
      * The version of the document that you want to update.
      */
    var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
    /**
      * The name of the document that you want to update.
      */
    var Name: DocumentName
    /**
      * Specify a new target type for the document.
      */
    var TargetType: js.UndefOr[TargetType] = js.undefined
    /**
      * An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
      */
    var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
  }
  
  trait UpdateDocumentResult extends js.Object {
    /**
      * A description of the document that was updated.
      */
    var DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
  }
  
  trait UpdateMaintenanceWindowRequest extends js.Object {
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
    /**
      * An optional description for the update request.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The duration of the Maintenance Window in hours.
      */
    var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
    /**
      * Whether the Maintenance Window is enabled.
      */
    var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when you want the Maintenance Window to become inactive. EndDate allows you to set a date and time in the future when the Maintenance Window will no longer run.
      */
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The name of the Maintenance Window.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. 
      */
    var Replace: js.UndefOr[Boolean] = js.undefined
    /**
      * The schedule of the Maintenance Window in the form of a cron or rate expression.
      */
    var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
      */
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
      */
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The ID of the Maintenance Window to update.
      */
    var WindowId: MaintenanceWindowId
  }
  
  trait UpdateMaintenanceWindowResult extends js.Object {
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
    /**
      * An optional description of the update.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The duration of the Maintenance Window in hours.
      */
    var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
    /**
      * Whether the Maintenance Window is enabled.
      */
    var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become inactive. The Maintenance Window will not run after this specified time.
      */
    var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The name of the Maintenance Window.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The schedule of the Maintenance Window in the form of a cron or rate expression.
      */
    var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
    /**
      * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
      */
    var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
    /**
      * The date and time, in ISO-8601 Extended format, for when the Maintenance Window is scheduled to become active. The Maintenance Window will not run before this specified time.
      */
    var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
    /**
      * The ID of the created Maintenance Window.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  }
  
  trait UpdateMaintenanceWindowTargetRequest extends js.Object {
    /**
      * An optional description for the update.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * A name for the update.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null.
      */
    var Replace: js.UndefOr[Boolean] = js.undefined
    /**
      * The targets to add or replace.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The Maintenance Window ID with which to modify the target.
      */
    var WindowId: MaintenanceWindowId
    /**
      * The target ID to modify.
      */
    var WindowTargetId: MaintenanceWindowTargetId
  }
  
  trait UpdateMaintenanceWindowTargetResult extends js.Object {
    /**
      * The updated description.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The updated name.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The updated owner.
      */
    var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
    /**
      * The updated targets.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The Maintenance Window ID specified in the update request.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The target ID specified in the update request.
      */
    var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
  }
  
  trait UpdateMaintenanceWindowTaskRequest extends js.Object {
    /**
      * The new task description to specify.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The new logging location in Amazon S3 to specify.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
    /**
      * The new MaxConcurrency value you want to specify. MaxConcurrency is the number of targets that are allowed to run this task in parallel.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The new MaxErrors value to specify. MaxErrors is the maximum number of errors that are allowed before the task stops being scheduled.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The new task name to specify.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * If True, then all fields that are required by the RegisterTaskWithMaintenanceWndow action are also required for this API request. Optional fields that are not specified are set to null.
      */
    var Replace: js.UndefOr[Boolean] = js.undefined
    /**
      * The IAM service role ARN to modify. The system assumes this role during task execution. If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when you run RegisterTaskWithMaintenanceWindow without specifying a service role ARN. For more information, see Service-Linked Role Permissions for Systems Manager and Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?  in the AWS Systems Manager User Guide.
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The targets (either instances or tags) to modify. Instances are specified using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value. 
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The task ARN to modify.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty.
      */
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
    /**
      * The parameters to modify.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    /**
      * The Maintenance Window ID that contains the task to modify.
      */
    var WindowId: MaintenanceWindowId
    /**
      * The task ID to modify.
      */
    var WindowTaskId: MaintenanceWindowTaskId
  }
  
  trait UpdateMaintenanceWindowTaskResult extends js.Object {
    /**
      * The updated task description.
      */
    var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
    /**
      * The updated logging information in Amazon S3.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
    /**
      * The updated MaxConcurrency value.
      */
    var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
    /**
      * The updated MaxErrors value.
      */
    var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
    /**
      * The updated task name.
      */
    var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
    /**
      * The updated priority value.
      */
    var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
    /**
      * The updated service role ARN value.
      */
    var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
    /**
      * The updated target values.
      */
    var Targets: js.UndefOr[Targets] = js.undefined
    /**
      * The updated task ARN value.
      */
    var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
    /**
      * The updated parameter values.
      */
    var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
    /**
      * The updated parameter values.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
      */
    var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
    /**
      * The ID of the Maintenance Window that was updated.
      */
    var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
    /**
      * The task ID of the Maintenance Window that was updated.
      */
    var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
  }
  
  trait UpdateManagedInstanceRoleRequest extends js.Object {
    /**
      * The IAM role you want to assign or change.
      */
    var IamRole: IamRole
    /**
      * The ID of the managed instance where you want to update the role.
      */
    var InstanceId: ManagedInstanceId
  }
  
  trait UpdateManagedInstanceRoleResult extends js.Object
  
  trait UpdatePatchBaselineRequest extends js.Object {
    /**
      * A set of rules used to include patches in the baseline.
      */
    var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
    /**
      * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
      */
    var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * Assigns a new compliance severity level to an existing patch baseline.
      */
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
      */
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the patch baseline to update.
      */
    var BaselineId: BaselineId
    /**
      * A description of the patch baseline.
      */
    var Description: js.UndefOr[BaselineDescription] = js.undefined
    /**
      * A set of global filters used to include patches in the baseline.
      */
    var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    /**
      * The name of the patch baseline.
      */
    var Name: js.UndefOr[BaselineName] = js.undefined
    /**
      * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
      */
    var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
      */
    var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
    /**
      * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API request. Optional fields that are not specified are set to null.
      */
    var Replace: js.UndefOr[Boolean] = js.undefined
    /**
      * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
      */
    var Sources: js.UndefOr[PatchSourceList] = js.undefined
  }
  
  trait UpdatePatchBaselineResult extends js.Object {
    /**
      * A set of rules used to include patches in the baseline.
      */
    var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
    /**
      * A list of explicitly approved patches for the baseline.
      */
    var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * The compliance severity level assigned to the patch baseline after the update completed.
      */
    var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
    /**
      * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
      */
    var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the deleted patch baseline.
      */
    var BaselineId: js.UndefOr[BaselineId] = js.undefined
    /**
      * The date when the patch baseline was created.
      */
    var CreatedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * A description of the Patch Baseline.
      */
    var Description: js.UndefOr[BaselineDescription] = js.undefined
    /**
      * A set of global filters used to exclude patches from the baseline.
      */
    var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
    /**
      * The date when the patch baseline was last modified.
      */
    var ModifiedDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the patch baseline.
      */
    var Name: js.UndefOr[BaselineName] = js.undefined
    /**
      * The operating system rule used by the updated patch baseline.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * A list of explicitly rejected patches for the baseline.
      */
    var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
    /**
      * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
      */
    var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
    /**
      * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
      */
    var Sources: js.UndefOr[PatchSourceList] = js.undefined
  }
  
  trait _AssociationComplianceSeverity extends js.Object
  
  trait _AssociationExecutionFilterKey extends js.Object
  
  trait _AssociationExecutionTargetsFilterKey extends js.Object
  
  trait _AssociationFilterKey extends js.Object
  
  trait _AssociationFilterOperatorType extends js.Object
  
  trait _AssociationStatusName extends js.Object
  
  trait _AutomationExecutionFilterKey extends js.Object
  
  trait _AutomationExecutionStatus extends js.Object
  
  trait _AutomationType extends js.Object
  
  trait _CommandFilterKey extends js.Object
  
  trait _CommandInvocationStatus extends js.Object
  
  trait _CommandPluginStatus extends js.Object
  
  trait _CommandStatus extends js.Object
  
  trait _ComplianceQueryOperatorType extends js.Object
  
  trait _ComplianceSeverity extends js.Object
  
  trait _ComplianceStatus extends js.Object
  
  trait _ConnectionStatus extends js.Object
  
  trait _DescribeActivationsFilterKeys extends js.Object
  
  trait _DocumentFilterKey extends js.Object
  
  trait _DocumentFormat extends js.Object
  
  trait _DocumentHashType extends js.Object
  
  trait _DocumentParameterType extends js.Object
  
  trait _DocumentStatus extends js.Object
  
  trait _DocumentType extends js.Object
  
  trait _ExecutionMode extends js.Object
  
  trait _Fault extends js.Object
  
  trait _InstanceInformationFilterKey extends js.Object
  
  trait _InstancePatchStateOperatorType extends js.Object
  
  trait _InventoryAttributeDataType extends js.Object
  
  trait _InventoryDeletionStatus extends js.Object
  
  trait _InventoryQueryOperatorType extends js.Object
  
  trait _InventorySchemaDeleteOption extends js.Object
  
  trait _LastResourceDataSyncStatus extends js.Object
  
  trait _MaintenanceWindowExecutionStatus extends js.Object
  
  trait _MaintenanceWindowTaskType extends js.Object
  
  trait _NotificationEvent extends js.Object
  
  trait _NotificationType extends js.Object
  
  trait _OperatingSystem extends js.Object
  
  trait _ParameterType extends js.Object
  
  trait _ParametersFilterKey extends js.Object
  
  trait _PatchAction extends js.Object
  
  trait _PatchComplianceDataState extends js.Object
  
  trait _PatchComplianceLevel extends js.Object
  
  trait _PatchDeploymentStatus extends js.Object
  
  trait _PatchFilterKey extends js.Object
  
  trait _PatchOperationType extends js.Object
  
  trait _PingStatus extends js.Object
  
  trait _PlatformType extends js.Object
  
  trait _ResourceType extends js.Object
  
  trait _ResourceTypeForTagging extends js.Object
  
  trait _SessionFilterKey extends js.Object
  
  trait _SessionState extends js.Object
  
  trait _SessionStatus extends js.Object
  
  trait _SignalType extends js.Object
  
  trait _StepExecutionFilterKey extends js.Object
  
  trait _StopType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Account = java.lang.String
  type AccountId = java.lang.String
  type AccountIdList = js.Array[AccountId]
  type Accounts = js.Array[Account]
  type ActivationCode = java.lang.String
  type ActivationDescription = java.lang.String
  type ActivationId = java.lang.String
  type ActivationList = js.Array[Activation]
  type AgentErrorCode = java.lang.String
  type AggregatorSchemaOnly = scala.Boolean
  type AllowedPattern = java.lang.String
  type ApproveAfterDays = scala.Double
  type AssociationComplianceSeverity = _AssociationComplianceSeverity | java.lang.String
  type AssociationDescriptionList = js.Array[AssociationDescription]
  type AssociationExecutionFilterKey = _AssociationExecutionFilterKey | java.lang.String
  type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue = java.lang.String
  type AssociationExecutionId = java.lang.String
  type AssociationExecutionTargetsFilterKey = _AssociationExecutionTargetsFilterKey | java.lang.String
  type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = java.lang.String
  type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[AssociationExecution]
  type AssociationFilterKey = _AssociationFilterKey | java.lang.String
  type AssociationFilterList = js.Array[AssociationFilter]
  type AssociationFilterOperatorType = _AssociationFilterOperatorType | java.lang.String
  type AssociationFilterValue = java.lang.String
  type AssociationId = java.lang.String
  type AssociationIdList = js.Array[AssociationId]
  type AssociationList = js.Array[Association]
  type AssociationName = java.lang.String
  type AssociationResourceId = java.lang.String
  type AssociationResourceType = java.lang.String
  type AssociationStatusName = _AssociationStatusName | java.lang.String
  type AssociationVersion = java.lang.String
  type AssociationVersionList = js.Array[AssociationVersionInfo]
  type AttachmentContentList = js.Array[AttachmentContent]
  type AttachmentHash = java.lang.String
  type AttachmentHashType = awsDashSdkLib.awsDashSdkLibStrings.Sha256 | java.lang.String
  type AttachmentInformationList = js.Array[AttachmentInformation]
  type AttachmentName = java.lang.String
  type AttachmentUrl = java.lang.String
  type AttachmentsSourceKey = awsDashSdkLib.awsDashSdkLibStrings.SourceUrl | java.lang.String
  type AttachmentsSourceList = js.Array[AttachmentsSource]
  type AttachmentsSourceValue = java.lang.String
  type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type AutomationActionName = java.lang.String
  type AutomationExecutionFilterKey = _AutomationExecutionFilterKey | java.lang.String
  type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue = java.lang.String
  type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId = java.lang.String
  type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]
  type AutomationExecutionStatus = _AutomationExecutionStatus | java.lang.String
  type AutomationParameterKey = java.lang.String
  type AutomationParameterValue = java.lang.String
  type AutomationParameterValueList = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName = java.lang.String
  type AutomationType = _AutomationType | java.lang.String
  type BaselineDescription = java.lang.String
  type BaselineId = java.lang.String
  type BaselineName = java.lang.String
  type BatchErrorMessage = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type CloudWatchLogGroupName = java.lang.String
  type CloudWatchOutputEnabled = scala.Boolean
  type CommandFilterKey = _CommandFilterKey | java.lang.String
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = java.lang.String
  type CommandId = java.lang.String
  type CommandInvocationList = js.Array[CommandInvocation]
  type CommandInvocationStatus = _CommandInvocationStatus | java.lang.String
  type CommandList = js.Array[Command]
  type CommandMaxResults = scala.Double
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = java.lang.String
  type CommandPluginOutput = java.lang.String
  type CommandPluginStatus = _CommandPluginStatus | java.lang.String
  type CommandStatus = _CommandStatus | java.lang.String
  type Comment = java.lang.String
  type CompletedCount = scala.Double
  type ComplianceExecutionId = java.lang.String
  type ComplianceExecutionType = java.lang.String
  type ComplianceFilterValue = java.lang.String
  type ComplianceItemContentHash = java.lang.String
  type ComplianceItemEntryList = js.Array[ComplianceItemEntry]
  type ComplianceItemId = java.lang.String
  type ComplianceItemList = js.Array[ComplianceItem]
  type ComplianceItemTitle = java.lang.String
  type ComplianceQueryOperatorType = _ComplianceQueryOperatorType | java.lang.String
  type ComplianceResourceId = java.lang.String
  type ComplianceResourceIdList = js.Array[ComplianceResourceId]
  type ComplianceResourceType = java.lang.String
  type ComplianceResourceTypeList = js.Array[ComplianceResourceType]
  type ComplianceSeverity = _ComplianceSeverity | java.lang.String
  type ComplianceStatus = _ComplianceStatus | java.lang.String
  type ComplianceStringFilterKey = java.lang.String
  type ComplianceStringFilterList = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount = scala.Double
  type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName = java.lang.String
  type ComputerName = java.lang.String
  type ConnectionStatus = _ConnectionStatus | java.lang.String
  type ContentLength = scala.Double
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = stdLib.Date
  type DateTime = stdLib.Date
  type DefaultBaseline = scala.Boolean
  type DefaultInstanceName = java.lang.String
  type DeliveryTimedOutCount = scala.Double
  type DescribeActivationsFilterKeys = _DescribeActivationsFilterKeys | java.lang.String
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = java.lang.String
  type DocumentARN = java.lang.String
  type DocumentContent = java.lang.String
  type DocumentFilterKey = _DocumentFilterKey | java.lang.String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = java.lang.String
  type DocumentFormat = _DocumentFormat | java.lang.String
  type DocumentHash = java.lang.String
  type DocumentHashType = _DocumentHashType | java.lang.String
  type DocumentIdentifierList = js.Array[DocumentIdentifier]
  type DocumentKeyValuesFilterKey = java.lang.String
  type DocumentKeyValuesFilterList = js.Array[DocumentKeyValuesFilter]
  type DocumentKeyValuesFilterValue = java.lang.String
  type DocumentKeyValuesFilterValues = js.Array[DocumentKeyValuesFilterValue]
  type DocumentName = java.lang.String
  type DocumentOwner = java.lang.String
  type DocumentParameterDefaultValue = java.lang.String
  type DocumentParameterDescrption = java.lang.String
  type DocumentParameterList = js.Array[DocumentParameter]
  type DocumentParameterName = java.lang.String
  type DocumentParameterType = _DocumentParameterType | java.lang.String
  type DocumentPermissionType = awsDashSdkLib.awsDashSdkLibStrings.Share | java.lang.String
  type DocumentSchemaVersion = java.lang.String
  type DocumentSha1 = java.lang.String
  type DocumentStatus = _DocumentStatus | java.lang.String
  type DocumentStatusInformation = java.lang.String
  type DocumentType = _DocumentType | java.lang.String
  type DocumentVersion = java.lang.String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
  type DocumentVersionName = java.lang.String
  type DocumentVersionNumber = java.lang.String
  type DryRun = scala.Boolean
  type EffectiveInstanceAssociationMaxResults = scala.Double
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = scala.Double
  type ExecutionMode = _ExecutionMode | java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExpirationDate = stdLib.Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  type Fault = _Fault | java.lang.String
  type GetInventorySchemaMaxResults = scala.Double
  type GetParametersByPathMaxResults = scala.Double
  type IPAddress = java.lang.String
  type IamRole = java.lang.String
  type IdempotencyToken = java.lang.String
  type InstallOverrideList = java.lang.String
  type InstanceAssociationExecutionSummary = java.lang.String
  type InstanceAssociationList = js.Array[InstanceAssociation]
  type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceIdList = js.Array[InstanceId]
  type InstanceInformationFilterKey = _InstanceInformationFilterKey | java.lang.String
  type InstanceInformationFilterList = js.Array[InstanceInformationFilter]
  type InstanceInformationFilterValue = java.lang.String
  type InstanceInformationFilterValueSet = js.Array[InstanceInformationFilterValue]
  type InstanceInformationList = js.Array[InstanceInformation]
  type InstanceInformationStringFilterKey = java.lang.String
  type InstanceInformationStringFilterList = js.Array[InstanceInformationStringFilter]
  type InstancePatchStateFilterKey = java.lang.String
  type InstancePatchStateFilterList = js.Array[InstancePatchStateFilter]
  type InstancePatchStateFilterValue = java.lang.String
  type InstancePatchStateFilterValues = js.Array[InstancePatchStateFilterValue]
  type InstancePatchStateList = js.Array[InstancePatchState]
  type InstancePatchStateOperatorType = _InstancePatchStateOperatorType | java.lang.String
  type InstancePatchStatesList = js.Array[InstancePatchState]
  type InstanceTagName = java.lang.String
  type InstancesCount = scala.Double
  type Integer = scala.Double
  type InventoryAggregatorExpression = java.lang.String
  type InventoryAggregatorList = js.Array[InventoryAggregator]
  type InventoryAttributeDataType = _InventoryAttributeDataType | java.lang.String
  type InventoryDeletionId = java.lang.String
  type InventoryDeletionLastStatusMessage = java.lang.String
  type InventoryDeletionLastStatusUpdateTime = stdLib.Date
  type InventoryDeletionStartTime = stdLib.Date
  type InventoryDeletionStatus = _InventoryDeletionStatus | java.lang.String
  type InventoryDeletionSummaryItems = js.Array[InventoryDeletionSummaryItem]
  type InventoryDeletionsList = js.Array[InventoryDeletionStatusItem]
  type InventoryFilterKey = java.lang.String
  type InventoryFilterList = js.Array[InventoryFilter]
  type InventoryFilterValue = java.lang.String
  type InventoryFilterValueList = js.Array[InventoryFilterValue]
  type InventoryGroupList = js.Array[InventoryGroup]
  type InventoryGroupName = java.lang.String
  type InventoryItemAttributeList = js.Array[InventoryItemAttribute]
  type InventoryItemAttributeName = java.lang.String
  type InventoryItemCaptureTime = java.lang.String
  type InventoryItemContentHash = java.lang.String
  type InventoryItemEntryList = js.Array[InventoryItemEntry]
  type InventoryItemList = js.Array[InventoryItem]
  type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]
  type InventoryItemSchemaVersion = java.lang.String
  type InventoryItemTypeName = java.lang.String
  type InventoryItemTypeNameFilter = java.lang.String
  type InventoryQueryOperatorType = _InventoryQueryOperatorType | java.lang.String
  type InventoryResultEntityId = java.lang.String
  type InventoryResultEntityList = js.Array[InventoryResultEntity]
  type InventoryResultItemKey = java.lang.String
  type InventorySchemaDeleteOption = _InventorySchemaDeleteOption | java.lang.String
  type InventoryTypeDisplayName = java.lang.String
  type InvocationTraceOutput = java.lang.String
  type IsSubTypeSchema = scala.Boolean
  type KeyList = js.Array[TagKey]
  type LastResourceDataSyncMessage = java.lang.String
  type LastResourceDataSyncStatus = _LastResourceDataSyncStatus | java.lang.String
  type LastResourceDataSyncTime = stdLib.Date
  type LastSuccessfulResourceDataSyncTime = stdLib.Date
  type Long = scala.Double
  type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean
  type MaintenanceWindowCutoff = scala.Double
  type MaintenanceWindowDescription = java.lang.String
  type MaintenanceWindowDurationHours = scala.Double
  type MaintenanceWindowEnabled = scala.Boolean
  type MaintenanceWindowExecutionId = java.lang.String
  type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]
  type MaintenanceWindowExecutionStatus = _MaintenanceWindowExecutionStatus | java.lang.String
  type MaintenanceWindowExecutionStatusDetails = java.lang.String
  type MaintenanceWindowExecutionTaskExecutionId = java.lang.String
  type MaintenanceWindowExecutionTaskId = java.lang.String
  type MaintenanceWindowExecutionTaskIdList = js.Array[MaintenanceWindowExecutionTaskId]
  type MaintenanceWindowExecutionTaskIdentityList = js.Array[MaintenanceWindowExecutionTaskIdentity]
  type MaintenanceWindowExecutionTaskInvocationId = java.lang.String
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[MaintenanceWindowExecutionTaskInvocationIdentity]
  type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String
  type MaintenanceWindowFilterKey = java.lang.String
  type MaintenanceWindowFilterList = js.Array[MaintenanceWindowFilter]
  type MaintenanceWindowFilterValue = java.lang.String
  type MaintenanceWindowFilterValues = js.Array[MaintenanceWindowFilterValue]
  type MaintenanceWindowId = java.lang.String
  type MaintenanceWindowIdentityList = js.Array[MaintenanceWindowIdentity]
  type MaintenanceWindowLambdaClientContext = java.lang.String
  type MaintenanceWindowLambdaPayload = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsSsmMod.Blob | java.lang.String
  type MaintenanceWindowLambdaQualifier = java.lang.String
  type MaintenanceWindowMaxResults = scala.Double
  type MaintenanceWindowName = java.lang.String
  type MaintenanceWindowResourceType = awsDashSdkLib.awsDashSdkLibStrings.INSTANCE | java.lang.String
  type MaintenanceWindowSchedule = java.lang.String
  type MaintenanceWindowSearchMaxResults = scala.Double
  type MaintenanceWindowStepFunctionsInput = java.lang.String
  type MaintenanceWindowStepFunctionsName = java.lang.String
  type MaintenanceWindowStringDateTime = java.lang.String
  type MaintenanceWindowTargetId = java.lang.String
  type MaintenanceWindowTargetList = js.Array[MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn = java.lang.String
  type MaintenanceWindowTaskId = java.lang.String
  type MaintenanceWindowTaskList = js.Array[MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName = java.lang.String
  type MaintenanceWindowTaskParameterValue = java.lang.String
  type MaintenanceWindowTaskParameterValueList = js.Array[MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = scala.Double
  type MaintenanceWindowTaskTargetId = java.lang.String
  type MaintenanceWindowTaskType = _MaintenanceWindowTaskType | java.lang.String
  type MaintenanceWindowTimezone = java.lang.String
  type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = java.lang.String
  type MaxConcurrency = java.lang.String
  type MaxErrors = java.lang.String
  type MaxResults = scala.Double
  type MaxResultsEC2Compatible = scala.Double
  type NextToken = java.lang.String
  type NotificationArn = java.lang.String
  type NotificationEvent = _NotificationEvent | java.lang.String
  type NotificationEventList = js.Array[NotificationEvent]
  type NotificationType = _NotificationType | java.lang.String
  type OperatingSystem = _OperatingSystem | java.lang.String
  type OutputSourceId = java.lang.String
  type OutputSourceType = java.lang.String
  type OwnerInformation = java.lang.String
  type PSParameterName = java.lang.String
  type PSParameterSelector = java.lang.String
  type PSParameterValue = java.lang.String
  type PSParameterVersion = scala.Double
  type ParameterDescription = java.lang.String
  type ParameterHistoryList = js.Array[ParameterHistory]
  type ParameterKeyId = java.lang.String
  type ParameterLabel = java.lang.String
  type ParameterLabelList = js.Array[ParameterLabel]
  type ParameterList = js.Array[Parameter]
  type ParameterMetadataList = js.Array[ParameterMetadata]
  type ParameterName = java.lang.String
  type ParameterNameList = js.Array[PSParameterName]
  type ParameterStringFilterKey = java.lang.String
  type ParameterStringFilterList = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue = java.lang.String
  type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption = java.lang.String
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValueList = js.Array[ParameterValue]
  type ParametersFilterKey = _ParametersFilterKey | java.lang.String
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = java.lang.String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  type PatchAction = _PatchAction | java.lang.String
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = scala.Double
  type PatchClassification = java.lang.String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  type PatchComplianceDataState = _PatchComplianceDataState | java.lang.String
  type PatchComplianceLevel = _PatchComplianceLevel | java.lang.String
  type PatchComplianceMaxResults = scala.Double
  type PatchContentUrl = java.lang.String
  type PatchDeploymentStatus = _PatchDeploymentStatus | java.lang.String
  type PatchDescription = java.lang.String
  type PatchFailedCount = scala.Double
  type PatchFilterKey = _PatchFilterKey | java.lang.String
  type PatchFilterList = js.Array[PatchFilter]
  type PatchFilterValue = java.lang.String
  type PatchFilterValueList = js.Array[PatchFilterValue]
  type PatchGroup = java.lang.String
  type PatchGroupList = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId = java.lang.String
  type PatchIdList = js.Array[PatchId]
  type PatchInstalledCount = scala.Double
  type PatchInstalledOtherCount = scala.Double
  type PatchInstalledRejectedCount = scala.Double
  type PatchKbNumber = java.lang.String
  type PatchLanguage = java.lang.String
  type PatchList = js.Array[Patch]
  type PatchMissingCount = scala.Double
  type PatchMsrcNumber = java.lang.String
  type PatchMsrcSeverity = java.lang.String
  type PatchNotApplicableCount = scala.Double
  type PatchOperationType = _PatchOperationType | java.lang.String
  type PatchOrchestratorFilterKey = java.lang.String
  type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = java.lang.String
  type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct = java.lang.String
  type PatchProductFamily = java.lang.String
  type PatchRuleList = js.Array[PatchRule]
  type PatchSeverity = java.lang.String
  type PatchSourceConfiguration = java.lang.String
  type PatchSourceList = js.Array[PatchSource]
  type PatchSourceName = java.lang.String
  type PatchSourceProduct = java.lang.String
  type PatchSourceProductList = js.Array[PatchSourceProduct]
  type PatchTitle = java.lang.String
  type PatchVendor = java.lang.String
  type PingStatus = _PingStatus | java.lang.String
  type PlatformType = _PlatformType | java.lang.String
  type PlatformTypeList = js.Array[PlatformType]
  type Product = java.lang.String
  type PutInventoryMessage = java.lang.String
  type Region = java.lang.String
  type Regions = js.Array[Region]
  type RegistrationLimit = scala.Double
  type RegistrationsCount = scala.Double
  type RemainingCount = scala.Double
  type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount = scala.Double
  type ResourceCountByStatus = java.lang.String
  type ResourceDataSyncAWSKMSKeyARN = java.lang.String
  type ResourceDataSyncCreatedTime = stdLib.Date
  type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncName = java.lang.String
  type ResourceDataSyncS3BucketName = java.lang.String
  type ResourceDataSyncS3Format = awsDashSdkLib.awsDashSdkLibStrings.JsonSerDe | java.lang.String
  type ResourceDataSyncS3Prefix = java.lang.String
  type ResourceDataSyncS3Region = java.lang.String
  type ResourceId = java.lang.String
  type ResourceType = _ResourceType | java.lang.String
  type ResourceTypeForTagging = _ResourceTypeForTagging | java.lang.String
  type ResponseCode = scala.Double
  type ResultAttributeList = js.Array[ResultAttribute]
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3Region = java.lang.String
  type ScheduleExpression = java.lang.String
  type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]
  type ServiceRole = java.lang.String
  type SessionDetails = java.lang.String
  type SessionFilterKey = _SessionFilterKey | java.lang.String
  type SessionFilterList = js.Array[SessionFilter]
  type SessionFilterValue = java.lang.String
  type SessionId = java.lang.String
  type SessionList = js.Array[Session]
  type SessionManagerCloudWatchOutputUrl = java.lang.String
  type SessionManagerParameterName = java.lang.String
  type SessionManagerParameterValue = java.lang.String
  type SessionManagerParameterValueList = js.Array[SessionManagerParameterValue]
  type SessionManagerS3OutputUrl = java.lang.String
  type SessionMaxResults = scala.Double
  type SessionOwner = java.lang.String
  type SessionState = _SessionState | java.lang.String
  type SessionStatus = _SessionStatus | java.lang.String
  type SessionTarget = java.lang.String
  type SignalType = _SignalType | java.lang.String
  type SnapshotDownloadUrl = java.lang.String
  type SnapshotId = java.lang.String
  type StandardErrorContent = java.lang.String
  type StandardOutputContent = java.lang.String
  type StatusAdditionalInfo = java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type StatusName = java.lang.String
  type StepExecutionFilterKey = _StepExecutionFilterKey | java.lang.String
  type StepExecutionFilterList = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue = java.lang.String
  type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]
  type StepExecutionList = js.Array[StepExecution]
  type StopType = _StopType | java.lang.String
  type StreamUrl = java.lang.String
  type String = java.lang.String
  type StringDateTime = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetCount = scala.Double
  type TargetKey = java.lang.String
  type TargetLocations = js.Array[TargetLocation]
  type TargetMapKey = java.lang.String
  type TargetMapValue = java.lang.String
  type TargetMapValueList = js.Array[TargetMapValue]
  type TargetMaps = js.Array[TargetMap]
  type TargetParameterList = js.Array[ParameterValue]
  type TargetType = java.lang.String
  type TargetValue = java.lang.String
  type TargetValues = js.Array[TargetValue]
  type Targets = js.Array[Target]
  type TimeoutSeconds = scala.Double
  type TokenValue = java.lang.String
  type TotalCount = scala.Double
  type Url = java.lang.String
  type ValidNextStep = java.lang.String
  type ValidNextStepList = js.Array[ValidNextStep]
  type Version = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

