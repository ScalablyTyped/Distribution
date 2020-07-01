package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientGrantsOptionsPaged extends GetClientGrantsOptions {
  /**
    * true if a query summary must be included in the result, false otherwise
    * @default false
    */
  var include_totals: js.UndefOr[Boolean] = js.undefined
}

object GetClientGrantsOptionsPaged {
  @scala.inline
  def apply(
    audience: String = null,
    client_id: String = null,
    include_totals: js.UndefOr[Boolean] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): GetClientGrantsOptionsPaged = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (!js.isUndefined(include_totals)) __obj.updateDynamic("include_totals")(include_totals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientGrantsOptionsPaged]
  }
}

