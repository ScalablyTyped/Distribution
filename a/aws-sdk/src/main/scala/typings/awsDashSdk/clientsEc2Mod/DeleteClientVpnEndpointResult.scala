package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClientVpnEndpointResult extends js.Object {
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.undefined
}

object DeleteClientVpnEndpointResult {
  @scala.inline
  def apply(Status: ClientVpnEndpointStatus = null): DeleteClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DeleteClientVpnEndpointResult]
  }
}

