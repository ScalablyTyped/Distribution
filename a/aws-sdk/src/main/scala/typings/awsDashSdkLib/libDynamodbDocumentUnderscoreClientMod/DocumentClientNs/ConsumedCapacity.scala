package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConsumedCapacity extends js.Object {
  /**
       * The total number of capacity units consumed by the operation.
       */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  /**
       * The amount of throughput consumed on each global index affected by the operation.
       */
  var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
  /**
       * The amount of throughput consumed on each local index affected by the operation.
       */
  var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
  /**
       * The amount of throughput consumed on the table affected by the operation.
       */
  var Table: js.UndefOr[Capacity] = js.undefined
  /**
       * The name of the table that was affected by the operation.
       */
  var TableName: js.UndefOr[TableName] = js.undefined
}

