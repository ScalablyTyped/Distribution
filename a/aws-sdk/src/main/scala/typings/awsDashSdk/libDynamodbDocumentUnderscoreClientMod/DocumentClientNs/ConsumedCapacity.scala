package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

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
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
  ] = js.undefined
  /**
    * The total number of write capacity units consumed by the operation.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
}

object ConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    GlobalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    LocalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    Table: Capacity = null,
    TableName: TableName = null,
    WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  ): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapacityUnits)) __obj.updateDynamic("CapacityUnits")(CapacityUnits)
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes)
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes)
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits)
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (!js.isUndefined(WriteCapacityUnits)) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits)
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

