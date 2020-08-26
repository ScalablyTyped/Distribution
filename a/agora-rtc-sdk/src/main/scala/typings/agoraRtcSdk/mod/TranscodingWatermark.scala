package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configurations for the watermark image to put on top of the video in {@link setLiveTranscoding}.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  */
@js.native
trait TranscodingWatermark extends js.Object {
  /**
    * The height (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The HTTP/HTTPS URL address of the image on the broadcasting video.
    *
    * ASCII characters only. The maximum length of this parameter is 1024 bytes. Supports online PNG only.
    */
  var url: String = js.native
  /**
    * The width (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The horizontal distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The vertical distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var y: js.UndefOr[Double] = js.native
}

object TranscodingWatermark {
  @scala.inline
  def apply(url: String): TranscodingWatermark = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingWatermark]
  }
  @scala.inline
  implicit class TranscodingWatermarkOps[Self <: TranscodingWatermark] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

