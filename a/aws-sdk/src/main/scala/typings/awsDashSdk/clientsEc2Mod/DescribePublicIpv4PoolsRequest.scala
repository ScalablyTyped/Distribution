package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePublicIpv4PoolsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[PoolMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.undefined
  /**
    * The IDs of the address pools.
    */
  var PoolIds: js.UndefOr[ValueStringList] = js.undefined
}

object DescribePublicIpv4PoolsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[PoolMaxResults] = js.undefined,
    NextToken: NextToken = null,
    PoolIds: ValueStringList = null
  ): DescribePublicIpv4PoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PoolIds != null) __obj.updateDynamic("PoolIds")(PoolIds)
    __obj.asInstanceOf[DescribePublicIpv4PoolsRequest]
  }
}

