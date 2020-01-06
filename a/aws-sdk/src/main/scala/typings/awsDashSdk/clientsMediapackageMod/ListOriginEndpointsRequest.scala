package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOriginEndpointsRequest extends js.Object {
  /**
    * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
    */
  var ChannelId: js.UndefOr[__string] = js.native
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListOriginEndpointsRequest {
  @scala.inline
  def apply(ChannelId: __string = null, MaxResults: Int | Double = null, NextToken: __string = null): ListOriginEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOriginEndpointsRequest]
  }
}

