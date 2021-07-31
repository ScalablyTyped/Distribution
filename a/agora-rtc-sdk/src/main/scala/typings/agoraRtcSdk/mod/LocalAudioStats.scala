package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio statistics of the local stream.
  *
  * If {@link getLocalAudioStats} is called successfully, the {@link LocalAudioStatsMap} provides the UID and {@link LocalAudioStats} of the local user.
  */
trait LocalAudioStats extends StObject {
  
  /**
    * Encoding type of the sent audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.undefined
  
  /** Energy level of the captured audio. */
  val RecordingLevel: js.UndefOr[String] = js.undefined
  
  /** Sampling rate, in kHz. */
  val SamplingRate: js.UndefOr[String] = js.undefined
  
  /** Bitrate of the sent audio, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.undefined
  
  /** Energy level of the sent audio. */
  val SendLevel: js.UndefOr[String] = js.undefined
}
object LocalAudioStats {
  
  @scala.inline
  def apply(): LocalAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalAudioStats]
  }
  
  @scala.inline
  implicit class LocalAudioStatsMutableBuilder[Self <: LocalAudioStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecType(value: String): Self = StObject.set(x, "CodecType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecTypeUndefined: Self = StObject.set(x, "CodecType", js.undefined)
    
    @scala.inline
    def setMuteState(value: String): Self = StObject.set(x, "MuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteStateUndefined: Self = StObject.set(x, "MuteState", js.undefined)
    
    @scala.inline
    def setRecordingLevel(value: String): Self = StObject.set(x, "RecordingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingLevelUndefined: Self = StObject.set(x, "RecordingLevel", js.undefined)
    
    @scala.inline
    def setSamplingRate(value: String): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRateUndefined: Self = StObject.set(x, "SamplingRate", js.undefined)
    
    @scala.inline
    def setSendBitrate(value: String): Self = StObject.set(x, "SendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBitrateUndefined: Self = StObject.set(x, "SendBitrate", js.undefined)
    
    @scala.inline
    def setSendLevel(value: String): Self = StObject.set(x, "SendLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendLevelUndefined: Self = StObject.set(x, "SendLevel", js.undefined)
  }
}
