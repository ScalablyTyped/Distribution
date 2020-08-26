package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRolesData extends js.Object {
  var name_filter: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var per_page: js.UndefOr[Double] = js.native
}

object GetRolesData {
  @scala.inline
  def apply(): GetRolesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRolesData]
  }
  @scala.inline
  implicit class GetRolesDataOps[Self <: GetRolesData] (val x: Self) extends AnyVal {
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
    def setName_filter(value: String): Self = this.set("name_filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName_filter: Self = this.set("name_filter", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
  }
  
}

