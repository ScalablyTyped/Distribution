package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  /**
    * The smoothing max bitrate for RTP and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The protocol that is used by the source or output.
    */
  var Protocol: awsDashSdkLib.clientsMediaconnectMod.Protocol
  /**
    * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
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
    MaxBitrate: js.UndefOr[__integer] = js.undefined,
    MaxLatency: js.UndefOr[__integer] = js.undefined,
    SmoothingLatency: js.UndefOr[__integer] = js.undefined,
    StreamId: __string = null
  ): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency)
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency)
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    __obj.asInstanceOf[Transport]
  }
}

