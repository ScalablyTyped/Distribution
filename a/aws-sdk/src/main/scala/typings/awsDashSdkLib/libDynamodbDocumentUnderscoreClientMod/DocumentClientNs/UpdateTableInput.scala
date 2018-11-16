package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateTableInput extends js.Object {
  /**
       * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
       */
  var AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined
  /**
       * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
       */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined
  /**
       * The new provisioned throughput settings for the specified table or index.
       */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
  /**
       * The new server-side encryption settings for the specified table.
       */
  var SSESpecification: js.UndefOr[SSESpecification] = js.undefined
  /**
       * Represents the DynamoDB Streams configuration for the table.  You will receive a ResourceInUseException if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream. 
       */
  var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
  /**
       * The name of the table to be updated.
       */
  var TableName: TableName
}

