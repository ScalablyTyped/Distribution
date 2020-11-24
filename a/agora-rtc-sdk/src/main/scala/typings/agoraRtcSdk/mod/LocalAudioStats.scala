package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio statistics of the local stream.
  *
  * If {@link getLocalAudioStats} is called successfully, the {@link LocalAudioStatsMap} provides the UID and {@link LocalAudioStats} of the local user.
  */
@js.native
trait LocalAudioStats extends js.Object {
  
  /**
    * Encoding type of the sent audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.native
  
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  
  /** Energy level of the captured audio. */
  val RecordingLevel: js.UndefOr[String] = js.native
  
  /** Sampling rate, in kHz. */
  val SamplingRate: js.UndefOr[String] = js.native
  
  /** Bitrate of the sent audio, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.native
  
  /** Energy level of the sent audio. */
  val SendLevel: js.UndefOr[String] = js.native
}
object LocalAudioStats {
  
  @scala.inline
  def apply(): LocalAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalAudioStats]
  }
  
  @scala.inline
  implicit class LocalAudioStatsOps[Self <: LocalAudioStats] (val x: Self) extends AnyVal {
    
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
    def setCodecType(value: String): Self = this.set("CodecType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecType: Self = this.set("CodecType", js.undefined)
    
    @scala.inline
    def setMuteState(value: String): Self = this.set("MuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteState: Self = this.set("MuteState", js.undefined)
    
    @scala.inline
    def setRecordingLevel(value: String): Self = this.set("RecordingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingLevel: Self = this.set("RecordingLevel", js.undefined)
    
    @scala.inline
    def setSamplingRate(value: String): Self = this.set("SamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRate: Self = this.set("SamplingRate", js.undefined)
    
    @scala.inline
    def setSendBitrate(value: String): Self = this.set("SendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendBitrate: Self = this.set("SendBitrate", js.undefined)
    
    @scala.inline
    def setSendLevel(value: String): Self = this.set("SendLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendLevel: Self = this.set("SendLevel", js.undefined)
  }
}
