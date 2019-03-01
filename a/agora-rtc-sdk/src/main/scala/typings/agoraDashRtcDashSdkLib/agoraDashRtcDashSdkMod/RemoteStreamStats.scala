package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteStreamStats extends js.Object {
  var audioReceiveBytes: java.lang.String
  var audioReceivePackets: java.lang.String
  var audioReceivePacketsLost: java.lang.String
  var duration: java.lang.String
  var startTime: java.lang.String
  var timestamp: java.lang.String
  var videoReceiveBandwidth: js.UndefOr[java.lang.String] = js.undefined
  var videoReceiveBytes: java.lang.String
  var videoReceiveDecodeFrameRate: js.UndefOr[java.lang.String] = js.undefined
  var videoReceiveFrameRate: js.UndefOr[java.lang.String] = js.undefined
  var videoReceivePackets: java.lang.String
  var videoReceivePacketsLost: java.lang.String
  var videoReceivedResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  var videoReceivedResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteStreamStats {
  @scala.inline
  def apply(
    audioReceiveBytes: java.lang.String,
    audioReceivePackets: java.lang.String,
    audioReceivePacketsLost: java.lang.String,
    duration: java.lang.String,
    startTime: java.lang.String,
    timestamp: java.lang.String,
    videoReceiveBytes: java.lang.String,
    videoReceivePackets: java.lang.String,
    videoReceivePacketsLost: java.lang.String,
    videoReceiveBandwidth: java.lang.String = null,
    videoReceiveDecodeFrameRate: java.lang.String = null,
    videoReceiveFrameRate: java.lang.String = null,
    videoReceivedResolutionHeight: java.lang.String = null,
    videoReceivedResolutionWidth: java.lang.String = null
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioReceiveBytes")(audioReceiveBytes)
    __obj.updateDynamic("audioReceivePackets")(audioReceivePackets)
    __obj.updateDynamic("audioReceivePacketsLost")(audioReceivePacketsLost)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("videoReceiveBytes")(videoReceiveBytes)
    __obj.updateDynamic("videoReceivePackets")(videoReceivePackets)
    __obj.updateDynamic("videoReceivePacketsLost")(videoReceivePacketsLost)
    if (videoReceiveBandwidth != null) __obj.updateDynamic("videoReceiveBandwidth")(videoReceiveBandwidth)
    if (videoReceiveDecodeFrameRate != null) __obj.updateDynamic("videoReceiveDecodeFrameRate")(videoReceiveDecodeFrameRate)
    if (videoReceiveFrameRate != null) __obj.updateDynamic("videoReceiveFrameRate")(videoReceiveFrameRate)
    if (videoReceivedResolutionHeight != null) __obj.updateDynamic("videoReceivedResolutionHeight")(videoReceivedResolutionHeight)
    if (videoReceivedResolutionWidth != null) __obj.updateDynamic("videoReceivedResolutionWidth")(videoReceivedResolutionWidth)
    __obj.asInstanceOf[RemoteStreamStats]
  }
}

