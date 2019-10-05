package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalSecondaryIndexDescription extends js.Object {
  /**
    * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false.  For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
    */
  var Backfilling: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.Backfilling] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.IndexName] = js.undefined
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.undefined
  /**
    * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.IndexStatus] = js.undefined
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.undefined
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.KeySchema] = js.undefined
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.Projection] = js.undefined
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
}

object GlobalSecondaryIndexDescription {
  @scala.inline
  def apply(
    Backfilling: js.UndefOr[Boolean] = js.undefined,
    IndexArn: String = null,
    IndexName: IndexName = null,
    IndexSizeBytes: Int | scala.Double = null,
    IndexStatus: IndexStatus = null,
    ItemCount: Int | scala.Double = null,
    KeySchema: KeySchema = null,
    Projection: Projection = null,
    ProvisionedThroughput: ProvisionedThroughputDescription = null
  ): GlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Backfilling)) __obj.updateDynamic("Backfilling")(Backfilling)
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn)
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (IndexSizeBytes != null) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema)
    if (Projection != null) __obj.updateDynamic("Projection")(Projection)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    __obj.asInstanceOf[GlobalSecondaryIndexDescription]
  }
}

