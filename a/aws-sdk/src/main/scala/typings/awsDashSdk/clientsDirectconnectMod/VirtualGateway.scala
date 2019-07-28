package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualGateway extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  /**
    * The state of the virtual private gateway. The following are the possible values:    pending: Initial state after creating the virtual private gateway.    available: Ready for use by a private virtual interface.    deleting: Initial state after deleting the virtual private gateway.    deleted: The virtual private gateway is deleted. The private virtual interface is unable to send traffic over this gateway.  
    */
  var virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined
}

object VirtualGateway {
  @scala.inline
  def apply(virtualGatewayId: VirtualGatewayId = null, virtualGatewayState: VirtualGatewayState = null): VirtualGateway = {
    val __obj = js.Dynamic.literal()
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId)
    if (virtualGatewayState != null) __obj.updateDynamic("virtualGatewayState")(virtualGatewayState)
    __obj.asInstanceOf[VirtualGateway]
  }
}

