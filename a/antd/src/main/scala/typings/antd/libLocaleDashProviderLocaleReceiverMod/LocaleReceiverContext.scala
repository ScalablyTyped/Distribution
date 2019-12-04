package typings.antd.libLocaleDashProviderLocaleReceiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleReceiverContext extends js.Object {
  var antLocale: js.UndefOr[LocaleInterface] = js.undefined
}

object LocaleReceiverContext {
  @scala.inline
  def apply(antLocale: LocaleInterface = null): LocaleReceiverContext = {
    val __obj = js.Dynamic.literal()
    if (antLocale != null) __obj.updateDynamic("antLocale")(antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleReceiverContext]
  }
}

