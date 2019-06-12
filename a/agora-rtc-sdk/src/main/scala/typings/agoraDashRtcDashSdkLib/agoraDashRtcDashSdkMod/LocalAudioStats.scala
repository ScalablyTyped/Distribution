package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

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
  val CodecType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[java.lang.String] = js.undefined
  /** Energy level of the captured audio. */
  val RecordingLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Sampling rate, in kHz. */
  val SamplingRate: js.UndefOr[java.lang.String] = js.undefined
  /** Bitrate of the sent audio, in Kbps. */
  val SendBitrate: js.UndefOr[java.lang.String] = js.undefined
  /** Energy level of the sent audio. */
  val SendLevel: js.UndefOr[java.lang.String] = js.undefined
}

object LocalAudioStats {
  @scala.inline
  def apply(
    CodecType: java.lang.String = null,
    MuteState: java.lang.String = null,
    RecordingLevel: java.lang.String = null,
    SamplingRate: java.lang.String = null,
    SendBitrate: java.lang.String = null,
    SendLevel: java.lang.String = null
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

