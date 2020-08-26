package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio statistics of the remote stream.
  *
  * If {@link getRemoteAudioStats} is called successfully, the {@link RemoteAudioStatsMap} interface provides the UID and {@link RemoteAudioStats} of each remote user.
  */
@js.native
trait RemoteAudioStats extends js.Object {
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
  implicit class RemoteAudioStatsOps[Self <: RemoteAudioStats] (val x: Self) extends AnyVal {
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
    def setEnd2EndDelay(value: String): Self = this.set("End2EndDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd2EndDelay: Self = this.set("End2EndDelay", js.undefined)
    @scala.inline
    def setMuteState(value: String): Self = this.set("MuteState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuteState: Self = this.set("MuteState", js.undefined)
    @scala.inline
    def setPacketLossRate(value: String): Self = this.set("PacketLossRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketLossRate: Self = this.set("PacketLossRate", js.undefined)
    @scala.inline
    def setRecvBitrate(value: String): Self = this.set("RecvBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvBitrate: Self = this.set("RecvBitrate", js.undefined)
    @scala.inline
    def setRecvLevel(value: String): Self = this.set("RecvLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvLevel: Self = this.set("RecvLevel", js.undefined)
    @scala.inline
    def setTotalFreezeTime(value: String): Self = this.set("TotalFreezeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFreezeTime: Self = this.set("TotalFreezeTime", js.undefined)
    @scala.inline
    def setTotalPlayDuration(value: String): Self = this.set("TotalPlayDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPlayDuration: Self = this.set("TotalPlayDuration", js.undefined)
    @scala.inline
    def setTransportDelay(value: String): Self = this.set("TransportDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportDelay: Self = this.set("TransportDelay", js.undefined)
  }
  
}

