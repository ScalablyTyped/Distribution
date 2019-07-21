package typings
package atAntDashDesignReactDashNativeLib.libProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var locale: js.UndefOr[
    stdLib.Partial[atAntDashDesignReactDashNativeLib.libLocaleDashProviderMod.Locale]
  ] = js.undefined
  var theme: js.UndefOr[stdLib.Partial[atAntDashDesignReactDashNativeLib.libStyleMod.Theme]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    locale: stdLib.Partial[atAntDashDesignReactDashNativeLib.libLocaleDashProviderMod.Locale] = null,
    theme: stdLib.Partial[atAntDashDesignReactDashNativeLib.libStyleMod.Theme] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ProviderProps]
  }
}

