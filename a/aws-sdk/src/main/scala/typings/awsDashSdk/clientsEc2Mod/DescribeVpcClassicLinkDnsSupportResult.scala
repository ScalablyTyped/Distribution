package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.undefined
  /**
    * Information about the ClassicLink DNS support status of the VPCs.
    */
  var Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.undefined
}

object DescribeVpcClassicLinkDnsSupportResult {
  @scala.inline
  def apply(
    NextToken: DescribeVpcClassicLinkDnsSupportNextToken = null,
    Vpcs: ClassicLinkDnsSupportList = null
  ): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs)
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
}

