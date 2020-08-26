package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomWidthBorderColor extends js.Object {
  var borderBottomWidth: Double = js.native
  var borderColor: String = js.native
  var borderStyle: String = js.native
}

object BorderBottomWidthBorderColor {
  @scala.inline
  def apply(borderBottomWidth: Double, borderColor: String, borderStyle: String): BorderBottomWidthBorderColor = {
    val __obj = js.Dynamic.literal(borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomWidthBorderColor]
  }
  @scala.inline
  implicit class BorderBottomWidthBorderColorOps[Self <: BorderBottomWidthBorderColor] (val x: Self) extends AnyVal {
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
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
  }
  
}

