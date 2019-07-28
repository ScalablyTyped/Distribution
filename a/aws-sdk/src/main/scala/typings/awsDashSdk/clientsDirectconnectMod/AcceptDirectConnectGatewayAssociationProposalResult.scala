package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptDirectConnectGatewayAssociationProposalResult extends js.Object {
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}

object AcceptDirectConnectGatewayAssociationProposalResult {
  @scala.inline
  def apply(directConnectGatewayAssociation: DirectConnectGatewayAssociation = null): AcceptDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociation != null) __obj.updateDynamic("directConnectGatewayAssociation")(directConnectGatewayAssociation)
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalResult]
  }
}

