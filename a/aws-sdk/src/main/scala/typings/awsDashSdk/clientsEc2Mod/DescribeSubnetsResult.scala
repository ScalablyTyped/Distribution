package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubnetsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about one or more subnets.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
}

object DescribeSubnetsResult {
  @scala.inline
  def apply(NextToken: String = null, Subnets: SubnetList = null): DescribeSubnetsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    __obj.asInstanceOf[DescribeSubnetsResult]
  }
}

