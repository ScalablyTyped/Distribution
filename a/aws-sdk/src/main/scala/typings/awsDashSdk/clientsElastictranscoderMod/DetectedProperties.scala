package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedProperties extends js.Object {
  /**
    * The detected duration of the input file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.undefined
  /**
    * The detected file size of the input file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.undefined
  /**
    * The detected frame rate of the input file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.undefined
  /**
    * The detected height of the input file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The detected width of the input file, in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.undefined
}

object DetectedProperties {
  @scala.inline
  def apply(
    DurationMillis: Int | Double = null,
    FileSize: Int | Double = null,
    FrameRate: FloatString = null,
    Height: Int | Double = null,
    Width: Int | Double = null
  ): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    if (DurationMillis != null) __obj.updateDynamic("DurationMillis")(DurationMillis.asInstanceOf[js.Any])
    if (FileSize != null) __obj.updateDynamic("FileSize")(FileSize.asInstanceOf[js.Any])
    if (FrameRate != null) __obj.updateDynamic("FrameRate")(FrameRate)
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedProperties]
  }
}

