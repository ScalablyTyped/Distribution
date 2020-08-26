package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndex extends js.Object {
  var zIndex: Double = js.native
}

object ZIndex {
  @scala.inline
  def apply(zIndex: Double): ZIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  @scala.inline
  implicit class ZIndexOps[Self <: ZIndex] (val x: Self) extends AnyVal {
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
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

