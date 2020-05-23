package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the local stream.
  *
  * If the local stream calls {@link getStats} successfully, this interface provides the statistics.
  */
trait LocalStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String
  /** Bytes of the sent audio. */
  var audioSendBytes: String
  /** Packets of the sent audio. */
  var audioSendPackets: String
  /**
    * Number of lost packets of the sent audio.
    *
    * **Note**
    *
    * Safari and Firefox do not support this property.
    */
  var audioSendPacketsLost: String
  /** Bytes of the sent video. */
  var videoSendBytes: String
  /** Frame rate of the sent video. */
  var videoSendFrameRate: String
  /** Packets of the sent video. */
  var videoSendPackets: String
  /** Number of lost packets of the sent video. */
  var videoSendPacketsLost: String
  /** Resolution height of the sent video. */
  var videoSendResolutionHeight: js.UndefOr[String] = js.undefined
  /** Resolution width of the sent video. */
  var videoSendResolutionWidth: js.UndefOr[String] = js.undefined
}

object LocalStreamStats {
  @scala.inline
  def apply(
    accessDelay: String,
    audioSendBytes: String,
    audioSendPackets: String,
    audioSendPacketsLost: String,
    videoSendBytes: String,
    videoSendFrameRate: String,
    videoSendPackets: String,
    videoSendPacketsLost: String,
    videoSendResolutionHeight: String = null,
    videoSendResolutionWidth: String = null
  ): LocalStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioSendBytes = audioSendBytes.asInstanceOf[js.Any], audioSendPackets = audioSendPackets.asInstanceOf[js.Any], audioSendPacketsLost = audioSendPacketsLost.asInstanceOf[js.Any], videoSendBytes = videoSendBytes.asInstanceOf[js.Any], videoSendFrameRate = videoSendFrameRate.asInstanceOf[js.Any], videoSendPackets = videoSendPackets.asInstanceOf[js.Any], videoSendPacketsLost = videoSendPacketsLost.asInstanceOf[js.Any])
    if (videoSendResolutionHeight != null) __obj.updateDynamic("videoSendResolutionHeight")(videoSendResolutionHeight.asInstanceOf[js.Any])
    if (videoSendResolutionWidth != null) __obj.updateDynamic("videoSendResolutionWidth")(videoSendResolutionWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStreamStats]
  }
}

