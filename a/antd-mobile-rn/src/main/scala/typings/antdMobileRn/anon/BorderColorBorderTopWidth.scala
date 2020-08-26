package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorBorderTopWidth extends js.Object {
  var borderColor: String = js.native
  var borderTopWidth: Double = js.native
  var flexGrow: Double = js.native
  var paddingVertical: Double = js.native
}

object BorderColorBorderTopWidth {
  @scala.inline
  def apply(borderColor: String, borderTopWidth: Double, flexGrow: Double, paddingVertical: Double): BorderColorBorderTopWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderTopWidth]
  }
  @scala.inline
  implicit class BorderColorBorderTopWidthOps[Self <: BorderColorBorderTopWidth] (val x: Self) extends AnyVal {
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
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

