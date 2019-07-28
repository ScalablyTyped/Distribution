package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayAttachmentAssociation extends js.Object {
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.undefined
  /**
    * The ID of the route table for the transit gateway.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}

object TransitGatewayAttachmentAssociation {
  @scala.inline
  def apply(State: TransitGatewayAssociationState = null, TransitGatewayRouteTableId: String = null): TransitGatewayAttachmentAssociation = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayRouteTableId != null) __obj.updateDynamic("TransitGatewayRouteTableId")(TransitGatewayRouteTableId)
    __obj.asInstanceOf[TransitGatewayAttachmentAssociation]
  }
}

