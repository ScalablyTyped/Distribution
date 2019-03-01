package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOutput extends js.Object {
  /**
    * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
  /**
    * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
    */
  var Item: js.UndefOr[AttributeMap] = js.undefined
}

object GetItemOutput {
  @scala.inline
  def apply(ConsumedCapacity: ConsumedCapacity = null, Item: AttributeMap = null): GetItemOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity)
    if (Item != null) __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[GetItemOutput]
  }
}

