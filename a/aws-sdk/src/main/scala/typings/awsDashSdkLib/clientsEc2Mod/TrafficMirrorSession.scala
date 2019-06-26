package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorSession extends js.Object {
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Traffic Mirror session's network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the account that owns the Traffic Mirror session.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the entire packet
    */
  var PacketLength: js.UndefOr[Integer] = js.undefined
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: js.UndefOr[Integer] = js.undefined
  /**
    * The tags assigned to the Traffic Mirror session.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
  /**
    * The ID for the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
  /**
    * The virtual network ID associated with the Traffic Mirror session.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.undefined
}

object TrafficMirrorSession {
  @scala.inline
  def apply(
    Description: String = null,
    NetworkInterfaceId: String = null,
    OwnerId: String = null,
    PacketLength: js.UndefOr[Integer] = js.undefined,
    SessionNumber: js.UndefOr[Integer] = js.undefined,
    Tags: TagList = null,
    TrafficMirrorFilterId: String = null,
    TrafficMirrorSessionId: String = null,
    TrafficMirrorTargetId: String = null,
    VirtualNetworkId: js.UndefOr[Integer] = js.undefined
  ): TrafficMirrorSession = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (!js.isUndefined(PacketLength)) __obj.updateDynamic("PacketLength")(PacketLength)
    if (!js.isUndefined(SessionNumber)) __obj.updateDynamic("SessionNumber")(SessionNumber)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId)
    if (TrafficMirrorSessionId != null) __obj.updateDynamic("TrafficMirrorSessionId")(TrafficMirrorSessionId)
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId)
    if (!js.isUndefined(VirtualNetworkId)) __obj.updateDynamic("VirtualNetworkId")(VirtualNetworkId)
    __obj.asInstanceOf[TrafficMirrorSession]
  }
}

