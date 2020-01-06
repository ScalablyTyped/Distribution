package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayMulticastDomainResult extends js.Object {
  /**
    * Information about the deleted transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayMulticastDomain] = js.native
}

object DeleteTransitGatewayMulticastDomainResult {
  @scala.inline
  def apply(TransitGatewayMulticastDomain: TransitGatewayMulticastDomain = null): DeleteTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayMulticastDomain != null) __obj.updateDynamic("TransitGatewayMulticastDomain")(TransitGatewayMulticastDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainResult]
  }
}

