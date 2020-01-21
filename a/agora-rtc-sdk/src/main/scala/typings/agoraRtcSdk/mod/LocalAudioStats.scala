package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Audio statistics of the local stream. */
trait LocalAudioStats extends js.Object {
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
  def apply(
    CodecType: String = null,
    MuteState: String = null,
    RecordingLevel: String = null,
    SamplingRate: String = null,
    SendBitrate: String = null,
    SendLevel: String = null
  ): LocalAudioStats = {
    val __obj = js.Dynamic.literal()
    if (CodecType != null) __obj.updateDynamic("CodecType")(CodecType.asInstanceOf[js.Any])
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState.asInstanceOf[js.Any])
    if (RecordingLevel != null) __obj.updateDynamic("RecordingLevel")(RecordingLevel.asInstanceOf[js.Any])
    if (SamplingRate != null) __obj.updateDynamic("SamplingRate")(SamplingRate.asInstanceOf[js.Any])
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate.asInstanceOf[js.Any])
    if (SendLevel != null) __obj.updateDynamic("SendLevel")(SendLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalAudioStats]
  }
}

