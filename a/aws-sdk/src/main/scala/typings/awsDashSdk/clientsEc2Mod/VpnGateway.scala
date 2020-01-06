package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGateway extends js.Object {
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.native
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}

object VpnGateway {
  @scala.inline
  def apply(
    AmazonSideAsn: Int | scala.Double = null,
    AvailabilityZone: String = null,
    State: VpnState = null,
    Tags: TagList = null,
    Type: GatewayType = null,
    VpcAttachments: VpcAttachmentList = null,
    VpnGatewayId: String = null
  ): VpnGateway = {
    val __obj = js.Dynamic.literal()
    if (AmazonSideAsn != null) __obj.updateDynamic("AmazonSideAsn")(AmazonSideAsn.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcAttachments != null) __obj.updateDynamic("VpcAttachments")(VpcAttachments.asInstanceOf[js.Any])
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGateway]
  }
}

