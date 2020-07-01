package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientGrantsOptions extends js.Object {
  /**
    * The audience.
    */
  var audience: js.UndefOr[String] = js.undefined
  /**
    * The id of the client (application).
    */
  var client_id: js.UndefOr[String] = js.undefined
  /** @default 0 */
  var page: js.UndefOr[Double] = js.undefined
  /** @default 10 */
  var per_page: js.UndefOr[Double] = js.undefined
}

object GetClientGrantsOptions {
  @scala.inline
  def apply(
    audience: String = null,
    client_id: String = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): GetClientGrantsOptions = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientGrantsOptions]
  }
}

