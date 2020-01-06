package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDynamodbMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADD
    - typings.awsDashSdk.awsDashSdkStrings.PUT
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = _AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[AttributeDefinition]
  type AttributeMap = StringDictionary[AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[AttributeName]
  type AttributeUpdates = StringDictionary[AttributeValueUpdate]
  type AttributeValueList = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = _BackupStatus | java.lang.String
  type BackupSummaries = js.Array[BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = _BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.AWS_BACKUP
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = _BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = StringDictionary[KeysAndAttributes]
  type BatchGetResponseMap = StringDictionary[ItemList]
  type BatchWriteItemRequestMap = StringDictionary[WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONED
    - typings.awsDashSdk.awsDashSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = _BillingMode | java.lang.String
  type BinaryAttributeValue = Buffer | Uint8Array | Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type BooleanObject = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQ
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.LE
    - typings.awsDashSdk.awsDashSdkStrings.LT
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - typings.awsDashSdk.awsDashSdkStrings.BETWEEN
    - typings.awsDashSdk.awsDashSdkStrings.NOT_NULL
    - typings.awsDashSdk.awsDashSdkStrings.NULL
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_CONTAINS
    - typings.awsDashSdk.awsDashSdkStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AND
    - typings.awsDashSdk.awsDashSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = _ConditionalOperator | java.lang.String
  type ConsistentRead = Boolean
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = _ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLE
    - typings.awsDashSdk.awsDashSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = _ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = _ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[ContributorInsightsSummary]
  type Double = scala.Double
  type Endpoints = js.Array[Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = StringDictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap = StringDictionary[AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = StringDictionary[AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = StringDictionary[Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[GlobalSecondaryIndexAutoScalingUpdate]
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = _GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = StringDictionary[AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = StringDictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[AttributeMap]
  type ItemResponseList = js.Array[ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = StringDictionary[AttributeValue]
  type KeyConditions = StringDictionary[Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[Key]
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HASH
    - typings.awsDashSdk.awsDashSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  type LastUpdateDateTime = Date
  type ListAttributeValue = js.Array[AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = StringDictionary[AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = _PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.KEYS_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = _ProjectionType | java.lang.String
  type PutItemInputAttributeMap = StringDictionary[AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[ReplicaAutoScalingDescription]
  type ReplicaAutoScalingUpdateList = js.Array[ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[ReplicaGlobalSecondaryIndexDescription]
  type ReplicaGlobalSecondaryIndexList = js.Array[ReplicaGlobalSecondaryIndex]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[Replica]
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = _ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INDEXES
    - typings.awsDashSdk.awsDashSdkStrings.TOTAL
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = _ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIZE
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = _ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.ALL_OLD
    - typings.awsDashSdk.awsDashSdkStrings.UPDATED_OLD
    - typings.awsDashSdk.awsDashSdkStrings.ALL_NEW
    - typings.awsDashSdk.awsDashSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = _ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL_OLD
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = _ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = _SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES256
    - typings.awsDashSdk.awsDashSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = _SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.S
    - typings.awsDashSdk.awsDashSdkStrings.N
    - typings.awsDashSdk.awsDashSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = _ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = StringDictionary[Capacity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL_ATTRIBUTES
    - typings.awsDashSdk.awsDashSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typings.awsDashSdk.awsDashSdkStrings.SPECIFIC_ATTRIBUTES
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - java.lang.String
  */
  type Select = _Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEW_IMAGE
    - typings.awsDashSdk.awsDashSdkStrings.OLD_IMAGE
    - typings.awsDashSdk.awsDashSdkStrings.NEW_AND_OLD_IMAGES
    - typings.awsDashSdk.awsDashSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = _StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[TableName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVING
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVED
    - java.lang.String
  */
  type TableStatus = _TableStatus | java.lang.String
  type TagKeyList = js.Array[TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = Date
  type TimeRangeUpperBound = Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = _TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[TransactGetItem]
  type TransactWriteItemList = js.Array[TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[WriteRequest]
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2011-12-05`
    - typings.awsDashSdk.awsDashSdkStrings.`2012-08-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
