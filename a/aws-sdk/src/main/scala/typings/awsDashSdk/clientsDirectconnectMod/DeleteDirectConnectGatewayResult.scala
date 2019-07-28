package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayResult extends js.Object {
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}

object DeleteDirectConnectGatewayResult {
  @scala.inline
  def apply(directConnectGateway: DirectConnectGateway = null): DeleteDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGateway != null) __obj.updateDynamic("directConnectGateway")(directConnectGateway)
    __obj.asInstanceOf[DeleteDirectConnectGatewayResult]
  }
}

