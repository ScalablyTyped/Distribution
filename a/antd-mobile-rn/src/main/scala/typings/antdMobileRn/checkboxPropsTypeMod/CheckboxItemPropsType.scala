package typings.antdMobileRn.checkboxPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxItemPropsType extends CheckboxPropsType {
  var extra: js.UndefOr[ReactNode] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object CheckboxItemPropsType {
  @scala.inline
  def apply(): CheckboxItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxItemPropsType]
  }
  @scala.inline
  implicit class CheckboxItemPropsTypeOps[Self <: CheckboxItemPropsType] (val x: Self) extends AnyVal {
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
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

