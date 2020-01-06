package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorSessionRequest extends js.Object {
  /**
    * The description to assign to the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the entire packet.
    */
  var PacketLength: js.UndefOr[Integer] = js.native
  /**
    * The properties that you want to remove from the Traffic Mirror session. When you remove a property from a Traffic Mirror session, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorSessionFieldList] = js.native
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilterId] = js.native
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typings.awsDashSdk.clientsEc2Mod.TrafficMirrorSessionId = js.native
  /**
    * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection with the source.
    */
  var TrafficMirrorTargetId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorTargetId] = js.native
  /**
    * The virtual network ID of the Traffic Mirror session.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.native
}

object ModifyTrafficMirrorSessionRequest {
  @scala.inline
  def apply(
    TrafficMirrorSessionId: TrafficMirrorSessionId,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PacketLength: Int | scala.Double = null,
    RemoveFields: TrafficMirrorSessionFieldList = null,
    SessionNumber: Int | scala.Double = null,
    TrafficMirrorFilterId: TrafficMirrorFilterId = null,
    TrafficMirrorTargetId: TrafficMirrorTargetId = null,
    VirtualNetworkId: Int | scala.Double = null
  ): ModifyTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (PacketLength != null) __obj.updateDynamic("PacketLength")(PacketLength.asInstanceOf[js.Any])
    if (RemoveFields != null) __obj.updateDynamic("RemoveFields")(RemoveFields.asInstanceOf[js.Any])
    if (SessionNumber != null) __obj.updateDynamic("SessionNumber")(SessionNumber.asInstanceOf[js.Any])
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId.asInstanceOf[js.Any])
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId.asInstanceOf[js.Any])
    if (VirtualNetworkId != null) __obj.updateDynamic("VirtualNetworkId")(VirtualNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorSessionRequest]
  }
}

