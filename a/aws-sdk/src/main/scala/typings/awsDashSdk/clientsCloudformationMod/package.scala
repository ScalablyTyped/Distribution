package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudformationMod {
  import typings.awsDashSdk.awsDashSdkStrings.Resource
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Account = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SKIPPED
    - java.lang.String
  */
  type AccountGateStatus = _AccountGateStatus | String
  type AccountGateStatusReason = String
  type AccountLimitList = js.Array[AccountLimit]
  type AccountList = js.Array[Account]
  type AllowedValue = String
  type AllowedValues = js.Array[AllowedValue]
  type Arn = String
  type BoxedInteger = Double
  type BoxedMaxResults = Double
  type Capabilities = js.Array[Capability]
  type CapabilitiesReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_IAM
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_NAMED_IAM
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_AUTO_EXPAND
    - java.lang.String
  */
  type Capability = _Capability | String
  type CausingEntity = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Add
    - typings.awsDashSdk.awsDashSdkStrings.Modify
    - typings.awsDashSdk.awsDashSdkStrings.Remove
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | String
  type ChangeSetId = String
  type ChangeSetName = String
  type ChangeSetNameOrId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeSetStatus = _ChangeSetStatus | String
  type ChangeSetStatusReason = String
  type ChangeSetSummaries = js.Array[ChangeSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE
    - java.lang.String
  */
  type ChangeSetType = _ChangeSetType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ResourceReference
    - typings.awsDashSdk.awsDashSdkStrings.ParameterReference
    - typings.awsDashSdk.awsDashSdkStrings.ResourceAttribute
    - typings.awsDashSdk.awsDashSdkStrings.DirectModification
    - typings.awsDashSdk.awsDashSdkStrings.Automatic
    - java.lang.String
  */
  type ChangeSource = _ChangeSource | String
  type ChangeType = Resource | String
  type Changes = js.Array[Change]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type ClientToken = String
  type CreationTime = Date
  type DeletionTime = Date
  type Description = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADD
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE
    - typings.awsDashSdk.awsDashSdkStrings.NOT_EQUAL
    - java.lang.String
  */
  type DifferenceType = _DifferenceType | String
  type DisableRollback = Boolean
  type EnableTerminationProtection = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Static
    - typings.awsDashSdk.awsDashSdkStrings.Dynamic
    - java.lang.String
  */
  type EvaluationType = _EvaluationType | String
  type EventId = String
  type ExecutionRoleName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.OBSOLETE
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | String
  type ExportName = String
  type ExportValue = String
  type Exports = js.Array[Export]
  type FailureToleranceCount = Double
  type FailureTolerancePercentage = Double
  type Imports = js.Array[StackName]
  type Key = String
  type LastUpdatedTime = Date
  type LimitName = String
  type LimitValue = Double
  type LogicalResourceId = String
  type LogicalResourceIds = js.Array[LogicalResourceId]
  type MaxConcurrentCount = Double
  type MaxConcurrentPercentage = Double
  type MaxResults = Double
  type Metadata = String
  type MonitoringTimeInMinutes = Double
  type NextToken = String
  type NoEcho = Boolean
  type NotificationARN = String
  type NotificationARNs = js.Array[NotificationARN]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DO_NOTHING
    - typings.awsDashSdk.awsDashSdkStrings.ROLLBACK
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type OnFailure = _OnFailure | String
  type OutputKey = String
  type OutputValue = String
  type Outputs = js.Array[Output]
  type ParameterDeclarations = js.Array[ParameterDeclaration]
  type ParameterKey = String
  type ParameterType = String
  type ParameterValue = String
  type Parameters = js.Array[Parameter]
  type PhysicalResourceId = String
  type PhysicalResourceIdContext = js.Array[PhysicalResourceIdContextKeyValuePair]
  type Properties = String
  type PropertyDifferences = js.Array[PropertyDifference]
  type PropertyName = String
  type PropertyPath = String
  type PropertyValue = String
  type Reason = String
  type Region = String
  type RegionList = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.True
    - typings.awsDashSdk.awsDashSdkStrings.False
    - typings.awsDashSdk.awsDashSdkStrings.Conditional
    - java.lang.String
  */
  type Replacement = _Replacement | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Never
    - typings.awsDashSdk.awsDashSdkStrings.Conditionally
    - typings.awsDashSdk.awsDashSdkStrings.Always
    - java.lang.String
  */
  type RequiresRecreation = _RequiresRecreation | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Properties
    - typings.awsDashSdk.awsDashSdkStrings.Metadata
    - typings.awsDashSdk.awsDashSdkStrings.CreationPolicy
    - typings.awsDashSdk.awsDashSdkStrings.UpdatePolicy
    - typings.awsDashSdk.awsDashSdkStrings.DeletionPolicy
    - typings.awsDashSdk.awsDashSdkStrings.Tags
    - java.lang.String
  */
  type ResourceAttribute = _ResourceAttribute | String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceProperties = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILURE
    - java.lang.String
  */
  type ResourceSignalStatus = _ResourceSignalStatus | String
  type ResourceSignalUniqueId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SKIPPED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_COMPLETE
    - java.lang.String
  */
  type ResourceStatus = _ResourceStatus | String
  type ResourceStatusReason = String
  type ResourceToSkip = String
  type ResourceType = String
  type ResourceTypes = js.Array[ResourceType]
  type ResourcesToSkip = js.Array[ResourceToSkip]
  type RetainResources = js.Array[LogicalResourceId]
  type RetainStacks = Boolean
  type RetainStacksNullable = Boolean
  type RoleARN = String
  type RollbackTriggers = js.Array[RollbackTrigger]
  type Scope = js.Array[ResourceAttribute]
  type StackDriftDetectionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DETECTION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DETECTION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DETECTION_COMPLETE
    - java.lang.String
  */
  type StackDriftDetectionStatus = _StackDriftDetectionStatus | String
  type StackDriftDetectionStatusReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DRIFTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_SYNC
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackDriftStatus = _StackDriftStatus | String
  type StackEvents = js.Array[StackEvent]
  type StackId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURRENT
    - typings.awsDashSdk.awsDashSdkStrings.OUTDATED
    - typings.awsDashSdk.awsDashSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = _StackInstanceStatus | String
  type StackInstanceSummaries = js.Array[StackInstanceSummary]
  type StackName = String
  type StackNameOrId = String
  type StackPolicyBody = String
  type StackPolicyDuringUpdateBody = String
  type StackPolicyDuringUpdateURL = String
  type StackPolicyURL = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_SYNC
    - typings.awsDashSdk.awsDashSdkStrings.MODIFIED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackResourceDriftStatus = _StackResourceDriftStatus | String
  type StackResourceDriftStatusFilters = js.Array[StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[StackResourceDrift]
  type StackResourceSummaries = js.Array[StackResourceSummary]
  type StackResources = js.Array[StackResource]
  type StackSetARN = String
  type StackSetId = String
  type StackSetName = String
  type StackSetNameOrId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationAction = _StackSetOperationAction | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - java.lang.String
  */
  type StackSetOperationResultStatus = _StackSetOperationResultStatus | String
  type StackSetOperationResultSummaries = js.Array[StackSetOperationResultSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type StackSetOperationStatus = _StackSetOperationStatus | String
  type StackSetOperationSummaries = js.Array[StackSetOperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type StackSetStatus = _StackSetStatus | String
  type StackSetSummaries = js.Array[StackSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.ROLLBACK_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.ROLLBACK_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.ROLLBACK_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_COMPLETE_CLEANUP_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_ROLLBACK_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_ROLLBACK_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_ROLLBACK_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.REVIEW_IN_PROGRESS
    - java.lang.String
  */
  type StackStatus = _StackStatus | String
  type StackStatusFilter = js.Array[StackStatus]
  type StackStatusReason = String
  type StackSummaries = js.Array[StackSummary]
  type Stacks = js.Array[Stack]
  type StageList = js.Array[TemplateStage]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TemplateBody = String
  type TemplateDescription = String
  type TemplateParameters = js.Array[TemplateParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Original
    - typings.awsDashSdk.awsDashSdkStrings.Processed
    - java.lang.String
  */
  type TemplateStage = _TemplateStage | String
  type TemplateURL = String
  type TimeoutMinutes = Double
  type Timestamp = Date
  type TransformName = String
  type TransformsList = js.Array[TransformName]
  type Type = String
  type Url = String
  type UsePreviousTemplate = Boolean
  type UsePreviousValue = Boolean
  type Value = String
  type Version = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-05-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
