package typings.atAntDashDesignReactDashNative.esLocaleDashProviderMod

import typings.atAntDashDesignReactDashNative.PartialLocale
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
  var locale: js.UndefOr[PartialLocale] = js.undefined
}

object LocaleProviderProps {
  @scala.inline
  def apply(children: ReactElement = null, locale: PartialLocale = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

