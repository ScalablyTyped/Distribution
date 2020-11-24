package typings.asana.mod.resources.Projects

import typings.asana.mod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindAllParams extends PaginationParams {
  
  var archived: js.UndefOr[Boolean] = js.native
  
  var team: js.UndefOr[String | Double] = js.native
  
  var workspace: js.UndefOr[String | Double] = js.native
}
object FindAllParams {
  
  @scala.inline
  def apply(): FindAllParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAllParams]
  }
  
  @scala.inline
  implicit class FindAllParamsOps[Self <: FindAllParams] (val x: Self) extends AnyVal {
    
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
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setTeam(value: String | Double): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    
    @scala.inline
    def setWorkspace(value: String | Double): Self = this.set("workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
}
