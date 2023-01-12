package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video statistics of the remote stream.
  *
  * If {@link getRemoteVideoStats} is called successfully, the {@link RemoteVideoStatsMap} interface provides the UID and {@link RemoteVideoStats} of each remote user.
  */
trait RemoteVideoStats extends StObject {
  
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
  
  inline def apply(): RemoteVideoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteVideoStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
    
    inline def setEnd2EndDelay(value: String): Self = StObject.set(x, "End2EndDelay", value.asInstanceOf[js.Any])
    
    inline def setEnd2EndDelayUndefined: Self = StObject.set(x, "End2EndDelay", js.undefined)
    
    inline def setMuteState(value: String): Self = StObject.set(x, "MuteState", value.asInstanceOf[js.Any])
    
    inline def setMuteStateUndefined: Self = StObject.set(x, "MuteState", js.undefined)
    
    inline def setPacketLossRate(value: String): Self = StObject.set(x, "PacketLossRate", value.asInstanceOf[js.Any])
    
    inline def setPacketLossRateUndefined: Self = StObject.set(x, "PacketLossRate", js.undefined)
    
    inline def setRecvBitrate(value: String): Self = StObject.set(x, "RecvBitrate", value.asInstanceOf[js.Any])
    
    inline def setRecvBitrateUndefined: Self = StObject.set(x, "RecvBitrate", js.undefined)
    
    inline def setRecvResolutionHeight(value: String): Self = StObject.set(x, "RecvResolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setRecvResolutionHeightUndefined: Self = StObject.set(x, "RecvResolutionHeight", js.undefined)
    
    inline def setRecvResolutionWidth(value: String): Self = StObject.set(x, "RecvResolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setRecvResolutionWidthUndefined: Self = StObject.set(x, "RecvResolutionWidth", js.undefined)
    
    inline def setRenderFrameRate(value: String): Self = StObject.set(x, "RenderFrameRate", value.asInstanceOf[js.Any])
    
    inline def setRenderFrameRateUndefined: Self = StObject.set(x, "RenderFrameRate", js.undefined)
    
    inline def setRenderResolutionHeight(value: String): Self = StObject.set(x, "RenderResolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setRenderResolutionHeightUndefined: Self = StObject.set(x, "RenderResolutionHeight", js.undefined)
    
    inline def setRenderResolutionWidth(value: String): Self = StObject.set(x, "RenderResolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setRenderResolutionWidthUndefined: Self = StObject.set(x, "RenderResolutionWidth", js.undefined)
    
    inline def setTotalFreezeTime(value: String): Self = StObject.set(x, "TotalFreezeTime", value.asInstanceOf[js.Any])
    
    inline def setTotalFreezeTimeUndefined: Self = StObject.set(x, "TotalFreezeTime", js.undefined)
    
    inline def setTotalPlayDuration(value: String): Self = StObject.set(x, "TotalPlayDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalPlayDurationUndefined: Self = StObject.set(x, "TotalPlayDuration", js.undefined)
    
    inline def setTransportDelay(value: String): Self = StObject.set(x, "TransportDelay", value.asInstanceOf[js.Any])
    
    inline def setTransportDelayUndefined: Self = StObject.set(x, "TransportDelay", js.undefined)
  }
}
