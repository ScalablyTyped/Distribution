package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mask extends js.Object {
  var duration: Double = js.native
  var mask: Boolean = js.native
  def onClose(): Unit = js.native
}

object Mask {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: () => Unit): Mask = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[Mask]
  }
  @scala.inline
  implicit class MaskOps[Self <: Mask] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
  }
  
}

