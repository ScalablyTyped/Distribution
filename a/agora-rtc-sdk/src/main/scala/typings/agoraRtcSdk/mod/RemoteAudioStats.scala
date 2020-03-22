package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio statistics of the remote stream.
  *
  * If {@link getRemoteAudioStats} is called successfully, the {@link RemoteAudioStatsMap} interface provides the UID and {@link RemoteAudioStats} of each remote user.
  */
trait RemoteAudioStats extends js.Object {
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
  @scala.inline
  def apply(
    CodecType: String = null,
    End2EndDelay: String = null,
    MuteState: String = null,
    PacketLossRate: String = null,
    RecvBitrate: String = null,
    RecvLevel: String = null,
    TotalFreezeTime: String = null,
    TotalPlayDuration: String = null,
    TransportDelay: String = null
  ): RemoteAudioStats = {
    val __obj = js.Dynamic.literal()
    if (CodecType != null) __obj.updateDynamic("CodecType")(CodecType.asInstanceOf[js.Any])
    if (End2EndDelay != null) __obj.updateDynamic("End2EndDelay")(End2EndDelay.asInstanceOf[js.Any])
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState.asInstanceOf[js.Any])
    if (PacketLossRate != null) __obj.updateDynamic("PacketLossRate")(PacketLossRate.asInstanceOf[js.Any])
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate.asInstanceOf[js.Any])
    if (RecvLevel != null) __obj.updateDynamic("RecvLevel")(RecvLevel.asInstanceOf[js.Any])
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime.asInstanceOf[js.Any])
    if (TotalPlayDuration != null) __obj.updateDynamic("TotalPlayDuration")(TotalPlayDuration.asInstanceOf[js.Any])
    if (TransportDelay != null) __obj.updateDynamic("TransportDelay")(TransportDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAudioStats]
  }
}

