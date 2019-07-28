package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableTransitGatewayRouteTablePropagationResult extends js.Object {
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.undefined
}

object EnableTransitGatewayRouteTablePropagationResult {
  @scala.inline
  def apply(Propagation: TransitGatewayPropagation = null): EnableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    if (Propagation != null) __obj.updateDynamic("Propagation")(Propagation)
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationResult]
  }
}

