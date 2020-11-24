package typings.asana.mod.resources.Tasks

import typings.asana.mod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindAllParams extends PaginationParams {
  
  var assignee: js.UndefOr[Double] = js.native
  
  var completed_since: js.UndefOr[String] = js.native
  
  var modified_since: js.UndefOr[String] = js.native
  
  var project: js.UndefOr[String | Double] = js.native
  
  var section: js.UndefOr[String | Double] = js.native
  
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
    def setAssignee(value: Double): Self = this.set("assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    
    @scala.inline
    def setCompleted_since(value: String): Self = this.set("completed_since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted_since: Self = this.set("completed_since", js.undefined)
    
    @scala.inline
    def setModified_since(value: String): Self = this.set("modified_since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified_since: Self = this.set("modified_since", js.undefined)
    
    @scala.inline
    def setProject(value: String | Double): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setSection(value: String | Double): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    
    @scala.inline
    def setWorkspace(value: String | Double): Self = this.set("workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
}
