package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableTransitGatewayRouteTablePropagationResult extends js.Object {
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.undefined
}

object DisableTransitGatewayRouteTablePropagationResult {
  @scala.inline
  def apply(Propagation: TransitGatewayPropagation = null): DisableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    if (Propagation != null) __obj.updateDynamic("Propagation")(Propagation)
    __obj.asInstanceOf[DisableTransitGatewayRouteTablePropagationResult]
  }
}

