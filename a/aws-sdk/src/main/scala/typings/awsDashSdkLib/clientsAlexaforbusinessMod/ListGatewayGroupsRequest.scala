package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGatewayGroupsRequest extends js.Object {
  /**
    * The maximum number of gateway group summaries to return. The default is 50.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListGatewayGroupsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListGatewayGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGatewayGroupsRequest]
  }
}

