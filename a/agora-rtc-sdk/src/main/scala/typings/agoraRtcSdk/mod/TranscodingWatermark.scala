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
trait TranscodingWatermark extends js.Object {
  /**
    * The height (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The HTTP/HTTPS URL address of the image on the broadcasting video.
    *
    * ASCII characters only. The maximum length of this parameter is 1024 bytes. Supports online PNG only.
    */
  var url: String
  /**
    * The width (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The vertical distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object TranscodingWatermark {
  @scala.inline
  def apply(
    url: String,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TranscodingWatermark = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingWatermark]
  }
}

