package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectConnectGatewayResult extends js.Object {
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}

object CreateDirectConnectGatewayResult {
  @scala.inline
  def apply(directConnectGateway: DirectConnectGateway = null): CreateDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGateway != null) __obj.updateDynamic("directConnectGateway")(directConnectGateway)
    __obj.asInstanceOf[CreateDirectConnectGatewayResult]
  }
}

