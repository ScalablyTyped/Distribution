package typings
package awsDashSdkLib.clientsElastictranscoderMod

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
    DurationMillis: js.UndefOr[NullableLong] = js.undefined,
    FileSize: js.UndefOr[NullableLong] = js.undefined,
    FrameRate: FloatString = null,
    Height: js.UndefOr[NullableInteger] = js.undefined,
    Width: js.UndefOr[NullableInteger] = js.undefined
  ): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationMillis)) __obj.updateDynamic("DurationMillis")(DurationMillis)
    if (!js.isUndefined(FileSize)) __obj.updateDynamic("FileSize")(FileSize)
    if (FrameRate != null) __obj.updateDynamic("FrameRate")(FrameRate)
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height)
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[DetectedProperties]
  }
}

