package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the local stream.
  */
trait LocalStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: java.lang.String
  /** Bytes of the sent audio. */
  var audioSendBytes: java.lang.String
  /** Packets of the sent audio. */
  var audioSendPackets: java.lang.String
  /**
    * Number of lost packets of the sent audio.
    *
    * **Note:**
    *
    * Safari and Firefox do not support this property.
    */
  var audioSendPacketsLost: java.lang.String
  /** Bytes of the sent video. */
  var videoSendBytes: java.lang.String
  /** Frame rate of the sent video. */
  var videoSendFrameRate: java.lang.String
  /** Packets of the sent video. */
  var videoSendPackets: java.lang.String
  /** Number of lost packets of the sent video. */
  var videoSendPacketsLost: java.lang.String
  /** Resolution height of the sent video. */
  var videoSendResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Resolution width of the sent video. */
  var videoSendResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
}

object LocalStreamStats {
  @scala.inline
  def apply(
    accessDelay: java.lang.String,
    audioSendBytes: java.lang.String,
    audioSendPackets: java.lang.String,
    audioSendPacketsLost: java.lang.String,
    videoSendBytes: java.lang.String,
    videoSendFrameRate: java.lang.String,
    videoSendPackets: java.lang.String,
    videoSendPacketsLost: java.lang.String,
    videoSendResolutionHeight: java.lang.String = null,
    videoSendResolutionWidth: java.lang.String = null
  ): LocalStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay, audioSendBytes = audioSendBytes, audioSendPackets = audioSendPackets, audioSendPacketsLost = audioSendPacketsLost, videoSendBytes = videoSendBytes, videoSendFrameRate = videoSendFrameRate, videoSendPackets = videoSendPackets, videoSendPacketsLost = videoSendPacketsLost)
    if (videoSendResolutionHeight != null) __obj.updateDynamic("videoSendResolutionHeight")(videoSendResolutionHeight)
    if (videoSendResolutionWidth != null) __obj.updateDynamic("videoSendResolutionWidth")(videoSendResolutionWidth)
    __obj.asInstanceOf[LocalStreamStats]
  }
}

