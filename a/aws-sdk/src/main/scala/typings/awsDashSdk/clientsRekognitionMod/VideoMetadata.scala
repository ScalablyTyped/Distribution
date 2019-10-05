package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoMetadata extends js.Object {
  /**
    * Type of compression used in the analyzed video. 
    */
  var Codec: js.UndefOr[String] = js.undefined
  /**
    * Length of the video in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.undefined
  /**
    * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * Vertical pixel dimension of the video.
    */
  var FrameHeight: js.UndefOr[ULong] = js.undefined
  /**
    * Number of frames per second in the video.
    */
  var FrameRate: js.UndefOr[Float] = js.undefined
  /**
    * Horizontal pixel dimension of the video.
    */
  var FrameWidth: js.UndefOr[ULong] = js.undefined
}

object VideoMetadata {
  @scala.inline
  def apply(
    Codec: String = null,
    DurationMillis: Int | Double = null,
    Format: String = null,
    FrameHeight: Int | Double = null,
    FrameRate: Int | Double = null,
    FrameWidth: Int | Double = null
  ): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec)
    if (DurationMillis != null) __obj.updateDynamic("DurationMillis")(DurationMillis.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (FrameHeight != null) __obj.updateDynamic("FrameHeight")(FrameHeight.asInstanceOf[js.Any])
    if (FrameRate != null) __obj.updateDynamic("FrameRate")(FrameRate.asInstanceOf[js.Any])
    if (FrameWidth != null) __obj.updateDynamic("FrameWidth")(FrameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMetadata]
  }
}

