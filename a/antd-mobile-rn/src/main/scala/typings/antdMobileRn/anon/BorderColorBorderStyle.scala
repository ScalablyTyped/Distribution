package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorBorderStyle extends js.Object {
  var borderColor: String = js.native
  var borderStyle: String = js.native
  var borderTopWidth: Double = js.native
  var flexDirection: String = js.native
  var height: Double = js.native
}

object BorderColorBorderStyle {
  @scala.inline
  def apply(
    borderColor: String,
    borderStyle: String,
    borderTopWidth: Double,
    flexDirection: String,
    height: Double
  ): BorderColorBorderStyle = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderStyle]
  }
  @scala.inline
  implicit class BorderColorBorderStyleOps[Self <: BorderColorBorderStyle] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

