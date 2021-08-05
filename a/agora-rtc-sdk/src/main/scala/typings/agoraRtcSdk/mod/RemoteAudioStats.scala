package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio statistics of the remote stream.
  *
  * If {@link getRemoteAudioStats} is called successfully, the {@link RemoteAudioStatsMap} interface provides the UID and {@link RemoteAudioStats} of each remote user.
  */
trait RemoteAudioStats extends StObject {
  
  /**
    * Decoding type of the received audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.undefined
  
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the audio.
    */
  val End2EndDelay: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.undefined
  
  /** Packet loss rate (%) of the remote audio. */
  val PacketLossRate: js.UndefOr[String] = js.undefined
  
  /** Bitrate of the received audio, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.undefined
  
  /** Volume of the received audio. */
  val RecvLevel: js.UndefOr[String] = js.undefined
  
  /** Total freeze time of the received audio. */
  val TotalFreezeTime: js.UndefOr[String] = js.undefined
  
  /** Total playing duration of the received audio. */
  val TotalPlayDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the audio.
    */
  val TransportDelay: js.UndefOr[String] = js.undefined
}
object RemoteAudioStats {
  
  inline def apply(): RemoteAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAudioStats]
  }
  
  extension [Self <: RemoteAudioStats](x: Self) {
    
    inline def setCodecType(value: String): Self = StObject.set(x, "CodecType", value.asInstanceOf[js.Any])
    
    inline def setCodecTypeUndefined: Self = StObject.set(x, "CodecType", js.undefined)
    
    inline def setEnd2EndDelay(value: String): Self = StObject.set(x, "End2EndDelay", value.asInstanceOf[js.Any])
    
    inline def setEnd2EndDelayUndefined: Self = StObject.set(x, "End2EndDelay", js.undefined)
    
    inline def setMuteState(value: String): Self = StObject.set(x, "MuteState", value.asInstanceOf[js.Any])
    
    inline def setMuteStateUndefined: Self = StObject.set(x, "MuteState", js.undefined)
    
    inline def setPacketLossRate(value: String): Self = StObject.set(x, "PacketLossRate", value.asInstanceOf[js.Any])
    
    inline def setPacketLossRateUndefined: Self = StObject.set(x, "PacketLossRate", js.undefined)
    
    inline def setRecvBitrate(value: String): Self = StObject.set(x, "RecvBitrate", value.asInstanceOf[js.Any])
    
    inline def setRecvBitrateUndefined: Self = StObject.set(x, "RecvBitrate", js.undefined)
    
    inline def setRecvLevel(value: String): Self = StObject.set(x, "RecvLevel", value.asInstanceOf[js.Any])
    
    inline def setRecvLevelUndefined: Self = StObject.set(x, "RecvLevel", js.undefined)
    
    inline def setTotalFreezeTime(value: String): Self = StObject.set(x, "TotalFreezeTime", value.asInstanceOf[js.Any])
    
    inline def setTotalFreezeTimeUndefined: Self = StObject.set(x, "TotalFreezeTime", js.undefined)
    
    inline def setTotalPlayDuration(value: String): Self = StObject.set(x, "TotalPlayDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalPlayDurationUndefined: Self = StObject.set(x, "TotalPlayDuration", js.undefined)
    
    inline def setTransportDelay(value: String): Self = StObject.set(x, "TransportDelay", value.asInstanceOf[js.Any])
    
    inline def setTransportDelayUndefined: Self = StObject.set(x, "TransportDelay", js.undefined)
  }
}
