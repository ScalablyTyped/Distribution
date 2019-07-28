package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.undefined
}

object DisassociateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(Association: TransitGatewayAssociation = null): DisassociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association)
    __obj.asInstanceOf[DisassociateTransitGatewayRouteTableResult]
  }
}

