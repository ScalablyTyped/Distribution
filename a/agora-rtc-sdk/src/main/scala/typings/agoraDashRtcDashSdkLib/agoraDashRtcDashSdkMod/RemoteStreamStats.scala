package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the remote stream.
  */
trait RemoteStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: java.lang.String
  /** Bytes of the received audio. */
  var audioReceiveBytes: java.lang.String
  /**
    * Delay in receiving the audio (ms).
    *
    * Delay from sending to playing the audio, only supported by Chrome for now.
    */
  var audioReceiveDelay: java.lang.String
  /** Packets of the received audio. */
  var audioReceivePackets: java.lang.String
  /** Number of lost packets of the received audio. */
  var audioReceivePacketsLost: java.lang.String
  /**
    * End to end delay (ms).
    *
    * Delay from sending to receiving data.
    */
  var endToEndDelay: java.lang.String
  /** Bytes of the received video. */
  var videoReceiveBytes: java.lang.String
  /** Decode frame rate after the video is received. */
  var videoReceiveDecodeFrameRate: java.lang.String
  /**
    * Delay in receiving the video (ms).
    *
    * Delay from sending to playing the video, only supported by Chrome for now.
    */
  var videoReceiveDelay: java.lang.String
  /** Frame rate rof the received video. */
  var videoReceiveFrameRate: java.lang.String
  /** Packets of the received video. */
  var videoReceivePackets: java.lang.String
  /** Number of lost packets of the received video. */
  var videoReceivePacketsLost: java.lang.String
  /** Resolution height of the received video. */
  var videoReceivedResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Resolution width of the received video. */
  var videoReceivedResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteStreamStats {
  @scala.inline
  def apply(
    accessDelay: java.lang.String,
    audioReceiveBytes: java.lang.String,
    audioReceiveDelay: java.lang.String,
    audioReceivePackets: java.lang.String,
    audioReceivePacketsLost: java.lang.String,
    endToEndDelay: java.lang.String,
    videoReceiveBytes: java.lang.String,
    videoReceiveDecodeFrameRate: java.lang.String,
    videoReceiveDelay: java.lang.String,
    videoReceiveFrameRate: java.lang.String,
    videoReceivePackets: java.lang.String,
    videoReceivePacketsLost: java.lang.String,
    videoReceivedResolutionHeight: java.lang.String = null,
    videoReceivedResolutionWidth: java.lang.String = null
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay, audioReceiveBytes = audioReceiveBytes, audioReceiveDelay = audioReceiveDelay, audioReceivePackets = audioReceivePackets, audioReceivePacketsLost = audioReceivePacketsLost, endToEndDelay = endToEndDelay, videoReceiveBytes = videoReceiveBytes, videoReceiveDecodeFrameRate = videoReceiveDecodeFrameRate, videoReceiveDelay = videoReceiveDelay, videoReceiveFrameRate = videoReceiveFrameRate, videoReceivePackets = videoReceivePackets, videoReceivePacketsLost = videoReceivePacketsLost)
    if (videoReceivedResolutionHeight != null) __obj.updateDynamic("videoReceivedResolutionHeight")(videoReceivedResolutionHeight)
    if (videoReceivedResolutionWidth != null) __obj.updateDynamic("videoReceivedResolutionWidth")(videoReceivedResolutionWidth)
    __obj.asInstanceOf[RemoteStreamStats]
  }
}

