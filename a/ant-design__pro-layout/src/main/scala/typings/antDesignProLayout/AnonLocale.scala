package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocale extends js.Object {
  var locale: js.UndefOr[Boolean] = js.undefined
}

object AnonLocale {
  @scala.inline
  def apply(locale: js.UndefOr[Boolean] = js.undefined): AnonLocale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(locale)) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocale]
  }
}

