package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the user layout configuration in {@link setLiveTranscoding}. */
@js.native
trait TranscodingUser extends js.Object {
  /**
    * The transparency level of the video frame.
    *
    * The value ranges between 0.0 and 1.0:
    *
    * - 0.0: Completely transparent.
    * - 1.0: Opaque.
    */
  var alpha: Double = js.native
  /**
    * The height of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 360.
    */
  var height: js.UndefOr[Double] = js.native
  /** The user ID of the CDN live host. */
  var uid: js.UndefOr[Double | String] = js.native
  /**
    * The width of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 640.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The position of the upper left end of the video on the horizontal axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The position of the upper left end of the video on the vertical axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var y: js.UndefOr[Double] = js.native
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
  var zOrder: js.UndefOr[Double] = js.native
}

object TranscodingUser {
  @scala.inline
  def apply(alpha: Double): TranscodingUser = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingUser]
  }
  @scala.inline
  implicit class TranscodingUserOps[Self <: TranscodingUser] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUid(value: Double | String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
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
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
  
}

