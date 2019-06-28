package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDescription extends js.Object {
  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
    */
  var AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined
  /**
    * Contains the details for the read/write capacity mode.
    */
  var BillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
  /**
    * The date and time when the table was created, in UNIX epoch time format.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
    */
  var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined
  /**
    * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.undefined
  /**
    * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    */
  var KeySchema: js.UndefOr[KeySchema] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
    */
  var LatestStreamArn: js.UndefOr[StreamArn] = js.undefined
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name.   the StreamLabel.  
    */
  var LatestStreamLabel: js.UndefOr[String] = js.undefined
  /**
    * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
    */
  var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined
  /**
    * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
  /**
    * Contains details for the restore.
    */
  var RestoreSummary: js.UndefOr[RestoreSummary] = js.undefined
  /**
    * The description of the server-side encryption status on the specified table.
    */
  var SSEDescription: js.UndefOr[SSEDescription] = js.undefined
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the table.
    */
  var TableArn: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: js.UndefOr[TableId] = js.undefined
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[TableName] = js.undefined
  /**
    * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.undefined
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[TableStatus] = js.undefined
}

object TableDescription {
  @scala.inline
  def apply(
    AttributeDefinitions: AttributeDefinitions = null,
    BillingModeSummary: BillingModeSummary = null,
    CreationDateTime: _Date = null,
    GlobalSecondaryIndexes: GlobalSecondaryIndexDescriptionList = null,
    ItemCount: js.UndefOr[Long] = js.undefined,
    KeySchema: KeySchema = null,
    LatestStreamArn: StreamArn = null,
    LatestStreamLabel: String = null,
    LocalSecondaryIndexes: LocalSecondaryIndexDescriptionList = null,
    ProvisionedThroughput: ProvisionedThroughputDescription = null,
    RestoreSummary: RestoreSummary = null,
    SSEDescription: SSEDescription = null,
    StreamSpecification: StreamSpecification = null,
    TableArn: String = null,
    TableId: TableId = null,
    TableName: TableName = null,
    TableSizeBytes: js.UndefOr[Long] = js.undefined,
    TableStatus: TableStatus = null
  ): TableDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions)
    if (BillingModeSummary != null) __obj.updateDynamic("BillingModeSummary")(BillingModeSummary)
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes)
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount)
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema)
    if (LatestStreamArn != null) __obj.updateDynamic("LatestStreamArn")(LatestStreamArn)
    if (LatestStreamLabel != null) __obj.updateDynamic("LatestStreamLabel")(LatestStreamLabel)
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    if (RestoreSummary != null) __obj.updateDynamic("RestoreSummary")(RestoreSummary)
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription)
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification)
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn)
    if (TableId != null) __obj.updateDynamic("TableId")(TableId)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes)
    if (TableStatus != null) __obj.updateDynamic("TableStatus")(TableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescription]
  }
}

