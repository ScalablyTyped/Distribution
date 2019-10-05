package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableDetails extends js.Object {
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BillingMode
  ] = js.undefined
  /**
    * Number of items in the table. Please note this is an approximate value. 
    */
  var ItemCount: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ItemCount
  ] = js.undefined
  /**
    * Schema of the table. 
    */
  var KeySchema: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.KeySchema
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ProvisionedThroughput
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableArn
  ] = js.undefined
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableCreationDateTime
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableId
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableName
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
    ItemCount: Int | scala.Double = null,
    TableArn: TableArn = null,
    TableSizeBytes: Int | scala.Double = null
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema, ProvisionedThroughput = ProvisionedThroughput, TableCreationDateTime = TableCreationDateTime, TableId = TableId, TableName = TableName)
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn)
    if (TableSizeBytes != null) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
}

