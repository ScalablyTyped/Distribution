package typings.antd.menuContextMod

import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuContextProps extends js.Object {
  var antdMenuTheme: js.UndefOr[MenuTheme] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var inlineCollapsed: Boolean = js.native
}

object MenuContextProps {
  @scala.inline
  def apply(inlineCollapsed: Boolean): MenuContextProps = {
    val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuContextProps]
  }
  @scala.inline
  implicit class MenuContextPropsOps[Self <: MenuContextProps] (val x: Self) extends AnyVal {
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
    def setInlineCollapsed(value: Boolean): Self = this.set("inlineCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setAntdMenuTheme(value: MenuTheme): Self = this.set("antdMenuTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntdMenuTheme: Self = this.set("antdMenuTheme", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}

