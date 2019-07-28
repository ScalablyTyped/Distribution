package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcClassicLinkResult extends js.Object {
  /**
    * The ClassicLink status of one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcClassicLinkList] = js.undefined
}

object DescribeVpcClassicLinkResult {
  @scala.inline
  def apply(Vpcs: VpcClassicLinkList = null): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs)
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
}

