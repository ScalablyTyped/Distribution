package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Audio statistics of the remote stream. */
trait RemoteAudioStats extends js.Object {
  /**
    * Decoding type of the received audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the audio.
    */
  val End2EndDelay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[java.lang.String] = js.undefined
  /** Packet loss rate (%) of the remote audio. */
  val PacketLossRate: js.UndefOr[java.lang.String] = js.undefined
  /** Bitrate of the received audio, in Kbps. */
  val RecvBitrate: js.UndefOr[java.lang.String] = js.undefined
  /** Volume of the received audio. */
  val RecvLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Total freeze time of the received audio. */
  val TotalFreezeTime: js.UndefOr[java.lang.String] = js.undefined
  /** Total playing duration of the received audio. */
  val TotalPlayDuration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the audio.
    */
  val TransportDelay: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteAudioStats {
  @scala.inline
  def apply(
    CodecType: java.lang.String = null,
    End2EndDelay: java.lang.String = null,
    MuteState: java.lang.String = null,
    PacketLossRate: java.lang.String = null,
    RecvBitrate: java.lang.String = null,
    RecvLevel: java.lang.String = null,
    TotalFreezeTime: java.lang.String = null,
    TotalPlayDuration: java.lang.String = null,
    TransportDelay: java.lang.String = null
  ): RemoteAudioStats = {
    val __obj = js.Dynamic.literal()
    if (CodecType != null) __obj.updateDynamic("CodecType")(CodecType)
    if (End2EndDelay != null) __obj.updateDynamic("End2EndDelay")(End2EndDelay)
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState)
    if (PacketLossRate != null) __obj.updateDynamic("PacketLossRate")(PacketLossRate)
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate)
    if (RecvLevel != null) __obj.updateDynamic("RecvLevel")(RecvLevel)
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime)
    if (TotalPlayDuration != null) __obj.updateDynamic("TotalPlayDuration")(TotalPlayDuration)
    if (TransportDelay != null) __obj.updateDynamic("TransportDelay")(TransportDelay)
    __obj.asInstanceOf[RemoteAudioStats]
  }
}

