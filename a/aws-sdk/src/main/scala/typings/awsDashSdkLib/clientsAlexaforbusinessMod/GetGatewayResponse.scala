package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayResponse extends js.Object {
  /**
    * The details of the gateway.
    */
  var Gateway: js.UndefOr[Gateway] = js.undefined
}

object GetGatewayResponse {
  @scala.inline
  def apply(Gateway: Gateway = null): GetGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway)
    __obj.asInstanceOf[GetGatewayResponse]
  }
}

