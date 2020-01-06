package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkResult extends js.Object {
  /**
    * The ClassicLink status of one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcClassicLinkList] = js.native
}

object DescribeVpcClassicLinkResult {
  @scala.inline
  def apply(Vpcs: VpcClassicLinkList = null): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
}

