package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The protocol that is used by the source or output.
    */
  var Protocol: typings.awsDashSdk.clientsMediaconnectMod.Protocol
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[__string] = js.undefined
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[__string] = js.undefined
}

object Transport {
  @scala.inline
  def apply(
    Protocol: Protocol,
    CidrAllowList: __listOf__string = null,
    MaxBitrate: js.UndefOr[__integer] = js.undefined,
    MaxLatency: js.UndefOr[__integer] = js.undefined,
    RemoteId: __string = null,
    SmoothingLatency: js.UndefOr[__integer] = js.undefined,
    StreamId: __string = null
  ): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    if (CidrAllowList != null) __obj.updateDynamic("CidrAllowList")(CidrAllowList)
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency)
    if (RemoteId != null) __obj.updateDynamic("RemoteId")(RemoteId)
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency)
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    __obj.asInstanceOf[Transport]
  }
}

