package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bitrate extends js.Object {
  /**
    * The bitrate of the low-quality video stream frame in Kbps.
    *
    * A positive integer, and the value range is [1,10000000]. The default value is 50.
    */
  var bitrate: js.UndefOr[Double] = js.undefined
  /**
    * The frame rate of the low-quality video stream frame in fps.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 15.
    */
  var framerate: js.UndefOr[Double] = js.undefined
  /**
    * The height of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 120.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The width of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 160.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Bitrate {
  @scala.inline
  def apply(
    bitrate: js.UndefOr[Double] = js.undefined,
    framerate: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Bitrate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framerate)) __obj.updateDynamic("framerate")(framerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitrate]
  }
}

