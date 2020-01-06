package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayMulticastDomainAssociationsResult extends js.Object {
  /**
    * Information about the multicast domain associations.
    */
  var MulticastDomainAssociations: js.UndefOr[TransitGatewayMulticastDomainAssociationList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetTransitGatewayMulticastDomainAssociationsResult {
  @scala.inline
  def apply(
    MulticastDomainAssociations: TransitGatewayMulticastDomainAssociationList = null,
    NextToken: String = null
  ): GetTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (MulticastDomainAssociations != null) __obj.updateDynamic("MulticastDomainAssociations")(MulticastDomainAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayMulticastDomainAssociationsResult]
  }
}

