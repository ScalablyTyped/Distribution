package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The connection statistics of the local stream.
  *
  * If the local stream calls {@link getStats} successfully, this interface provides the statistics.
  */
trait LocalStreamStats extends StObject {
  
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String
  
  /** Bytes of the sent audio. */
  var audioSendBytes: String
  
  /** Packets of the sent audio. */
  var audioSendPackets: String
  
  /**
    * Number of lost packets of the sent audio.
    *
    * **Note**
    *
    * Safari and Firefox do not support this property.
    */
  var audioSendPacketsLost: String
  
  /** Bytes of the sent video. */
  var videoSendBytes: String
  
  /** Frame rate of the sent video. */
  var videoSendFrameRate: String
  
  /** Packets of the sent video. */
  var videoSendPackets: String
  
  /** Number of lost packets of the sent video. */
  var videoSendPacketsLost: String
  
  /** Resolution height of the sent video. */
  var videoSendResolutionHeight: js.UndefOr[String] = js.undefined
  
  /** Resolution width of the sent video. */
  var videoSendResolutionWidth: js.UndefOr[String] = js.undefined
}
object LocalStreamStats {
  
  inline def apply(
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
  
  extension [Self <: LocalStreamStats](x: Self) {
    
    inline def setAccessDelay(value: String): Self = StObject.set(x, "accessDelay", value.asInstanceOf[js.Any])
    
    inline def setAudioSendBytes(value: String): Self = StObject.set(x, "audioSendBytes", value.asInstanceOf[js.Any])
    
    inline def setAudioSendPackets(value: String): Self = StObject.set(x, "audioSendPackets", value.asInstanceOf[js.Any])
    
    inline def setAudioSendPacketsLost(value: String): Self = StObject.set(x, "audioSendPacketsLost", value.asInstanceOf[js.Any])
    
    inline def setVideoSendBytes(value: String): Self = StObject.set(x, "videoSendBytes", value.asInstanceOf[js.Any])
    
    inline def setVideoSendFrameRate(value: String): Self = StObject.set(x, "videoSendFrameRate", value.asInstanceOf[js.Any])
    
    inline def setVideoSendPackets(value: String): Self = StObject.set(x, "videoSendPackets", value.asInstanceOf[js.Any])
    
    inline def setVideoSendPacketsLost(value: String): Self = StObject.set(x, "videoSendPacketsLost", value.asInstanceOf[js.Any])
    
    inline def setVideoSendResolutionHeight(value: String): Self = StObject.set(x, "videoSendResolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setVideoSendResolutionHeightUndefined: Self = StObject.set(x, "videoSendResolutionHeight", js.undefined)
    
    inline def setVideoSendResolutionWidth(value: String): Self = StObject.set(x, "videoSendResolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setVideoSendResolutionWidthUndefined: Self = StObject.set(x, "videoSendResolutionWidth", js.undefined)
  }
}
