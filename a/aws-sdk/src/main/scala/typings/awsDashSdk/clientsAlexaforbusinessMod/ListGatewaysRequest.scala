package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGatewaysRequest extends js.Object {
  /**
    * The gateway group ARN for which to list gateways.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The maximum number of gateway summaries to return. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  /**
    * The token used to paginate though multiple pages of gateway summaries.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListGatewaysRequest {
  @scala.inline
  def apply(
    GatewayGroupArn: Arn = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroupArn != null) __obj.updateDynamic("GatewayGroupArn")(GatewayGroupArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGatewaysRequest]
  }
}

