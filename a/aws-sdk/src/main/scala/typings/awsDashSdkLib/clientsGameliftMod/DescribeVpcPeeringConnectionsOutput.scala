package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcPeeringConnectionsOutput extends js.Object {
  /**
    * Collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
}

object DescribeVpcPeeringConnectionsOutput {
  @scala.inline
  def apply(VpcPeeringConnections: VpcPeeringConnectionList = null): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringConnections != null) __obj.updateDynamic("VpcPeeringConnections")(VpcPeeringConnections)
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
}

