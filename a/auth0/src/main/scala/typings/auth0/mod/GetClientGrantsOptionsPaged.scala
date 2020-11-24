package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClientGrantsOptionsPaged extends GetClientGrantsOptions {
  
  /**
    * true if a query summary must be included in the result, false otherwise
    * @default false
    */
  var include_totals: js.UndefOr[Boolean] = js.native
}
object GetClientGrantsOptionsPaged {
  
  @scala.inline
  def apply(): GetClientGrantsOptionsPaged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientGrantsOptionsPaged]
  }
  
  @scala.inline
  implicit class GetClientGrantsOptionsPagedOps[Self <: GetClientGrantsOptionsPaged] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteInclude_totals: Self = this.set("include_totals", js.undefined)
  }
}
