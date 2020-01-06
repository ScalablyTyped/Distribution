package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePublicIpv4PoolsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[PoolMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
  /**
    * The IDs of the address pools.
    */
  var PoolIds: js.UndefOr[ValueStringList] = js.native
}

object DescribePublicIpv4PoolsRequest {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    PoolIds: ValueStringList = null
  ): DescribePublicIpv4PoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PoolIds != null) __obj.updateDynamic("PoolIds")(PoolIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublicIpv4PoolsRequest]
  }
}

