package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemsBorderBottomColor extends js.Object {
  var alignItems: String = js.native
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
  var flexDirection: String = js.native
  var flexGrow: Double = js.native
  var height: Double = js.native
  var justifyContent: String = js.native
}

object AlignItemsBorderBottomColor {
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flexDirection: String,
    flexGrow: Double,
    height: Double,
    justifyContent: String
  ): AlignItemsBorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsBorderBottomColor]
  }
  @scala.inline
  implicit class AlignItemsBorderBottomColorOps[Self <: AlignItemsBorderBottomColor] (val x: Self) extends AnyVal {
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
    def setBorderBottomColor(value: String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
  }
  
}

