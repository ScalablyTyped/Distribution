package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemResponse extends js.Object {
  /**
    * Map of attribute data consisting of the data type and attribute value.
    */
  var Item: js.UndefOr[AttributeMap] = js.native
}

object ItemResponse {
  @scala.inline
  def apply(Item: AttributeMap = null): ItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemResponse]
  }
}

