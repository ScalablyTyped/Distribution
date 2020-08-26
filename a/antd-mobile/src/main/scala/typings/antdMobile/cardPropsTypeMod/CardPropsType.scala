package typings.antdMobile.cardPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardPropsType extends js.Object {
  var full: js.UndefOr[Boolean] = js.native
}

object CardPropsType {
  @scala.inline
  def apply(): CardPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardPropsType]
  }
  @scala.inline
  implicit class CardPropsTypeOps[Self <: CardPropsType] (val x: Self) extends AnyVal {
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
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
  }
  
}

