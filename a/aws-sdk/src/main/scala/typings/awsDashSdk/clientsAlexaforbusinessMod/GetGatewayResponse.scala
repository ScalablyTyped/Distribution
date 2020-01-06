package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayResponse extends js.Object {
  /**
    * The details of the gateway.
    */
  var Gateway: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Gateway] = js.native
}

object GetGatewayResponse {
  @scala.inline
  def apply(Gateway: Gateway = null): GetGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayResponse]
  }
}

