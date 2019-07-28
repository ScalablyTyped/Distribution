package typings.atAntDashDesignReactDashNative.esStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseThemeContextProps extends js.Object {
  var theme: js.UndefOr[typings.atAntDashDesignReactDashNative.esStyleMod.PartialTheme] = js.undefined
}

object UseThemeContextProps {
  @scala.inline
  def apply(theme: typings.atAntDashDesignReactDashNative.esStyleMod.PartialTheme = null): UseThemeContextProps = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[UseThemeContextProps]
  }
}

