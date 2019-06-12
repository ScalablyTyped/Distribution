package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Video statistics of the local stream. */
trait LocalVideoStats extends js.Object {
  /** Frame rate of the captured video, in fps. */
  val CaptureFrameRate: js.UndefOr[java.lang.String] = js.undefined
  /** Height (pixels) of the captured video. */
  val CaptureResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Width (pixels) of the captured video. */
  val CaptureResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Delay from capturing to encoding the local video, in ms. */
  val EncodeDelay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[java.lang.String] = js.undefined
  /** Bitrate of the sent video, in Kbps. */
  val SendBitrate: js.UndefOr[java.lang.String] = js.undefined
  /** Frame rate of the sent video, in fps. */
  val SendFrameRate: js.UndefOr[java.lang.String] = js.undefined
  /** Height of the sent video, in pixels. */
  val SendResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the sent video, in pixels. */
  val SendResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Bitrate of the local video set in [[setVideoProfile]]. */
  val TargetSendBitrate: js.UndefOr[java.lang.String] = js.undefined
  /** Total duration of the published video, in seconds. */
  val TotalDuration: js.UndefOr[java.lang.String] = js.undefined
  /** Total freeze time of the encoded video, in seconds. */
  val TotalFreezeTime: js.UndefOr[java.lang.String] = js.undefined
}

object LocalVideoStats {
  @scala.inline
  def apply(
    CaptureFrameRate: java.lang.String = null,
    CaptureResolutionHeight: java.lang.String = null,
    CaptureResolutionWidth: java.lang.String = null,
    EncodeDelay: java.lang.String = null,
    MuteState: java.lang.String = null,
    SendBitrate: java.lang.String = null,
    SendFrameRate: java.lang.String = null,
    SendResolutionHeight: java.lang.String = null,
    SendResolutionWidth: java.lang.String = null,
    TargetSendBitrate: java.lang.String = null,
    TotalDuration: java.lang.String = null,
    TotalFreezeTime: java.lang.String = null
  ): LocalVideoStats = {
    val __obj = js.Dynamic.literal()
    if (CaptureFrameRate != null) __obj.updateDynamic("CaptureFrameRate")(CaptureFrameRate)
    if (CaptureResolutionHeight != null) __obj.updateDynamic("CaptureResolutionHeight")(CaptureResolutionHeight)
    if (CaptureResolutionWidth != null) __obj.updateDynamic("CaptureResolutionWidth")(CaptureResolutionWidth)
    if (EncodeDelay != null) __obj.updateDynamic("EncodeDelay")(EncodeDelay)
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState)
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate)
    if (SendFrameRate != null) __obj.updateDynamic("SendFrameRate")(SendFrameRate)
    if (SendResolutionHeight != null) __obj.updateDynamic("SendResolutionHeight")(SendResolutionHeight)
    if (SendResolutionWidth != null) __obj.updateDynamic("SendResolutionWidth")(SendResolutionWidth)
    if (TargetSendBitrate != null) __obj.updateDynamic("TargetSendBitrate")(TargetSendBitrate)
    if (TotalDuration != null) __obj.updateDynamic("TotalDuration")(TotalDuration)
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime)
    __obj.asInstanceOf[LocalVideoStats]
  }
}

