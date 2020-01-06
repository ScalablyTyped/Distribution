package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointsResponse extends js.Object {
  /**
    * An array of responses, one for each endpoint that's associated with the user ID.
    */
  var Item: ListOfEndpointResponse = js.native
}

object EndpointsResponse {
  @scala.inline
  def apply(Item: ListOfEndpointResponse): EndpointsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointsResponse]
  }
}

