package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Video statistics of the remote stream. */
trait RemoteVideoStats extends js.Object {
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the video.
    */
  val End2EndDelay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[java.lang.String] = js.undefined
  /** Packet loss rate (%) of the remote video. */
  val PacketLossRate: js.UndefOr[java.lang.String] = js.undefined
  /** Bitrate of the received video, in Kbps. */
  val RecvBitrate: js.UndefOr[java.lang.String] = js.undefined
  /** Resolution height of the received video, in pixels. */
  val RecvResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Resolution width of the received video, in pixels. */
  val RecvResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Rendering frame rate of the decoded video, in fps. */
  val RenderFrameRate: js.UndefOr[java.lang.String] = js.undefined
  /** Height (pixels) of the rendered video */
  val RenderResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Width (pixels) of the rendered video */
  val RenderResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Total freeze time of the received video. */
  val TotalFreezeTime: js.UndefOr[java.lang.String] = js.undefined
  /** Total playing duration of the received video. */
  val TotalPlayDuration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the video.
    */
  val TransportDelay: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteVideoStats {
  @scala.inline
  def apply(
    End2EndDelay: java.lang.String = null,
    MuteState: java.lang.String = null,
    PacketLossRate: java.lang.String = null,
    RecvBitrate: java.lang.String = null,
    RecvResolutionHeight: java.lang.String = null,
    RecvResolutionWidth: java.lang.String = null,
    RenderFrameRate: java.lang.String = null,
    RenderResolutionHeight: java.lang.String = null,
    RenderResolutionWidth: java.lang.String = null,
    TotalFreezeTime: java.lang.String = null,
    TotalPlayDuration: java.lang.String = null,
    TransportDelay: java.lang.String = null
  ): RemoteVideoStats = {
    val __obj = js.Dynamic.literal()
    if (End2EndDelay != null) __obj.updateDynamic("End2EndDelay")(End2EndDelay)
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState)
    if (PacketLossRate != null) __obj.updateDynamic("PacketLossRate")(PacketLossRate)
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate)
    if (RecvResolutionHeight != null) __obj.updateDynamic("RecvResolutionHeight")(RecvResolutionHeight)
    if (RecvResolutionWidth != null) __obj.updateDynamic("RecvResolutionWidth")(RecvResolutionWidth)
    if (RenderFrameRate != null) __obj.updateDynamic("RenderFrameRate")(RenderFrameRate)
    if (RenderResolutionHeight != null) __obj.updateDynamic("RenderResolutionHeight")(RenderResolutionHeight)
    if (RenderResolutionWidth != null) __obj.updateDynamic("RenderResolutionWidth")(RenderResolutionWidth)
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime)
    if (TotalPlayDuration != null) __obj.updateDynamic("TotalPlayDuration")(TotalPlayDuration)
    if (TransportDelay != null) __obj.updateDynamic("TransportDelay")(TransportDelay)
    __obj.asInstanceOf[RemoteVideoStats]
  }
}

