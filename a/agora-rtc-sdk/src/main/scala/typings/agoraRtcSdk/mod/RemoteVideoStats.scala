package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video statistics of the remote stream.
  *
  * If {@link getRemoteVideoStats} is called successfully, the {@link RemoteVideoStatsMap} interface provides the UID and {@link RemoteVideoStats} of each remote user.
  */
@js.native
trait RemoteVideoStats extends StObject {
  
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the video.
    */
  val End2EndDelay: js.UndefOr[String] = js.native
  
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  
  /** Packet loss rate (%) of the remote video. */
  val PacketLossRate: js.UndefOr[String] = js.native
  
  /** Bitrate of the received video, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.native
  
  /** Resolution height of the received video, in pixels. */
  val RecvResolutionHeight: js.UndefOr[String] = js.native
  
  /** Resolution width of the received video, in pixels. */
  val RecvResolutionWidth: js.UndefOr[String] = js.native
  
  /** Rendering frame rate of the decoded video, in fps. */
  val RenderFrameRate: js.UndefOr[String] = js.native
  
  /** Height (pixels) of the rendered video */
  val RenderResolutionHeight: js.UndefOr[String] = js.native
  
  /** Width (pixels) of the rendered video */
  val RenderResolutionWidth: js.UndefOr[String] = js.native
  
  /** Total freeze time of the received video. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
  
  /** Total playing duration of the received video. */
  val TotalPlayDuration: js.UndefOr[String] = js.native
  
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the video.
    */
  val TransportDelay: js.UndefOr[String] = js.native
}
object RemoteVideoStats {
  
  @scala.inline
  def apply(): RemoteVideoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteVideoStats]
  }
  
  @scala.inline
  implicit class RemoteVideoStatsMutableBuilder[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd2EndDelay(value: String): Self = StObject.set(x, "End2EndDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd2EndDelayUndefined: Self = StObject.set(x, "End2EndDelay", js.undefined)
    
    @scala.inline
    def setMuteState(value: String): Self = StObject.set(x, "MuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteStateUndefined: Self = StObject.set(x, "MuteState", js.undefined)
    
    @scala.inline
    def setPacketLossRate(value: String): Self = StObject.set(x, "PacketLossRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLossRateUndefined: Self = StObject.set(x, "PacketLossRate", js.undefined)
    
    @scala.inline
    def setRecvBitrate(value: String): Self = StObject.set(x, "RecvBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvBitrateUndefined: Self = StObject.set(x, "RecvBitrate", js.undefined)
    
    @scala.inline
    def setRecvResolutionHeight(value: String): Self = StObject.set(x, "RecvResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvResolutionHeightUndefined: Self = StObject.set(x, "RecvResolutionHeight", js.undefined)
    
    @scala.inline
    def setRecvResolutionWidth(value: String): Self = StObject.set(x, "RecvResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvResolutionWidthUndefined: Self = StObject.set(x, "RecvResolutionWidth", js.undefined)
    
    @scala.inline
    def setRenderFrameRate(value: String): Self = StObject.set(x, "RenderFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFrameRateUndefined: Self = StObject.set(x, "RenderFrameRate", js.undefined)
    
    @scala.inline
    def setRenderResolutionHeight(value: String): Self = StObject.set(x, "RenderResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderResolutionHeightUndefined: Self = StObject.set(x, "RenderResolutionHeight", js.undefined)
    
    @scala.inline
    def setRenderResolutionWidth(value: String): Self = StObject.set(x, "RenderResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderResolutionWidthUndefined: Self = StObject.set(x, "RenderResolutionWidth", js.undefined)
    
    @scala.inline
    def setTotalFreezeTime(value: String): Self = StObject.set(x, "TotalFreezeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFreezeTimeUndefined: Self = StObject.set(x, "TotalFreezeTime", js.undefined)
    
    @scala.inline
    def setTotalPlayDuration(value: String): Self = StObject.set(x, "TotalPlayDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPlayDurationUndefined: Self = StObject.set(x, "TotalPlayDuration", js.undefined)
    
    @scala.inline
    def setTransportDelay(value: String): Self = StObject.set(x, "TransportDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportDelayUndefined: Self = StObject.set(x, "TransportDelay", js.undefined)
  }
}
