package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the remote stream.
  *
  * If the remote stream calls {@link getStats} successfully, this interface provides the statistics.
  */
trait RemoteStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String
  /** Bytes of the received audio. */
  var audioReceiveBytes: String
  /**
    * Delay in receiving the audio (ms).
    *
    * Delay from sending to playing the audio, only supported by Chrome for now.
    */
  var audioReceiveDelay: String
  /** Packets of the received audio. */
  var audioReceivePackets: String
  /** Number of lost packets of the received audio. */
  var audioReceivePacketsLost: String
  /**
    * End to end delay (ms).
    *
    * Delay from sending to receiving data.
    */
  var endToEndDelay: String
  /** Bytes of the received video. */
  var videoReceiveBytes: String
  /** Decode frame rate after the video is received. */
  var videoReceiveDecodeFrameRate: String
  /**
    * Delay in receiving the video (ms).
    *
    * Delay from sending to playing the video, only supported by Chrome for now.
    */
  var videoReceiveDelay: String
  /** Frame rate rof the received video. */
  var videoReceiveFrameRate: String
  /** Packets of the received video. */
  var videoReceivePackets: String
  /** Number of lost packets of the received video. */
  var videoReceivePacketsLost: String
  /** Resolution height of the received video. */
  var videoReceiveResolutionHeight: js.UndefOr[String] = js.undefined
  /** Resolution width of the received video. */
  var videoReceiveResolutionWidth: js.UndefOr[String] = js.undefined
}

object RemoteStreamStats {
  @scala.inline
  def apply(
    accessDelay: String,
    audioReceiveBytes: String,
    audioReceiveDelay: String,
    audioReceivePackets: String,
    audioReceivePacketsLost: String,
    endToEndDelay: String,
    videoReceiveBytes: String,
    videoReceiveDecodeFrameRate: String,
    videoReceiveDelay: String,
    videoReceiveFrameRate: String,
    videoReceivePackets: String,
    videoReceivePacketsLost: String,
    videoReceiveResolutionHeight: String = null,
    videoReceiveResolutionWidth: String = null
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioReceiveBytes = audioReceiveBytes.asInstanceOf[js.Any], audioReceiveDelay = audioReceiveDelay.asInstanceOf[js.Any], audioReceivePackets = audioReceivePackets.asInstanceOf[js.Any], audioReceivePacketsLost = audioReceivePacketsLost.asInstanceOf[js.Any], endToEndDelay = endToEndDelay.asInstanceOf[js.Any], videoReceiveBytes = videoReceiveBytes.asInstanceOf[js.Any], videoReceiveDecodeFrameRate = videoReceiveDecodeFrameRate.asInstanceOf[js.Any], videoReceiveDelay = videoReceiveDelay.asInstanceOf[js.Any], videoReceiveFrameRate = videoReceiveFrameRate.asInstanceOf[js.Any], videoReceivePackets = videoReceivePackets.asInstanceOf[js.Any], videoReceivePacketsLost = videoReceivePacketsLost.asInstanceOf[js.Any])
    if (videoReceiveResolutionHeight != null) __obj.updateDynamic("videoReceiveResolutionHeight")(videoReceiveResolutionHeight.asInstanceOf[js.Any])
    if (videoReceiveResolutionWidth != null) __obj.updateDynamic("videoReceiveResolutionWidth")(videoReceiveResolutionWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStreamStats]
  }
}

