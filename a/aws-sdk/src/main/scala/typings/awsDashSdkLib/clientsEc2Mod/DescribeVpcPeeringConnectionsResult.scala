package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcPeeringConnectionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the VPC peering connections.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
}

object DescribeVpcPeeringConnectionsResult {
  @scala.inline
  def apply(NextToken: String = null, VpcPeeringConnections: VpcPeeringConnectionList = null): DescribeVpcPeeringConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VpcPeeringConnections != null) __obj.updateDynamic("VpcPeeringConnections")(VpcPeeringConnections)
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsResult]
  }
}

