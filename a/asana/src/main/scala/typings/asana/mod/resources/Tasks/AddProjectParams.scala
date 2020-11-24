package typings.asana.mod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddProjectParams extends js.Object {
  
  var insertAfter: js.UndefOr[Double] = js.native
  
  var insertBefore: js.UndefOr[Double] = js.native
  
  var project: String | Double = js.native
  
  var section: js.UndefOr[Double] = js.native
}
object AddProjectParams {
  
  @scala.inline
  def apply(project: String | Double): AddProjectParams = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProjectParams]
  }
  
  @scala.inline
  implicit class AddProjectParamsOps[Self <: AddProjectParams] (val x: Self) extends AnyVal {
    
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
    def setProject(value: String | Double): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAfter(value: Double): Self = this.set("insertAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    
    @scala.inline
    def setInsertBefore(value: Double): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    
    @scala.inline
    def setSection(value: Double): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
