package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanOutput extends js.Object {
  /**
    * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ConsumedCapacity
  ] = js.native
  /**
    * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
    */
  var Items: js.UndefOr[ItemList] = js.native
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.native
  /**
    * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  var ScannedCount: js.UndefOr[Integer] = js.native
}

object ScanOutput {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacity = null,
    Count: Int | scala.Double = null,
    Items: ItemList = null,
    LastEvaluatedKey: Key = null,
    ScannedCount: Int | scala.Double = null
  ): ScanOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (LastEvaluatedKey != null) __obj.updateDynamic("LastEvaluatedKey")(LastEvaluatedKey.asInstanceOf[js.Any])
    if (ScannedCount != null) __obj.updateDynamic("ScannedCount")(ScannedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanOutput]
  }
}

