package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the user layout configuration in {@link setLiveTranscoding}. */
trait TranscodingUser extends js.Object {
  /**
    * The transparency level of the video frame.
    *
    * The value ranges between 0.0 and 1.0:
    *
    * - 0.0: Completely transparent.
    * - 1.0: Opaque.
    */
  var alpha: Double
  /**
    * The height of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 360.
    */
  var height: js.UndefOr[Double] = js.undefined
  /** The user ID of the CDN live host. */
  var uid: js.UndefOr[Double | String] = js.undefined
  /**
    * The width of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 640.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The position of the upper left end of the video on the horizontal axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The position of the upper left end of the video on the vertical axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * The layer index of the video frame.
    *
    * Integer only. The value range is [0,100].
    *
    * From v2.3.0, Agora SDK supports setting zOrder as 0.
    *
    * - 0: (Default) Bottom layer.
    * - 100: Top layer.
    *
    */
  var zOrder: js.UndefOr[Double] = js.undefined
}

object TranscodingUser {
  @scala.inline
  def apply(
    alpha: Double,
    height: js.UndefOr[Double] = js.undefined,
    uid: Double | String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zOrder: js.UndefOr[Double] = js.undefined
  ): TranscodingUser = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zOrder)) __obj.updateDynamic("zOrder")(zOrder.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingUser]
  }
}

