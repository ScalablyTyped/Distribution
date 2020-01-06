package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorSessionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the source network interface.
    */
  var NetworkInterfaceId: typings.awsDashSdk.clientsEc2Mod.NetworkInterfaceId = js.native
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. If you do not want to mirror the entire packet, use the PacketLength parameter to specify the number of bytes in each packet to mirror.
    */
  var PacketLength: js.UndefOr[Integer] = js.native
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: Integer = js.native
  /**
    * The tags to assign to a Traffic Mirror session.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilterId = js.native
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: typings.awsDashSdk.clientsEc2Mod.TrafficMirrorTargetId = js.native
  /**
    * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.native
}

object CreateTrafficMirrorSessionRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: NetworkInterfaceId,
    SessionNumber: Integer,
    TrafficMirrorFilterId: TrafficMirrorFilterId,
    TrafficMirrorTargetId: TrafficMirrorTargetId,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PacketLength: Int | scala.Double = null,
    TagSpecifications: TagSpecificationList = null,
    VirtualNetworkId: Int | scala.Double = null
  ): CreateTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], SessionNumber = SessionNumber.asInstanceOf[js.Any], TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any], TrafficMirrorTargetId = TrafficMirrorTargetId.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (PacketLength != null) __obj.updateDynamic("PacketLength")(PacketLength.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (VirtualNetworkId != null) __obj.updateDynamic("VirtualNetworkId")(VirtualNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorSessionRequest]
  }
}

