package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectTemplate extends js.Object {
  
  val Application: typings.activexVbide.VBIDE.Application = js.native
  
  val Parent: typings.activexVbide.VBIDE.Application = js.native
  
  @JSName("VBIDE.ProjectTemplate_typekey")
  var VBIDEDotProjectTemplate_typekey: ProjectTemplate = js.native
}
object ProjectTemplate {
  
  @scala.inline
  def apply(Application: Application, Parent: Application, VBIDEDotProjectTemplate_typekey: ProjectTemplate): ProjectTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.ProjectTemplate_typekey")(VBIDEDotProjectTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTemplate]
  }
  
  @scala.inline
  implicit class ProjectTemplateOps[Self <: ProjectTemplate] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Application): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBIDEDotProjectTemplate_typekey(value: ProjectTemplate): Self = this.set("VBIDE.ProjectTemplate_typekey", value.asInstanceOf[js.Any])
  }
}
