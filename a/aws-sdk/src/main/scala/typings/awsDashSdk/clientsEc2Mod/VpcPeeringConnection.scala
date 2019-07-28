package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnection extends js.Object {
  /**
    * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined
  /**
    * The time that an unaccepted VPC peering connection will expire.
    */
  var ExpirationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Information about the requester VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined
  /**
    * The status of the VPC peering connection.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.undefined
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object VpcPeeringConnection {
  @scala.inline
  def apply(
    AccepterVpcInfo: VpcPeeringConnectionVpcInfo = null,
    ExpirationTime: DateTime = null,
    RequesterVpcInfo: VpcPeeringConnectionVpcInfo = null,
    Status: VpcPeeringConnectionStateReason = null,
    Tags: TagList = null,
    VpcPeeringConnectionId: String = null
  ): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    if (AccepterVpcInfo != null) __obj.updateDynamic("AccepterVpcInfo")(AccepterVpcInfo)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (RequesterVpcInfo != null) __obj.updateDynamic("RequesterVpcInfo")(RequesterVpcInfo)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId)
    __obj.asInstanceOf[VpcPeeringConnection]
  }
}

