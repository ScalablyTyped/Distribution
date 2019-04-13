package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the endpoints.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.undefined
}

object DescribeVpcEndpointsResult {
  @scala.inline
  def apply(NextToken: String = null, VpcEndpoints: VpcEndpointSet = null): DescribeVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VpcEndpoints != null) __obj.updateDynamic("VpcEndpoints")(VpcEndpoints)
    __obj.asInstanceOf[DescribeVpcEndpointsResult]
  }
}

