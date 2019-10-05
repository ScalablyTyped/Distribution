package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

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
    * The total number of read capacity units consumed by the operation.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  var Table: js.UndefOr[Capacity] = js.undefined
  /**
    * The name of the table that was affected by the operation.
    */
  var TableName: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableName
  ] = js.undefined
  /**
    * The total number of write capacity units consumed by the operation.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
}

object ConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: Int | scala.Double = null,
    GlobalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    LocalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    ReadCapacityUnits: Int | scala.Double = null,
    Table: Capacity = null,
    TableName: TableName = null,
    WriteCapacityUnits: Int | scala.Double = null
  ): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes)
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes)
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

