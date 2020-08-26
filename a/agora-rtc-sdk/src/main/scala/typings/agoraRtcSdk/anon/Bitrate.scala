package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitrate extends js.Object {
  /**
    * The bitrate of the low-quality video stream frame in Kbps.
    *
    * A positive integer, and the value range is [1,10000000]. The default value is 50.
    */
  var bitrate: js.UndefOr[Double] = js.native
  /**
    * The frame rate of the low-quality video stream frame in fps.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 15.
    */
  var framerate: js.UndefOr[Double] = js.native
  /**
    * The height of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 120.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The width of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 160.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var width: js.UndefOr[Double] = js.native
}

object Bitrate {
  @scala.inline
  def apply(): Bitrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitrate]
  }
  @scala.inline
  implicit class BitrateOps[Self <: Bitrate] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerate: Self = this.set("framerate", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

