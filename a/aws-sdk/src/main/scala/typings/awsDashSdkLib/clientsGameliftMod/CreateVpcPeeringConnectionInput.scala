package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcPeeringConnectionInput extends js.Object {
  /**
    * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with. 
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings.
    */
  var PeerVpcAwsAccountId: NonZeroAndMaxString
  /**
    * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString
}

object CreateVpcPeeringConnectionInput {
  @scala.inline
  def apply(FleetId: FleetId, PeerVpcAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): CreateVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, PeerVpcAwsAccountId = PeerVpcAwsAccountId, PeerVpcId = PeerVpcId)
  
    __obj.asInstanceOf[CreateVpcPeeringConnectionInput]
  }
}

