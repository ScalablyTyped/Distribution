package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio statistics of the remote stream.
  *
  * If {@link getRemoteAudioStats} is called successfully, the {@link RemoteAudioStatsMap} interface provides the UID and {@link RemoteAudioStats} of each remote user.
  */
@js.native
trait RemoteAudioStats extends StObject {
  
  /**
    * Decoding type of the received audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.native
  
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the audio.
    */
  val End2EndDelay: js.UndefOr[String] = js.native
  
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  
  /** Packet loss rate (%) of the remote audio. */
  val PacketLossRate: js.UndefOr[String] = js.native
  
  /** Bitrate of the received audio, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.native
  
  /** Volume of the received audio. */
  val RecvLevel: js.UndefOr[String] = js.native
  
  /** Total freeze time of the received audio. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
  
  /** Total playing duration of the received audio. */
  val TotalPlayDuration: js.UndefOr[String] = js.native
  
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the audio.
    */
  val TransportDelay: js.UndefOr[String] = js.native
}
object RemoteAudioStats {
  
  @scala.inline
  def apply(): RemoteAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAudioStats]
  }
  
  @scala.inline
  implicit class RemoteAudioStatsMutableBuilder[Self <: RemoteAudioStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecType(value: String): Self = StObject.set(x, "CodecType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecTypeUndefined: Self = StObject.set(x, "CodecType", js.undefined)
    
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
    def setRecvLevel(value: String): Self = StObject.set(x, "RecvLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvLevelUndefined: Self = StObject.set(x, "RecvLevel", js.undefined)
    
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
