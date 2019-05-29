package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataflowEndpoint extends js.Object {
  /**
    * Socket address of a dataflow endpoint.
    */
  var address: js.UndefOr[SocketAddress] = js.undefined
  /**
    * Name of a dataflow endpoint.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  /**
    * Status of a dataflow endpoint.
    */
  var status: js.UndefOr[EndpointStatus] = js.undefined
}

object DataflowEndpoint {
  @scala.inline
  def apply(address: SocketAddress = null, name: SafeName = null, status: EndpointStatus = null): DataflowEndpoint = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpoint]
  }
}

