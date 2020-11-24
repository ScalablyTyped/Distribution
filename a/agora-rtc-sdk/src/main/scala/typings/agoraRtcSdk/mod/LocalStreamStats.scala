package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The connection statistics of the local stream.
  *
  * If the local stream calls {@link getStats} successfully, this interface provides the statistics.
  */
@js.native
trait LocalStreamStats extends js.Object {
  
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String = js.native
  
  /** Bytes of the sent audio. */
  var audioSendBytes: String = js.native
  
  /** Packets of the sent audio. */
  var audioSendPackets: String = js.native
  
  /**
    * Number of lost packets of the sent audio.
    *
    * **Note**
    *
    * Safari and Firefox do not support this property.
    */
  var audioSendPacketsLost: String = js.native
  
  /** Bytes of the sent video. */
  var videoSendBytes: String = js.native
  
  /** Frame rate of the sent video. */
  var videoSendFrameRate: String = js.native
  
  /** Packets of the sent video. */
  var videoSendPackets: String = js.native
  
  /** Number of lost packets of the sent video. */
  var videoSendPacketsLost: String = js.native
  
  /** Resolution height of the sent video. */
  var videoSendResolutionHeight: js.UndefOr[String] = js.native
  
  /** Resolution width of the sent video. */
  var videoSendResolutionWidth: js.UndefOr[String] = js.native
}
object LocalStreamStats {
  
  @scala.inline
  def apply(
    accessDelay: String,
    audioSendBytes: String,
    audioSendPackets: String,
    audioSendPacketsLost: String,
    videoSendBytes: String,
    videoSendFrameRate: String,
    videoSendPackets: String,
    videoSendPacketsLost: String
  ): LocalStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioSendBytes = audioSendBytes.asInstanceOf[js.Any], audioSendPackets = audioSendPackets.asInstanceOf[js.Any], audioSendPacketsLost = audioSendPacketsLost.asInstanceOf[js.Any], videoSendBytes = videoSendBytes.asInstanceOf[js.Any], videoSendFrameRate = videoSendFrameRate.asInstanceOf[js.Any], videoSendPackets = videoSendPackets.asInstanceOf[js.Any], videoSendPacketsLost = videoSendPacketsLost.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStreamStats]
  }
  
  @scala.inline
  implicit class LocalStreamStatsOps[Self <: LocalStreamStats] (val x: Self) extends AnyVal {
    
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
    def setAccessDelay(value: String): Self = this.set("accessDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSendBytes(value: String): Self = this.set("audioSendBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSendPackets(value: String): Self = this.set("audioSendPackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSendPacketsLost(value: String): Self = this.set("audioSendPacketsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSendBytes(value: String): Self = this.set("videoSendBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSendFrameRate(value: String): Self = this.set("videoSendFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSendPackets(value: String): Self = this.set("videoSendPackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSendPacketsLost(value: String): Self = this.set("videoSendPacketsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSendResolutionHeight(value: String): Self = this.set("videoSendResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSendResolutionHeight: Self = this.set("videoSendResolutionHeight", js.undefined)
    
    @scala.inline
    def setVideoSendResolutionWidth(value: String): Self = this.set("videoSendResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSendResolutionWidth: Self = this.set("videoSendResolutionWidth", js.undefined)
  }
}
