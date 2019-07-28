package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcList] = js.undefined
}

object DescribeVpcsResult {
  @scala.inline
  def apply(NextToken: String = null, Vpcs: VpcList = null): DescribeVpcsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Vpcs != null) __obj.updateDynamic("Vpcs")(Vpcs)
    __obj.asInstanceOf[DescribeVpcsResult]
  }
}

