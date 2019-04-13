package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentClientNs {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADD
    - awsDashSdkLib.awsDashSdkLibStrings.PUT
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = _AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[AttributeValueUpdate]
  type AttributeValue = js.Any
  type AttributeValueList = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = scala.Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = stdLib.Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = _BackupStatus | java.lang.String
  type BackupSummaries = js.Array[BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = _BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_BACKUP
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = _BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONED
    - awsDashSdkLib.awsDashSdkLibStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = _BillingMode | java.lang.String
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQ
    - awsDashSdkLib.awsDashSdkLibStrings.NE
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.LE
    - awsDashSdkLib.awsDashSdkLibStrings.LT
    - awsDashSdkLib.awsDashSdkLibStrings.GE
    - awsDashSdkLib.awsDashSdkLibStrings.GT
    - awsDashSdkLib.awsDashSdkLibStrings.BETWEEN
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_NULL
    - awsDashSdkLib.awsDashSdkLibStrings.NULL
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINS
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_CONTAINS
    - awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AND
    - awsDashSdkLib.awsDashSdkLibStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = _ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = _ContinuousBackupsStatus | java.lang.String
  type Double = scala.Double
  type Endpoints = js.Array[Endpoint]
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[Condition]
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = _GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[AttributeMap]
  type ItemResponseList = js.Array[ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[Key]
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HASH
    - awsDashSdkLib.awsDashSdkLibStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  type ListAttributeValue = js.Array[AttributeValue]
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = _PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = _ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type RegionName = java.lang.String
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[Replica]
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = _ReplicaStatus | java.lang.String
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INDEXES
    - awsDashSdkLib.awsDashSdkLibStrings.TOTAL
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = _ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIZE
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = _ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATED_OLD
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_NEW
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = _ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = _ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLING
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLING
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = _SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AES256
    - awsDashSdkLib.awsDashSdkLibStrings.KMS
    - java.lang.String
  */
  type SSEType = _SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.S
    - awsDashSdkLib.awsDashSdkLibStrings.N
    - awsDashSdkLib.awsDashSdkLibStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = _ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[Capacity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_ATTRIBUTES
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_PROJECTED_ATTRIBUTES
    - awsDashSdkLib.awsDashSdkLibStrings.SPECIFIC_ATTRIBUTES
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT
    - java.lang.String
  */
  type Select = _Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NEW_IMAGE
    - awsDashSdkLib.awsDashSdkLibStrings.OLD_IMAGE
    - awsDashSdkLib.awsDashSdkLibStrings.NEW_AND_OLD_IMAGES
    - awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = _StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = stdLib.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[TableName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type TableStatus = _TableStatus | java.lang.String
  type TagKeyList = js.Array[TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = stdLib.Date
  type TimeRangeUpperBound = stdLib.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLING
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLING
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = _TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[TransactGetItem]
  type TransactWriteItemList = js.Array[TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[WriteRequest]
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - nodeLib.Buffer
    - awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.File
    - awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.Blob
    - stdLib.ArrayBuffer
    - stdLib.DataView
    - stdLib.Int8Array
    - stdLib.Uint8Array
    - stdLib.Uint8ClampedArray
    - stdLib.Int16Array
    - stdLib.Uint16Array
    - stdLib.Int32Array
    - stdLib.Uint32Array
    - stdLib.Float32Array
    - stdLib.Float64Array
    - nodeLib.streamMod.Stream
  */
  type binaryType = _binaryType | nodeLib.Buffer | stdLib.ArrayBuffer | stdLib.DataView | stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array | nodeLib.streamMod.Stream
}
