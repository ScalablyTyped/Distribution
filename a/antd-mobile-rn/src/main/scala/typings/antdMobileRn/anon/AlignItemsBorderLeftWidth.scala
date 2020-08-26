package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemsBorderLeftWidth extends js.Object {
  var alignItems: String = js.native
  var borderLeftWidth: Double = js.native
  var borderRightWidth: Double = js.native
  var borderStyle: String = js.native
  var flex: Double = js.native
  var justifyContent: String = js.native
  var paddingVertical: Double = js.native
}

object AlignItemsBorderLeftWidth {
  @scala.inline
  def apply(
    alignItems: String,
    borderLeftWidth: Double,
    borderRightWidth: Double,
    borderStyle: String,
    flex: Double,
    justifyContent: String,
    paddingVertical: Double
  ): AlignItemsBorderLeftWidth = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsBorderLeftWidth]
  }
  @scala.inline
  implicit class AlignItemsBorderLeftWidthOps[Self <: AlignItemsBorderLeftWidth] (val x: Self) extends AnyVal {
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
    def setAlignItems(value: String): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

