package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayRegistrationsResponse extends js.Object {
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The transit gateway registrations.
    */
  var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.native
}

object GetTransitGatewayRegistrationsResponse {
  @scala.inline
  def apply(NextToken: String = null, TransitGatewayRegistrations: TransitGatewayRegistrationList = null): GetTransitGatewayRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayRegistrations != null) __obj.updateDynamic("TransitGatewayRegistrations")(TransitGatewayRegistrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
  }
}

