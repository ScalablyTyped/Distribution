package typings.asana.mod.resources.Sections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionsParams extends js.Object {
  
  var insert_after: js.UndefOr[String] = js.native
  
  var insert_before: js.UndefOr[String] = js.native
  
  var task: Double | String = js.native
}
object SectionsParams {
  
  @scala.inline
  def apply(task: Double | String): SectionsParams = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionsParams]
  }
  
  @scala.inline
  implicit class SectionsParamsOps[Self <: SectionsParams] (val x: Self) extends AnyVal {
    
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
    def setTask(value: Double | String): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert_after(value: String): Self = this.set("insert_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert_after: Self = this.set("insert_after", js.undefined)
    
    @scala.inline
    def setInsert_before(value: String): Self = this.set("insert_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert_before: Self = this.set("insert_before", js.undefined)
  }
}
