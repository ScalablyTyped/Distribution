package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCoipPoolsResult extends js.Object {
  /**
    * Information about the address pools.
    */
  var CoipPools: js.UndefOr[CoipPoolSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeCoipPoolsResult {
  @scala.inline
  def apply(CoipPools: CoipPoolSet = null, NextToken: String = null): DescribeCoipPoolsResult = {
    val __obj = js.Dynamic.literal()
    if (CoipPools != null) __obj.updateDynamic("CoipPools")(CoipPools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCoipPoolsResult]
  }
}

