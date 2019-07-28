package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInputsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListInputsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: __string = null): ListInputsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInputsRequest]
  }
}

