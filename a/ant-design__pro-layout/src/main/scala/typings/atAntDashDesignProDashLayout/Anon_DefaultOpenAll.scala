package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultOpenAll extends js.Object {
  var defaultOpenAll: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Boolean] = js.undefined
}

object Anon_DefaultOpenAll {
  @scala.inline
  def apply(defaultOpenAll: js.UndefOr[Boolean] = js.undefined, locale: js.UndefOr[Boolean] = js.undefined): Anon_DefaultOpenAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultOpenAll)) __obj.updateDynamic("defaultOpenAll")(defaultOpenAll.asInstanceOf[js.Any])
    if (!js.isUndefined(locale)) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultOpenAll]
  }
}

