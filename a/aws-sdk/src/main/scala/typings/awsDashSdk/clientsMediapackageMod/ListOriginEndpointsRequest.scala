package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOriginEndpointsRequest extends js.Object {
  /**
    * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
    */
  var ChannelId: js.UndefOr[__string] = js.undefined
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.MaxResults] = js.undefined
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListOriginEndpointsRequest {
  @scala.inline
  def apply(ChannelId: __string = null, MaxResults: Int | Double = null, NextToken: __string = null): ListOriginEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListOriginEndpointsRequest]
  }
}

