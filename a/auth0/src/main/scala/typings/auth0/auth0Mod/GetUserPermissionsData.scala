package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPermissionsData extends ObjectWithId {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object GetUserPermissionsData {
  @scala.inline
  def apply(id: String, page: Int | Double = null, per_page: Int | Double = null): GetUserPermissionsData = {
    val __obj = js.Dynamic.literal(id = id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPermissionsData]
  }
}

