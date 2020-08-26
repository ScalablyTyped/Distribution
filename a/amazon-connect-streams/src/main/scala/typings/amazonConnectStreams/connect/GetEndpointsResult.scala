package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointsResult extends js.Object {
  var addresses: js.Array[Endpoint] = js.native
  var endpoints: js.Array[Endpoint] = js.native
}

object GetEndpointsResult {
  @scala.inline
  def apply(addresses: js.Array[Endpoint], endpoints: js.Array[Endpoint]): GetEndpointsResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointsResult]
  }
  @scala.inline
  implicit class GetEndpointsResultOps[Self <: GetEndpointsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressesVarargs(value: Endpoint*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Endpoint]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
  }
  
}

