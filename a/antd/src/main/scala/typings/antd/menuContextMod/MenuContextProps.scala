package typings.antd.menuContextMod

import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuContextProps extends js.Object {
  var antdMenuTheme: js.UndefOr[MenuTheme] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var inlineCollapsed: Boolean
}

object MenuContextProps {
  @scala.inline
  def apply(inlineCollapsed: Boolean, antdMenuTheme: MenuTheme = null, direction: ltr | rtl = null): MenuContextProps = {
    val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any])
    if (antdMenuTheme != null) __obj.updateDynamic("antdMenuTheme")(antdMenuTheme.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuContextProps]
  }
}

