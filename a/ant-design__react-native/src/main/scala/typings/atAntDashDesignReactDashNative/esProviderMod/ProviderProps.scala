package typings.atAntDashDesignReactDashNative.esProviderMod

import typings.atAntDashDesignReactDashNative.PartialLocale
import typings.atAntDashDesignReactDashNative.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var locale: js.UndefOr[PartialLocale] = js.undefined
  var theme: js.UndefOr[PartialTheme] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(locale: PartialLocale = null, theme: PartialTheme = null): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}

