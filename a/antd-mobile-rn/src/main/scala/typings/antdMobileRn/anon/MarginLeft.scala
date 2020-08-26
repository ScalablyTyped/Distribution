package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginLeft extends js.Object {
  var alignItems: String = js.native
  var flexDirection: String = js.native
  var marginLeft: Double = js.native
  var paddingRight: Double = js.native
  var paddingVertical: Double = js.native
}

object MarginLeft {
  @scala.inline
  def apply(
    alignItems: String,
    flexDirection: String,
    marginLeft: Double,
    paddingRight: Double,
    paddingVertical: Double
  ): MarginLeft = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeft]
  }
  @scala.inline
  implicit class MarginLeftOps[Self <: MarginLeft] (val x: Self) extends AnyVal {
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
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

