package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinHeight extends js.Object {
  var alignItems: String = js.native
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
  var flex: Double = js.native
  var flexDirection: String = js.native
  var minHeight: Double = js.native
  var paddingRight: Double = js.native
  var paddingVertical: Double = js.native
}

object MinHeight {
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flex: Double,
    flexDirection: String,
    minHeight: Double,
    paddingRight: Double,
    paddingVertical: Double
  ): MinHeight = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeight]
  }
  @scala.inline
  implicit class MinHeightOps[Self <: MinHeight] (val x: Self) extends AnyVal {
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
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

