package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGateways extends js.Object {
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.native
}

object VirtualGateways {
  @scala.inline
  def apply(virtualGateways: VirtualGatewayList = null): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    if (virtualGateways != null) __obj.updateDynamic("virtualGateways")(virtualGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGateways]
  }
}

