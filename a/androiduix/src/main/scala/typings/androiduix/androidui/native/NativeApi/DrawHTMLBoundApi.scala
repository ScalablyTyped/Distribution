package typings.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawHTMLBoundApi extends js.Object {
  def hideDrawHTMLBound(viewHash: Double): Unit = js.native
  def showDrawHTMLBound(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
}

object DrawHTMLBoundApi {
  @scala.inline
  def apply(
    hideDrawHTMLBound: Double => Unit,
    showDrawHTMLBound: (Double, Double, Double, Double, Double) => Unit
  ): DrawHTMLBoundApi = {
    val __obj = js.Dynamic.literal(hideDrawHTMLBound = js.Any.fromFunction1(hideDrawHTMLBound), showDrawHTMLBound = js.Any.fromFunction5(showDrawHTMLBound))
    __obj.asInstanceOf[DrawHTMLBoundApi]
  }
  @scala.inline
  implicit class DrawHTMLBoundApiOps[Self <: DrawHTMLBoundApi] (val x: Self) extends AnyVal {
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
    def setHideDrawHTMLBound(value: Double => Unit): Self = this.set("hideDrawHTMLBound", js.Any.fromFunction1(value))
    @scala.inline
    def setShowDrawHTMLBound(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("showDrawHTMLBound", js.Any.fromFunction5(value))
  }
  
}

