package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.native
}

object DisassociateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(Association: TransitGatewayAssociation = null): DisassociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayRouteTableResult]
  }
}

