package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video statistics of the local stream.
  *
  * If {@link getLocalVideoStats} is called successfully, the {@link LocalVideoStatsMap} interface provides the UID and {@link LocalVideoStats} of the local user.
  */
@js.native
trait LocalVideoStats extends js.Object {
  /** Frame rate of the captured video, in fps. */
  val CaptureFrameRate: js.UndefOr[String] = js.native
  /** Height (pixels) of the captured video. */
  val CaptureResolutionHeight: js.UndefOr[String] = js.native
  /** Width (pixels) of the captured video. */
  val CaptureResolutionWidth: js.UndefOr[String] = js.native
  /** Delay from capturing to encoding the local video, in ms. */
  val EncodeDelay: js.UndefOr[String] = js.native
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  /** Bitrate of the sent video, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.native
  /** Frame rate of the sent video, in fps. */
  val SendFrameRate: js.UndefOr[String] = js.native
  /** Height of the sent video, in pixels. */
  val SendResolutionHeight: js.UndefOr[String] = js.native
  /** Width of the sent video, in pixels. */
  val SendResolutionWidth: js.UndefOr[String] = js.native
  /** Bitrate of the local video set in [[setVideoProfile]]. */
  val TargetSendBitrate: js.UndefOr[String] = js.native
  /** Total duration of the published video, in seconds. */
  val TotalDuration: js.UndefOr[String] = js.native
  /** Total freeze time of the encoded video, in seconds. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
}

object LocalVideoStats {
  @scala.inline
  def apply(): LocalVideoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalVideoStats]
  }
  @scala.inline
  implicit class LocalVideoStatsOps[Self <: LocalVideoStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureFrameRate(value: String): Self = this.set("CaptureFrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureFrameRate: Self = this.set("CaptureFrameRate", js.undefined)
    @scala.inline
    def setCaptureResolutionHeight(value: String): Self = this.set("CaptureResolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureResolutionHeight: Self = this.set("CaptureResolutionHeight", js.undefined)
    @scala.inline
    def setCaptureResolutionWidth(value: String): Self = this.set("CaptureResolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureResolutionWidth: Self = this.set("CaptureResolutionWidth", js.undefined)
    @scala.inline
    def setEncodeDelay(value: String): Self = this.set("EncodeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeDelay: Self = this.set("EncodeDelay", js.undefined)
    @scala.inline
    def setMuteState(value: String): Self = this.set("MuteState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuteState: Self = this.set("MuteState", js.undefined)
    @scala.inline
    def setSendBitrate(value: String): Self = this.set("SendBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendBitrate: Self = this.set("SendBitrate", js.undefined)
    @scala.inline
    def setSendFrameRate(value: String): Self = this.set("SendFrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendFrameRate: Self = this.set("SendFrameRate", js.undefined)
    @scala.inline
    def setSendResolutionHeight(value: String): Self = this.set("SendResolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendResolutionHeight: Self = this.set("SendResolutionHeight", js.undefined)
    @scala.inline
    def setSendResolutionWidth(value: String): Self = this.set("SendResolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendResolutionWidth: Self = this.set("SendResolutionWidth", js.undefined)
    @scala.inline
    def setTargetSendBitrate(value: String): Self = this.set("TargetSendBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSendBitrate: Self = this.set("TargetSendBitrate", js.undefined)
    @scala.inline
    def setTotalDuration(value: String): Self = this.set("TotalDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDuration: Self = this.set("TotalDuration", js.undefined)
    @scala.inline
    def setTotalFreezeTime(value: String): Self = this.set("TotalFreezeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFreezeTime: Self = this.set("TotalFreezeTime", js.undefined)
  }
  
}

