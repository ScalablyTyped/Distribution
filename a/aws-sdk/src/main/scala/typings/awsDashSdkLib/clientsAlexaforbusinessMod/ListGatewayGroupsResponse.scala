package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGatewayGroupsResponse extends js.Object {
  /**
    * The gateway groups in the list.
    */
  var GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.undefined
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListGatewayGroupsResponse {
  @scala.inline
  def apply(GatewayGroups: GatewayGroupSummaries = null, NextToken: NextToken = null): ListGatewayGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroups != null) __obj.updateDynamic("GatewayGroups")(GatewayGroups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGatewayGroupsResponse]
  }
}

