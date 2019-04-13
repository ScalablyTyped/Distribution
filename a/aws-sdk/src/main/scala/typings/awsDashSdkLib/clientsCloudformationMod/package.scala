package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudformationMod {
  type Account = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SKIPPED
    - java.lang.String
  */
  type AccountGateStatus = _AccountGateStatus | java.lang.String
  type AccountGateStatusReason = java.lang.String
  type AccountLimitList = js.Array[AccountLimit]
  type AccountList = js.Array[Account]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[AllowedValue]
  type Arn = java.lang.String
  type BoxedInteger = scala.Double
  type BoxedMaxResults = scala.Double
  type Capabilities = js.Array[Capability]
  type CapabilitiesReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_NAMED_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_AUTO_EXPAND
    - java.lang.String
  */
  type Capability = _Capability | java.lang.String
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Add
    - awsDashSdkLib.awsDashSdkLibStrings.Modify
    - awsDashSdkLib.awsDashSdkLibStrings.Remove
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | java.lang.String
  type ChangeSetId = java.lang.String
  type ChangeSetName = java.lang.String
  type ChangeSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ChangeSetStatus = _ChangeSetStatus | java.lang.String
  type ChangeSetStatusReason = java.lang.String
  type ChangeSetSummaries = js.Array[ChangeSetSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE
    - java.lang.String
  */
  type ChangeSetType = _ChangeSetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceReference
    - awsDashSdkLib.awsDashSdkLibStrings.ParameterReference
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceAttribute
    - awsDashSdkLib.awsDashSdkLibStrings.DirectModification
    - awsDashSdkLib.awsDashSdkLibStrings.Automatic
    - java.lang.String
  */
  type ChangeSource = _ChangeSource | java.lang.String
  type ChangeType = awsDashSdkLib.awsDashSdkLibStrings.Resource | java.lang.String
  type Changes = js.Array[Change]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type CreationTime = stdLib.Date
  type DeletionTime = stdLib.Date
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADD
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_EQUAL
    - java.lang.String
  */
  type DifferenceType = _DifferenceType | java.lang.String
  type DisableRollback = scala.Boolean
  type EnableTerminationProtection = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Static
    - awsDashSdkLib.awsDashSdkLibStrings.Dynamic
    - java.lang.String
  */
  type EvaluationType = _EvaluationType | java.lang.String
  type EventId = java.lang.String
  type ExecutionRoleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.OBSOLETE
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type ExportName = java.lang.String
  type ExportValue = java.lang.String
  type Exports = js.Array[Export]
  type FailureToleranceCount = scala.Double
  type FailureTolerancePercentage = scala.Double
  type Imports = js.Array[StackName]
  type Key = java.lang.String
  type LastUpdatedTime = stdLib.Date
  type LimitName = java.lang.String
  type LimitValue = scala.Double
  type LogicalResourceId = java.lang.String
  type LogicalResourceIds = js.Array[LogicalResourceId]
  type MaxConcurrentCount = scala.Double
  type MaxConcurrentPercentage = scala.Double
  type MaxResults = scala.Double
  type Metadata = java.lang.String
  type MonitoringTimeInMinutes = scala.Double
  type NextToken = java.lang.String
  type NoEcho = scala.Boolean
  type NotificationARN = java.lang.String
  type NotificationARNs = js.Array[NotificationARN]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DO_NOTHING
    - awsDashSdkLib.awsDashSdkLibStrings.ROLLBACK
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type OnFailure = _OnFailure | java.lang.String
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type Outputs = js.Array[Output]
  type ParameterDeclarations = js.Array[ParameterDeclaration]
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type Parameters = js.Array[Parameter]
  type PhysicalResourceId = java.lang.String
  type PhysicalResourceIdContext = js.Array[PhysicalResourceIdContextKeyValuePair]
  type Properties = java.lang.String
  type PropertyDifferences = js.Array[PropertyDifference]
  type PropertyName = java.lang.String
  type PropertyPath = java.lang.String
  type PropertyValue = java.lang.String
  type Reason = java.lang.String
  type Region = java.lang.String
  type RegionList = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.True
    - awsDashSdkLib.awsDashSdkLibStrings.False
    - awsDashSdkLib.awsDashSdkLibStrings.Conditional
    - java.lang.String
  */
  type Replacement = _Replacement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Never
    - awsDashSdkLib.awsDashSdkLibStrings.Conditionally
    - awsDashSdkLib.awsDashSdkLibStrings.Always
    - java.lang.String
  */
  type RequiresRecreation = _RequiresRecreation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Properties
    - awsDashSdkLib.awsDashSdkLibStrings.Metadata
    - awsDashSdkLib.awsDashSdkLibStrings.CreationPolicy
    - awsDashSdkLib.awsDashSdkLibStrings.UpdatePolicy
    - awsDashSdkLib.awsDashSdkLibStrings.DeletionPolicy
    - awsDashSdkLib.awsDashSdkLibStrings.Tags
    - java.lang.String
  */
  type ResourceAttribute = _ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceProperties = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILURE
    - java.lang.String
  */
  type ResourceSignalStatus = _ResourceSignalStatus | java.lang.String
  type ResourceSignalUniqueId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_SKIPPED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_COMPLETE
    - java.lang.String
  */
  type ResourceStatus = _ResourceStatus | java.lang.String
  type ResourceStatusReason = java.lang.String
  type ResourceToSkip = java.lang.String
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[ResourceType]
  type ResourcesToSkip = js.Array[ResourceToSkip]
  type RetainResources = js.Array[LogicalResourceId]
  type RetainStacks = scala.Boolean
  type RetainStacksNullable = scala.Boolean
  type RoleARN = java.lang.String
  type RollbackTriggers = js.Array[RollbackTrigger]
  type Scope = js.Array[ResourceAttribute]
  type StackDriftDetectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DETECTION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DETECTION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DETECTION_COMPLETE
    - java.lang.String
  */
  type StackDriftDetectionStatus = _StackDriftDetectionStatus | java.lang.String
  type StackDriftDetectionStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DRIFTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_SYNC
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackDriftStatus = _StackDriftStatus | java.lang.String
  type StackEvents = js.Array[StackEvent]
  type StackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURRENT
    - awsDashSdkLib.awsDashSdkLibStrings.OUTDATED
    - awsDashSdkLib.awsDashSdkLibStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = _StackInstanceStatus | java.lang.String
  type StackInstanceSummaries = js.Array[StackInstanceSummary]
  type StackName = java.lang.String
  type StackNameOrId = java.lang.String
  type StackPolicyBody = java.lang.String
  type StackPolicyDuringUpdateBody = java.lang.String
  type StackPolicyDuringUpdateURL = java.lang.String
  type StackPolicyURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_SYNC
    - awsDashSdkLib.awsDashSdkLibStrings.MODIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackResourceDriftStatus = _StackResourceDriftStatus | java.lang.String
  type StackResourceDriftStatusFilters = js.Array[StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[StackResourceDrift]
  type StackResourceSummaries = js.Array[StackResourceSummary]
  type StackResources = js.Array[StackResource]
  type StackSetARN = java.lang.String
  type StackSetId = java.lang.String
  type StackSetName = java.lang.String
  type StackSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationAction = _StackSetOperationAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - java.lang.String
  */
  type StackSetOperationResultStatus = _StackSetOperationResultStatus | java.lang.String
  type StackSetOperationResultSummaries = js.Array[StackSetOperationResultSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type StackSetOperationStatus = _StackSetOperationStatus | java.lang.String
  type StackSetOperationSummaries = js.Array[StackSetOperationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type StackSetStatus = _StackSetStatus | java.lang.String
  type StackSetSummaries = js.Array[StackSetSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.ROLLBACK_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.ROLLBACK_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.ROLLBACK_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_COMPLETE_CLEANUP_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_ROLLBACK_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_ROLLBACK_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_ROLLBACK_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.REVIEW_IN_PROGRESS
    - java.lang.String
  */
  type StackStatus = _StackStatus | java.lang.String
  type StackStatusFilter = js.Array[StackStatus]
  type StackStatusReason = java.lang.String
  type StackSummaries = js.Array[StackSummary]
  type Stacks = js.Array[Stack]
  type StageList = js.Array[TemplateStage]
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateParameters = js.Array[TemplateParameter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Original
    - awsDashSdkLib.awsDashSdkLibStrings.Processed
    - java.lang.String
  */
  type TemplateStage = _TemplateStage | java.lang.String
  type TemplateURL = java.lang.String
  type TimeoutMinutes = scala.Double
  type Timestamp = stdLib.Date
  type TransformName = java.lang.String
  type TransformsList = js.Array[TransformName]
  type Type = java.lang.String
  type Url = java.lang.String
  type UsePreviousTemplate = scala.Boolean
  type UsePreviousValue = scala.Boolean
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2010-05-15`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
