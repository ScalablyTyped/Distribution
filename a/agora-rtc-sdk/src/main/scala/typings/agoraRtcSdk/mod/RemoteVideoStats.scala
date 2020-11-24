package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video statistics of the remote stream.
  *
  * If {@link getRemoteVideoStats} is called successfully, the {@link RemoteVideoStatsMap} interface provides the UID and {@link RemoteVideoStats} of each remote user.
  */
@js.native
trait RemoteVideoStats extends js.Object {
  
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
  implicit class RemoteVideoStatsOps[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
    
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
    def setEnd2EndDelay(value: String): Self = this.set("End2EndDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd2EndDelay: Self = this.set("End2EndDelay", js.undefined)
    
    @scala.inline
    def setMuteState(value: String): Self = this.set("MuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteState: Self = this.set("MuteState", js.undefined)
    
    @scala.inline
    def setPacketLossRate(value: String): Self = this.set("PacketLossRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketLossRate: Self = this.set("PacketLossRate", js.undefined)
    
    @scala.inline
    def setRecvBitrate(value: String): Self = this.set("RecvBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvBitrate: Self = this.set("RecvBitrate", js.undefined)
    
    @scala.inline
    def setRecvResolutionHeight(value: String): Self = this.set("RecvResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvResolutionHeight: Self = this.set("RecvResolutionHeight", js.undefined)
    
    @scala.inline
    def setRecvResolutionWidth(value: String): Self = this.set("RecvResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvResolutionWidth: Self = this.set("RecvResolutionWidth", js.undefined)
    
    @scala.inline
    def setRenderFrameRate(value: String): Self = this.set("RenderFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFrameRate: Self = this.set("RenderFrameRate", js.undefined)
    
    @scala.inline
    def setRenderResolutionHeight(value: String): Self = this.set("RenderResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderResolutionHeight: Self = this.set("RenderResolutionHeight", js.undefined)
    
    @scala.inline
    def setRenderResolutionWidth(value: String): Self = this.set("RenderResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderResolutionWidth: Self = this.set("RenderResolutionWidth", js.undefined)
    
    @scala.inline
    def setTotalFreezeTime(value: String): Self = this.set("TotalFreezeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFreezeTime: Self = this.set("TotalFreezeTime", js.undefined)
    
    @scala.inline
    def setTotalPlayDuration(value: String): Self = this.set("TotalPlayDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPlayDuration: Self = this.set("TotalPlayDuration", js.undefined)
    
    @scala.inline
    def setTransportDelay(value: String): Self = this.set("TransportDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportDelay: Self = this.set("TransportDelay", js.undefined)
  }
}
