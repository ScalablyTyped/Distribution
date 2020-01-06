package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetItemOutput extends js.Object {
  /**
    * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  /**
    * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
    */
  var Responses: js.UndefOr[BatchGetResponseMap] = js.native
  /**
    * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.native
}

object BatchGetItemOutput {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacityMultiple = null,
    Responses: BatchGetResponseMap = null,
    UnprocessedKeys: BatchGetRequestMap = null
  ): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (Responses != null) __obj.updateDynamic("Responses")(Responses.asInstanceOf[js.Any])
    if (UnprocessedKeys != null) __obj.updateDynamic("UnprocessedKeys")(UnprocessedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetItemOutput]
  }
}

