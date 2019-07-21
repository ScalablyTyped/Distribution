package typings
package atAntDashDesignReactDashNativeLib.esProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var locale: js.UndefOr[stdLib.Partial[atAntDashDesignReactDashNativeLib.esLocaleDashProviderMod.Locale]] = js.undefined
  var theme: js.UndefOr[stdLib.Partial[atAntDashDesignReactDashNativeLib.esStyleMod.Theme]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    locale: stdLib.Partial[atAntDashDesignReactDashNativeLib.esLocaleDashProviderMod.Locale] = null,
    theme: stdLib.Partial[atAntDashDesignReactDashNativeLib.esStyleMod.Theme] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ProviderProps]
  }
}

