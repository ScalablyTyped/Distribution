package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorSessionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the source network interface.
    */
  var NetworkInterfaceId: String
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror. For example, if you set this value to 1network0, then the first 100 bytes that meet the filter criteria are copied to the target. If you do not want to mirror the entire packet, use the PacketLength parameter to specify the number of bytes in each packet to mirror.
    */
  var PacketLength: js.UndefOr[Integer] = js.undefined
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: Integer
  /**
    * The tags to assign to a Traffic Mirror session.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: String
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: String
  /**
    * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.undefined
}

object CreateTrafficMirrorSessionRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    SessionNumber: Integer,
    TrafficMirrorFilterId: String,
    TrafficMirrorTargetId: String,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    PacketLength: js.UndefOr[Integer] = js.undefined,
    TagSpecifications: TagSpecificationList = null,
    VirtualNetworkId: js.UndefOr[Integer] = js.undefined
  ): CreateTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId, SessionNumber = SessionNumber, TrafficMirrorFilterId = TrafficMirrorFilterId, TrafficMirrorTargetId = TrafficMirrorTargetId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(PacketLength)) __obj.updateDynamic("PacketLength")(PacketLength)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (!js.isUndefined(VirtualNetworkId)) __obj.updateDynamic("VirtualNetworkId")(VirtualNetworkId)
    __obj.asInstanceOf[CreateTrafficMirrorSessionRequest]
  }
}

