package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagatingVgw extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.undefined
}

object PropagatingVgw {
  @scala.inline
  def apply(GatewayId: String = null): PropagatingVgw = {
    val __obj = js.Dynamic.literal()
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId)
    __obj.asInstanceOf[PropagatingVgw]
  }
}

