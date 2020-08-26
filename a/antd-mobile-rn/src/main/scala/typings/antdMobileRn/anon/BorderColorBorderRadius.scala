package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorBorderRadius extends js.Object {
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var flexDirection: String = js.native
  var overflow: String = js.native
}

object BorderColorBorderRadius {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    overflow: String
  ): BorderColorBorderRadius = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderRadius]
  }
  @scala.inline
  implicit class BorderColorBorderRadiusOps[Self <: BorderColorBorderRadius] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
  }
  
}

