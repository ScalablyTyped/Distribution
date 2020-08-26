package typings.antdMobileRn.badgePropsTypeMod

import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgePropsTypes extends js.Object {
  var corner: js.UndefOr[Boolean] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var overflowCount: js.UndefOr[Double] = js.native
  var size: js.UndefOr[large | small] = js.native
  var text: js.UndefOr[js.Any] = js.native
}

object BadgePropsTypes {
  @scala.inline
  def apply(): BadgePropsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgePropsTypes]
  }
  @scala.inline
  implicit class BadgePropsTypesOps[Self <: BadgePropsTypes] (val x: Self) extends AnyVal {
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
    def setCorner(value: Boolean): Self = this.set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setOverflowCount(value: Double): Self = this.set("overflowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowCount: Self = this.set("overflowCount", js.undefined)
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

