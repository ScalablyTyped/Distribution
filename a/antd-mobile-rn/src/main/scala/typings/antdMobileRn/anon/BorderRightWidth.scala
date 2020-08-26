package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRightWidth extends js.Object {
  var borderRightWidth: Double = js.native
  var height: Double = js.native
}

object BorderRightWidth {
  @scala.inline
  def apply(borderRightWidth: Double, height: Double): BorderRightWidth = {
    val __obj = js.Dynamic.literal(borderRightWidth = borderRightWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightWidth]
  }
  @scala.inline
  implicit class BorderRightWidthOps[Self <: BorderRightWidth] (val x: Self) extends AnyVal {
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
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

