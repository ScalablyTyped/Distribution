package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewayGroupsResponse extends js.Object {
  /**
    * The gateway groups in the list.
    */
  var GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.native
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListGatewayGroupsResponse {
  @scala.inline
  def apply(GatewayGroups: GatewayGroupSummaries = null, NextToken: NextToken = null): ListGatewayGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroups != null) __obj.updateDynamic("GatewayGroups")(GatewayGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewayGroupsResponse]
  }
}

