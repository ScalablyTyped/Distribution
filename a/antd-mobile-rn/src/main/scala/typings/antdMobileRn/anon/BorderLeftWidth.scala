package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftWidth extends js.Object {
  var borderLeftWidth: Double = js.native
  var borderRadius: Double = js.native
  var borderRightWidth: Double = js.native
}

object BorderLeftWidth {
  @scala.inline
  def apply(borderLeftWidth: Double, borderRadius: Double, borderRightWidth: Double): BorderLeftWidth = {
    val __obj = js.Dynamic.literal(borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftWidth]
  }
  @scala.inline
  implicit class BorderLeftWidthOps[Self <: BorderLeftWidth] (val x: Self) extends AnyVal {
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
    def setBorderLeftWidth(value: Double): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
  }
  
}

