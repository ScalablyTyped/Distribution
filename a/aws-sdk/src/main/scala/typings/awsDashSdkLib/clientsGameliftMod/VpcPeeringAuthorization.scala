package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringAuthorization extends js.Object {
  /**
    * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
    */
  var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * 
    */
  var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object VpcPeeringAuthorization {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    ExpirationTime: Timestamp = null,
    GameLiftAwsAccountId: NonZeroAndMaxString = null,
    PeerVpcAwsAccountId: NonZeroAndMaxString = null,
    PeerVpcId: NonZeroAndMaxString = null
  ): VpcPeeringAuthorization = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (GameLiftAwsAccountId != null) __obj.updateDynamic("GameLiftAwsAccountId")(GameLiftAwsAccountId)
    if (PeerVpcAwsAccountId != null) __obj.updateDynamic("PeerVpcAwsAccountId")(PeerVpcAwsAccountId)
    if (PeerVpcId != null) __obj.updateDynamic("PeerVpcId")(PeerVpcId)
    __obj.asInstanceOf[VpcPeeringAuthorization]
  }
}

