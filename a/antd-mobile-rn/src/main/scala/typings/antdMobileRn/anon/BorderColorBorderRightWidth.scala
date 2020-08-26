package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorBorderRightWidth extends js.Object {
  var borderColor: String = js.native
  var borderRightWidth: Double = js.native
  var borderTopWidth: Double = js.native
  var flexGrow: Double = js.native
  var height: Double = js.native
  var justifyContent: String = js.native
  var paddingVertical: Double = js.native
}

object BorderColorBorderRightWidth {
  @scala.inline
  def apply(
    borderColor: String,
    borderRightWidth: Double,
    borderTopWidth: Double,
    flexGrow: Double,
    height: Double,
    justifyContent: String,
    paddingVertical: Double
  ): BorderColorBorderRightWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderRightWidth]
  }
  @scala.inline
  implicit class BorderColorBorderRightWidthOps[Self <: BorderColorBorderRightWidth] (val x: Self) extends AnyVal {
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
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

