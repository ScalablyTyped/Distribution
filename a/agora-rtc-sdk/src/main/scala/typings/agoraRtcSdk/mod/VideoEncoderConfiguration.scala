package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.anon.Height
import typings.agoraRtcSdk.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The video encoder configuration.
  *
  * This interface sets the video encoder configuration in {@link setVideoEncoderConfiguration}.
  *
  * Depending on the OS, browser, and camera, the actual resolution, frame rate, and bitrate might be different from the set values.
  */
trait VideoEncoderConfiguration extends js.Object {
  /**
    * The video bitrate (Kbps). The value range is [1,10000000].
    *
    * We recommend setting the bitrate between 100 Kbps and 5000 Kbps. You can refer to the table below and set your bitrate.
    *
    * [[include:VideoProfileDefinition.md]]
    */
  var bitrate: js.UndefOr[Max] = js.undefined
  /**
    * The video frame rate (fps).
    *
    * The value range is [1, 10000]. We recommend setting the frame rate between 5 fps and 30 fps.
    *
    * **Note**
    * - This parameter sets the local capturing video frame rate. The actual encoding frame rate depends on the device, system, and browser.
    * - When the network conditions change, the browser adjusts the encoding frame rate automatically.
    */
  var frameRate: js.UndefOr[Max] = js.undefined
  /**
    * Resolution of the video.
    *
    * We recommend using common resolutions, for example:
    *
    * - 480 &times; 360
    * - 640 &times; 480
    * - 960 &times; 720
    *
    */
  var resolution: js.UndefOr[Height] = js.undefined
}

object VideoEncoderConfiguration {
  @scala.inline
  def apply(bitrate: Max = null, frameRate: Max = null, resolution: Height = null): VideoEncoderConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncoderConfiguration]
  }
}

