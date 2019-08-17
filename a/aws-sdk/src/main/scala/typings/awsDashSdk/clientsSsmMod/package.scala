package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSsmMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.JsonSerDe
  import typings.awsDashSdk.awsDashSdkStrings.Sha256
  import typings.awsDashSdk.awsDashSdkStrings.Share
  import typings.awsDashSdk.awsDashSdkStrings.SourceUrl
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

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
  type ApproveAfterDays = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CRITICAL
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type AssociationComplianceSeverity = _AssociationComplianceSeverity | java.lang.String
  type AssociationDescriptionList = js.Array[AssociationDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionId
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.CreatedTime
    - java.lang.String
  */
  type AssociationExecutionFilterKey = _AssociationExecutionFilterKey | java.lang.String
  type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue = java.lang.String
  type AssociationExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.ResourceId
    - typings.awsDashSdk.awsDashSdkStrings.ResourceType
    - java.lang.String
  */
  type AssociationExecutionTargetsFilterKey = _AssociationExecutionTargetsFilterKey | java.lang.String
  type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = java.lang.String
  type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[AssociationExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InstanceId
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.AssociationId
    - typings.awsDashSdk.awsDashSdkStrings.AssociationStatusName
    - typings.awsDashSdk.awsDashSdkStrings.LastExecutedBefore
    - typings.awsDashSdk.awsDashSdkStrings.LastExecutedAfter
    - typings.awsDashSdk.awsDashSdkStrings.AssociationName
    - java.lang.String
  */
  type AssociationFilterKey = _AssociationFilterKey | java.lang.String
  type AssociationFilterList = js.Array[AssociationFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUAL
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type AssociationFilterOperatorType = _AssociationFilterOperatorType | java.lang.String
  type AssociationFilterValue = java.lang.String
  type AssociationId = java.lang.String
  type AssociationIdList = js.Array[AssociationId]
  type AssociationList = js.Array[Association]
  type AssociationName = java.lang.String
  type AssociationResourceId = java.lang.String
  type AssociationResourceType = java.lang.String
  type AssociationStatusAggregatedCount = StringDictionary[InstanceCount]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type AssociationStatusName = _AssociationStatusName | java.lang.String
  type AssociationVersion = java.lang.String
  type AssociationVersionList = js.Array[AssociationVersionInfo]
  type AttachmentContentList = js.Array[AttachmentContent]
  type AttachmentHash = java.lang.String
  type AttachmentHashType = Sha256 | java.lang.String
  type AttachmentInformationList = js.Array[AttachmentInformation]
  type AttachmentName = java.lang.String
  type AttachmentUrl = java.lang.String
  type AttachmentsSourceKey = SourceUrl | java.lang.String
  type AttachmentsSourceList = js.Array[AttachmentsSource]
  type AttachmentsSourceValue = java.lang.String
  type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type AutomationActionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DocumentNamePrefix
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionStatus
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionId
    - typings.awsDashSdk.awsDashSdkStrings.ParentExecutionId
    - typings.awsDashSdk.awsDashSdkStrings.CurrentAction
    - typings.awsDashSdk.awsDashSdkStrings.StartTimeBefore
    - typings.awsDashSdk.awsDashSdkStrings.StartTimeAfter
    - typings.awsDashSdk.awsDashSdkStrings.AutomationType
    - java.lang.String
  */
  type AutomationExecutionFilterKey = _AutomationExecutionFilterKey | java.lang.String
  type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue = java.lang.String
  type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId = java.lang.String
  type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Waiting
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Cancelling
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type AutomationExecutionStatus = _AutomationExecutionStatus | java.lang.String
  type AutomationParameterKey = java.lang.String
  type AutomationParameterMap = StringDictionary[AutomationParameterValueList]
  type AutomationParameterValue = java.lang.String
  type AutomationParameterValueList = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CrossAccount
    - typings.awsDashSdk.awsDashSdkStrings.Local
    - java.lang.String
  */
  type AutomationType = _AutomationType | java.lang.String
  type BaselineDescription = java.lang.String
  type BaselineId = java.lang.String
  type BaselineName = java.lang.String
  type BatchErrorMessage = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type CloudWatchLogGroupName = java.lang.String
  type CloudWatchOutputEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvokedAfter
    - typings.awsDashSdk.awsDashSdkStrings.InvokedBefore
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionStage
    - typings.awsDashSdk.awsDashSdkStrings.DocumentName
    - java.lang.String
  */
  type CommandFilterKey = _CommandFilterKey | java.lang.String
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = java.lang.String
  type CommandId = java.lang.String
  type CommandInvocationList = js.Array[CommandInvocation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Delayed
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Cancelling
    - java.lang.String
  */
  type CommandInvocationStatus = _CommandInvocationStatus | java.lang.String
  type CommandList = js.Array[Command]
  type CommandMaxResults = Double
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = java.lang.String
  type CommandPluginOutput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type CommandPluginStatus = _CommandPluginStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Cancelling
    - java.lang.String
  */
  type CommandStatus = _CommandStatus | java.lang.String
  type Comment = java.lang.String
  type CompletedCount = Double
  type ComplianceExecutionId = java.lang.String
  type ComplianceExecutionType = java.lang.String
  type ComplianceFilterValue = java.lang.String
  type ComplianceItemContentHash = java.lang.String
  type ComplianceItemDetails = StringDictionary[AttributeValue]
  type ComplianceItemEntryList = js.Array[ComplianceItemEntry]
  type ComplianceItemId = java.lang.String
  type ComplianceItemList = js.Array[ComplianceItem]
  type ComplianceItemTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUAL
    - typings.awsDashSdk.awsDashSdkStrings.NOT_EQUAL
    - typings.awsDashSdk.awsDashSdkStrings.BEGIN_WITH
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type ComplianceQueryOperatorType = _ComplianceQueryOperatorType | java.lang.String
  type ComplianceResourceId = java.lang.String
  type ComplianceResourceIdList = js.Array[ComplianceResourceId]
  type ComplianceResourceType = java.lang.String
  type ComplianceResourceTypeList = js.Array[ComplianceResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CRITICAL
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.INFORMATIONAL
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type ComplianceSeverity = _ComplianceSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ComplianceStatus = _ComplianceStatus | java.lang.String
  type ComplianceStringFilterKey = java.lang.String
  type ComplianceStringFilterList = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount = Double
  type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName = java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Connected
    - typings.awsDashSdk.awsDashSdkStrings.NotConnected
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | java.lang.String
  type ContentLength = Double
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = Date
  type DateTime = Date
  type DefaultBaseline = scala.Boolean
  type DefaultInstanceName = java.lang.String
  type DeliveryTimedOutCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ActivationIds
    - typings.awsDashSdk.awsDashSdkStrings.DefaultInstanceName
    - typings.awsDashSdk.awsDashSdkStrings.IamRole
    - java.lang.String
  */
  type DescribeActivationsFilterKeys = _DescribeActivationsFilterKeys | java.lang.String
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = java.lang.String
  type DocumentARN = java.lang.String
  type DocumentContent = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.Owner
    - typings.awsDashSdk.awsDashSdkStrings.PlatformTypes
    - typings.awsDashSdk.awsDashSdkStrings.DocumentType
    - java.lang.String
  */
  type DocumentFilterKey = _DocumentFilterKey | java.lang.String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.YAML
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type DocumentFormat = _DocumentFormat | java.lang.String
  type DocumentHash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Sha256
    - typings.awsDashSdk.awsDashSdkStrings.Sha1
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.String
    - typings.awsDashSdk.awsDashSdkStrings.StringList
    - java.lang.String
  */
  type DocumentParameterType = _DocumentParameterType | java.lang.String
  type DocumentPermissionType = Share | java.lang.String
  type DocumentSchemaVersion = java.lang.String
  type DocumentSha1 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Updating
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type DocumentStatus = _DocumentStatus | java.lang.String
  type DocumentStatusInformation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Command
    - typings.awsDashSdk.awsDashSdkStrings.Policy
    - typings.awsDashSdk.awsDashSdkStrings.Automation
    - typings.awsDashSdk.awsDashSdkStrings.Session
    - typings.awsDashSdk.awsDashSdkStrings.Package
    - java.lang.String
  */
  type DocumentType = _DocumentType | java.lang.String
  type DocumentVersion = java.lang.String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
  type DocumentVersionName = java.lang.String
  type DocumentVersionNumber = java.lang.String
  type DryRun = scala.Boolean
  type EffectiveInstanceAssociationMaxResults = Double
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto
    - typings.awsDashSdk.awsDashSdkStrings.Interactive
    - java.lang.String
  */
  type ExecutionMode = _ExecutionMode | java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExpirationDate = Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Client
    - typings.awsDashSdk.awsDashSdkStrings.Server
    - typings.awsDashSdk.awsDashSdkStrings.Unknown
    - java.lang.String
  */
  type Fault = _Fault | java.lang.String
  type GetInventorySchemaMaxResults = Double
  type GetParametersByPathMaxResults = Double
  type IPAddress = java.lang.String
  type IamRole = java.lang.String
  type IdempotencyToken = java.lang.String
  type InstallOverrideList = java.lang.String
  type InstanceAssociationExecutionSummary = java.lang.String
  type InstanceAssociationList = js.Array[InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = StringDictionary[InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount = Double
  type InstanceId = java.lang.String
  type InstanceIdList = js.Array[InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InstanceIds
    - typings.awsDashSdk.awsDashSdkStrings.AgentVersion
    - typings.awsDashSdk.awsDashSdkStrings.PingStatus
    - typings.awsDashSdk.awsDashSdkStrings.PlatformTypes
    - typings.awsDashSdk.awsDashSdkStrings.ActivationIds
    - typings.awsDashSdk.awsDashSdkStrings.IamRole
    - typings.awsDashSdk.awsDashSdkStrings.ResourceType
    - typings.awsDashSdk.awsDashSdkStrings.AssociationStatus
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equal
    - typings.awsDashSdk.awsDashSdkStrings.NotEqual
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - java.lang.String
  */
  type InstancePatchStateOperatorType = _InstancePatchStateOperatorType | java.lang.String
  type InstancePatchStatesList = js.Array[InstancePatchState]
  type InstanceTagName = java.lang.String
  type InstancesCount = Double
  type Integer = Double
  type InventoryAggregatorExpression = java.lang.String
  type InventoryAggregatorList = js.Array[InventoryAggregator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.string
    - typings.awsDashSdk.awsDashSdkStrings.number
    - java.lang.String
  */
  type InventoryAttributeDataType = _InventoryAttributeDataType | java.lang.String
  type InventoryDeletionId = java.lang.String
  type InventoryDeletionLastStatusMessage = java.lang.String
  type InventoryDeletionLastStatusUpdateTime = Date
  type InventoryDeletionStartTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - java.lang.String
  */
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
  type InventoryItemContentContext = StringDictionary[AttributeValue]
  type InventoryItemContentHash = java.lang.String
  type InventoryItemEntry = StringDictionary[AttributeValue]
  type InventoryItemEntryList = js.Array[InventoryItemEntry]
  type InventoryItemList = js.Array[InventoryItem]
  type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]
  type InventoryItemSchemaVersion = java.lang.String
  type InventoryItemTypeName = java.lang.String
  type InventoryItemTypeNameFilter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equal
    - typings.awsDashSdk.awsDashSdkStrings.NotEqual
    - typings.awsDashSdk.awsDashSdkStrings.BeginWith
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.Exists
    - java.lang.String
  */
  type InventoryQueryOperatorType = _InventoryQueryOperatorType | java.lang.String
  type InventoryResultEntityId = java.lang.String
  type InventoryResultEntityList = js.Array[InventoryResultEntity]
  type InventoryResultItemKey = java.lang.String
  type InventoryResultItemMap = StringDictionary[InventoryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DisableSchema
    - typings.awsDashSdk.awsDashSdkStrings.DeleteSchema
    - java.lang.String
  */
  type InventorySchemaDeleteOption = _InventorySchemaDeleteOption | java.lang.String
  type InventoryTypeDisplayName = java.lang.String
  type InvocationTraceOutput = java.lang.String
  type IsSubTypeSchema = scala.Boolean
  type KeyList = js.Array[TagKey]
  type LastResourceDataSyncMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Successful
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - java.lang.String
  */
  type LastResourceDataSyncStatus = _LastResourceDataSyncStatus | java.lang.String
  type LastResourceDataSyncTime = Date
  type LastSuccessfulResourceDataSyncTime = Date
  type Long = Double
  type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean
  type MaintenanceWindowCutoff = Double
  type MaintenanceWindowDescription = java.lang.String
  type MaintenanceWindowDurationHours = Double
  type MaintenanceWindowEnabled = scala.Boolean
  type MaintenanceWindowExecutionId = java.lang.String
  type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLING
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.SKIPPED_OVERLAPPING
    - java.lang.String
  */
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
  type MaintenanceWindowLambdaPayload = Buffer | Uint8Array | Blob | java.lang.String
  type MaintenanceWindowLambdaQualifier = java.lang.String
  type MaintenanceWindowMaxResults = Double
  type MaintenanceWindowName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_GROUP
    - java.lang.String
  */
  type MaintenanceWindowResourceType = _MaintenanceWindowResourceType | java.lang.String
  type MaintenanceWindowSchedule = java.lang.String
  type MaintenanceWindowSearchMaxResults = Double
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
  type MaintenanceWindowTaskParameters = StringDictionary[MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = Double
  type MaintenanceWindowTaskTargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUN_COMMAND
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATION
    - typings.awsDashSdk.awsDashSdkStrings.STEP_FUNCTIONS
    - typings.awsDashSdk.awsDashSdkStrings.LAMBDA
    - java.lang.String
  */
  type MaintenanceWindowTaskType = _MaintenanceWindowTaskType | java.lang.String
  type MaintenanceWindowTimezone = java.lang.String
  type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = java.lang.String
  type MaxConcurrency = java.lang.String
  type MaxErrors = java.lang.String
  type MaxResults = Double
  type MaxResultsEC2Compatible = Double
  type NextToken = java.lang.String
  type NormalStringMap = StringDictionary[String]
  type NotificationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type NotificationEvent = _NotificationEvent | java.lang.String
  type NotificationEventList = js.Array[NotificationEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Command
    - typings.awsDashSdk.awsDashSdkStrings.Invocation
    - java.lang.String
  */
  type NotificationType = _NotificationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_LINUX
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_LINUX_2
    - typings.awsDashSdk.awsDashSdkStrings.UBUNTU
    - typings.awsDashSdk.awsDashSdkStrings.REDHAT_ENTERPRISE_LINUX
    - typings.awsDashSdk.awsDashSdkStrings.SUSE
    - typings.awsDashSdk.awsDashSdkStrings.CENTOS
    - java.lang.String
  */
  type OperatingSystem = _OperatingSystem | java.lang.String
  type OpsAggregatorList = js.Array[OpsAggregator]
  type OpsAggregatorType = java.lang.String
  type OpsAggregatorValue = java.lang.String
  type OpsAggregatorValueKey = java.lang.String
  type OpsAggregatorValueMap = StringDictionary[OpsAggregatorValue]
  type OpsDataAttributeName = java.lang.String
  type OpsDataTypeName = java.lang.String
  type OpsEntityId = java.lang.String
  type OpsEntityItemEntry = StringDictionary[AttributeValue]
  type OpsEntityItemEntryList = js.Array[OpsEntityItemEntry]
  type OpsEntityItemKey = java.lang.String
  type OpsEntityItemMap = StringDictionary[OpsEntityItem]
  type OpsEntityList = js.Array[OpsEntity]
  type OpsFilterKey = java.lang.String
  type OpsFilterList = js.Array[OpsFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equal
    - typings.awsDashSdk.awsDashSdkStrings.NotEqual
    - typings.awsDashSdk.awsDashSdkStrings.BeginWith
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.Exists
    - java.lang.String
  */
  type OpsFilterOperatorType = _OpsFilterOperatorType | java.lang.String
  type OpsFilterValue = java.lang.String
  type OpsFilterValueList = js.Array[OpsFilterValue]
  type OpsItemDataKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SearchableString
    - typings.awsDashSdk.awsDashSdkStrings.String
    - java.lang.String
  */
  type OpsItemDataType = _OpsItemDataType | java.lang.String
  type OpsItemDataValueString = java.lang.String
  type OpsItemDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.CreatedBy
    - typings.awsDashSdk.awsDashSdkStrings.Source
    - typings.awsDashSdk.awsDashSdkStrings.Priority
    - typings.awsDashSdk.awsDashSdkStrings.Title
    - typings.awsDashSdk.awsDashSdkStrings.OpsItemId
    - typings.awsDashSdk.awsDashSdkStrings.CreatedTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - typings.awsDashSdk.awsDashSdkStrings.OperationalData
    - typings.awsDashSdk.awsDashSdkStrings.OperationalDataKey
    - typings.awsDashSdk.awsDashSdkStrings.OperationalDataValue
    - typings.awsDashSdk.awsDashSdkStrings.ResourceId
    - typings.awsDashSdk.awsDashSdkStrings.AutomationId
    - java.lang.String
  */
  type OpsItemFilterKey = _OpsItemFilterKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equal
    - typings.awsDashSdk.awsDashSdkStrings.Contains
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - java.lang.String
  */
  type OpsItemFilterOperator = _OpsItemFilterOperator | java.lang.String
  type OpsItemFilterValue = java.lang.String
  type OpsItemFilterValues = js.Array[OpsItemFilterValue]
  type OpsItemFilters = js.Array[OpsItemFilter]
  type OpsItemId = java.lang.String
  type OpsItemMaxResults = Double
  type OpsItemNotifications = js.Array[OpsItemNotification]
  type OpsItemOperationalData = StringDictionary[OpsItemDataValue]
  type OpsItemOpsDataKeysList = js.Array[String]
  type OpsItemPriority = Double
  type OpsItemSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Open
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Resolved
    - java.lang.String
  */
  type OpsItemStatus = _OpsItemStatus | java.lang.String
  type OpsItemSummaries = js.Array[OpsItemSummary]
  type OpsItemTitle = java.lang.String
  type OutputSourceId = java.lang.String
  type OutputSourceType = java.lang.String
  type OwnerInformation = java.lang.String
  type PSParameterName = java.lang.String
  type PSParameterSelector = java.lang.String
  type PSParameterValue = java.lang.String
  type PSParameterVersion = Double
  type ParameterDescription = java.lang.String
  type ParameterHistoryList = js.Array[ParameterHistory]
  type ParameterKeyId = java.lang.String
  type ParameterLabel = java.lang.String
  type ParameterLabelList = js.Array[ParameterLabel]
  type ParameterList = js.Array[Parameter]
  type ParameterMetadataList = js.Array[ParameterMetadata]
  type ParameterName = java.lang.String
  type ParameterNameList = js.Array[PSParameterName]
  type ParameterPolicies = java.lang.String
  type ParameterPolicyList = js.Array[ParameterInlinePolicy]
  type ParameterStringFilterKey = java.lang.String
  type ParameterStringFilterList = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue = java.lang.String
  type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Standard
    - typings.awsDashSdk.awsDashSdkStrings.Advanced
    - java.lang.String
  */
  type ParameterTier = _ParameterTier | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.String
    - typings.awsDashSdk.awsDashSdkStrings.StringList
    - typings.awsDashSdk.awsDashSdkStrings.SecureString
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValueList = js.Array[ParameterValue]
  type Parameters = StringDictionary[ParameterValueList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.Type
    - typings.awsDashSdk.awsDashSdkStrings.KeyId
    - java.lang.String
  */
  type ParametersFilterKey = _ParametersFilterKey | java.lang.String
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = java.lang.String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_AS_DEPENDENCY
    - typings.awsDashSdk.awsDashSdkStrings.BLOCK
    - java.lang.String
  */
  type PatchAction = _PatchAction | java.lang.String
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = Double
  type PatchClassification = java.lang.String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSTALLED
    - typings.awsDashSdk.awsDashSdkStrings.INSTALLED_OTHER
    - typings.awsDashSdk.awsDashSdkStrings.INSTALLED_REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.MISSING
    - typings.awsDashSdk.awsDashSdkStrings.NOT_APPLICABLE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type PatchComplianceDataState = _PatchComplianceDataState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CRITICAL
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.INFORMATIONAL
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type PatchComplianceLevel = _PatchComplianceLevel | java.lang.String
  type PatchComplianceMaxResults = Double
  type PatchContentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.APPROVED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_APPROVAL
    - typings.awsDashSdk.awsDashSdkStrings.EXPLICIT_APPROVED
    - typings.awsDashSdk.awsDashSdkStrings.EXPLICIT_REJECTED
    - java.lang.String
  */
  type PatchDeploymentStatus = _PatchDeploymentStatus | java.lang.String
  type PatchDescription = java.lang.String
  type PatchFailedCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PATCH_SET
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCT
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCT_FAMILY
    - typings.awsDashSdk.awsDashSdkStrings.CLASSIFICATION
    - typings.awsDashSdk.awsDashSdkStrings.MSRC_SEVERITY
    - typings.awsDashSdk.awsDashSdkStrings.PATCH_ID
    - typings.awsDashSdk.awsDashSdkStrings.SECTION
    - typings.awsDashSdk.awsDashSdkStrings.PRIORITY
    - typings.awsDashSdk.awsDashSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchFilterKey = _PatchFilterKey | java.lang.String
  type PatchFilterList = js.Array[PatchFilter]
  type PatchFilterValue = java.lang.String
  type PatchFilterValueList = js.Array[PatchFilterValue]
  type PatchGroup = java.lang.String
  type PatchGroupList = js.Array[PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]
  type PatchId = java.lang.String
  type PatchIdList = js.Array[PatchId]
  type PatchInstalledCount = Double
  type PatchInstalledOtherCount = Double
  type PatchInstalledRejectedCount = Double
  type PatchKbNumber = java.lang.String
  type PatchLanguage = java.lang.String
  type PatchList = js.Array[Patch]
  type PatchMissingCount = Double
  type PatchMsrcNumber = java.lang.String
  type PatchMsrcSeverity = java.lang.String
  type PatchNotApplicableCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Scan
    - typings.awsDashSdk.awsDashSdkStrings.Install
    - java.lang.String
  */
  type PatchOperationType = _PatchOperationType | java.lang.String
  type PatchOrchestratorFilterKey = java.lang.String
  type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = java.lang.String
  type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]
  type PatchProduct = java.lang.String
  type PatchProductFamily = java.lang.String
  type PatchPropertiesList = js.Array[PatchPropertyEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCT
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCT_FAMILY
    - typings.awsDashSdk.awsDashSdkStrings.CLASSIFICATION
    - typings.awsDashSdk.awsDashSdkStrings.MSRC_SEVERITY
    - typings.awsDashSdk.awsDashSdkStrings.PRIORITY
    - typings.awsDashSdk.awsDashSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchProperty = _PatchProperty | java.lang.String
  type PatchPropertyEntry = StringDictionary[AttributeValue]
  type PatchRuleList = js.Array[PatchRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OS
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION
    - java.lang.String
  */
  type PatchSet = _PatchSet | java.lang.String
  type PatchSeverity = java.lang.String
  type PatchSourceConfiguration = java.lang.String
  type PatchSourceList = js.Array[PatchSource]
  type PatchSourceName = java.lang.String
  type PatchSourceProduct = java.lang.String
  type PatchSourceProductList = js.Array[PatchSourceProduct]
  type PatchTitle = java.lang.String
  type PatchUnreportedNotApplicableCount = Double
  type PatchVendor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Online
    - typings.awsDashSdk.awsDashSdkStrings.ConnectionLost
    - typings.awsDashSdk.awsDashSdkStrings.Inactive
    - java.lang.String
  */
  type PingStatus = _PingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Windows
    - typings.awsDashSdk.awsDashSdkStrings.Linux
    - java.lang.String
  */
  type PlatformType = _PlatformType | java.lang.String
  type PlatformTypeList = js.Array[PlatformType]
  type Product = java.lang.String
  type PutInventoryMessage = java.lang.String
  type Region = java.lang.String
  type Regions = js.Array[Region]
  type RegistrationLimit = Double
  type RegistrationsCount = Double
  type RelatedOpsItems = js.Array[RelatedOpsItem]
  type RemainingCount = Double
  type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]
  type ResourceCount = Double
  type ResourceCountByStatus = java.lang.String
  type ResourceDataSyncAWSKMSKeyARN = java.lang.String
  type ResourceDataSyncCreatedTime = Date
  type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]
  type ResourceDataSyncName = java.lang.String
  type ResourceDataSyncS3BucketName = java.lang.String
  type ResourceDataSyncS3Format = JsonSerDe | java.lang.String
  type ResourceDataSyncS3Prefix = java.lang.String
  type ResourceDataSyncS3Region = java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ManagedInstance
    - typings.awsDashSdk.awsDashSdkStrings.Document
    - typings.awsDashSdk.awsDashSdkStrings.EC2Instance
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Document
    - typings.awsDashSdk.awsDashSdkStrings.ManagedInstance
    - typings.awsDashSdk.awsDashSdkStrings.MaintenanceWindow
    - typings.awsDashSdk.awsDashSdkStrings.Parameter
    - typings.awsDashSdk.awsDashSdkStrings.PatchBaseline
    - typings.awsDashSdk.awsDashSdkStrings.OpsItem
    - java.lang.String
  */
  type ResourceTypeForTagging = _ResourceTypeForTagging | java.lang.String
  type ResponseCode = Double
  type ResultAttributeList = js.Array[ResultAttribute]
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3Region = java.lang.String
  type ScheduleExpression = java.lang.String
  type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]
  type ServiceRole = java.lang.String
  type ServiceSettingId = java.lang.String
  type ServiceSettingValue = java.lang.String
  type SessionDetails = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvokedAfter
    - typings.awsDashSdk.awsDashSdkStrings.InvokedBefore
    - typings.awsDashSdk.awsDashSdkStrings.Target
    - typings.awsDashSdk.awsDashSdkStrings.Owner
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - java.lang.String
  */
  type SessionFilterKey = _SessionFilterKey | java.lang.String
  type SessionFilterList = js.Array[SessionFilter]
  type SessionFilterValue = java.lang.String
  type SessionId = java.lang.String
  type SessionList = js.Array[Session]
  type SessionManagerCloudWatchOutputUrl = java.lang.String
  type SessionManagerParameterName = java.lang.String
  type SessionManagerParameterValue = java.lang.String
  type SessionManagerParameterValueList = js.Array[SessionManagerParameterValue]
  type SessionManagerParameters = StringDictionary[SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl = java.lang.String
  type SessionMaxResults = Double
  type SessionOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.History
    - java.lang.String
  */
  type SessionState = _SessionState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Connected
    - typings.awsDashSdk.awsDashSdkStrings.Connecting
    - typings.awsDashSdk.awsDashSdkStrings.Disconnected
    - typings.awsDashSdk.awsDashSdkStrings.Terminated
    - typings.awsDashSdk.awsDashSdkStrings.Terminating
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type SessionStatus = _SessionStatus | java.lang.String
  type SessionTarget = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Approve
    - typings.awsDashSdk.awsDashSdkStrings.Reject
    - typings.awsDashSdk.awsDashSdkStrings.StartStep
    - typings.awsDashSdk.awsDashSdkStrings.StopStep
    - typings.awsDashSdk.awsDashSdkStrings.Resume
    - java.lang.String
  */
  type SignalType = _SignalType | java.lang.String
  type SnapshotDownloadUrl = java.lang.String
  type SnapshotId = java.lang.String
  type StandardErrorContent = java.lang.String
  type StandardOutputContent = java.lang.String
  type StatusAdditionalInfo = java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type StatusName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.StartTimeBefore
    - typings.awsDashSdk.awsDashSdkStrings.StartTimeAfter
    - typings.awsDashSdk.awsDashSdkStrings.StepExecutionStatus
    - typings.awsDashSdk.awsDashSdkStrings.StepExecutionId
    - typings.awsDashSdk.awsDashSdkStrings.StepName
    - typings.awsDashSdk.awsDashSdkStrings.Action
    - java.lang.String
  */
  type StepExecutionFilterKey = _StepExecutionFilterKey | java.lang.String
  type StepExecutionFilterList = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue = java.lang.String
  type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]
  type StepExecutionList = js.Array[StepExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - typings.awsDashSdk.awsDashSdkStrings.Cancel
    - java.lang.String
  */
  type StopType = _StopType | java.lang.String
  type StreamUrl = java.lang.String
  type String = java.lang.String
  type StringDateTime = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetCount = Double
  type TargetKey = java.lang.String
  type TargetLocations = js.Array[TargetLocation]
  type TargetMap = StringDictionary[TargetMapValueList]
  type TargetMapKey = java.lang.String
  type TargetMapValue = java.lang.String
  type TargetMapValueList = js.Array[TargetMapValue]
  type TargetMaps = js.Array[TargetMap]
  type TargetParameterList = js.Array[ParameterValue]
  type TargetType = java.lang.String
  type TargetValue = java.lang.String
  type TargetValues = js.Array[TargetValue]
  type Targets = js.Array[Target]
  type TimeoutSeconds = Double
  type TokenValue = java.lang.String
  type TotalCount = Double
  type Url = java.lang.String
  type ValidNextStep = java.lang.String
  type ValidNextStepList = js.Array[ValidNextStep]
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
