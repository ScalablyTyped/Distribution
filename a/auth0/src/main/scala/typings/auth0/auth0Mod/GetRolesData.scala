package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRolesData extends js.Object {
  var name_filter: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object GetRolesData {
  @scala.inline
  def apply(name_filter: String = null, page: Int | Double = null, per_page: Int | Double = null): GetRolesData = {
    val __obj = js.Dynamic.literal()
    if (name_filter != null) __obj.updateDynamic("name_filter")(name_filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesData]
  }
}

