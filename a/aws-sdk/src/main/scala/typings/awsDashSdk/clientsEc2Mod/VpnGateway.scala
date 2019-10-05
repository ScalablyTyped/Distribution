package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGateway extends js.Object {
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.undefined
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.undefined
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.undefined
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
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
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcAttachments != null) __obj.updateDynamic("VpcAttachments")(VpcAttachments)
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId)
    __obj.asInstanceOf[VpnGateway]
  }
}

