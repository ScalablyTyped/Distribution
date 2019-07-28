package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEndpointGroupsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString
  /**
    * The number of endpoint group objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.MaxResults] = js.undefined
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListEndpointGroupsRequest {
  @scala.inline
  def apply(
    ListenerArn: GenericString,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: GenericString = null
  ): ListEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEndpointGroupsRequest]
  }
}

