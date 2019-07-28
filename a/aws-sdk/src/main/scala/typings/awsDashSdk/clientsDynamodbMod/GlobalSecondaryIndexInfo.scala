package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalSecondaryIndexInfo extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.IndexName] = js.undefined
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.KeySchema] = js.undefined
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.Projection] = js.undefined
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. 
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ProvisionedThroughput] = js.undefined
}

object GlobalSecondaryIndexInfo {
  @scala.inline
  def apply(
    IndexName: IndexName = null,
    KeySchema: KeySchema = null,
    Projection: Projection = null,
    ProvisionedThroughput: ProvisionedThroughput = null
  ): GlobalSecondaryIndexInfo = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema)
    if (Projection != null) __obj.updateDynamic("Projection")(Projection)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    __obj.asInstanceOf[GlobalSecondaryIndexInfo]
  }
}

