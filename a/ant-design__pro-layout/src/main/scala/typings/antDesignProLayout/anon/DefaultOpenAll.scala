package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOpenAll extends js.Object {
  var defaultOpenAll: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Boolean] = js.undefined
}

object DefaultOpenAll {
  @scala.inline
  def apply(defaultOpenAll: js.UndefOr[Boolean] = js.undefined, locale: js.UndefOr[Boolean] = js.undefined): DefaultOpenAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultOpenAll)) __obj.updateDynamic("defaultOpenAll")(defaultOpenAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locale)) __obj.updateDynamic("locale")(locale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOpenAll]
  }
}

