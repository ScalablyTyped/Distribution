package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRadiusBorderStyle extends js.Object {
  var borderRadius: Double = js.native
  var borderStyle: String = js.native
  var borderWidth: Double = js.native
  var overflow: String = js.native
  var paddingHorizontal: Double = js.native
  var paddingVertical: Double = js.native
}

object BorderRadiusBorderStyle {
  @scala.inline
  def apply(
    borderRadius: Double,
    borderStyle: String,
    borderWidth: Double,
    overflow: String,
    paddingHorizontal: Double,
    paddingVertical: Double
  ): BorderRadiusBorderStyle = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusBorderStyle]
  }
  @scala.inline
  implicit class BorderRadiusBorderStyleOps[Self <: BorderRadiusBorderStyle] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

