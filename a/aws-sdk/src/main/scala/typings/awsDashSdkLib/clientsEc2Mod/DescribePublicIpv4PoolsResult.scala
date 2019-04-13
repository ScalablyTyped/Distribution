package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePublicIpv4PoolsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the address pools.
    */
  var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet] = js.undefined
}

object DescribePublicIpv4PoolsResult {
  @scala.inline
  def apply(NextToken: String = null, PublicIpv4Pools: PublicIpv4PoolSet = null): DescribePublicIpv4PoolsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PublicIpv4Pools != null) __obj.updateDynamic("PublicIpv4Pools")(PublicIpv4Pools)
    __obj.asInstanceOf[DescribePublicIpv4PoolsResult]
  }
}

