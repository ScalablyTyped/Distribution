package typings.antd.libMenuMenuContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuContextProps extends js.Object {
  var antdMenuTheme: js.UndefOr[MenuTheme] = js.undefined
  var inlineCollapsed: Boolean
}

object MenuContextProps {
  @scala.inline
  def apply(inlineCollapsed: Boolean, antdMenuTheme: MenuTheme = null): MenuContextProps = {
    val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any])
    if (antdMenuTheme != null) __obj.updateDynamic("antdMenuTheme")(antdMenuTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuContextProps]
  }
}

