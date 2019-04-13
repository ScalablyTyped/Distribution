package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointsResponse extends js.Object {
  /**
    * The list of endpoints.
    */
  var Item: js.UndefOr[ListOfEndpointResponse] = js.undefined
}

object EndpointsResponse {
  @scala.inline
  def apply(Item: ListOfEndpointResponse = null): EndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[EndpointsResponse]
  }
}

