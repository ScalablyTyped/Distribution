package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GlobalSecondaryIndex extends js.Object {
  /**
       * The name of the global secondary index. The name must be unique among all other indexes on this table.
       */
  var IndexName: IndexName
  /**
       * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
       */
  var KeySchema: KeySchema
  /**
       * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
       */
  var Projection: Projection
  /**
       * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
       */
  var ProvisionedThroughput: ProvisionedThroughput
}

