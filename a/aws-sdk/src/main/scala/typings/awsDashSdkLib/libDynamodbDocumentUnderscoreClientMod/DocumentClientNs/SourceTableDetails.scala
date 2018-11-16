package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SourceTableDetails extends js.Object {
  /**
       * Number of items in the table. Please note this is an approximate value. 
       */
  var ItemCount: js.UndefOr[ItemCount] = js.undefined
  /**
       * Schema of the table. 
       */
  var KeySchema: KeySchema
  /**
       * Read IOPs and Write IOPS on the table when the backup was created.
       */
  var ProvisionedThroughput: ProvisionedThroughput
  /**
       * ARN of the table for which backup was created. 
       */
  var TableArn: js.UndefOr[TableArn] = js.undefined
  /**
       * Time when the source table was created. 
       */
  var TableCreationDateTime: TableCreationDateTime
  /**
       * Unique identifier for the table for which the backup was created. 
       */
  var TableId: TableId
  /**
       * The name of the table for which the backup was created. 
       */
  var TableName: TableName
  /**
       * Size of the table in bytes. Please note this is an approximate value.
       */
  var TableSizeBytes: js.UndefOr[Long] = js.undefined
}

