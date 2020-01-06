package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCustomerGatewayResponse extends js.Object {
  /**
    * The customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.CustomerGatewayAssociation] = js.native
}

object AssociateCustomerGatewayResponse {
  @scala.inline
  def apply(CustomerGatewayAssociation: CustomerGatewayAssociation = null): AssociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerGatewayAssociation != null) __obj.updateDynamic("CustomerGatewayAssociation")(CustomerGatewayAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayResponse]
  }
}

