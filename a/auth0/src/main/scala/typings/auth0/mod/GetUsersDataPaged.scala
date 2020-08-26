package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsersDataPaged extends GetUsersData {
  var include_totals: Boolean = js.native
}

object GetUsersDataPaged {
  @scala.inline
  def apply(include_totals: Boolean): GetUsersDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersDataPaged]
  }
  @scala.inline
  implicit class GetUsersDataPagedOps[Self <: GetUsersDataPaged] (val x: Self) extends AnyVal {
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

