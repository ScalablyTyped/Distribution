package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualGateways extends js.Object {
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
}

object VirtualGateways {
  @scala.inline
  def apply(virtualGateways: VirtualGatewayList = null): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    if (virtualGateways != null) __obj.updateDynamic("virtualGateways")(virtualGateways)
    __obj.asInstanceOf[VirtualGateways]
  }
}

