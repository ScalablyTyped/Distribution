package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserRolesData extends ObjectWithId {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object GetUserRolesData {
  @scala.inline
  def apply(id: String, page: Int | Double = null, per_page: Int | Double = null): GetUserRolesData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRolesData]
  }
}

