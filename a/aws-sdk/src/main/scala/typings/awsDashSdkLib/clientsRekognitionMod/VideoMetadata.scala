package typings
package awsDashSdkLib.clientsRekognitionMod

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
    DurationMillis: js.UndefOr[ULong] = js.undefined,
    Format: String = null,
    FrameHeight: js.UndefOr[ULong] = js.undefined,
    FrameRate: js.UndefOr[Float] = js.undefined,
    FrameWidth: js.UndefOr[ULong] = js.undefined
  ): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec)
    if (!js.isUndefined(DurationMillis)) __obj.updateDynamic("DurationMillis")(DurationMillis)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (!js.isUndefined(FrameHeight)) __obj.updateDynamic("FrameHeight")(FrameHeight)
    if (!js.isUndefined(FrameRate)) __obj.updateDynamic("FrameRate")(FrameRate)
    if (!js.isUndefined(FrameWidth)) __obj.updateDynamic("FrameWidth")(FrameWidth)
    __obj.asInstanceOf[VideoMetadata]
  }
}

