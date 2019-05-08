package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSsmMod {
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CRITICAL
    - awsDashSdkLib.awsDashSdkLibStrings.HIGH
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.LOW
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - java.lang.String
  */
  type AssociationComplianceSeverity = _AssociationComplianceSeverity | java.lang.String
  type AssociationDescriptionList = js.Array[AssociationDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionId
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedTime
    - java.lang.String
  */
  type AssociationExecutionFilterKey = _AssociationExecutionFilterKey | java.lang.String
  type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]
  type AssociationExecutionFilterValue = java.lang.String
  type AssociationExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceId
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceType
    - java.lang.String
  */
  type AssociationExecutionTargetsFilterKey = _AssociationExecutionTargetsFilterKey | java.lang.String
  type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = java.lang.String
  type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[AssociationExecution]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceId
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.AssociationId
    - awsDashSdkLib.awsDashSdkLibStrings.AssociationStatusName
    - awsDashSdkLib.awsDashSdkLibStrings.LastExecutedBefore
    - awsDashSdkLib.awsDashSdkLibStrings.LastExecutedAfter
    - awsDashSdkLib.awsDashSdkLibStrings.AssociationName
    - java.lang.String
  */
  type AssociationFilterKey = _AssociationFilterKey | java.lang.String
  type AssociationFilterList = js.Array[AssociationFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQUAL
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
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
  type AssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[InstanceCount]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DocumentNamePrefix
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionStatus
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionId
    - awsDashSdkLib.awsDashSdkLibStrings.ParentExecutionId
    - awsDashSdkLib.awsDashSdkLibStrings.CurrentAction
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimeBefore
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimeAfter
    - awsDashSdkLib.awsDashSdkLibStrings.AutomationType
    - java.lang.String
  */
  type AutomationExecutionFilterKey = _AutomationExecutionFilterKey | java.lang.String
  type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]
  type AutomationExecutionFilterValue = java.lang.String
  type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]
  type AutomationExecutionId = java.lang.String
  type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Waiting
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelling
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type AutomationExecutionStatus = _AutomationExecutionStatus | java.lang.String
  type AutomationParameterKey = java.lang.String
  type AutomationParameterMap = org.scalablytyped.runtime.StringDictionary[AutomationParameterValueList]
  type AutomationParameterValue = java.lang.String
  type AutomationParameterValueList = js.Array[AutomationParameterValue]
  type AutomationTargetParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CrossAccount
    - awsDashSdkLib.awsDashSdkLibStrings.Local
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InvokedAfter
    - awsDashSdkLib.awsDashSdkLibStrings.InvokedBefore
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionStage
    - awsDashSdkLib.awsDashSdkLibStrings.DocumentName
    - java.lang.String
  */
  type CommandFilterKey = _CommandFilterKey | java.lang.String
  type CommandFilterList = js.Array[CommandFilter]
  type CommandFilterValue = java.lang.String
  type CommandId = java.lang.String
  type CommandInvocationList = js.Array[CommandInvocation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Delayed
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelling
    - java.lang.String
  */
  type CommandInvocationStatus = _CommandInvocationStatus | java.lang.String
  type CommandList = js.Array[Command]
  type CommandMaxResults = scala.Double
  type CommandPluginList = js.Array[CommandPlugin]
  type CommandPluginName = java.lang.String
  type CommandPluginOutput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type CommandPluginStatus = _CommandPluginStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelling
    - java.lang.String
  */
  type CommandStatus = _CommandStatus | java.lang.String
  type Comment = java.lang.String
  type CompletedCount = scala.Double
  type ComplianceExecutionId = java.lang.String
  type ComplianceExecutionType = java.lang.String
  type ComplianceFilterValue = java.lang.String
  type ComplianceItemContentHash = java.lang.String
  type ComplianceItemDetails = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type ComplianceItemEntryList = js.Array[ComplianceItemEntry]
  type ComplianceItemId = java.lang.String
  type ComplianceItemList = js.Array[ComplianceItem]
  type ComplianceItemTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQUAL
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_EQUAL
    - awsDashSdkLib.awsDashSdkLibStrings.BEGIN_WITH
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
    - java.lang.String
  */
  type ComplianceQueryOperatorType = _ComplianceQueryOperatorType | java.lang.String
  type ComplianceResourceId = java.lang.String
  type ComplianceResourceIdList = js.Array[ComplianceResourceId]
  type ComplianceResourceType = java.lang.String
  type ComplianceResourceTypeList = js.Array[ComplianceResourceType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CRITICAL
    - awsDashSdkLib.awsDashSdkLibStrings.HIGH
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.LOW
    - awsDashSdkLib.awsDashSdkLibStrings.INFORMATIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - java.lang.String
  */
  type ComplianceSeverity = _ComplianceSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ComplianceStatus = _ComplianceStatus | java.lang.String
  type ComplianceStringFilterKey = java.lang.String
  type ComplianceStringFilterList = js.Array[ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]
  type ComplianceSummaryCount = scala.Double
  type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]
  type ComplianceTypeName = java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Connected
    - awsDashSdkLib.awsDashSdkLibStrings.NotConnected
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | java.lang.String
  type ContentLength = scala.Double
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type CreatedDate = stdLib.Date
  type DateTime = stdLib.Date
  type DefaultBaseline = scala.Boolean
  type DefaultInstanceName = java.lang.String
  type DeliveryTimedOutCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ActivationIds
    - awsDashSdkLib.awsDashSdkLibStrings.DefaultInstanceName
    - awsDashSdkLib.awsDashSdkLibStrings.IamRole
    - java.lang.String
  */
  type DescribeActivationsFilterKeys = _DescribeActivationsFilterKeys | java.lang.String
  type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]
  type DescriptionInDocument = java.lang.String
  type DocumentARN = java.lang.String
  type DocumentContent = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.Owner
    - awsDashSdkLib.awsDashSdkLibStrings.PlatformTypes
    - awsDashSdkLib.awsDashSdkLibStrings.DocumentType
    - java.lang.String
  */
  type DocumentFilterKey = _DocumentFilterKey | java.lang.String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.YAML
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type DocumentFormat = _DocumentFormat | java.lang.String
  type DocumentHash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Sha256
    - awsDashSdkLib.awsDashSdkLibStrings.Sha1
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
    - awsDashSdkLib.awsDashSdkLibStrings.String
    - awsDashSdkLib.awsDashSdkLibStrings.StringList
    - java.lang.String
  */
  type DocumentParameterType = _DocumentParameterType | java.lang.String
  type DocumentPermissionType = awsDashSdkLib.awsDashSdkLibStrings.Share | java.lang.String
  type DocumentSchemaVersion = java.lang.String
  type DocumentSha1 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DocumentStatus = _DocumentStatus | java.lang.String
  type DocumentStatusInformation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Command
    - awsDashSdkLib.awsDashSdkLibStrings.Policy
    - awsDashSdkLib.awsDashSdkLibStrings.Automation
    - awsDashSdkLib.awsDashSdkLibStrings.Session
    - awsDashSdkLib.awsDashSdkLibStrings.Package
    - java.lang.String
  */
  type DocumentType = _DocumentType | java.lang.String
  type DocumentVersion = java.lang.String
  type DocumentVersionList = js.Array[DocumentVersionInfo]
  type DocumentVersionName = java.lang.String
  type DocumentVersionNumber = java.lang.String
  type DryRun = scala.Boolean
  type EffectiveInstanceAssociationMaxResults = scala.Double
  type EffectivePatchList = js.Array[EffectivePatch]
  type ErrorCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Auto
    - awsDashSdkLib.awsDashSdkLibStrings.Interactive
    - java.lang.String
  */
  type ExecutionMode = _ExecutionMode | java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExpirationDate = stdLib.Date
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Client
    - awsDashSdkLib.awsDashSdkLibStrings.Server
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type Fault = _Fault | java.lang.String
  type GetInventorySchemaMaxResults = scala.Double
  type GetParametersByPathMaxResults = scala.Double
  type IPAddress = java.lang.String
  type IamRole = java.lang.String
  type IdempotencyToken = java.lang.String
  type InstallOverrideList = java.lang.String
  type InstanceAssociationExecutionSummary = java.lang.String
  type InstanceAssociationList = js.Array[InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceIdList = js.Array[InstanceId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceIds
    - awsDashSdkLib.awsDashSdkLibStrings.AgentVersion
    - awsDashSdkLib.awsDashSdkLibStrings.PingStatus
    - awsDashSdkLib.awsDashSdkLibStrings.PlatformTypes
    - awsDashSdkLib.awsDashSdkLibStrings.ActivationIds
    - awsDashSdkLib.awsDashSdkLibStrings.IamRole
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceType
    - awsDashSdkLib.awsDashSdkLibStrings.AssociationStatus
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
    - awsDashSdkLib.awsDashSdkLibStrings.Equal
    - awsDashSdkLib.awsDashSdkLibStrings.NotEqual
    - awsDashSdkLib.awsDashSdkLibStrings.LessThan
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThan
    - java.lang.String
  */
  type InstancePatchStateOperatorType = _InstancePatchStateOperatorType | java.lang.String
  type InstancePatchStatesList = js.Array[InstancePatchState]
  type InstanceTagName = java.lang.String
  type InstancesCount = scala.Double
  type Integer = scala.Double
  type InventoryAggregatorExpression = java.lang.String
  type InventoryAggregatorList = js.Array[InventoryAggregator]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.string
    - awsDashSdkLib.awsDashSdkLibStrings.number
    - java.lang.String
  */
  type InventoryAttributeDataType = _InventoryAttributeDataType | java.lang.String
  type InventoryDeletionId = java.lang.String
  type InventoryDeletionLastStatusMessage = java.lang.String
  type InventoryDeletionLastStatusUpdateTime = stdLib.Date
  type InventoryDeletionStartTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
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
  type InventoryItemContentContext = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type InventoryItemContentHash = java.lang.String
  type InventoryItemEntry = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type InventoryItemEntryList = js.Array[InventoryItemEntry]
  type InventoryItemList = js.Array[InventoryItem]
  type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]
  type InventoryItemSchemaVersion = java.lang.String
  type InventoryItemTypeName = java.lang.String
  type InventoryItemTypeNameFilter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Equal
    - awsDashSdkLib.awsDashSdkLibStrings.NotEqual
    - awsDashSdkLib.awsDashSdkLibStrings.BeginWith
    - awsDashSdkLib.awsDashSdkLibStrings.LessThan
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThan
    - awsDashSdkLib.awsDashSdkLibStrings.Exists
    - java.lang.String
  */
  type InventoryQueryOperatorType = _InventoryQueryOperatorType | java.lang.String
  type InventoryResultEntityId = java.lang.String
  type InventoryResultEntityList = js.Array[InventoryResultEntity]
  type InventoryResultItemKey = java.lang.String
  type InventoryResultItemMap = org.scalablytyped.runtime.StringDictionary[InventoryResultItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DisableSchema
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteSchema
    - java.lang.String
  */
  type InventorySchemaDeleteOption = _InventorySchemaDeleteOption | java.lang.String
  type InventoryTypeDisplayName = java.lang.String
  type InvocationTraceOutput = java.lang.String
  type IsSubTypeSchema = scala.Boolean
  type KeyList = js.Array[TagKey]
  type LastResourceDataSyncMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLING
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.SKIPPED_OVERLAPPING
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
  type MaintenanceWindowLambdaPayload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
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
  type MaintenanceWindowTaskParameters = org.scalablytyped.runtime.StringDictionary[MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = scala.Double
  type MaintenanceWindowTaskTargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUN_COMMAND
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATION
    - awsDashSdkLib.awsDashSdkLibStrings.STEP_FUNCTIONS
    - awsDashSdkLib.awsDashSdkLibStrings.LAMBDA
    - java.lang.String
  */
  type MaintenanceWindowTaskType = _MaintenanceWindowTaskType | java.lang.String
  type MaintenanceWindowTimezone = java.lang.String
  type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = java.lang.String
  type MaxConcurrency = java.lang.String
  type MaxErrors = java.lang.String
  type MaxResults = scala.Double
  type MaxResultsEC2Compatible = scala.Double
  type NextToken = java.lang.String
  type NormalStringMap = org.scalablytyped.runtime.StringDictionary[String]
  type NotificationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type NotificationEvent = _NotificationEvent | java.lang.String
  type NotificationEventList = js.Array[NotificationEvent]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Command
    - awsDashSdkLib.awsDashSdkLibStrings.Invocation
    - java.lang.String
  */
  type NotificationType = _NotificationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_LINUX
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_LINUX_2
    - awsDashSdkLib.awsDashSdkLibStrings.UBUNTU
    - awsDashSdkLib.awsDashSdkLibStrings.REDHAT_ENTERPRISE_LINUX
    - awsDashSdkLib.awsDashSdkLibStrings.SUSE
    - awsDashSdkLib.awsDashSdkLibStrings.CENTOS
    - java.lang.String
  */
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
  type ParameterPolicies = java.lang.String
  type ParameterPolicyList = js.Array[ParameterInlinePolicy]
  type ParameterStringFilterKey = java.lang.String
  type ParameterStringFilterList = js.Array[ParameterStringFilter]
  type ParameterStringFilterValue = java.lang.String
  type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]
  type ParameterStringQueryOption = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Standard
    - awsDashSdkLib.awsDashSdkLibStrings.Advanced
    - java.lang.String
  */
  type ParameterTier = _ParameterTier | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.String
    - awsDashSdkLib.awsDashSdkLibStrings.StringList
    - awsDashSdkLib.awsDashSdkLibStrings.SecureString
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValueList = js.Array[ParameterValue]
  type Parameters = org.scalablytyped.runtime.StringDictionary[ParameterValueList]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.Type
    - awsDashSdkLib.awsDashSdkLibStrings.KeyId
    - java.lang.String
  */
  type ParametersFilterKey = _ParametersFilterKey | java.lang.String
  type ParametersFilterList = js.Array[ParametersFilter]
  type ParametersFilterValue = java.lang.String
  type ParametersFilterValueList = js.Array[ParametersFilterValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOW_AS_DEPENDENCY
    - awsDashSdkLib.awsDashSdkLibStrings.BLOCK
    - java.lang.String
  */
  type PatchAction = _PatchAction | java.lang.String
  type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]
  type PatchBaselineMaxResults = scala.Double
  type PatchClassification = java.lang.String
  type PatchComplianceDataList = js.Array[PatchComplianceData]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INSTALLED
    - awsDashSdkLib.awsDashSdkLibStrings.INSTALLED_OTHER
    - awsDashSdkLib.awsDashSdkLibStrings.INSTALLED_REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_APPLICABLE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type PatchComplianceDataState = _PatchComplianceDataState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CRITICAL
    - awsDashSdkLib.awsDashSdkLibStrings.HIGH
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.LOW
    - awsDashSdkLib.awsDashSdkLibStrings.INFORMATIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - java.lang.String
  */
  type PatchComplianceLevel = _PatchComplianceLevel | java.lang.String
  type PatchComplianceMaxResults = scala.Double
  type PatchContentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.APPROVED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_APPROVAL
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLICIT_APPROVED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLICIT_REJECTED
    - java.lang.String
  */
  type PatchDeploymentStatus = _PatchDeploymentStatus | java.lang.String
  type PatchDescription = java.lang.String
  type PatchFailedCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PATCH_SET
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCT
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCT_FAMILY
    - awsDashSdkLib.awsDashSdkLibStrings.CLASSIFICATION
    - awsDashSdkLib.awsDashSdkLibStrings.MSRC_SEVERITY
    - awsDashSdkLib.awsDashSdkLibStrings.PATCH_ID
    - awsDashSdkLib.awsDashSdkLibStrings.SECTION
    - awsDashSdkLib.awsDashSdkLibStrings.PRIORITY
    - awsDashSdkLib.awsDashSdkLibStrings.SEVERITY
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Scan
    - awsDashSdkLib.awsDashSdkLibStrings.Install
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
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCT
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCT_FAMILY
    - awsDashSdkLib.awsDashSdkLibStrings.CLASSIFICATION
    - awsDashSdkLib.awsDashSdkLibStrings.MSRC_SEVERITY
    - awsDashSdkLib.awsDashSdkLibStrings.PRIORITY
    - awsDashSdkLib.awsDashSdkLibStrings.SEVERITY
    - java.lang.String
  */
  type PatchProperty = _PatchProperty | java.lang.String
  type PatchPropertyEntry = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type PatchRuleList = js.Array[PatchRule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OS
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION
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
  type PatchUnreportedNotApplicableCount = scala.Double
  type PatchVendor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Online
    - awsDashSdkLib.awsDashSdkLibStrings.ConnectionLost
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - java.lang.String
  */
  type PingStatus = _PingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Windows
    - awsDashSdkLib.awsDashSdkLibStrings.Linux
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ManagedInstance
    - awsDashSdkLib.awsDashSdkLibStrings.Document
    - awsDashSdkLib.awsDashSdkLibStrings.EC2Instance
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Document
    - awsDashSdkLib.awsDashSdkLibStrings.ManagedInstance
    - awsDashSdkLib.awsDashSdkLibStrings.MaintenanceWindow
    - awsDashSdkLib.awsDashSdkLibStrings.Parameter
    - awsDashSdkLib.awsDashSdkLibStrings.PatchBaseline
    - java.lang.String
  */
  type ResourceTypeForTagging = _ResourceTypeForTagging | java.lang.String
  type ResponseCode = scala.Double
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
    - awsDashSdkLib.awsDashSdkLibStrings.InvokedAfter
    - awsDashSdkLib.awsDashSdkLibStrings.InvokedBefore
    - awsDashSdkLib.awsDashSdkLibStrings.Target
    - awsDashSdkLib.awsDashSdkLibStrings.Owner
    - awsDashSdkLib.awsDashSdkLibStrings.Status
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
  type SessionManagerParameters = org.scalablytyped.runtime.StringDictionary[SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl = java.lang.String
  type SessionMaxResults = scala.Double
  type SessionOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.History
    - java.lang.String
  */
  type SessionState = _SessionState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Connected
    - awsDashSdkLib.awsDashSdkLibStrings.Connecting
    - awsDashSdkLib.awsDashSdkLibStrings.Disconnected
    - awsDashSdkLib.awsDashSdkLibStrings.Terminated
    - awsDashSdkLib.awsDashSdkLibStrings.Terminating
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type SessionStatus = _SessionStatus | java.lang.String
  type SessionTarget = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Approve
    - awsDashSdkLib.awsDashSdkLibStrings.Reject
    - awsDashSdkLib.awsDashSdkLibStrings.StartStep
    - awsDashSdkLib.awsDashSdkLibStrings.StopStep
    - awsDashSdkLib.awsDashSdkLibStrings.Resume
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
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimeBefore
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimeAfter
    - awsDashSdkLib.awsDashSdkLibStrings.StepExecutionStatus
    - awsDashSdkLib.awsDashSdkLibStrings.StepExecutionId
    - awsDashSdkLib.awsDashSdkLibStrings.StepName
    - awsDashSdkLib.awsDashSdkLibStrings.Action
    - java.lang.String
  */
  type StepExecutionFilterKey = _StepExecutionFilterKey | java.lang.String
  type StepExecutionFilterList = js.Array[StepExecutionFilter]
  type StepExecutionFilterValue = java.lang.String
  type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]
  type StepExecutionList = js.Array[StepExecution]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.Cancel
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
  type TargetCount = scala.Double
  type TargetKey = java.lang.String
  type TargetLocations = js.Array[TargetLocation]
  type TargetMap = org.scalablytyped.runtime.StringDictionary[TargetMapValueList]
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
