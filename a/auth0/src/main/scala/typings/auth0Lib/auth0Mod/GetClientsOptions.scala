package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientsOptions extends js.Object {
  var app_type: js.UndefOr[js.Array[ClientAppType]] = js.undefined
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_fields: js.UndefOr[scala.Boolean] = js.undefined
  var include_totals: js.UndefOr[scala.Boolean] = js.undefined
  var is_first_party: js.UndefOr[scala.Boolean] = js.undefined
  var is_global: js.UndefOr[scala.Boolean] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object GetClientsOptions {
  @scala.inline
  def apply(
    app_type: js.Array[ClientAppType] = null,
    fields: js.Array[java.lang.String] = null,
    include_fields: js.UndefOr[scala.Boolean] = js.undefined,
    include_totals: js.UndefOr[scala.Boolean] = js.undefined,
    is_first_party: js.UndefOr[scala.Boolean] = js.undefined,
    is_global: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): GetClientsOptions = {
    val __obj = js.Dynamic.literal()
    if (app_type != null) __obj.updateDynamic("app_type")(app_type)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields)
    if (!js.isUndefined(include_totals)) __obj.updateDynamic("include_totals")(include_totals)
    if (!js.isUndefined(is_first_party)) __obj.updateDynamic("is_first_party")(is_first_party)
    if (!js.isUndefined(is_global)) __obj.updateDynamic("is_global")(is_global)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientsOptions]
  }
}

