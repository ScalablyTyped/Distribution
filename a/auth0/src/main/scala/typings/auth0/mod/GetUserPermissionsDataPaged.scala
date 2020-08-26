package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPermissionsDataPaged extends GetUserPermissionsData {
  var include_totals: Boolean = js.native
}

object GetUserPermissionsDataPaged {
  @scala.inline
  def apply(id: String, include_totals: Boolean): GetUserPermissionsDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPermissionsDataPaged]
  }
  @scala.inline
  implicit class GetUserPermissionsDataPagedOps[Self <: GetUserPermissionsDataPaged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInclude_totals(value: Boolean): Self = this.set("include_totals", value.asInstanceOf[js.Any])
  }
  
}

