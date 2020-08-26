package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingRight extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var color: String = js.native
  var flex: Double = js.native
  var fontSize: Double = js.native
  var height: Double = js.native
  var paddingBottom: Double = js.native
  var paddingLeft: Double = js.native
  var paddingRight: Double = js.native
  var paddingTop: Double = js.native
}

object PaddingRight {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    flex: Double,
    fontSize: Double,
    height: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double
  ): PaddingRight = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingRight]
  }
  @scala.inline
  implicit class PaddingRightOps[Self <: PaddingRight] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
  }
  
}

