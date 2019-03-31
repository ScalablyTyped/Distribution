package typings
package antdDashMobileLib.libLocaleDashProviderLocaleDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var locale: antdDashMobileLib.Anon_DatePicker
}

object LocaleProviderProps {
  @scala.inline
  def apply(
    locale: antdDashMobileLib.Anon_DatePicker,
    children: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

