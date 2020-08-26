package typings.antdMobile.cardMod

import typings.antdMobile.cardPropsTypeMod.CardPropsType
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardProps
  extends AllHTMLAttributes[HTMLDivElement]
     with CardPropsType
     with ClassAttributes[HTMLDivElement] {
  var prefixCls: js.UndefOr[String] = js.native
}

object CardProps {
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

