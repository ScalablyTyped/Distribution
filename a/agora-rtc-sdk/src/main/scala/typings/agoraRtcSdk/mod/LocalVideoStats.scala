package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video statistics of the local stream.
  *
  * If {@link getLocalVideoStats} is called successfully, the {@link LocalVideoStatsMap} interface provides the UID and {@link LocalVideoStats} of the local user.
  */
@js.native
trait LocalVideoStats extends StObject {
  
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
  implicit class LocalVideoStatsMutableBuilder[Self <: LocalVideoStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureFrameRate(value: String): Self = StObject.set(x, "CaptureFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureFrameRateUndefined: Self = StObject.set(x, "CaptureFrameRate", js.undefined)
    
    @scala.inline
    def setCaptureResolutionHeight(value: String): Self = StObject.set(x, "CaptureResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureResolutionHeightUndefined: Self = StObject.set(x, "CaptureResolutionHeight", js.undefined)
    
    @scala.inline
    def setCaptureResolutionWidth(value: String): Self = StObject.set(x, "CaptureResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureResolutionWidthUndefined: Self = StObject.set(x, "CaptureResolutionWidth", js.undefined)
    
    @scala.inline
    def setEncodeDelay(value: String): Self = StObject.set(x, "EncodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeDelayUndefined: Self = StObject.set(x, "EncodeDelay", js.undefined)
    
    @scala.inline
    def setMuteState(value: String): Self = StObject.set(x, "MuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteStateUndefined: Self = StObject.set(x, "MuteState", js.undefined)
    
    @scala.inline
    def setSendBitrate(value: String): Self = StObject.set(x, "SendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBitrateUndefined: Self = StObject.set(x, "SendBitrate", js.undefined)
    
    @scala.inline
    def setSendFrameRate(value: String): Self = StObject.set(x, "SendFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendFrameRateUndefined: Self = StObject.set(x, "SendFrameRate", js.undefined)
    
    @scala.inline
    def setSendResolutionHeight(value: String): Self = StObject.set(x, "SendResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendResolutionHeightUndefined: Self = StObject.set(x, "SendResolutionHeight", js.undefined)
    
    @scala.inline
    def setSendResolutionWidth(value: String): Self = StObject.set(x, "SendResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendResolutionWidthUndefined: Self = StObject.set(x, "SendResolutionWidth", js.undefined)
    
    @scala.inline
    def setTargetSendBitrate(value: String): Self = StObject.set(x, "TargetSendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSendBitrateUndefined: Self = StObject.set(x, "TargetSendBitrate", js.undefined)
    
    @scala.inline
    def setTotalDuration(value: String): Self = StObject.set(x, "TotalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDurationUndefined: Self = StObject.set(x, "TotalDuration", js.undefined)
    
    @scala.inline
    def setTotalFreezeTime(value: String): Self = StObject.set(x, "TotalFreezeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFreezeTimeUndefined: Self = StObject.set(x, "TotalFreezeTime", js.undefined)
  }
}
