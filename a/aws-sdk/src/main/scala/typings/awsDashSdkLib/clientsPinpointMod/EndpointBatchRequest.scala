package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointBatchRequest extends js.Object {
  /**
    * List of items to update. Maximum 100 items
    */
  var Item: js.UndefOr[ListOfEndpointBatchItem] = js.undefined
}

object EndpointBatchRequest {
  @scala.inline
  def apply(Item: ListOfEndpointBatchItem = null): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[EndpointBatchRequest]
  }
}

