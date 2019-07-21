package typings
package atAntDashDesignReactDashNativeLib.esLocaleDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  var locale: js.UndefOr[atAntDashDesignReactDashNativeLib.PartialLocale] = js.undefined
}

object LocaleProviderProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement = null,
    locale: atAntDashDesignReactDashNativeLib.PartialLocale = null
  ): LocaleProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

