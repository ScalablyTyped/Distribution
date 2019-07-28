package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointBatchRequest extends js.Object {
  /**
    * An array that defines the endpoints to create or update and, for each endpoint, the property values to set or change. An array can contain a maximum of 100 items.
    */
  var Item: ListOfEndpointBatchItem
}

object EndpointBatchRequest {
  @scala.inline
  def apply(Item: ListOfEndpointBatchItem): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal(Item = Item)
  
    __obj.asInstanceOf[EndpointBatchRequest]
  }
}

