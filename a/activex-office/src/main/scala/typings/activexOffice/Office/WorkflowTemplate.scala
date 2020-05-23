package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTemplate extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Description: String
  val DocumentLibraryName: String
  val DocumentLibraryURL: String
  val Id: String
  val Name: String
  @JSName("Office.WorkflowTemplate_typekey")
  var OfficeDotWorkflowTemplate_typekey: WorkflowTemplate
  def Show(): Double
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
}

