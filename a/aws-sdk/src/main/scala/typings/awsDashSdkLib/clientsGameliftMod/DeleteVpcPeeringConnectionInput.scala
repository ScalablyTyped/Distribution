package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcPeeringConnectionInput extends js.Object {
  /**
    * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection record.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Unique identifier for a VPC peering connection. This value is included in the VpcPeeringConnection object, which can be retrieved by calling DescribeVpcPeeringConnections.
    */
  var VpcPeeringConnectionId: NonZeroAndMaxString
}

object DeleteVpcPeeringConnectionInput {
  @scala.inline
  def apply(FleetId: FleetId, VpcPeeringConnectionId: NonZeroAndMaxString): DeleteVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, VpcPeeringConnectionId = VpcPeeringConnectionId)
  
    __obj.asInstanceOf[DeleteVpcPeeringConnectionInput]
  }
}

