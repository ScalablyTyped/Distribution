package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableTransitGatewayRouteTablePropagationResult extends js.Object {
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.native
}

object EnableTransitGatewayRouteTablePropagationResult {
  @scala.inline
  def apply(Propagation: TransitGatewayPropagation = null): EnableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    if (Propagation != null) __obj.updateDynamic("Propagation")(Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationResult]
  }
}

