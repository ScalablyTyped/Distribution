package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsersData extends js.Object {
  
  var connection: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[String] = js.native
  
  var include_fields: js.UndefOr[Boolean] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var search_engine: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
}
object GetUsersData {
  
  @scala.inline
  def apply(): GetUsersData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsersData]
  }
  
  @scala.inline
  implicit class GetUsersDataOps[Self <: GetUsersData] (val x: Self) extends AnyVal {
    
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setInclude_fields(value: Boolean): Self = this.set("include_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_fields: Self = this.set("include_fields", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setSearch_engine(value: String): Self = this.set("search_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_engine: Self = this.set("search_engine", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
