package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the remote stream.
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
  var videoReceivedResolutionHeight: js.UndefOr[String] = js.undefined
  /** Resolution width of the received video. */
  var videoReceivedResolutionWidth: js.UndefOr[String] = js.undefined
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
    videoReceivedResolutionHeight: String = null,
    videoReceivedResolutionWidth: String = null
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay, audioReceiveBytes = audioReceiveBytes, audioReceiveDelay = audioReceiveDelay, audioReceivePackets = audioReceivePackets, audioReceivePacketsLost = audioReceivePacketsLost, endToEndDelay = endToEndDelay, videoReceiveBytes = videoReceiveBytes, videoReceiveDecodeFrameRate = videoReceiveDecodeFrameRate, videoReceiveDelay = videoReceiveDelay, videoReceiveFrameRate = videoReceiveFrameRate, videoReceivePackets = videoReceivePackets, videoReceivePacketsLost = videoReceivePacketsLost)
    if (videoReceivedResolutionHeight != null) __obj.updateDynamic("videoReceivedResolutionHeight")(videoReceivedResolutionHeight)
    if (videoReceivedResolutionWidth != null) __obj.updateDynamic("videoReceivedResolutionWidth")(videoReceivedResolutionWidth)
    __obj.asInstanceOf[RemoteStreamStats]
  }
}

