package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

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
  val End2EndDelay: js.UndefOr[String] = js.undefined
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.undefined
  /** Packet loss rate (%) of the remote video. */
  val PacketLossRate: js.UndefOr[String] = js.undefined
  /** Bitrate of the received video, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.undefined
  /** Resolution height of the received video, in pixels. */
  val RecvResolutionHeight: js.UndefOr[String] = js.undefined
  /** Resolution width of the received video, in pixels. */
  val RecvResolutionWidth: js.UndefOr[String] = js.undefined
  /** Rendering frame rate of the decoded video, in fps. */
  val RenderFrameRate: js.UndefOr[String] = js.undefined
  /** Height (pixels) of the rendered video */
  val RenderResolutionHeight: js.UndefOr[String] = js.undefined
  /** Width (pixels) of the rendered video */
  val RenderResolutionWidth: js.UndefOr[String] = js.undefined
  /** Total freeze time of the received video. */
  val TotalFreezeTime: js.UndefOr[String] = js.undefined
  /** Total playing duration of the received video. */
  val TotalPlayDuration: js.UndefOr[String] = js.undefined
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the video.
    */
  val TransportDelay: js.UndefOr[String] = js.undefined
}

object RemoteVideoStats {
  @scala.inline
  def apply(
    End2EndDelay: String = null,
    MuteState: String = null,
    PacketLossRate: String = null,
    RecvBitrate: String = null,
    RecvResolutionHeight: String = null,
    RecvResolutionWidth: String = null,
    RenderFrameRate: String = null,
    RenderResolutionHeight: String = null,
    RenderResolutionWidth: String = null,
    TotalFreezeTime: String = null,
    TotalPlayDuration: String = null,
    TransportDelay: String = null
  ): RemoteVideoStats = {
    val __obj = js.Dynamic.literal()
    if (End2EndDelay != null) __obj.updateDynamic("End2EndDelay")(End2EndDelay.asInstanceOf[js.Any])
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState.asInstanceOf[js.Any])
    if (PacketLossRate != null) __obj.updateDynamic("PacketLossRate")(PacketLossRate.asInstanceOf[js.Any])
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate.asInstanceOf[js.Any])
    if (RecvResolutionHeight != null) __obj.updateDynamic("RecvResolutionHeight")(RecvResolutionHeight.asInstanceOf[js.Any])
    if (RecvResolutionWidth != null) __obj.updateDynamic("RecvResolutionWidth")(RecvResolutionWidth.asInstanceOf[js.Any])
    if (RenderFrameRate != null) __obj.updateDynamic("RenderFrameRate")(RenderFrameRate.asInstanceOf[js.Any])
    if (RenderResolutionHeight != null) __obj.updateDynamic("RenderResolutionHeight")(RenderResolutionHeight.asInstanceOf[js.Any])
    if (RenderResolutionWidth != null) __obj.updateDynamic("RenderResolutionWidth")(RenderResolutionWidth.asInstanceOf[js.Any])
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime.asInstanceOf[js.Any])
    if (TotalPlayDuration != null) __obj.updateDynamic("TotalPlayDuration")(TotalPlayDuration.asInstanceOf[js.Any])
    if (TransportDelay != null) __obj.updateDynamic("TransportDelay")(TransportDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteVideoStats]
  }
}

