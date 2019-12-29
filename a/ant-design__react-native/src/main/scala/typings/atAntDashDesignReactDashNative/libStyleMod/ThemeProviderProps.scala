package typings.atAntDashDesignReactDashNative.libStyleMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[PartialTheme] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply(children: ReactNode = null, value: PartialTheme = null): ThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
}

