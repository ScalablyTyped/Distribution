package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteItemInput extends js.Object {
  /**
    * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
    */
  var RequestItems: BatchWriteItemRequestMap
  var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
    */
  var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
}

object BatchWriteItemInput {
  @scala.inline
  def apply(
    RequestItems: BatchWriteItemRequestMap,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null
  ): BatchWriteItemInput = {
    val __obj = js.Dynamic.literal(RequestItems = RequestItems)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteItemInput]
  }
}

