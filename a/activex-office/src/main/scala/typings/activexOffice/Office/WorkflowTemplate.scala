package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplate extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  val DocumentLibraryName: String = js.native
  
  val DocumentLibraryURL: String = js.native
  
  val Id: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.WorkflowTemplate_typekey")
  var OfficeDotWorkflowTemplate_typekey: WorkflowTemplate = js.native
  
  def Show(): Double = js.native
}
object WorkflowTemplate {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    DocumentLibraryName: String,
    DocumentLibraryURL: String,
    Id: String,
    Name: String,
    OfficeDotWorkflowTemplate_typekey: WorkflowTemplate,
    Show: () => Double
  ): WorkflowTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentLibraryName = DocumentLibraryName.asInstanceOf[js.Any], DocumentLibraryURL = DocumentLibraryURL.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Office.WorkflowTemplate_typekey")(OfficeDotWorkflowTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTemplate]
  }
  
  @scala.inline
  implicit class WorkflowTemplateOps[Self <: WorkflowTemplate] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLibraryName(value: String): Self = this.set("DocumentLibraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLibraryURL(value: String): Self = this.set("DocumentLibraryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotWorkflowTemplate_typekey(value: WorkflowTemplate): Self = this.set("Office.WorkflowTemplate_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Double): Self = this.set("Show", js.Any.fromFunction0(value))
  }
}
