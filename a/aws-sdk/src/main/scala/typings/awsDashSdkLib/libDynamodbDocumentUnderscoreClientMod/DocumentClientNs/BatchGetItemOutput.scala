package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BatchGetItemOutput extends js.Object {
  /**
       * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
       */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
  /**
       * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
       */
  var Responses: js.UndefOr[BatchGetResponseMap] = js.undefined
  /**
       * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
       */
  var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined
}

