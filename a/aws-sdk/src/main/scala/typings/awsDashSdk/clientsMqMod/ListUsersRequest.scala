package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: __string
  /**
    * The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMqMod.MaxResults] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListUsersRequest {
  @scala.inline
  def apply(BrokerId: __string, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: __string = null): ListUsersRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

