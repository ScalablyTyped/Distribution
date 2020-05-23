package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientsOptions extends js.Object {
  var app_type: js.UndefOr[js.Array[ClientAppType]] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var include_fields: js.UndefOr[Boolean] = js.undefined
  var include_totals: js.UndefOr[Boolean] = js.undefined
  var is_first_party: js.UndefOr[Boolean] = js.undefined
  var is_global: js.UndefOr[Boolean] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object GetClientsOptions {
  @scala.inline
  def apply(
    app_type: js.Array[ClientAppType] = null,
    fields: js.Array[String] = null,
    include_fields: js.UndefOr[Boolean] = js.undefined,
    include_totals: js.UndefOr[Boolean] = js.undefined,
    is_first_party: js.UndefOr[Boolean] = js.undefined,
    is_global: js.UndefOr[Boolean] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): GetClientsOptions = {
    val __obj = js.Dynamic.literal()
    if (app_type != null) __obj.updateDynamic("app_type")(app_type.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(include_totals)) __obj.updateDynamic("include_totals")(include_totals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_first_party)) __obj.updateDynamic("is_first_party")(is_first_party.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_global)) __obj.updateDynamic("is_global")(is_global.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientsOptions]
  }
}

