package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomColorBorderBottomWidth extends js.Object {
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
}

object BorderBottomColorBorderBottomWidth {
  @scala.inline
  def apply(borderBottomColor: String, borderBottomWidth: Double): BorderBottomColorBorderBottomWidth = {
    val __obj = js.Dynamic.literal(borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomColorBorderBottomWidth]
  }
  @scala.inline
  implicit class BorderBottomColorBorderBottomWidthOps[Self <: BorderBottomColorBorderBottomWidth] (val x: Self) extends AnyVal {
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
    def setBorderBottomColor(value: String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
  }
  
}

