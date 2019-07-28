package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitrate extends js.Object {
  /** Bitrate of the low-video stream frame in Kbps. A positive integer, and the value range is [1,10000000]. */
  var bitrate: js.UndefOr[Double] = js.undefined
  /** Frame rate of the low-video stream frame in fps. A positive integer, and the value range is [1,10000]. */
  var framerate: js.UndefOr[Double] = js.undefined
  /**
    * Height of the low-video stream frame. A positive integer, and the value range is [1,10000].
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns default values.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Width of the low-video stream frame. A positive integer, and the value range is [1,10000].
    *
    * The width and height parameters are bound together, and take effect only when both are set.Otherwise, the SDK assigns default values.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Bitrate {
  @scala.inline
  def apply(
    bitrate: Int | Double = null,
    framerate: Int | Double = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): Anon_Bitrate = {
    val __obj = js.Dynamic.literal()
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bitrate]
  }
}

