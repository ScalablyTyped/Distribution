package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointsRequest extends js.Object {
  /**
    * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[__integer] = js.undefined
  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  var Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeEndpointsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[__integer] = js.undefined,
    Mode: DescribeEndpointsMode = null,
    NextToken: __string = null
  ): DescribeEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEndpointsRequest]
  }
}

