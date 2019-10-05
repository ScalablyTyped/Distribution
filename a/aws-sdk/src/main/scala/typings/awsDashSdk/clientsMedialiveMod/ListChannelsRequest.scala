package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListChannelsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: __string = null): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListChannelsRequest]
  }
}

