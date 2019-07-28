package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableDetails extends js.Object {
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BillingMode] = js.undefined
  /**
    * Number of items in the table. Please note this is an approximate value. 
    */
  var ItemCount: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ItemCount] = js.undefined
  /**
    * Schema of the table. 
    */
  var KeySchema: typings.awsDashSdk.clientsDynamodbMod.KeySchema
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typings.awsDashSdk.clientsDynamodbMod.ProvisionedThroughput
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableArn] = js.undefined
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: typings.awsDashSdk.clientsDynamodbMod.TableCreationDateTime
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typings.awsDashSdk.clientsDynamodbMod.TableId
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typings.awsDashSdk.clientsDynamodbMod.TableName
  /**
    * Size of the table in bytes. Please note this is an approximate value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.undefined
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: KeySchema,
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: TableCreationDateTime,
    TableId: TableId,
    TableName: TableName,
    BillingMode: BillingMode = null,
    ItemCount: js.UndefOr[ItemCount] = js.undefined,
    TableArn: TableArn = null,
    TableSizeBytes: js.UndefOr[Long] = js.undefined
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema, ProvisionedThroughput = ProvisionedThroughput, TableCreationDateTime = TableCreationDateTime, TableId = TableId, TableName = TableName)
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount)
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn)
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes)
    __obj.asInstanceOf[SourceTableDetails]
  }
}

