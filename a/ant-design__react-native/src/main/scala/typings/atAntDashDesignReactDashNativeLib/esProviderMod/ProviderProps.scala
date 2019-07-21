package typings
package atAntDashDesignReactDashNativeLib.esProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var locale: js.UndefOr[atAntDashDesignReactDashNativeLib.PartialLocale] = js.undefined
  var theme: js.UndefOr[atAntDashDesignReactDashNativeLib.PartialTheme] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    locale: atAntDashDesignReactDashNativeLib.PartialLocale = null,
    theme: atAntDashDesignReactDashNativeLib.PartialTheme = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ProviderProps]
  }
}

