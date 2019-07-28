package typings.antdDashMobileDashRn.libLocaleDashProviderLocaleDashProviderMod

import typings.antdDashMobileDashRn.Anon_DatePicker
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
  var locale: Anon_DatePicker
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: Anon_DatePicker, children: ReactElement = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

