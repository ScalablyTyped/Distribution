package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

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
    if (CodecType != null) __obj.updateDynamic("CodecType")(CodecType)
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState)
    if (RecordingLevel != null) __obj.updateDynamic("RecordingLevel")(RecordingLevel)
    if (SamplingRate != null) __obj.updateDynamic("SamplingRate")(SamplingRate)
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate)
    if (SendLevel != null) __obj.updateDynamic("SendLevel")(SendLevel)
    __obj.asInstanceOf[LocalAudioStats]
  }
}

