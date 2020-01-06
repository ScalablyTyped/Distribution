package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewaysResponse extends js.Object {
  /**
    * The gateways in the list.
    */
  var Gateways: js.UndefOr[GatewaySummaries] = js.native
  /**
    * The token used to paginate though multiple pages of gateway summaries.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.native
}

object ListGatewaysResponse {
  @scala.inline
  def apply(Gateways: GatewaySummaries = null, NextToken: NextToken = null): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    if (Gateways != null) __obj.updateDynamic("Gateways")(Gateways.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysResponse]
  }
}

