package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: js.UndefOr[Boolean] = js.undefined
}

object Locale {
  @scala.inline
  def apply(locale: js.UndefOr[Boolean] = js.undefined): Locale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(locale)) __obj.updateDynamic("locale")(locale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

