package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointsResult extends js.Object {
  var addresses: js.Array[Endpoint]
  var endpoints: js.Array[Endpoint]
}

object GetEndpointsResult {
  @scala.inline
  def apply(addresses: js.Array[Endpoint], endpoints: js.Array[Endpoint]): GetEndpointsResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointsResult]
  }
}

