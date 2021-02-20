package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The connection statistics of the remote stream.
  *
  * If the remote stream calls {@link getStats} successfully, this interface provides the statistics.
  */
@js.native
trait RemoteStreamStats extends StObject {
  
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String = js.native
  
  /** Bytes of the received audio. */
  var audioReceiveBytes: String = js.native
  
  /**
    * Delay in receiving the audio (ms).
    *
    * Delay from sending to playing the audio, only supported by Chrome for now.
    */
  var audioReceiveDelay: String = js.native
  
  /** Packets of the received audio. */
  var audioReceivePackets: String = js.native
  
  /** Number of lost packets of the received audio. */
  var audioReceivePacketsLost: String = js.native
  
  /**
    * End to end delay (ms).
    *
    * Delay from sending to receiving data.
    */
  var endToEndDelay: String = js.native
  
  /** Bytes of the received video. */
  var videoReceiveBytes: String = js.native
  
  /** Decode frame rate after the video is received. */
  var videoReceiveDecodeFrameRate: String = js.native
  
  /**
    * Delay in receiving the video (ms).
    *
    * Delay from sending to playing the video, only supported by Chrome for now.
    */
  var videoReceiveDelay: String = js.native
  
  /** Frame rate rof the received video. */
  var videoReceiveFrameRate: String = js.native
  
  /** Packets of the received video. */
  var videoReceivePackets: String = js.native
  
  /** Number of lost packets of the received video. */
  var videoReceivePacketsLost: String = js.native
  
  /** Resolution height of the received video. */
  var videoReceiveResolutionHeight: js.UndefOr[String] = js.native
  
  /** Resolution width of the received video. */
  var videoReceiveResolutionWidth: js.UndefOr[String] = js.native
}
object RemoteStreamStats {
  
  @scala.inline
  def apply(
    accessDelay: String,
    audioReceiveBytes: String,
    audioReceiveDelay: String,
    audioReceivePackets: String,
    audioReceivePacketsLost: String,
    endToEndDelay: String,
    videoReceiveBytes: String,
    videoReceiveDecodeFrameRate: String,
    videoReceiveDelay: String,
    videoReceiveFrameRate: String,
    videoReceivePackets: String,
    videoReceivePacketsLost: String
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioReceiveBytes = audioReceiveBytes.asInstanceOf[js.Any], audioReceiveDelay = audioReceiveDelay.asInstanceOf[js.Any], audioReceivePackets = audioReceivePackets.asInstanceOf[js.Any], audioReceivePacketsLost = audioReceivePacketsLost.asInstanceOf[js.Any], endToEndDelay = endToEndDelay.asInstanceOf[js.Any], videoReceiveBytes = videoReceiveBytes.asInstanceOf[js.Any], videoReceiveDecodeFrameRate = videoReceiveDecodeFrameRate.asInstanceOf[js.Any], videoReceiveDelay = videoReceiveDelay.asInstanceOf[js.Any], videoReceiveFrameRate = videoReceiveFrameRate.asInstanceOf[js.Any], videoReceivePackets = videoReceivePackets.asInstanceOf[js.Any], videoReceivePacketsLost = videoReceivePacketsLost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStreamStats]
  }
  
  @scala.inline
  implicit class RemoteStreamStatsMutableBuilder[Self <: RemoteStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDelay(value: String): Self = StObject.set(x, "accessDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioReceiveBytes(value: String): Self = StObject.set(x, "audioReceiveBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioReceiveDelay(value: String): Self = StObject.set(x, "audioReceiveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioReceivePackets(value: String): Self = StObject.set(x, "audioReceivePackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioReceivePacketsLost(value: String): Self = StObject.set(x, "audioReceivePacketsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndToEndDelay(value: String): Self = StObject.set(x, "endToEndDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveBytes(value: String): Self = StObject.set(x, "videoReceiveBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveDecodeFrameRate(value: String): Self = StObject.set(x, "videoReceiveDecodeFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveDelay(value: String): Self = StObject.set(x, "videoReceiveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveFrameRate(value: String): Self = StObject.set(x, "videoReceiveFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceivePackets(value: String): Self = StObject.set(x, "videoReceivePackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceivePacketsLost(value: String): Self = StObject.set(x, "videoReceivePacketsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveResolutionHeight(value: String): Self = StObject.set(x, "videoReceiveResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveResolutionHeightUndefined: Self = StObject.set(x, "videoReceiveResolutionHeight", js.undefined)
    
    @scala.inline
    def setVideoReceiveResolutionWidth(value: String): Self = StObject.set(x, "videoReceiveResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveResolutionWidthUndefined: Self = StObject.set(x, "videoReceiveResolutionWidth", js.undefined)
  }
}
