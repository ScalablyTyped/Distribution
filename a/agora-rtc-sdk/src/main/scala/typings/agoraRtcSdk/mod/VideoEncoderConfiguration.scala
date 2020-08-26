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
@js.native
trait VideoEncoderConfiguration extends js.Object {
  /**
    * The video bitrate (Kbps). The value range is [1,10000000].
    *
    * We recommend setting the bitrate between 100 Kbps and 5000 Kbps. You can refer to the table below and set your bitrate.
    *
    * [[include:VideoProfileDefinition.md]]
    */
  var bitrate: js.UndefOr[Max] = js.native
  /**
    * The video frame rate (fps).
    *
    * The value range is [1, 10000]. We recommend setting the frame rate between 5 fps and 30 fps.
    *
    * **Note**
    * - This parameter sets the local capturing video frame rate. The actual encoding frame rate depends on the device, system, and browser.
    * - When the network conditions change, the browser adjusts the encoding frame rate automatically.
    */
  var frameRate: js.UndefOr[Max] = js.native
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
  var resolution: js.UndefOr[Height] = js.native
}

object VideoEncoderConfiguration {
  @scala.inline
  def apply(): VideoEncoderConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncoderConfiguration]
  }
  @scala.inline
  implicit class VideoEncoderConfigurationOps[Self <: VideoEncoderConfiguration] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Max): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setFrameRate(value: Max): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setResolution(value: Height): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
  
}

