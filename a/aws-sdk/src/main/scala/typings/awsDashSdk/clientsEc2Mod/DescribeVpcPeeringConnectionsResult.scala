package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringConnectionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the VPC peering connections.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}

object DescribeVpcPeeringConnectionsResult {
  @scala.inline
  def apply(NextToken: String = null, VpcPeeringConnections: VpcPeeringConnectionList = null): DescribeVpcPeeringConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VpcPeeringConnections != null) __obj.updateDynamic("VpcPeeringConnections")(VpcPeeringConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsResult]
  }
}

