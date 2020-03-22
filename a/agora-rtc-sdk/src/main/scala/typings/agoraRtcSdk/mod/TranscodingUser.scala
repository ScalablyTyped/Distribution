package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the user layout configuration in {@link setLiveTranscoding}. */
trait TranscodingUser extends js.Object {
  /**
    * Transparency of the video frame.
    *
    * The value ranges between 0.0 and 1.0:
    *
    * - 0.0: Completely transparent.
    * - 1.0: (Default) Opaque.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Height of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 640.
    */
  var height: js.UndefOr[Double] = js.undefined
  /** User ID of the CDN live host. */
  var uid: js.UndefOr[Double | String] = js.undefined
  /**
    * Width of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 360.
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
    * Layer position of the video frame.
    *
    * Integer only. The value range is [0,100].
    *
    * From v2.3.0, Agora SDK supports setting zOrder as 0.
    *
    * - 0: (Default) Lowest.
    * - 100: Highest.
    *
    */
  var zOrder: js.UndefOr[Double] = js.undefined
}

object TranscodingUser {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    height: Int | Double = null,
    uid: Double | String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zOrder: Int | Double = null
  ): TranscodingUser = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingUser]
  }
}

