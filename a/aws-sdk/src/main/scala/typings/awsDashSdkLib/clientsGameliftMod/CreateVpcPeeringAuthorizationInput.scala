package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcPeeringAuthorizationInput extends js.Object {
  /**
    * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
    */
  var GameLiftAwsAccountId: NonZeroAndMaxString
  /**
    * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString
}

object CreateVpcPeeringAuthorizationInput {
  @scala.inline
  def apply(GameLiftAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): CreateVpcPeeringAuthorizationInput = {
    val __obj = js.Dynamic.literal(GameLiftAwsAccountId = GameLiftAwsAccountId, PeerVpcId = PeerVpcId)
  
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationInput]
  }
}

