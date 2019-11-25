package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPermissionsDataPaged extends GetUserPermissionsData {
  var include_totals: Boolean
}

object GetUserPermissionsDataPaged {
  @scala.inline
  def apply(id: String, include_totals: Boolean, page: Int | Double = null, per_page: Int | Double = null): GetUserPermissionsDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPermissionsDataPaged]
  }
}

