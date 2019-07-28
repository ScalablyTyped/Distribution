package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactGetItemsOutput extends js.Object {
  /**
    * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
  /**
    * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
    */
  var Responses: js.UndefOr[ItemResponseList] = js.undefined
}

object TransactGetItemsOutput {
  @scala.inline
  def apply(ConsumedCapacity: ConsumedCapacityMultiple = null, Responses: ItemResponseList = null): TransactGetItemsOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity)
    if (Responses != null) __obj.updateDynamic("Responses")(Responses)
    __obj.asInstanceOf[TransactGetItemsOutput]
  }
}

