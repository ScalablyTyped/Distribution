package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.undefined
  /**
    * One or more VPC IDs.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined
}

object DescribeVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.undefined,
    NextToken: DescribeVpcClassicLinkDnsSupportNextToken = null,
    VpcIds: VpcClassicLinkIdList = null
  ): DescribeVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VpcIds != null) __obj.updateDynamic("VpcIds")(VpcIds)
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
  }
}

