package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClientsOptions extends js.Object {
  var app_type: js.UndefOr[js.Array[ClientAppType]] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var include_fields: js.UndefOr[Boolean] = js.native
  var include_totals: js.UndefOr[Boolean] = js.native
  var is_first_party: js.UndefOr[Boolean] = js.native
  var is_global: js.UndefOr[Boolean] = js.native
  var page: js.UndefOr[Double] = js.native
  var per_page: js.UndefOr[Double] = js.native
}

object GetClientsOptions {
  @scala.inline
  def apply(): GetClientsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientsOptions]
  }
  @scala.inline
  implicit class GetClientsOptionsOps[Self <: GetClientsOptions] (val x: Self) extends AnyVal {
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
    def setApp_typeVarargs(value: ClientAppType*): Self = this.set("app_type", js.Array(value :_*))
    @scala.inline
    def setApp_type(value: js.Array[ClientAppType]): Self = this.set("app_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_type: Self = this.set("app_type", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setInclude_fields(value: Boolean): Self = this.set("include_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_fields: Self = this.set("include_fields", js.undefined)
    @scala.inline
    def setInclude_totals(value: Boolean): Self = this.set("include_totals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_totals: Self = this.set("include_totals", js.undefined)
    @scala.inline
    def setIs_first_party(value: Boolean): Self = this.set("is_first_party", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_first_party: Self = this.set("is_first_party", js.undefined)
    @scala.inline
    def setIs_global(value: Boolean): Self = this.set("is_global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_global: Self = this.set("is_global", js.undefined)
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

