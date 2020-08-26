package typings.androiduix.android.view.View.AttachInfo

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidateInfo extends js.Object {
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var target: View = js.native
  var top: Double = js.native
  def recycle(): Unit = js.native
}

object InvalidateInfo {
  @scala.inline
  def apply(bottom: Double, left: Double, recycle: () => Unit, right: Double, target: View, top: Double): InvalidateInfo = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), right = right.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidateInfo]
  }
  @scala.inline
  implicit class InvalidateInfoOps[Self <: InvalidateInfo] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: View): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

